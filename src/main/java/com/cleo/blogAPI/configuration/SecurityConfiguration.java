package com.cleo.blogAPI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;


public class SecurityConfiguration  {
/*
  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/login")
                .permitAll()
                .antMatchers("/users","/blogs","/")
                .hasAnyAuthority("Admin","Staff")
                .and().formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .permitAll()
                .and()
                .logout().permitAll();
        http.headers().frameOptions().sameOrigin();
        return http.build();
    }
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return (web -> web.ignoring().antMatchers("/images/**","/js/**","/webjars/**"));
    }*/
}
