package com.medivoucher.cuponesfarmacia.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Medicamento {
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicamentoId;

    @Column(length = 50) @Required
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;
 
}

