package web.dao;

import web.model.CarMy;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(CarMy carMy) {
        sessionFactory.getCurrentSession().save(carMy);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<CarMy> listCars() {
        TypedQuery<CarMy> query = sessionFactory.getCurrentSession().createQuery("from CarMy");
        return query.getResultList();
    }

    @Override
    public CarMy getUserByNumberAndSeries(String number, int series) {
        String sql = "select c from CarMy c where c.number= :number and c.series= :series";

        CarMy carMy = (CarMy) sessionFactory
                .openSession().createQuery(sql)
                .setParameter("number", number)
                .setParameter("series", series)
                .uniqueResult();

        return carMy;

    }

}
