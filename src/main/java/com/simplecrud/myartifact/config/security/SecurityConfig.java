package com.simplecrud.myartifact.config.security;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@EnableGlobalMethodSecurity(
    securedEnabled = true,
    jsr250Enabled = true,
    prePostEnabled = true
)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http = http.cors().and().csrf().disable();

        http = http
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and();

        http.authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers(HttpMethod.GET, "/api/books/**").permitAll()
        .antMatchers(HttpMethod.POST, "/api/books/**").permitAll()
        .antMatchers(HttpMethod.PUT, "/api/books/**").permitAll()
        .antMatchers(HttpMethod.DELETE, "/api/books/**").permitAll()
        .antMatchers(HttpMethod.GET, "/public").permitAll()
        .anyRequest().authenticated();
    }
}
