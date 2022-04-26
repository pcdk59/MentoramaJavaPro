package br.com.sistema.hospitalar.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class InternacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internacaoPaciente;
    private String nomePaciente;
    private String dataHoraEntrada;
    private String dataHoraSaida;
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private ProfissionalSaudeEntity profissional_saude;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private ProfissionalSaudeEntity paciente;

    public InternacaoEntity(){

    }

    public InternacaoEntity(Long internacaoPaciente, String nomePaciente,
                            String dataHoraEntrada, String dataHoraSaida,
                            String diagnostico, ProfissionalSaudeEntity profissional_saude,
                            ProfissionalSaudeEntity paciente) {

        this.internacaoPaciente = internacaoPaciente;
        this.nomePaciente = nomePaciente;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
        this.profissional_saude = profissional_saude;
        this.paciente = paciente;
    }

    public Long getInternacaoPaciente() {
        return internacaoPaciente;
    }

    public void setInternacaoPaciente(Long internacaoPaciente) {
        this.internacaoPaciente = internacaoPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ProfissionalSaudeEntity getProfissional_saude() {
        return profissional_saude;
    }

    public void setProfissional_saude(ProfissionalSaudeEntity profissional_saude) {
        this.profissional_saude = profissional_saude;
    }

    public ProfissionalSaudeEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(ProfissionalSaudeEntity paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternacaoEntity)) return false;
        InternacaoEntity that = (InternacaoEntity) o;
        return Objects.equals(getInternacaoPaciente(), that.getInternacaoPaciente()) && Objects.equals(getProfissional_saude(), that.getProfissional_saude()) && Objects.equals(getPaciente(), that.getPaciente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInternacaoPaciente(), getProfissional_saude(), getPaciente());
    }
}