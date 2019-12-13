package club.wyk.sbmybatisssm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dog {

    private Integer id;
    private String name;
    private String color;
    private Integer age;

}
