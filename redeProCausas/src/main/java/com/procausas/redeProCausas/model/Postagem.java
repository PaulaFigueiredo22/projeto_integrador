package com.procausas.redeProCausas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=5, max=100)
	private String post_titulo;
	
	@NotNull
	@Size(min=100, max=10000)
	private String post_texto;
	
	@NotNull
	private String post_cidade;
	
	@NotNull
	private String post_estado;
	
	@NotNull
	private String post_endereco;
	
	private String post_tag;
	
	private String post_url;
	
	private String post_imagem;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPost_titulo() {
		return post_titulo;
	}

	public void setPost_titulo(String post_titulo) {
		this.post_titulo = post_titulo;
	}

	public String getPost_texto() {
		return post_texto;
	}

	public void setPost_texto(String post_texto) {
		this.post_texto = post_texto;
	}

	public String getPost_cidade() {
		return post_cidade;
	}

	public void setPost_cidade(String post_cidade) {
		this.post_cidade = post_cidade;
	}

	public String getPost_estado() {
		return post_estado;
	}

	public void setPost_estado(String post_estado) {
		this.post_estado = post_estado;
	}

	public String getPost_endereco() {
		return post_endereco;
	}

	public void setPost_endereco(String post_endereco) {
		this.post_endereco = post_endereco;
	}

	public String getPost_tag() {
		return post_tag;
	}

	public void setPost_tag(String post_tag) {
		this.post_tag = post_tag;
	}

	public String getPost_url() {
		return post_url;
	}

	public void setPost_url(String post_url) {
		this.post_url = post_url;
	}

	public String getPost_imagem() {
		return post_imagem;
	}

	public void setPost_imagem(String post_imagem) {
		this.post_imagem = post_imagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	

}
