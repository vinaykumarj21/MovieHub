package dev.Vinaykumar.MovieHub.Model;

import dev.Vinaykumar.MovieHub.Model.Enums.PaymentMode;
import dev.Vinaykumar.MovieHub.Model.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private LocalDateTime paymentTime;
    private String refId;
    private double amount;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
}
