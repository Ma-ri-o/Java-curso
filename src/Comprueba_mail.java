import javax.swing.*;
import java.util.Scanner;

public class Comprueba_mail {

    public static void main(String[] args) {

        boolean arroba=false;

        String mail= JOptionPane.showInputDialog("Introduce mail");

        for ( int i=0; i<mail.length(); i++){

            if(mail.charAt(i)=='@'){

                arroba=true;
            }

        }
        if(arroba==true){

            System.out.println("es correcto");
        }
        else {
            System.out.println(" no es correcto");

        }

    }

}
