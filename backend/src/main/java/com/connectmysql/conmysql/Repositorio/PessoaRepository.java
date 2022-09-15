package com.connectmysql.conmysql.Repositorio;

import com.connectmysql.conmysql.model.PessoaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel,Integer>{
    
}
