package com.productsearch.product.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_Product")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	private String marca;
	private long codigo_barra;
	
	public Product() {	
	}
	
	public Product(long id, String descricao, String marca, long codigo_barra) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.codigo_barra = codigo_barra;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public long getCodigo_barra() {
		return codigo_barra;
	}


	public void setCodigo_barra(long codigo_barra) {
		this.codigo_barra = codigo_barra;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	} 

}
