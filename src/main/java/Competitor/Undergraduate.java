package Competitor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data



public class Undergraduate {

    protected String name;
    protected Degree d;
    protected int numberofSSubs;
    protected int degreeDuration = 4;

    public Undergraduate(String name  , Degree d , int numberOfSSubs){
        this.name = name;
        this.d = d;
        this.numberofSSubs = numberOfSSubs;
    }



}
