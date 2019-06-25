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


}
