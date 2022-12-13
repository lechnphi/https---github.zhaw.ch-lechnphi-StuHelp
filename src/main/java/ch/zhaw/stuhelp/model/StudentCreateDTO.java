package ch.zhaw.stuhelp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class StudentCreateDTO {
    private String email;
    private String name;
    private String prename;
    private String telephone;
    private String school;
    private String study;
    private String matrikel;
}