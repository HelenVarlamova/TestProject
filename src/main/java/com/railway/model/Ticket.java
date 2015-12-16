package com.railway.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 19.10.2015.
 */
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {
    @Id
    @Column(name = "ticket_id")
    private long user_id;

    @Column(name = "number")
    private String number;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "train_ticket", joinColumns = { @JoinColumn(name = "ticket_id") }, inverseJoinColumns = { @JoinColumn(name = "train_id") })
    private Set<Train> train = new HashSet<Train>();

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Train> getTrain() {
        return train;
    }

    public void setTrain(Set<Train> train) {
        this.train = train;
    }
}
