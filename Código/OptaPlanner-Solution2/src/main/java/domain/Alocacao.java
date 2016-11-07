package domain;


import org.apache.commons.lang.builder.HashCodeBuilder;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Alocacao {
    private Horario horario;
    private Disciplina disciplina;
    private Professor professor;



    public Alocacao() {}

    public Alocacao(Disciplina disciplinaParam) {
        disciplina = disciplinaParam;
    }


    @PlanningVariable(valueRangeProviderRefs = {"horario"})
    public Horario getHorario() {
        return horario;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(1450207409, -1692382659)
                .append(disciplina.getNome()).toHashCode();
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
