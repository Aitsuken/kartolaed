package kg.kuraido.kartolaed.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,  updatable = false)
    private Long id;
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String occupation;
    private String imageUrl;

}
