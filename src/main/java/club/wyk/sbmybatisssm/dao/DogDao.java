package club.wyk.sbmybatisssm.dao;

import club.wyk.sbmybatisssm.entity.Dog;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DogDao {

    @Insert("insert into dog(name,color,age)values(#{name},#{color},#{age})")
    int insert(Dog dog);

    @Update("update dog set name=#{name},color=#{color},age=#{age} where id=#{id}")
    int update(Dog dog);

    @Delete("delete from dog where id=#{id}")
    int delete(int id);

    @Select("select * from dog where id=#{id}")
    Dog getOne(int id);

    @Select("select * from dog where 1=1")
    List<Dog> getList(Dog dog);

}
