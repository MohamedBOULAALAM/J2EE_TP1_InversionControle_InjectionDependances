package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donne ");
        double tepm = 27;
        return tepm ;
    }
}