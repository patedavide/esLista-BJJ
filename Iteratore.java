public class Iteratore {
    private Nodo current;

    public Iteratore(Nodo head) {
        this.current = head;
    }

    public  Tecnica next() {
        Tecnica tecnica = current.getTecnica();
        current = current.getNext();
        return tecnica;
    }

    public boolean hasNext() {
        return current != null;
    }

}
