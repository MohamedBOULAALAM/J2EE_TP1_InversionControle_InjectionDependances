package presentation;   
import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection des dépendances
        par instantiation statique (new)
        */
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d); // injection via le setter
        System.out.println("Resultat : " + metier.calcul());
    }
}