package aulajavaspringboot.userdpt.repositories;

import aulajavaspringboot.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
