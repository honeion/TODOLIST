package com.restback.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    @Getter
    private int no; // int PRIMARY KEY AUTO_INCREMENT, # 게시판 관리 번호 기본키, 자동증가
    @Getter
    @Setter
    private String id; // varchar(200) NOT NULL , # 게시판 이름(회원아이디로)
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String name;

}
