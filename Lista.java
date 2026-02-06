public class Lista {

    private Nodo head;
    private Nodo coda;
    private int size;

    public Lista() {
        head = null;
        coda = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Nodo getHead() {
        return head;
    }

    public void aggiungiOrdinato(Tecnica tecnica) {
        if (tecnica == null) return;

        Nodo nuovo = new Nodo(tecnica);

        if (head == null) {
            head = coda = nuovo;
        } else if (tecnica.getDifficolta() <= head.getTecnica().getDifficolta()) {
            nuovo.setNext(head);
            head = nuovo;
        } else {
            Nodo corrente = head;
            while (corrente.getNext() != null &&
                    corrente.getNext().getTecnica().getDifficolta() < tecnica.getDifficolta()) {
                corrente = corrente.getNext();
            }
            nuovo.setNext(corrente.getNext());
            corrente.setNext(nuovo);

            if (nuovo.getNext() == null) {
                coda = nuovo;
            }
        }

        size++;
    }

    public Tecnica rimuoviElemento(Tecnica tecnica) {
        if (head == null || tecnica == null) return null;

        Nodo corrente = head;
        Nodo precedente = null;

        while (corrente != null) {
            if (corrente.getTecnica() == tecnica) {
                if (precedente == null) {
                    head = corrente.getNext();
                    if (head == null) {
                        coda = null;
                    }
                } else {
                    precedente.setNext(corrente.getNext());
                    if (corrente == coda) {
                        coda = precedente;
                    }
                }

                size--;
                return corrente.getTecnica();
            }

            precedente = corrente;
            corrente = corrente.getNext();
        }

        return null;
    }

    public void stampaLista() {
        if (head == null) {
            System.out.println("Lista vuota");
            return;
        }

        Nodo corrente = head;
        while (corrente != null) {
            Tecnica t = corrente.getTecnica();
            System.out.println(t.getNome() + " (difficoltà: " + t.getDifficolta() + ", categoria: " + t.getCategoria() + ")");
            corrente = corrente.getNext();
        }
    }


}
