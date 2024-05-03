
package Model;

import DAO.FinacasDao;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Prestacoes implements Serializable{
    Venda venda;
  boolean status;
  private double valorPago, valorAPagar, valarMinimoMes;

    public double getValarMinimoMes() {
        return valarMinimoMes;
    }

    public void setValarMinimoMes(double valarMinimoMes) {
        this.valarMinimoMes = valarMinimoMes;
    }
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getValorPago() {
        return valorPago;
    }
    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    public double getValorAPagar() {
        return valorAPagar;
    }
    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    
    
    public double percentagemPago(){
    return ((100*(valorPago/venda.getPrecoDaVenda())));
    }
    
    public void pagarPrestacao(double cash ){
   
    if(cash<=valorAPagar){
     valorAPagar = valorAPagar- cash;
    valorPago = valorPago + cash;
    
    }else if(valorAPagar == 0){
    JOptionPane.showMessageDialog(null, "Prestacoes Concluidas", "Prestacoes", JOptionPane.INFORMATION_MESSAGE);
    
    } else if(cash>valorAPagar){
    
     valorAPagar = valorAPagar- valorAPagar;
    valorPago = valorPago + (valorAPagar);
        JOptionPane.showConfirmDialog(null, "Valor a mais, Troco = "+(cash-valorAPagar));
    }
    
        FinacasDao dao =new FinacasDao();
        ArrayList<Financas> openFile = dao.openFile();
        openFile.get(0).setSaldo((openFile.get(0).getSaldo()+valorPago));
        dao.insert(openFile.get(0));
    
    }
    
}
