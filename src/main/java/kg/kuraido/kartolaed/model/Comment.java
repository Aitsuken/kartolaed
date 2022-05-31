package kg.kuraido.kartolaed.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    private UUID id;
    private UUID userId;
    private UUID postId;
    
    private Timestamp dateCreated;
    private String content;

}
