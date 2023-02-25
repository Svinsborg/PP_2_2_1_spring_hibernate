package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    @Override
    public void add(Car car) { //TODO
    }
    @Override
    public Car getCarForId() {
        return null;
    } //TODO

    @Override
    public List<User> listCars() {
        return null;
    } //TODO
}
