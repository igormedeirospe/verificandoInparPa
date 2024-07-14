import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //verificando se o numero é inpar ou pá

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if(numero % 2 == 0){
            System.out.println("seu numero é par " + numero);

        }else {
            System.out.println("inpar " + numero);
        }


    }
}