import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CosCumparaturi {
    public static void main(String[] args) {
        List<String> cos = new ArrayList<>();
        faCos(cos);
        int n = 0;
        while (n!=-1) {
            n = meniu();
            switch (n) {
                case 1:
                    afiseazaCos(cos);
                    break;
                case 2:
                    cautaProdus(cos);
                    break;
                case 3:
                    stergeProdus(cos);
                    break;
                case 4:
                    modificaProdus(cos);
                    break;
                case 5:
                    adaugaProdus(cos);
                    break;
                case -1:
                    break;
                default :
                    System.out.println("Ati introdus gresit!");

            }
        }


    }
    public static int meniu() {
        System.out.println("Alegeti:");
        System.out.println(" 1 - pentru afisare cos");
        System.out.println(" 2 - pentru cautare produs");
        System.out.println(" 3 - pentru stergere produs");
        System.out.println(" 4 - pentru modificare produs");
        System.out.println(" 5 - pentru adaugare produs");
        System.out.println("-1 - pentru iesire");
        int nr = new Scanner(System.in).nextInt();
        return nr;
    }

    public static void faCos(List cos) {
        cos.add("lapte");
        cos.add("branza");
        cos.add("unt");
        cos.add("apa");
        cos.add("ulei");
        cos.add("zahar");
    }

    public static void afiseazaCos(List cos){
        System.out.println(cos);
    }

    public static void cautaProdus(List cos) {
        boolean b = false;
        System.out.print("Produsul cautat: ");
        String st = new Scanner(System.in).nextLine();
        if (cos.contains(st)) {
            b = true;
        }
        System.out.println(b ? "Produsul este in cos!" : "Produsul nu este in cos!");
    }

    public static void stergeProdus(List cos) {
        boolean b = false;
        System.out.print("Introduceti produsul pe care doriti sa il stergeti: ");
        String st = new Scanner(System.in).nextLine();
        if (cos.remove(st)) {
            b = true;
        }
        System.out.println(b ? "Produsul a fost sters din cos!" : "Produsul nu a fost gasit in cos!");
    }

    public static void modificaProdus(List cos) {
        boolean b = false;
        System.out.print("Produsul pe care doriti sa il modificati: ");
        String st1 = new Scanner(System.in).nextLine();
        if (!cos.contains(st1)) {
            System.out.println("Produsul nu a fost gasit in cos!");
        }
        else {
            System.out.print("Introduceti noul produs: ");
            String st2 = new Scanner(System.in).nextLine();
            int i = cos.indexOf(st1) ;
            cos.set(i,st2);
            System.out.println("Produsul a fost modificat!");
        }
    }

    public static void adaugaProdus(List cos) {
        System.out.print("Produsul pe care doriti sa il adaugati in cos: ");
        String st = new Scanner(System.in).nextLine();
        if (!st.equals("")) {
            if (cos.contains(st)) {
                System.out.println("Produsul mai exista deja, nu poate fi adaugat!");
            }
            else {
                cos.add(st);
                System.out.println("Produsul a fost adaugat in cos!");
            }
        }
        else {
            System.out.println("Nu ati introdus nimic!");
        }
    }

}


