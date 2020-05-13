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
public class ListaCircula {

    private NoListaCircula prim;

    public ListaCircula() {
        this.prim = null;
    }

    //insere o valor v no ińıcio da lista
    public void inserInicio(int v) {
        NoListaCircula novo = new NoListaCircula();
        novo.setInfo(v);
        if (prim == null) {
            prim = novo;
            novo.setProx(novo);
        } else {
            NoListaCircula aux = prim;
            while (aux.getProx() != prim) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
            novo.setProx(prim);
            prim = novo;
        }
    }

    //insere o valor v no final da lista;
    public void insereFim(int v) {
        NoListaCircula novo = new NoListaCircula();
        novo.setInfo(v);
        if (prim == null) {
            prim = novo;
            novo.setProx(novo);
        } else {
            NoListaCircula aux = prim;
            while (aux.getProx() != prim) {
                aux = aux.getProx();
            }
            aux.setProx(novo);
            novo.setProx(prim);
        }
    }

    /*escreve no console todos os valores armazenados na
    lista (inteiros), separados por espa̧co em branco;*/
    public void imprime() {
        NoListaCircula aux = prim;
        NoListaCircula no = prim;
        System.out.print("Lista ");
        if (aux == null) {
            System.out.println("Lista vazia");
        }
        aux = aux.getProx();
        while (aux != prim) {
            System.out.print(" " + no);
            no = no.getProx();
            aux = aux.getProx();

        }
        System.out.println(" " + no);
    }

    /*semelhante ao m ́etodo anterior, poŕem os valores
    s̃ao “escritos” em uma String;*/
    public String toString() {
        NoListaCircula aux = prim;
        String s = "Lista " + aux + " ";
        if (aux == null) {
            System.out.println("Lista vazia");
        } else {
            aux = aux.getProx();
            while (aux != prim) {
                s = s + aux.toString() + " ";
                aux = aux.getProx();
            }
        }

        return s;
    }

    /*remove da lista o primeiro ńo que contiver o
    valor igual a v. Se nenhum n ́o com esse valor for encontrado, o m ́etodo
    ñao retira nenhum n ́o da lista;*/
    public void retira(int v) {
        NoListaCircula no = prim;
        if (prim == null) {
            System.out.println("Vazia");
            return;
        }
        if (comprimento() == 1 && no.getInfo() == v) {
            prim = null;
        }
        if (no.getInfo() == v) {
            removeInicio(v);
        }
        NoListaCircula aux = prim;
        no = no.getProx();
        while (no != prim && no.getInfo() != v ) {
            aux = no;
            no = no.getProx();
        }
        aux.setProx(no.getProx());
    }

    public void removeInicio(int v) {
        NoListaCircula no = prim;

        if (no == no.getProx()) {
            prim = null;
            return;
        } else {
            NoListaCircula aux = prim;
            while (aux.getProx() != prim) {
                aux = aux.getProx();
            }
            aux.setProx(prim.getProx());
            prim = prim.getProx();
        }
    }

    /*este ḿetodo destŕoi toda a lista (transformando-a em uma
    lista vazia);*/
    public void libera() {
        this.prim = null;
    }

    /*este m ́etodo retorna a referˆencia para o  ́ultimo
    ńo da lista. Se a lista estiver vazia, retorna null;*/
    public NoListaCircula ultimo() {
        NoListaCircula no = prim;
        NoListaCircula aux = null;
        if (comprimento() == 0) {
            return null;
        }
        no = no.getProx();
        while (no != prim) {
            no = no.getProx();
            if (no.getProx() == prim) {
                aux = no;
            }
        }
        return aux;
    }

    /* verifica se a lista atual  ́e igual `a
    lista l passada como parˆametro do m ́etodo. Para as duas listas serem
    iguais, elas devem armazenar valores iguais e na mesma ordem;*/
    public boolean igual(ListaCircula l) {
        NoListaCircula no = prim;
        NoListaCircula aux = no;

        if (no == null || l.prim == null) {
            return false;
        }
        int b = l.comprimento();
        int a = comprimento();
        if (a == b) {
            while (b != 0) {
                if (aux.getInfo() != l.prim.getInfo()) {
                    return false;
                }
                aux = aux.getProx();
                l.prim = l.prim.getProx();
                b--;
            }
        }
        return true;
    }
    // calcula e retorna a quantidade de n ́os da lista.

    public int comprimento() {
        NoListaCircula no = prim;

        if (prim == null) {
            return 0;
        }
        if (no == no.getProx()) {
            return 1;
        }
        no = no.getProx();
        int i = 1;
        while (no != prim) {
            no = no.getProx();
            i++;
        }
        return i;

    }
}
