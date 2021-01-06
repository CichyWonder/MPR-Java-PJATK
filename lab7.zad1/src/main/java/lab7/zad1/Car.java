package lab7.zad1;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Car {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String make;
    private String registartion;



    public void setMake(String make){
        this.make = make;
    }


    public void setRegistartion(String registartion){
        this.registartion=registartion;
    }

    public String getMake(){
        return this.make;
    }


    public String getRegistartion(){
        return this.registartion;
    }

    public Long getId() {
        return this.id;
    }
}
