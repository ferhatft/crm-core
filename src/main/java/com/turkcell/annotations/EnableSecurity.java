package com.turkcell.annotations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ComponentScan(basePackages = {"com.turkcell"})
@EntityScan(basePackages = {"com.turkcell.entities"})
@EnableJpaRepositories(basePackages = {"com.turkcell.repositories"})
public @interface EnableSecurity {

}