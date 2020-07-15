/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6desafio6;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Questao6desafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6-	Uma loja tem 150 clientes cadastrados 
        //e deseja mandar uma correspondência a cada 
        //um deles anunciando um bônus especial. 
        //Escreva um algoritmo que leia o nome do cliente
        //e o valor das suas compras no ano passado e calcule
        //um bônus de 10% se o valor das compras for menor que
        //500.000 e de 15 %, caso contrário.
        
        
        //ValorCom * 0.1 = 10.0/100.0
        //ValorCom * 0.15 = 15.0/100.0
        
         int cont;
       String nome,perc="", res="Listagem Dos Bônus\n\n"
               + " Nome   ValorR$   Bônus \n";
       double valorCom, bonus;
       
       for(cont=1; cont<=2;cont++){
           nome = JOptionPane.showInputDialog("Informe o nome:");
           valorCom = Double.parseDouble(JOptionPane.
                   showInputDialog("Informe o valor da compra no ano passado:"));
           if(valorCom <= 500000){
               bonus = valorCom * 0.1;
               perc = "10%";
           }else{
               bonus = valorCom * 0.15;
               perc = "15%";
           }
           res = res + " "+nome+" - R$"+valorCom
                   +" - obteve - "+perc+" no valor de R$ "+bonus+"\n";
           
       }
       JOptionPane.showMessageDialog(null, res);
    }
    
}
