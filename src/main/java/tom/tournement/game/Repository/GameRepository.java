package tom.tournement.game.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tom.tournement.game.Entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
