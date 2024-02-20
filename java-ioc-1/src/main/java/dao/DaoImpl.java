package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        /*
        Se connecter à La BD recuperer temperature
         */
        System.out.println("v1");
        double temp=Math.random()*40;
        return temp;
    }

}
