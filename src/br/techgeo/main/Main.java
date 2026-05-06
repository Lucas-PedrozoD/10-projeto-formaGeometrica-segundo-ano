package br.techgeo.main;

import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.forma.Forma;
import br.techgeo.forma.Volume;
import br.techgeo.ponto.Ponto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ponto ponto;
        ArrayList<Forma> lista = new ArrayList<>();


        lista.add(new Cilindro(8,2,new Ponto(2,-3)));


        lista.add(new Circulo(10,new Ponto(-4,7)));


        lista.add(new Cilindro(3,7.5,new Ponto(1,1)));


        lista.add(new Circulo(1.5, new Ponto(2,3)));

        // impressão dos dados
        for (Forma forma : lista){
            System.out.println(forma);
            System.out.println();
        }

        //impressão das áreas
        System.out.println("Área: ");
        for (Forma forma : lista){
            System.out.println(forma.calcularArea());
            System.out.println();
        }

        //Impressão do volume
        System.out.println("Volume: ");
        for (Forma forma: lista){
            if (forma instanceof Volume){
                // forma.calcularVolume
                System.out.println(((Volume) forma).calcularVolume());
                System.out.println();
            }
        }


    }
}
