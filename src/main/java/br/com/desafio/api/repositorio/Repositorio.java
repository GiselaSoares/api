package br.com.desafio.api.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.desafio.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    List<Pessoa> findAll();

    Pessoa save(Pessoa obj);
    
    Pessoa findByCodigo(int codigo);

    void delete(Pessoa obj);

    long count();

    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeByIdadeDesc(String nome);

}

