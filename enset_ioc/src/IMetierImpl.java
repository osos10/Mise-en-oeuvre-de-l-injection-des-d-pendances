public class IMetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540;
        return res;
    }

    //injecter variable dao un objet d'une classe qui implement cet interface
    public void setDao(IDao dao){
        this.dao=dao;
    }

}
