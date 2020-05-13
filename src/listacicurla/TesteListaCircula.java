/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacicurla;

/**
 *
 * @author regis
 */
public class TesteListaCircula {

    public static void main(String[] args) {
        ListaCircula l = new ListaCircula();
        l.inserInicio(10);
        l.inserInicio(2);
        l.inserInicio(1);

        ListaCircula lista = new ListaCircula();
        lista.inserInicio(10);
        lista.inserInicio(2);
        lista.inserInicio(1);

        //System.out.println(l.ultimo());
        // System.out.println(l.igual(lista));
        // System.out.println(l.comprimento());
        l.retira(10);
        //l.removeInicio(18);
        // l.insereFim(77);
        //l.imprime();
        //l.insereFim(77);
        //l.libera();
        System.out.println(l.toString());
    }

}
