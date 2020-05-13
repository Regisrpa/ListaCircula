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
public class NoListaCircula {

    private int info;
    private NoListaCircula prox;

    public void setInfo(int v) {
        this.info = v;
    }

    public void setProx(NoListaCircula p) {
        this.prox = p;
    }

    public int getInfo() {
        return this.info;
    }

    public NoListaCircula getProx() {
        return this.prox;
    }

    public String toString() {
        return "" + info;
    }
}
