package senac.com.controleglpmobile.model.atributes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Serializable {

    private String nome;
    private List<String> listTelefones;
    private List<String> listEmail;

    public Pessoa() {
        listTelefones = new ArrayList<>();
        listEmail = new ArrayList<>();

    }

    public Pessoa(String nome, List<String> listTelefones, List<String> listEmail) {
        this.nome = nome;
        this.listTelefones = listTelefones;
        this.listEmail = listEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListTelefones() {
        return listTelefones;
    }

    public void setListTelefones(List<String> listTelefones) {
        this.listTelefones = listTelefones;
    }

    public List<String> getListEmail() {
        return listEmail;
    }

    public void setListEmail(List<String> listEmail) {
        this.listEmail = listEmail;
    }


}


