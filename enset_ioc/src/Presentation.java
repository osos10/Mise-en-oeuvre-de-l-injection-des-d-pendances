public class Presentation {
    public static void main(String[] args) {
        // injection des depandences par  instanciation statique  ( new )
        DaoImpl2 dao=new DaoImpl2();
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
