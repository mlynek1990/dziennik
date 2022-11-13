package org.example;
import java.util.*;
public class Uczen {
    public String imie;
    public String nazwisko;
    private int[] matematyka = new int[4];
    private int[] polski = new int[4];
    private int[] historia = new int[4];
    private int[] przyrka = new int[4];

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Uczen() {

    }

    public void dodawanieOcenyMatematyka() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (matematyka[i] == 0) {
                System.out.println("Dodaj ocene z matematyki: ");
                matematyka[i] = scanner.nextInt();
                break;
            }
        }
    }
    public void dodawanieOcenyHistoria() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (historia[i] == 0) {
                System.out.println("Dodaj ocene z historii: ");
                historia[i] = scanner.nextInt();
                break;
            }
        }
    }
    public void dodawanieOcenyPolski() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (polski[i] == 0) {
                System.out.println("Dodaj ocene z polskiego: ");
                polski[i] = scanner.nextInt();
                break;
            }
        }
    }
    public void dodawanieOcenyPrzyrka() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (przyrka[i] == 0) {
                System.out.println("Dodaj ocene z przyrki: ");
                przyrka[i] = scanner.nextInt();
                break;
            }
        }
    }
    public void wyswietlanieOcen(){
        String ocenyMatematyka = "";
        for (int i=0;i<4;i++){
            if (matematyka[i]!=0){
                ocenyMatematyka += Integer.toString(i)+". "+Integer.toString(matematyka[i])+"\n";
            }
        }
        System.out.println("oceny z matematyki to:");
        System.out.println(ocenyMatematyka);

        String ocenyPolski = "";
        for (int i=0;i<4;i++){
            if (polski[i]!=0){
                ocenyPolski += Integer.toString(i)+". "+Integer.toString(polski[i])+"\n";
            }
        }
        System.out.println("oceny z polskiego to:");
        System.out.println(ocenyPolski);

        String ocenyHistoria = "";
        for (int i=0;i<4;i++){
            if (historia[i]!=0){
                ocenyHistoria += Integer.toString(i)+". "+Integer.toString(historia[i])+"\n";
            }
        }
        System.out.println("oceny z historii to:");
        System.out.println(ocenyHistoria);

        String ocenyPrzyrka = "";
        for (int i=0;i<4;i++){
            if (przyrka[i]!=0){
                ocenyPrzyrka+= Integer.toString(i)+". "+Integer.toString(przyrka[i])+"\n";
            }
        }
        System.out.println("oceny z przyry to:");
        System.out.println(ocenyPrzyrka);
    }
    public void usuwanieOcen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz przedmiot");
        System.out.println("1. matematyka");
        System.out.println("2. polski");
        System.out.println("3. historia");
        System.out.println("4. przyra");
        int wyborUzytkownika = scanner.nextInt();
        switch (wyborUzytkownika){
            case 1:
                System.out.println("Podaj indeks oceny");
                int indeks = scanner.nextInt();
                if (indeks==0){
                    matematyka[0] = 0;
                }
                if (indeks==1){
                    matematyka[1] = 0;
                }
                if (indeks==2){
                    matematyka[2] = 0;
                }
                if (indeks==3){
                    matematyka[3] = 0;
                } break;
            case 2:
                System.out.println("Podaj indeks oceny");
                int indeks1 = scanner.nextInt();
                if (indeks1==0){
                    polski[0] = 0;
                }
                if (indeks1==1){
                    polski[1] = 0;
                }
                if (indeks1==2){
                    polski[2] = 0;
                }
                if (indeks1==3){
                    polski[3] = 0;
                } break;
            case 3:
            System.out.println("Podaj indeks oceny");
            int indeks2 = scanner.nextInt();
            if (indeks2==0){
                historia[0] = 0;
            }
            if (indeks2==1){
                historia[1] = 0;
            }
            if (indeks2==2){
                historia[2] = 0;
            }
            if (indeks2==3){
                historia[3] = 0;
            } break;
            case 4:
                System.out.println("Podaj indeks oceny");
                int indeks3 = scanner.nextInt();
                if (indeks3==0){
                    przyrka[0] = 0;
                }
                if (indeks3==1){
                    przyrka[1] = 0;
                }
                if (indeks3==2){
                    przyrka[2] = 0;
                }
                if (indeks3==3){
                    przyrka[3] = 0;
                } break;

        }
    }
    public void sredniaPrzedmiotu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz przedmiot");
        System.out.println("1. matematyka");
        System.out.println("2. polski");
        System.out.println("3. historia");
        System.out.println("4. przyra");
        int wyborUzytkownika = scanner.nextInt();
        switch (wyborUzytkownika){
            case 1:
                int sumaOcenMatematyka = 0;
                int iloscOcenMatematyka = 0;
                for (int i=0;i<4;i++){
                    if(matematyka[i]!=0){
                        iloscOcenMatematyka++;
                        sumaOcenMatematyka += matematyka[i];
                    }
                }
                System.out.println(sumaOcenMatematyka/iloscOcenMatematyka);
                break;
            case 2:
                int sumaOcenPolski = 0;
                int iloscOcenPolski = 0;
                for (int i=0;i<4;i++){
                    if(polski[i]!=0){
                        iloscOcenPolski++;
                        sumaOcenPolski += matematyka[i];
                    }
                }
                System.out.println(sumaOcenPolski/iloscOcenPolski);
                break;
            case 3:
                int sumaOcenHistoria = 0;
                int iloscOcenHistoria = 0;
                for (int i=0;i<4;i++){
                    if(historia[i]!=0){
                        iloscOcenHistoria++;
                        sumaOcenHistoria += historia[i];
                    }
                }
                System.out.println(sumaOcenHistoria/iloscOcenHistoria);
                break;
            case 4:
                int sumaOcenPrzyrka = 0;
                int iloscOcenPrzyrka = 0;
                for (int i=0;i<4;i++){
                    if(przyrka[i]!=0){
                        iloscOcenPrzyrka++;
                        sumaOcenPrzyrka += matematyka[i];
                    }
                }
                System.out.println(sumaOcenPrzyrka/iloscOcenPrzyrka);
                break;

        }
    }
    //public void srednia
}