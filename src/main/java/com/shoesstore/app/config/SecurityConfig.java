package com.shoesstore.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> 
                auth
                    .requestMatchers("/", "/login", "/register").permitAll()  // Definir las rutas públicas
                    .anyRequest().authenticated()  // Todas las demás rutas requieren autenticación
            )
            .formLogin(formLogin -> 
                formLogin
                    .loginPage("/login")  // Página de inicio de sesión personalizada
                    .permitAll()  // Permitir acceso a la página de inicio de sesión a todos
            )
            .logout(logout -> 
                logout
                    .permitAll()  // Permitir el cierre de sesión
            );
        
        return http.build();  // Construir la configuración de seguridad
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.builder()
            .username("user")
            .password(passwordEncoder.encode("password"))  // Encriptar la contraseña con BCrypt
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Bean de codificación de contraseñas seguro
    }
}
