package test.it.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.it.test.entities.Question;

public interface QuestionRepository extends JpaRepository<Question,Long> {

}
