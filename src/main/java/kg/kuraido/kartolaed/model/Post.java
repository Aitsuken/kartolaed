package kg.kuraido.kartolaed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private UUID postId;
    private String groupId;
    private String imageId;

    private String description;
    private String postImageUrl;

    private long likes;
    private Timestamp dateCreated;



}
