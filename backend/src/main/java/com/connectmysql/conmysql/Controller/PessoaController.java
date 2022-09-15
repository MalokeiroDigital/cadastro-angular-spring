package com.connectmysql.conmysql.Controller;

import java.util.List;

import com.connectmysql.conmysql.Repositorio.PessoaRepository;
import com.connectmysql.conmysql.model.PessoaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository repositorio;

    @GetMapping(value="/api/{nome}")
    public List<PessoaModel> add(@PathVariable String nome){
        PessoaModel pessoa = new PessoaModel();
        pessoa.setNome(nome);
        this.repositorio.save(pessoa);
        
        return this.getAll();
    }

    @GetMapping(value="/listar")
    public List<PessoaModel> getAll(){
       return this.repositorio.findAll();
    }
}
