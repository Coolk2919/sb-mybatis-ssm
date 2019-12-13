package club.wyk.sbmybatisssm.Service.Impl;

import club.wyk.sbmybatisssm.Service.DogService;
import club.wyk.sbmybatisssm.dao.DogDao;
import club.wyk.sbmybatisssm.entity.Dog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Resource
    private DogDao dogDao;

    @Override
    public int insert(Dog dog) {
        return dogDao.insert(dog);
    }

    @Override
    public int update(Dog dog) {
        return dogDao.update(dog);
    }

    @Override
    public int delete(int id) {
        return dogDao.delete(id);
    }

    @Override
    public Dog getOne(int id) {
        return dogDao.getOne(id);
    }

    @Override
    public List<Dog> getList(Dog dog) {
        return dogDao.getList(dog);
    }
}
