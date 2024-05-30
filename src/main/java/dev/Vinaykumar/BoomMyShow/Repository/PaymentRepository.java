package dev.Vinaykumar.BoomMyShow.Repository;

import dev.Vinaykumar.BoomMyShow.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
