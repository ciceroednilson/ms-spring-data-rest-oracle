package br.com.ciceroednilson.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.ciceroednilson.custom.response.rest.CustomFuncionario;
import br.com.ciceroednilson.entity.FuncionarioEntity;


/***
 * ESSA INTERFACE VAI SER EXPOSTA COMO UM SERVIÇO REST, E AS OPERAÇÕES DEVEM SER CONTROLADAS
 * PELOS VERBOS HTTP(POST,GET,DELETE E PUT)
 * CrudRepository ou PagingAndSortingRepository
 * */
@RepositoryRestResource(path = "funcionarios", collectionResourceRel = "funcionarios", excerptProjection = CustomFuncionario.class)
public interface FuncionarioRepository extends PagingAndSortingRepository<FuncionarioEntity, Long>  {

	List<FuncionarioEntity> findByNome(@Param("nome") String nome); 
}