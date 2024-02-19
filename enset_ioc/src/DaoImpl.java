public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        Se connecter à La BD recuperer temperature
         */
        double temp=Math.random()*40;
        return temp;
    }

}
