package test.it.test.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.mockito.stubbing.Answer;

import java.util.List;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;
    private String questionText;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answear;
    @OneToOne(cascade= CascadeType.ALL)
    private Answer correctAnswer;

}
