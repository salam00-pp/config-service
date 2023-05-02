package com.bhn.configservice.utility;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class JwtUtil {
    public static final String HEADER_AUTH = "Authorization";
    public static final String HEADER_AUTH_PREFIX = "Bearer ";
    public static String parseJwt(HttpServletRequest request) {
        String headerAuth = request.getHeader(HEADER_AUTH);

        if (StringUtils.hasText(headerAuth) && headerAuth.startsWith(HEADER_AUTH_PREFIX)) {
            return headerAuth.substring(7, headerAuth.length());
        }

        return null;
    }

}
