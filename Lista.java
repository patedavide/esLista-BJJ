public class Lista {

    private int size;
    private Nodo head;
    private Nodo cursor; // coda

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public void aggiungiNodo(String valore) {
        if (valore == null) {
            return;
        }

        Nodo nuovoNodo = new Nodo(valore);

        if (head == null) {
            head = nuovoNodo;
            cursor = nuovoNodo;
        } else {
            cursor.setNext(nuovoNodo);
            cursor = nuovoNodo;
        }
        size++;
    }

    public void aggiungiInHead(String valore) {
        if (valore == null) {
            return;
        }

        Nodo nuovoNodo = new Nodo(valore);

        if (head == null) {
            head = nuovoNodo;
            cursor = nuovoNodo;
        } else {
            nuovoNodo.setNext(head);
            head = nuovoNodo;
        }
        size++;
    }

    public void aggiungiInCoda(String valore) {
        aggiungiNodo(valore);
    }

    public String rimuoviHead() {
        if (isVuota()) {
            return null;
        }

        String valore = head.getValore();
        head = head.getNext();
        size--;

        if (head == null) {
            cursor = null;
        }

        return valore;
    }

    public String rimuoviCoda() {
        if (isVuota()) {
            return null;
        }

        if (head == cursor) {
            String valore = head.getValore();
            head = cursor = null;
            size = 0;
            return valore;
        }

        Nodo corrente = head;
        while (corrente.getNext() != cursor) {
            corrente = corrente.getNext();
        }

        String valore = cursor.getValore();
        cursor = corrente;
        cursor.setNext(null);
        size--;

        return valore;
    }

    public boolean isVuota() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void stampaLista() {
        if (isVuota()) {
            System.out.println("Lista vuota.");
            return;
        }

        Nodo temp = head;
        while (temp != null) {
            System.out.println("→ " + temp.getValore());
            temp = temp.getNext();
        }
    }
}
