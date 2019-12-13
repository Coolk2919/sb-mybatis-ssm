package club.wyk.sbmybatisssm.Service;

import club.wyk.sbmybatisssm.entity.Dog;

import java.util.List;

public interface DogService {

    int insert(Dog dog);

    int update(Dog dog);

    int delete(int id);

    Dog getOne(int id);

    List<Dog> getList(Dog dog);

}
