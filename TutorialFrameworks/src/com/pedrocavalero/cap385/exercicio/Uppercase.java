package com.pedrocavalero.cap385.exercicio;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
@FormatterImplementation(UppercaseFormatter.class)
public @interface Uppercase {
}
