package com.bhn.configservice.filter;


import com.bhn.configservice.utility.JwtUtil;
import com.bhn.raptor.commonutility.client.MonoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Component
@Import(com.bhn.raptor.commonutility.client.ClientConfigurer.class)
public class AuthFilter extends OncePerRequestFilter {
    @Autowired
    MonoClient monoClient;
    @Override
    public void destroy() {
    }

//    @Override
//    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws IOException, ServletException {
//
//
//    }

//    @Override
//    public void init(FilterConfig filterconfig) throws ServletException {}

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        try {


//            System.out.println("Remote Host:" + request.getRemoteHost());
//            System.out.println("Remote Address:" + request.getRemoteAddr());
            final Boolean[] isTokenValidated = {false};

            String jwt = JwtUtil.parseJwt(request);
            final String uri = "http://localhost:8090/validate-token";
            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(jwt);
//          monoClient.getMonoClient(uri,Boolean.class,headers).subscribe(result -> {
//
//            System.out.println("mono response "+result );
//
//          });
//            Flux<Boolean> flux = WebClient.create()
//                    .get()
//                    .uri(uri)
//                    .headers(httpHeaders -> httpHeaders.setBearerAuth(jwt))
//                    .retrieve()
//                    .bodyToFlux(Boolean.class);

//            flux.subscribe(result -> {
//                isTokenValidated[0] =result;
//                System.out.println(result+ "fulx response ");});
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity result;
//            try {
//                result = restTemplate.exchange(RequestEntity.get(new URI(uri)).headers(headers).build(), Boolean.class);
//            } catch (URISyntaxException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(result.getStatusCode());
//            System.out.println(result.getBody());
//            if (result.getBody().equals(true)) {
//                filterChain.doFilter(request, response);
//
//                //
//            } else {
//                System.out.println(isTokenValidated[0]);
//                response.setStatus(HttpStatus.UNAUTHORIZED.value());
//                response.getWriter().write("Invalid Token");
//                response.getWriter().flush();
//            }

        } catch (HttpClientErrorException errorException) {

            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().write("Invalid Token");
            response.getWriter().flush();
        }
    }
}