package modulo6;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class dateOfTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con formato dd-MM-yyyy'");

        try {
            java.util.Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
