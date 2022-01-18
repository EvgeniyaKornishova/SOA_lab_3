package ru.ifmo.soa.lab3.primaryBack.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.ifmo.soa.lab3.primaryBack.entities.DBLocation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
    private Integer x; //Поле не может быть null
    private Float y;
    private Float z;

    public DBLocation toDBLocation(){return new DBLocation(x, y, z);}
}
