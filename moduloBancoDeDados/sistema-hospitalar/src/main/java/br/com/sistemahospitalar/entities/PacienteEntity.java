package br.com.sistemahospitalar.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "paciente")
public class PacienteEntity {

    @Id
    @GeneratedValue
    @ManyToMany(mappedBy = "id_paciente")
    private Long id;


//    @JoinColumn(name = "nome")
    private String nome;

//    @Column(name = "telefone")
    private String telefone;

//    @Column(name = "data_aniversario")
    private String dataAniversario;

//    @OneToOne(mappedBy = "idPaciente")
//      private List<PacienteEntity> pacienteEntities;

    public PacienteEntity(Long id, String nome, String telefone, String dataAniversario) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataAniversario = dataAniversario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
