package atv1;

public class Atribuicao{
    private  Professor professor ;
    private  Disciplina disciplina;
    public  Atribuicao(Professor professor , Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }
    public  Professor getProfessor (){
        return  this.professor;
    }
    public  Disciplina getDisciplina (){
        return this.disciplina;
    }
    public void setProfessor (Professor professor) {
        this.professor = professor;
    }
    public void setDisciplina (Disciplina disciplina){
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return   this.professor +
                "\n" + this.disciplina;
    }
}
