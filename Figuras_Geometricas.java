/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;

import javax.swing.JOptionPane;

/**
 *
 * @author MAYRA
 */
public class Figuras_Geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rectangulo,codigo,base,altura;
        double area;
        codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de la figura \n 1.Rectangulo \n 2.Cuadrado \n 3.Circulo"));
        if (codigo==1){
        base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
        altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura"));
        area=base*altura;
        JOptionPane.showMessageDialog(null,"El area de un rectangulo es: "+area);
        }

    }
    //ESTO ES UN EJEMPLO
}
