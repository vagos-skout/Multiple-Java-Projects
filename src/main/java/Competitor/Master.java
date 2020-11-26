package Competitor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Master extends Undergraduate {
    protected String dissertationTitle;

    public Master(String name , Degree d , int numberOfSSubs , String dissertationTitle){
        super(name , d ,numberOfSSubs);
        super.setDegreeDuration(1);
        this.dissertationTitle = dissertationTitle;
    }

}
