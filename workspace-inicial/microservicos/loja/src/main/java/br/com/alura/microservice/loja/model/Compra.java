package br.com.alura.microservice.loja.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;
	
	private LocalDate dataParaEntrega;
	
	private Long voucher;

	@Enumerated(EnumType.STRING)
	private CompraState state;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public void setDataParaEntrega(LocalDate previsaoParaEntrega) {
		this.dataParaEntrega = previsaoParaEntrega;
	}

	public LocalDate getDataParaEntrega() {
		return dataParaEntrega;
	}

	public Long getVoucher() {
		return voucher;
	}

	public void setVoucher(Long voucher) {
		this.voucher = voucher;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setState(CompraState recebido) {
		this.state = recebido;		
	}
	
	public CompraState getState() {
		return this.state;	
	}
	
	
}
