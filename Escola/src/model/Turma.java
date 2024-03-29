package model;

import model.Aluno;
import model.Professor;

public class Turma {

    private Professor professor;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    private String disciplina;

    public Turma(Professor professor, Aluno aluno1, Aluno aluno2,
                 Aluno aluno3, String disciplina){
        this.professor = professor;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno1() {
        return aluno1;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public Aluno getAluno3() {
        return aluno3;
    }

    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}