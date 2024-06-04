package com.medivoucher.cuponesfarmacia.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

public class Cupon {
    
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCupon;

    @Column(length = 50) @Required
    private String digitos;

    @Column(length = 50) @Required
    private String descripcion;

    @Temporal(TemporalType.DATE) @Required
    private Date fechaExpiracion;

    @ManyToOne
    @JoinColumn(name = "idFarmacia")
    private Farmacia farmacia;

    @ManyToOne
    @JoinColumn(name = "idPromocion")
    private Promocion promocion;
}
