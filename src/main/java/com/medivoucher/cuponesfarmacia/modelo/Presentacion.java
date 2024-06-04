package com.medivoucher.cuponesfarmacia.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Presentacion {
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPresentacion;

    @Column(length = 50) @Required
    private String descripcion;
}
