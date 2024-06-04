package com.medivoucher.cuponesfarmacia.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity  
@Getter @Setter 

public class Marca {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMarca;

    @Column(length = 50) @Required
    private String nombre;
	
}
