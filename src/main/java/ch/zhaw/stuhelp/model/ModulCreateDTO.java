package ch.zhaw.stuhelp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ModulCreateDTO {
    
       private String name;
    private double price;
    private int etcs;
    private String spezialication;
   
}
