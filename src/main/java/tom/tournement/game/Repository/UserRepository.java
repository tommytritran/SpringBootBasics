package tom.tournement.game.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tom.tournement.game.Entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
}
