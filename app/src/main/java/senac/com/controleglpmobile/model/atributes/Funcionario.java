package senac.com.controleglpmobile.model.atributes;

import java.util.List;

public class Funcionario extends Pessoa{

    private String cpf;
    private String matricula;
    private String usuario;
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, String cpf, String matricula, String usuario, Endereco endereco) {
        super(id, nome);
        this.cpf = cpf;
        this.matricula = matricula;
        this.usuario = usuario;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return " - " + cpf + " - " + usuario + " - " + matricula;
    }
}
