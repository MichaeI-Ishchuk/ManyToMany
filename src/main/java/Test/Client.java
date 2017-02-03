package Test;

import javax.persistence.*;

/**
 * Created by nata on 26.01.2017.
 */


@Entity
@Table (name="clients")
public class Client {

    @Id
    @GeneratedValue
    int id;

    @Column (name="name")
        String name;


    @Column (name="surname")
    String surname;




    public Client() {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}


