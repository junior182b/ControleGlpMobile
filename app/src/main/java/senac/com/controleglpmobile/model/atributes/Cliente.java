package senac.com.controleglpmobile.model.atributes;

import java.io.Serializable;
import java.util.List;

public class Cliente extends Pessoa implements Serializable {

    private String nomeSocial;
    private String cnpj;
    private Endereco endereco;
    private Caminhao caminhao;

    public Cliente() {
    }

    public Cliente(String nome, List<String> listTelefones, List<String> listEmail, String nomeSocial, String cnpj, Endereco endereco, Caminhao caminhao) {
        super(nome, listTelefones, listEmail);
        this.nomeSocial = nomeSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.caminhao = caminhao;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public void addTelefone(String novoFone){
        if(novoFone !=null && !novoFone.trim().isEmpty())
            listTelefones.add(novoFone);

    }
    public void addEmail(String novoEmail){
        if (novoEmail !=null && !novoEmail.trim().isEmpty())
            listEmail.add(novoEmail);

    }
    @Override
    public String toString() {
        String fones = "";
        for (String telefone : listTelefones) {
            fones += telefone + "\n";
        }
        String emails = "";
        for (String email:listEmail){
            email += email+"\n";
        }
        String retorno = "Telefone\n" + fones;
        retorno += "\n\n";
        retorno += "Emails\n"+emails;

        return retorno;
    }
}
