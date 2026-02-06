public class Iteratore {
    private Nodo current;

    public Iteratore(Nodo head) {
        this.current = head;
    }

    public  Tecnica next() {
        if (current == null) {
            throw new NoSuchElementException("Non ci sono più elementi nella lista.");
        }
        Tecnica tecnica = current.getTecnica();
        current = current.getNext();
        return tecnica;
    }

    public boolean hasNext() {
        return current != null;
    }

}
