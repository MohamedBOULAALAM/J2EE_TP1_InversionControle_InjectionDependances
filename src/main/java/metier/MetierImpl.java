package metier;
import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao ; // coupalge faible (depend d'interface)
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t+20;
        return res;
    }

    /**
     * Pour injecter dans la variable dao un objet
     * d'une classe qui implémente l'interface IDao
     * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
