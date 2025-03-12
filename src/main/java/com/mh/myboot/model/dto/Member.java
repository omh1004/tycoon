package com.mh.myboot.model.dto;



import lombok.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member  {

    private String userId;
    private String password;
    private String name;
    private String gender;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String[] hobby;
    private Date enrollDate=Date.valueOf(LocalDate.now());;


}

