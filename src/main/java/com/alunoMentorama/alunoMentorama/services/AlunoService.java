package com.alunoMentorama.alunoMentorama.services;

import com.alunoMentorama.alunoMentorama.domains.Aluno;
import com.alunoMentorama.exceptions.RecursoInexistente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    private final List<Aluno> alunoList;

    public AlunoService(List<Aluno> alunoList) {
        this.alunoList = new ArrayList<>();
    }

    public Boolean adicionarAluno(Aluno aluno) {
        try {
            if (aluno.getId() == null) {
                aluno.setId(alunoList.size() + 1);
            }
            alunoList.add(aluno);
            return Boolean.TRUE;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Nao foi possivel adicionar o aluno");
        }
    }

    public List<Aluno> findAll(String nome, Integer idade) {
        try {

            if (alunoList.stream().noneMatch(aluno -> aluno.getNome().contains(nome)) &&
                    alunoList.stream().noneMatch(aluno -> aluno.getIdade().equals(idade))) {
                throw new RuntimeException();
            }

            if (nome != null) {
                return alunoList.stream()
                        .filter(aln -> aln.getNome().toLowerCase()
                                .contains(nome.toLowerCase()))
                        .collect(Collectors.toList());
            }
            if (idade != null) {
                return alunoList.stream()
                        .filter(aln -> aln.getIdade().equals(idade))
                        .collect(Collectors.toList());
            }

            return alunoList;

        } catch (Exception e) {
            throw new RecursoInexistente();
        }
    }
}

