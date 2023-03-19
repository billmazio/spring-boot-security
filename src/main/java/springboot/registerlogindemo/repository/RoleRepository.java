package springboot.registerlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.registerlogindemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
