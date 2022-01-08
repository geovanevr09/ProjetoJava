/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import Model.Pessoa;
import View.JFRPrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geovane
 */
public class Principal {
     
    public static JFRPrincipal formprin;
    public static List<Pessoa>pessoas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pessoas = new ArrayList<>();
        
        formprin = new JFRPrincipal();
        formprin.setVisible(true);
    }
}
