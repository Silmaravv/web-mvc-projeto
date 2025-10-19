package br.senac.tads.dsw.web_mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF (útil em desenvolvimento)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**", "/h2-console/**", "/static/**", "/index.html").permitAll() // rotas públicas
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.permitAll()) // Habilita login padrão
                .logout(logout -> logout.permitAll()); // Habilita logout

        // Necessário para usar H2 Console
        http.headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();
    }
}