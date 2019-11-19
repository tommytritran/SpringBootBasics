package tom.tournement.game.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tom.tournement.game.Entity.Game;
import tom.tournement.game.Repository.GameRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Api(value = "Main controller for this WebApp")
@RestController
@AllArgsConstructor
public class GameController {

    private GameRepository gameRepo;

    @GetMapping("/game")
    @ApiOperation(value = "Get all games from DB")
    public List<Game> getAllGames(){
        return gameRepo.findAll();
    }

    @GetMapping("/game/{id}")
    @ApiOperation(value = "Get one specific game entity by ID (UUID)")
    public Game getGame(@PathVariable UUID id){return gameRepo.findByUuid(id);}

    @PostMapping("/game")
    @ApiOperation(value = "Add a game object to DB")
    public Game addGame(Game game){ return gameRepo.save(game);}
}
