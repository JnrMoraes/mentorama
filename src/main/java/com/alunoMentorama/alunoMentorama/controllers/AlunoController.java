package com.alunoMentorama.alunoMentorama.controllers;

import com.alunoMentorama.alunoMentorama.domains.Aluno;
import com.alunoMentorama.alunoMentorama.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Integer> adicionarAluno(@RequestBody Aluno aluno) {
        alunoService.adicionarAluno(aluno);
        return new ResponseEntity<>(aluno.getId(), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Integer idade) {

            return ResponseEntity.status(HttpStatus.OK)
                                 .body(this.alunoService.findAll(nome, idade));
    }
}
