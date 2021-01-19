package com.spring.codeblog.configuration;

import org.hibernate.jdbc.Expectation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Value("${SPRING_SERVICE_ADMIN}")
    private String ADMIN_USER;

    @Value("${SPRING_SERVICE_PASSWORD}")
    private String ADMIN_PASSWORD;
    private static final String [] AUTH_LIST=
            {
                    "/",
                    "/posts",
                    "/posts/{id}"
            };
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests()
                .antMatchers(AUTH_LIST).permitAll()
                .anyRequest().authenticated()
                .and().formLogin().permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

  @Override
  protected void configure (AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser(this.ADMIN_USER).password("{noop}"+this.ADMIN_PASSWORD).roles("ADMIN");
  }
   @Override
   public void configure (WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/bootstrap/**");
   }
}
