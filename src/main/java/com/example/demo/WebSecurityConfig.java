package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by kwongiho on 2017. 11. 2..
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Value(value="{admin:username}")
    private String userName;

    @Value(value="{admin.password}")
    private String password;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/swagger-ui.html", "/configuration/ui",
                                "/swagger-resources", "/configuration/security",
                                "/swagger-ui.html", "/webjars/**","/swagger/**").permitAll() // 인증 안해도 접근 가능해야 할 url들 넣어주기
        .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginPage("/login.html")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser(userName).password(password).roles("USER");
    }


}
