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
    private Carro carro;
    private Cliente Cliente;
    private Date dataInicio;
    private Date dataFim;
    private Boolean status;
    private double Preco;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
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
    
    public void Alugar(Date inicio, Date fim, Carro carro,Cliente cliente){
    this.Cliente = cliente;
    this.Preco = 00;
    this.carro = carro;
    this.dataInicio = inicio;
    this.dataFim = fim;
    this.status = true;
    }
    
    
    
    
}
