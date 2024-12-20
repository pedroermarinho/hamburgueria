package io.github.pedroermarinho.hamburgueria.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import io.github.pedroermarinho.hamburgueria.security.JWTAuthenticationFilter;
import io.github.pedroermarinho.hamburgueria.security.JWTAuthorizationFilter;
import io.github.pedroermarinho.hamburgueria.security.JWTUtil;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired  
    private JWTUtil jwtUtil;

    @Autowired
    private Environment env;

    @Autowired
	private UserDetailsService userDetailsService;


    private static final String[] PUBLIC_MATCHERS ={
        "/h2-console/**",
        "/login",
    };
    private static final String[] PUBLIC_MATCHERS_GET ={

       Constants.API_URL_CATEGORIA+"/**",
       Constants.API_URL_USUARIO+"/**",
       Constants.API_URL_PRODUTO+"/**",
      
    };

    private static final String[] PUBLIC_MATCHERS_POST = {
        Constants.API_URL_USUARIO,
};


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        
        
         if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
            http.headers().frameOptions().disable();
         }
        
        http.cors().and().csrf().disable();
        http.authorizeRequests()
        .antMatchers(HttpMethod.POST, PUBLIC_MATCHERS_POST).permitAll()
        // .antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll() 
        .antMatchers(PUBLIC_MATCHERS).permitAll()
        .anyRequest().authenticated();

        
        http.addFilter(new JWTAuthenticationFilter(authenticationManager(), jwtUtil));
        http.addFilter(new JWTAuthorizationFilter(authenticationManager(), jwtUtil, userDetailsService));
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

    @Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
