package com.zhujun.learnspringboot;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import java.time.LocalDate;

@Data
public class User {

    @NotBlank(message = "名字不能为空")
    private String name;

    @Min(value = 1, message = "年龄不能小于 1")
    private int age;

    @Email(message = "E-mail 格式不正确")
    private String email;

    @Past(message = "生日必须为过去的时间")
    private LocalDate birthday;
}
