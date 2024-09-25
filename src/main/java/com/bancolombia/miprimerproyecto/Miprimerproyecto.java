/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bancolombia.miprimerproyecto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Netec
 */
@SpringBootApplication
public class Miprimerproyecto implements CommandLineRunner{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Miprimerproyecto.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("¡Bienvenido a mi aplicativo desde Spring Boot!");
    }
}
