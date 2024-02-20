package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    // Couplage faible
    @Autowired
    //@Qualifier("dao2")
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
