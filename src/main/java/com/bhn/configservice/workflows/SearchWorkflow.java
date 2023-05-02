package com.bhn.configservice.workflows;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.http.HttpResponse;

@Component
@Slf4j
public class SearchWorkflow {
    public boolean validateRoleAndScope(HttpServletRequest request,HttpServletResponse response)
    {
        boolean isValidRoleAndScope=true;
        log.info("Validating Role and Scope for request : {}",request.getHeaderNames());

        if(request.getAttribute("role").equals("SuperAdmin")) {
            request.setAttribute("GDPRLevel", "1");

        }
        else if(request.getAttribute("role").equals("test")){
            request.setAttribute("GDPRLevel", "2");
        }
        else {
            isValidRoleAndScope=false;
            throw  new RuntimeException("role scope validation failed");
        }
return isValidRoleAndScope;
    }
    public void validatePreGDPRCompliance(HttpServletRequest request,HttpServletResponse response)
    {
        log.info("Validating Pre GDPR compliance for request : {}",request);
        if(request.getAttribute("GDPRLevel").equals("1")) {
           log.info("Do Nothing");
        }
        else if(request.getAttribute("role").equals("test")){

           throw new RuntimeException("request cannot be serve due to GDPR compliance");
        }

    }
    public void validatePostGDPRCompliance(HttpServletRequest request, HttpServletResponse response)
    {
        log.info("Validating Post GDPR compliance for request : {}",request);
        log.info("Response  : {}",response);
    }
    public void checkRisk(HttpServletRequest request,HttpServletResponse response)
    {
        log.info("Checking Risk for rrquest {}",request);
    }
    public void fliterPIIdata(HttpServletRequest request, HttpServletResponse response)
    {
        log.info("Filtering PII data for request : {}",request);
        log.info("Response  : {}",response);
    }
}
