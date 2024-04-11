package br.dev.biraneves.ebac.generics.app;

import br.dev.biraneves.ebac.generics.classes.FabricanteDeAutomoveis;
import br.dev.biraneves.ebac.generics.classes.Honda;
import br.dev.biraneves.ebac.generics.classes.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<FabricanteDeAutomoveis> lista = new ArrayList<>();

        FabricanteDeAutomoveis marca1 = new Honda();
        FabricanteDeAutomoveis marca2 = new Volkswagen();

        lista.add(marca1);
        lista.add(marca2);

        for (FabricanteDeAutomoveis marca : lista) {
            marca.imprimeMarca();
        }

    }

}