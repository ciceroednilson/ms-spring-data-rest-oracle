package br.com.ciceroednilson.custom.response.rest;

import org.springframework.data.rest.core.config.Projection;

import br.com.ciceroednilson.entity.FuncionarioEntity;

/***
 * INTERFACE CRIADA PARA CUSTOMIZAR A SAÍDA DO RESPONSE DO NOSSO SERVIÇO REST
 * @author stp
 *
 */
@Projection(name="customFuncionario", types={FuncionarioEntity.class})
public interface CustomFuncionario {

	String getCodigo();
	String getNome();
	float getSalario();
}
