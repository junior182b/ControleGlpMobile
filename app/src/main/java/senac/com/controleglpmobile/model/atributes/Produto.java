package senac.com.controleglpmobile.model.atributes;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@DatabaseTable(tableName = "produto")
public class Produto implements Serializable {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Integer id;
    @DatabaseField(columnName = "tipoProd", canBeNull = false, width = 150)
    private String tipoProd;
    @DatabaseField(columnName = "situacao", canBeNull = false, width = 150)
    private boolean situacao;
    @DatabaseField(columnName = "quantidade", canBeNull = false, width = 150)
    private int quantidade;
    @DatabaseField(columnName = "marca", canBeNull = false, width = 150)
    private String marca;


    public Produto(Integer id, String tipoProd, Boolean situacao, int quantidade, String marca) {
        this.id = id;
        this.tipoProd = tipoProd;
        this.situacao = situacao;
        this.quantidade = quantidade;
        this.marca = marca;
    }

    public Produto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", tipoProd='" + tipoProd + '\'' +
                ", situacao=" + situacao +
                ", quantidade=" + quantidade +
                ", marca='" + marca + '\'' +
                '}';
    }
}