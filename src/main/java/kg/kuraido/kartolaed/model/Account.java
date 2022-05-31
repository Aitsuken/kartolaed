package kg.kuraido.kartolaed.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @Id
    private UUID id;
    private String internalId;
    private String firstName;
    private String lastName;
    private String email;
    //private String password;
    private String occupation;
    private String imageUrl;
    @Column(nullable=false, columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean active;
    private Timestamp dateCreated;

}
