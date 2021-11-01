package com.cabinet.sitecabinet.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Angajat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nume;
    private String prenume;
    private String imageurl;
     public  Angajat(){

     }
    public Angajat(Long id, String nume, String prenume, String imageurl) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.imageurl = imageurl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
