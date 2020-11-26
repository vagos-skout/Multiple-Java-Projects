package Competitor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhdStudent extends Master {
    protected String supervisorName;


    public PhdStudent(String name , Degree d , int numberOfSSubs , String dissertationTitle , String supervisorName){
        super(name , d , numberOfSSubs , dissertationTitle);
        super.setDissertationTitle(dissertationTitle);
        this.supervisorName = supervisorName;

    }

}
