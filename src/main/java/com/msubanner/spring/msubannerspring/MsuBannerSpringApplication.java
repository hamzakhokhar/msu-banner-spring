package com.msubanner.spring.msubannerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Replacement banner system for msu denver. Built using java spring, mustache,
 * derby.
 *
 * @author team 3
 */
@SpringBootApplication
public class MsuBannerSpringApplication {

    /**
     * Runs the java spring application.
     * @param args variable catch all
     */
    public static void main(String[] args) {
        SpringApplication.run(MsuBannerSpringApplication.class, args);
    }
}
