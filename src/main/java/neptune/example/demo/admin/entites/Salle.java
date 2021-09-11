package neptune.example.demo.admin.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    private String libelle;
}
