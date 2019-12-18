package tom.tournement.game.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import tom.tournement.game.Entity.Game;

import java.util.UUID;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    public Game findByUuid(UUID uuid);

}
