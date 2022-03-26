package pres;

import Doa.DaoImpl;
import Metier.IMetier;
import Metier.MetierImp;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImp metier= new MetierImp();
        metier.setDao(dao);
        System.out.println("resultat="+ metier.calcul());
    }
}
