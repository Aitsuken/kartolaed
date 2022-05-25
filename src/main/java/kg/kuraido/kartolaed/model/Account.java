package kg.kuraido.kartolaed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Column(nullable = false,  updatable = false)
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String occupation;
    private String ImageUrl;

}
