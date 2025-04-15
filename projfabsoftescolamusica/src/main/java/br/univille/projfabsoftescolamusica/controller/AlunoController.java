package br.univille.projfabsoftescolamusica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.univille.projfabsoftescolamusica.entity.Aluno;
import br.univille.projfabsoftescolamusica.service.AlunoService;

@RestController
@RequestMapping("/api/v1/aluno") //talvez falte um s no alunos
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> getAluno(){
        var listaAluno = service.getAll();
        return new ResponseEntity<List<Aluno>>(listaAluno, HttpStatus.OK);
        
    }
    @PostMapping
    public ResponseEntity<Aluno> postAluno(@RequestBody Aluno aluno){
        if(aluno == null){
            return ResponseEntity.badRequest().build();
        }
        if (aluno.getId() == 0){
            service.save(aluno);
            return new ResponseEntity<Aluno>(aluno, HttpStatus.OK);
        }
        
        return ResponseEntity.badRequest().build();
    }
}
