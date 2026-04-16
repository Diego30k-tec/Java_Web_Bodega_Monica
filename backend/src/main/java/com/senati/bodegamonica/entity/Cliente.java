package com.senati.bodegamonica.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;

// @Entity le dice a Hibernate que esta clase representa una tabla en la BD
@Entity
// @Table indica el nombre exacto de tabla en MYSQL o MariaDB
@Table(name = "productos")
public class Cliente {
    // @Id marca este campo como la clave primaria de la tabla
    // @GeneratedValue hace que el ID se genere automaticamente (AutoIncrement)
    // @Column(name="cliente_id") indica el nombre exacto de la columna en mysql
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    // nullable=false significa que este campo no puede estar vacio en la BD
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String categoria;
    //unique=true significa que no puede haber dos clientes con el mismo DNI
    //length=8 significa limita el campo a 8 caracteres
    @Column(nullable = false)
    private BigDecimal precio;
    @Column(nullable = false)
    private Integer stock;
    //Sin anotaciones ( @ ) extra: columna normal, puede ser nula
    //private String telefono;
    //private String direccion;

    //GETTER a SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}