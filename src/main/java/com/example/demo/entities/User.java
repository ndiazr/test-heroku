package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The persistent class for the Users database table.
 */
@Entity
@Table(name = "Users")
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity
{
    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 100)
    private String username;
}