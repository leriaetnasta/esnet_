package ext;

import Doa.IDao;

public class DoaImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp=6000;
        return temp;
    }
}
