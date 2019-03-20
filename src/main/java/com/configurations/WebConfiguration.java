package com.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.services.NumberGenerator;

@Configuration
@EnableWebMvc
@ComponentScan("com.*")
public class WebConfiguration {

    @Bean
    public NumberGenerator numberGenerator(){
        return  new NumberGenerator();
    }
}
