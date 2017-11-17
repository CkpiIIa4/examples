package com.andersenlab.example.models;

public class Policeman extends People {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private Integer age;

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Policeman policeman = (Policeman) o;

        if (name != null ? !name.equals(policeman.name) : policeman.name != null) return false;
        return age.equals(policeman.age);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age.hashCode();
        return result;
    }
    private String uniform;

    public String getUniform() {
        return uniform;
    }
}
