package com.alunoMentorama.exceptions;

import org.springframework.http.HttpStatus;

public class RecursoInexistente extends RuntimeException{
    private final HttpStatus httpStatus;

    public RecursoInexistente(final String mensagem, final HttpStatus httpStatus){
        super(mensagem);
        this.httpStatus = httpStatus;
    }
}
