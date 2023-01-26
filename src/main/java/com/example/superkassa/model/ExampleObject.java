package com.example.superkassa.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "sk_example_table")
public class ExampleObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "obj")
    private Json obj;

    public int getId() {
        return id;
    }

    public Json getObj() {
        return obj;
    }

    public void setObj(Json obj) {
        this.obj = obj;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ExampleObject() {
    }

}
