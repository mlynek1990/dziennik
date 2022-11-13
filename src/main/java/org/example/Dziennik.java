package org.example;
import java.util.*;
public class Dziennik {
    private List <Uczen> listaUczniow;

public void dodawanieUcznia(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj imie: ");
    this.listaUczniow.add(new Uczen(scanner.next(),scanner.next()));

}
}

