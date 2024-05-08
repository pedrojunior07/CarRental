/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pedro
 */
import java.sql.Date;

public class Aluguer {
    
    
    private int IdCarro,idCliente;
    private Date dataInicio;
    private Date dataFim;
    private Boolean status;
    private double Preco;

   
    public int getIdCarro() {
        return IdCarro;
    }

    public void setIdCarro(int IdCarro) {
        this.IdCarro = IdCarro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
    public void Alugar(Date inicio, Date fim, int carro,int cliente){
    this.idCliente = cliente;
    this.Preco = 00;
    this.idCliente = carro;
    this.dataInicio = inicio;
    this.dataFim = fim;
    this.status = true;
    }
    
    
    
    
}
