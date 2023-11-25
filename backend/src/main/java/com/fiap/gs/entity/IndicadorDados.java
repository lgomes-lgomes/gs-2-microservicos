package com.fiap.gs.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "INDICADOR_DADOS")
public class IndicadorDados {
	@Id
	@Column(name = "id_indicador", length = 10)
	@JoinColumn(name = "id_indicador")
	private String id_indicador;

	@Id
	@Column(name = "ano")
	private Integer ano;

	@Id
	@Column(name = "regiao", length = 50)
	private String regiao;

	@Column(name = "valor", precision = 5, scale = 2)
	private BigDecimal valor;

	@ManyToOne
	@JoinColumn(name = "id_indicador")
	private Indicador indicador;

	public IndicadorDados() {
	}

	public IndicadorDados(String id_indicador, Integer ano, String regiao, BigDecimal valor) {
		this.id_indicador = id_indicador;
		this.ano = ano;
		this.regiao = regiao;
		this.valor = valor;
	}

	public String getId_indicador() {
		return id_indicador;
	}

	public void setId_indicador(String id_indicador) {
		this.id_indicador = id_indicador;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Indicador getIndicador() {
		return indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}
}
