package Doa;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de donnée");
        double temp=Math.random()*50;
        return temp;
    }
}
