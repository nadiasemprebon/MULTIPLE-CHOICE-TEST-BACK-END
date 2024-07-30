package test.it.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Answer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String answerText;

}
