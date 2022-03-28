package Metier;

import Doa.IDao;

public class MetierImp implements  IMetier{
    private IDao dao; //depender les interfaces est non pas les classes

    @Override
    public double calcul() {
        double temperature= dao.getData();
        double res=temperature*Math.cos(temperature*Math.PI)*5400;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }

}
