package ru.ifmo.soa.lab3.primaryBack.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.ifmo.soa.lab3.primaryBack.entities.DBCoordinates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Coordinates {
    private Long x; //Значение поля должно быть больше -375
    private Double y; //Максимальное значение поля: 796, Поле не может быть null

    public DBCoordinates toDBCoordinates() {
        return new DBCoordinates(x, y);
    }
}

