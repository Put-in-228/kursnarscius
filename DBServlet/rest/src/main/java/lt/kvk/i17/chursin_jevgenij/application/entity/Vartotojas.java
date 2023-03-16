package lt.kvk.i17.chursin_jevgenij.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vartotojas")
public class Vartotojas {
    @Id
    private int id;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private String surname;
    @Column(length = 255)
    private String login;
    @Column(length = 255)
    private String password;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
