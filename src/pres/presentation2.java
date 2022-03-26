package pres;

import Doa.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(new File("/Users/loubna/IdeaProjects/esnet_/src/config.txt"));

        String daoClassName= scanner.nextLine();
        //on demande de charger une classe:
        // les classes qu'on utilise sont chargée une seule fois sous forme d'obj de type classe
        Class cDao= Class.forName(daoClassName); // forname va charger le bytecode dans la memoire si la classe existe sinon it throws an exception
        // comme new; instancier la classe
        // newinstance retourne un objet de type object
        // il faux faire un caste si on instancie la classe avec Idao
        IDao  dao= (IDao) cDao.newInstance();

        String metierClassName= scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        // chercher une methode avec le nom setDao dans cMetier
        Method method= cMetier.getMethod("setDao",IDao.class);
        // invoke execute la methode setDao sur l'obj metier on le passe dao comme parametre
        // comme metier.setDao(dao);
        method.invoke(metier, dao); // dynamique
        System.out.println("resultat :" + metier.calcul());
    }
}
