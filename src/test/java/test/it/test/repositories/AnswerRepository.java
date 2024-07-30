package test.it.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.it.test.entities.Answer;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
