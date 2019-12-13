package club.wyk.sbmybatisssm.web;

import club.wyk.sbmybatisssm.Service.DogService;
import club.wyk.sbmybatisssm.entity.Dog;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dog")
@Api(value = "宠物管理类")
public class DogController {

    @Resource
    private DogService dogService;

    @PostMapping("/insert")
    public String insert(Dog dog) {
        int result = dogService.insert(dog);
        if (result == 1) {
            return "success";
        } else {
            return "failure";
        }
    }

    @PutMapping("/update/{id}")
    public String update(Dog dog) {
        int result = dogService.update(dog);
        if (result == 1) {
            return "success";
        } else {
            return "failure";
        }
    }

    @DeleteMapping("/get/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        int result = dogService.delete(id);
        if (result == 1) {
            return "success";
        } else {
            return "failure";
        }
    }

    @GetMapping("/get/{id}")
    public Dog getOne(@PathVariable("id") Integer id) {
        return dogService.getOne(id);
    }

    @GetMapping("/list")
    public List<Dog> getList(Integer page, Integer pageSize) {
        if (page != null && pageSize != null) {
            PageHelper.startPage(page, pageSize);
            return dogService.getList(new Dog());
        } else {
            return dogService.getList(new Dog());
        }
    }
}
