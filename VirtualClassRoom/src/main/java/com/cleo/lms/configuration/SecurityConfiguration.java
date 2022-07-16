package com.cleo.lms.configuration;


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
