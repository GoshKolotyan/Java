package org.example;

public class Teacher {
    public String name;
    public String Role;
    public String email;

    public Teacher(String name,String Role,String email) {
     this.name = name;
     this.Role = Role;
     this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + Role + "  " + email ;
    }

}
