package presentation;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //Instance new DaoImp()
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            //Instance new MetieImp
            String metierClassName = scanner.nextLine();
            Class cMetierClass = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetierClass.getConstructor().newInstance();

            Method setDaoMeth = cMetierClass.getMethod("setDao", IDao.class);
            setDaoMeth.invoke(metier, dao);
            System.out.println(metier.calcul());
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
