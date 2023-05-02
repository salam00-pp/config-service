package com.bhn.configservice.configuration;

import com.bhn.raptor.commonutility.configuration.InterceptorConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



@Configuration
@Import({com.bhn.raptor.commonutility.configuration.BeanConfig.class, InterceptorConfig.class})

public class AppConfig  {

}