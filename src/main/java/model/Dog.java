package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog {
    private String name;
    private String type;

    public Dog(String name) {
        this.name = name;
        this.type = "dog";
    }
}
