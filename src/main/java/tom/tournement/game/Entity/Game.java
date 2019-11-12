package tom.tournement.game.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "game")
public class Game {
    @Id//Annotate this to be the primary key in db
    @GeneratedValue(generator = "uuid") //Defines what type the primary key is going to be
    @GenericGenerator(name = "uuid", strategy = "uuid2")// Enginge how to generate the primary key
    @ApiModelProperty(required = false, hidden = true)
    private UUID uuid = UUID.randomUUID();

    @Column(name = "name") //Annotate the column name in db
    private String name;
}
