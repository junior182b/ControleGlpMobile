package senac.com.controleglpmobile.model.atributes;

import java.io.Serializable;

public class Endereco implements Serializable {

    private String cep;
    private String logradouto;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco() {
    }

    public Endereco(String cep, String logradouto, String numero, String bairro, String cidade, String estado, String pais) {
        this.cep = cep;
        this.logradouto = logradouto;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouto() {
        return logradouto;
    }

    public void setLogradouto(String logradouto) {
        this.logradouto = logradouto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
