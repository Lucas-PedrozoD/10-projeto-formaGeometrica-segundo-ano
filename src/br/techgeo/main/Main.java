package br.techgeo.main;

import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.ponto.Ponto;

public class Main {
    public static void main(String[] args) {
        Ponto ponto;

        //cilindro
        System.out.println("Cilindro");
        ponto = new Ponto(2,-3);
        Cilindro cilindro = new Cilindro(8,2,ponto);
        System.out.println("área = " + cilindro.calcularArea());
        System.out.println("volume = " + cilindro.calcularVolume());

        //circulo
        System.out.println("Circulo");
        ponto = new Ponto(-4,7);
        Circulo circulo = new Circulo(10,ponto);
        System.out.println("área = "+ circulo.calcularArea());


    }
}
