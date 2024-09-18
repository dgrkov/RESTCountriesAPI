package mk.ukim.finki.restcoutriesapp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Disable all security
        //      ``          Disable CSRF using the new API style
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Allow all requests
                );
        return http.build();
//        http.authorizeHttpRequests(configurer ->
//                        configurer
//                        .requestMatchers(HttpMethod.GET, "/countries/**").hasAnyRole("PUBLIC", "ADMIN")
//                        .requestMatchers(HttpMethod.GET, "/countries/favourite/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.POST, "/countries/favourite/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.PUT, "/countries/favourite/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.DELETE, "/countries/favourite/**").hasRole("ADMIN")
//                        .requestMatchers(HttpMethod.GET, "/h2").permitAll()
//
//                );
//
//        http.httpBasic(Customizer.withDefaults());
//        http.csrf(csrf -> csrf.disable());
//
//        return http.build();
    }
}
