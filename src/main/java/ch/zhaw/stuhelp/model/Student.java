package ch.zhaw.stuhelp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Document("student")
public class Student {
    @Id
    private String id;
    @NonNull
    private String email;
    @NonNull
    private String name;
    @NonNull
    private String prename;
    @NonNull
    private String telephone;
    @NonNull
    private String school;
    @NonNull
    private String study;
    @NonNull
    private String matrikel;
}