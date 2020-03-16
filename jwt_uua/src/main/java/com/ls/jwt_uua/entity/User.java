package com.ls.jwt_uua.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_user")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;

    private String password;

    private String sex;

    private Integer type;
}
