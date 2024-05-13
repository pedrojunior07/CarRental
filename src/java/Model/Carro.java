
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * 
 * @author Pedro
 * 
 * 
 */
public class Carro extends Veiculo implements carrosMetodos, Serializable {
private String modelo, tracao, descricao, matricula;
private int  quilometosPercoridos,km_litro,assentos;
private boolean disponivel;
private String  cor;
private ArrayList<String> images;


public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public int getKm_litro() {
        return km_litro;
    }

    public void setKm_litro(int km_litro) {
        this.km_litro = km_litro;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

   

    public int getQuilometosPercoridos() {
        return quilometosPercoridos;
    }

    public void setQuilometosPercoridos(int quilometosPercoridos) {
        this.quilometosPercoridos = quilometosPercoridos;
    }

    @Override
    public int getIdadeDoVeiculo(int anoDeFabrico) {
      Calendar c = Calendar.getInstance(); 
    return c.getWeekYear()- anoDeFabrico;
    }

    @Override
    public String estadoDoVeiculo(int quilometosPercoridos) {
    if(quilometosPercoridos>0)  { return "usado";}else
        return "novo";
    }
    
}
