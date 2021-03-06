package com.inyecciondependencias.inyecciondependencias;

import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String nombre;
    private String poblacion;
    private int edad;

    @Bean("bean1")
    public void bean1(){
        setNombre("bean1");
    }

    @Bean("bean2")
    public void bean2(){
        setNombre("bean2");
    }

    @Bean("bean3")
    public void bean3(){
        setNombre("bean3");
    }


}
