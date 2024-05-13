/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Pedro
 */
public class ImagemDirectorios implements Serializable {
    
  private String matricula;
  private ArrayList<String> carroImagens;
  
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<String> getCarroImagens() {
        return carroImagens;
    }

    public void setCarroImagens(ArrayList<String> carroImagens) {
        this.carroImagens = carroImagens;
    }
  
    
}
