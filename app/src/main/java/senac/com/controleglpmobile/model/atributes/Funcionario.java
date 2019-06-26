package senac.com.controleglpmobile.model.atributes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "funcionario")
public class Funcionario extends Pessoa{

    @DatabaseField(columnName = "cpf",canBeNull = false, width = 50)
    private String cpf;
    @DatabaseField(columnName = "matricula", canBeNull = false)
    private String matricula;
    @DatabaseField(columnName = "usuario", canBeNull = false)
    private String usuario;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
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
