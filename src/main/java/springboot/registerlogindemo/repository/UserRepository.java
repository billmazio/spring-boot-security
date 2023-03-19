package springboot.registerlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.registerlogindemo.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
