package test.it.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.it.test.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
