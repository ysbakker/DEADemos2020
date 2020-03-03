package oose.dea.dao;

import oose.dea.domain.Jedi;

import javax.enterprise.inject.Default;

@Default
public class JediDAO implements IJediDAO {

    @Override
    public Jedi getJedi(int customerId){
        if (customerId < 0){
            return null;
        }


        // TODO: This should come from the database
        Jedi jedi = new Jedi();
        jedi.setCustomerId(customerId);
        jedi.setName("Anakin Skywalker");
        jedi.setRank(2);
        jedi.setDarkside(false);

        return jedi;
    }
}
