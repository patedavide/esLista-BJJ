public class Main {
    public static void main(String[] args){
        Lista listaTecniche = new Lista();

        Tecnica t1 = new Tecnica("RNC", 3, Tecnica.Categoria.SOTTOMISSIONE);
        Tecnica t2 = new Tecnica("Kimura", 2, Tecnica.Categoria.SOTTOMISSIONE);
        Tecnica t3 = new Tecnica("Leva al braccio", 4, Tecnica.Categoria.PROIEZIONE);
        Tecnica t4 = new Tecnica("Americana", 5, Tecnica.Categoria.SOTTOMISSIONE);
        Tecnica t5 = new Tecnica("Triangolo", 5, Tecnica.Categoria.SOTTOMISSIONE);

        listaTecniche.aggiungiOrdinato(t1);
        listaTecniche.aggiungiOrdinato(t2);
        listaTecniche.aggiungiOrdinato(t3);
        listaTecniche.aggiungiOrdinato(t4);
        listaTecniche.aggiungiOrdinato(t5);

        System.out.println("\nTecniche della lista :");
        stampaConIteratore(listaTecniche);

        listaTecniche.rimuoviElemento(t4);
        System.out.println("\nTecniche dopo rimozione di Americana :");
        stampaConIteratore(listaTecniche);

        System.out.println("\nTecniche con metodo tradizionale:");
        listaTecniche.stampaLista();
    }

    public static void stampaConIteratore(Lista lista) {
        Iteratore iter = lista.getIteratore();

        if (!iter.hasNext()) {
            System.out.println("Lista vuota");
            return;
        }

        while (iter.hasNext()) {
            Tecnica t = iter.next();
            System.out.println(t.getNome() + " (difficoltà: " + t.getDifficolta() +
                    ", categoria: " + t.getCategoria() + ")");
        }
    }
}
