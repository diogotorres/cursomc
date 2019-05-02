package com.diogotorres.cursomc.domain;

import javax.persistence.Entity;

import com.diogotorres.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao  extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParecelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParecelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
