package senac.com.controleglpmobile.model.atributes;

import java.util.List;

public class Funcionario extends Pessoa{

    private String cpf;
    private String matricula;
    private String usuario;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, String cpf, String matricula, String usuario) {
        super(id, nome);
        this.cpf = cpf;
        this.matricula = matricula;
        this.usuario = usuario;
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


    @Override
    public String toString() {
        return " - " + cpf + " - " + usuario + " - " + matricula;
    }
}
