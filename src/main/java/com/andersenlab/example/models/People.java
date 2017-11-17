package com.andersenlab.example.models;

 public class People {

     private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     private Integer age;

     public Integer getAge() {
         return age;
     }

     public void setAge(Integer age) {
         this.age = age;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         People people = (People) o;

         if (name != null ? !name.equals(people.name) : people.name != null) return false;
         return age != null ? age.equals(people.age) : people.age == null;
     }

     @Override
     public int hashCode() {
         int result = name != null ? name.hashCode() : 0;
         result = 31 * result + (age != null ? age.hashCode() : 0);
         return result;
     }
 }