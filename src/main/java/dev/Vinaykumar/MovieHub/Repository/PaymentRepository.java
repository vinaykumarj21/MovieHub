package dev.Vinaykumar.MovieHub.Repository;

import dev.Vinaykumar.MovieHub.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
