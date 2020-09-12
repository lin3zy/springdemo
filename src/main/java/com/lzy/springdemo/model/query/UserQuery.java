package com.lzy.springdemo.model.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserQuery {
    private String id;
    private String name;
    private Integer age;
}
