/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Pedro
 */
public class Carro extends Veiculo implements carrosMetodos, Serializable {
private String modelo, tracao, descricao;
private int  quilometosPercoridos ,dirId;
private boolean disponivel;
private String  cor;
String[] diretorios;

//SEGUROS


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

    public String[] getDiretorios() {
        return diretorios;
    }

    public void setDiretorios(String[] diretorios) {
        this.diretorios = diretorios;
    }


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDirId() {
        return dirId;
    }

    public void setDirId(int dirId) {
        this.dirId = dirId;
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
