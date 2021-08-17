package com.alunoMentorama.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GenericAdvice {

    @ExceptionHandler({RecursoInexistente.class})
    public ResponseEntity<String> handle(final RecursoInexistente e){
        return new ResponseEntity<>("Aluno não existente", HttpStatus.NOT_FOUND);
    }
}
