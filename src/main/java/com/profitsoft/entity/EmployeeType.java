package com.profitsoft.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee_types")
public class EmployeeType {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "type_name")
    private String typeName;

    public EmployeeType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "EmployeeType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeType)) return false;
        EmployeeType that = (EmployeeType) o;
        return id == that.id &&
                typeName.equals(that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeName);
    }
}
