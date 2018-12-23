package br.com.ciceroednilson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="TB_FUNCIONARIOS")
public class FuncionarioEntity {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_funcionario")
	@SequenceGenerator(name="seq_funcionario", sequenceName="seq_funcionario", allocationSize=1)
	@Column(name="codigo")
	private Long codigo;
	
	@Column(name="nome")
	private String  nome;
	
	@Column(name="salario")
	private float  salario;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
