package com.restback.todolist.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Todo implements Serializable {
    @Getter
    private int no;
    @NonNull
    @Getter
    @Setter
    private int user_no;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String content;
    @Getter
    @Setter
    private boolean is_done;
    @Getter
    @Setter
    private int priority;
    @Getter
    @Setter
    private String reg_date;
    @Getter
    @Setter
    private String end_date;
}
