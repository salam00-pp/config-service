package com.bhn.configservice.interceptor;

import com.bhn.configservice.workflows.SearchWorkflow;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
public class WorkflowInterceptor implements HandlerInterceptor {
    @Autowired
    private SearchWorkflow searchWorkflow;
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //System.out.println("Pre Handle method is Calling");
        request.setAttribute("role","test");
        log.info("log role : {} ",request.getAttribute("role"));

        if(!searchWorkflow.validateRoleAndScope(request,response)){
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
              response.getWriter().write("Role scope validation failed");
                response.getWriter().flush();
            return false;
        };
        searchWorkflow.validatePreGDPRCompliance(request,response);
        searchWorkflow.checkRisk(request,response);
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handle method is Calling");


    }
    @Override
    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response, Object
                    handler, Exception exception) throws Exception {
        System.out.println("Request and Response is completed");
        searchWorkflow.validatePostGDPRCompliance(request,response);
        searchWorkflow.fliterPIIdata(request,response);

    }
}