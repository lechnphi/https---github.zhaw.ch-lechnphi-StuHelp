package ch.zhaw.stuhelp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Document("modul")
public class Modul {
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private Double price;
    @NonNull
    private int etcs;
    @NonNull
    private String spezialication;
    private String studentId;
}