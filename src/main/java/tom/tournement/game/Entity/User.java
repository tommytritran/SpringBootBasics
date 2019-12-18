package tom.tournement.game.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id//Annotate this to be the primary key in db
    @GeneratedValue(generator = "uuid") //Defines what type the primary key is going to be
    @GenericGenerator(name = "uuid", strategy = "uuid2")// Enginge how to generate the primary key
    @Column(length = 16) //Required to query this param, hibernate translates uuid to BINARY(255) while a uuid is BINARY(16)
    @ApiModelProperty(required = false, hidden = true)
    private UUID uuid = UUID.randomUUID();

    @Column(name = "name") //Annotate the column name in db
    private String name;


}