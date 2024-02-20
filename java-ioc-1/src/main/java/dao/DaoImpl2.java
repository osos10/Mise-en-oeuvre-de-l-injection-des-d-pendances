package dao;

import org.springframework.stereotype.Component;

//@Component("dao")

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("v2");
        double temp=Math.random()*1000;
        return temp;
    }
}
