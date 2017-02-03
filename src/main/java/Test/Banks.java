package Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nata on 26.01.2017.
 */

@Entity
@Table(name="banks")
public class Banks {

        @Id
        @GeneratedValue
        int id;


    @Column (name="bank_name")
    String name;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})

    List<Client> clientList = new ArrayList<Client>();

    public Banks() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
