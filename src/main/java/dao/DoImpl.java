package dao;

public class DoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donne ");
        double tepm = 27;
        return tepm ;
    }
}