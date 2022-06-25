package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Town {
    private String townName;
    private List<Dog> dogList;

    public Town(Dog dog) {
        this.townName = dog.getName() + dog.getType();
        dogList = new ArrayList<>();
        dogList.add(dog);
    }
}
