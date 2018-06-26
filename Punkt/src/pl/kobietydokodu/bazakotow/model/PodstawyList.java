package pl.kobietydokodu.bazakotow.model;

import java.util.ArrayList;
import java.util.List;

public class PodstawyList {
	public static void main(String[] args){
        //tworzymy tablic�
        List<String> lista = new ArrayList<String>();
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ci�gi znak�w
        lista.add("Asia");
        lista.add("Basia");
        lista.add("Krzysiek");
        lista.add("Wojtek");
 
        //sprawdzamy rozmiar listy
        System.out.println("Rozmiar listy to: "+lista.size());
 
        //usuwamy obiekt "Asia" i sprawdzamy rozmiar
        lista.remove("Asia");
        System.out.println("Rozmiar listy to: "+lista.size());
 
        //usuwamy obiekt zajmuj�cy 2 miejsce, czyli o indeksie 1 - u nas "Krzysiek"
        lista.remove(1);
        System.out.println("Rozmiar listy to: "+lista.size());
 
        //na koniec przypiszmy pierwszy element listy zmiennej imie i wy�wietlmy go
        //musimy u�y� rzutowania, poniewa� inaczej pr�bowaliby�my przypisa� Object do String
        String imie = (String)lista.get(0);
        System.out.println("Pierwszy element listy to: "+imie);
 
    }
}

