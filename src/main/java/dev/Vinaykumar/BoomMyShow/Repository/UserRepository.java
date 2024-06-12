package dev.Vinaykumar.BoomMyShow.Repository;

import dev.Vinaykumar.BoomMyShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByEmail(String email);
}
