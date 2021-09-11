package neptune.example.demo.admin.orm;

import neptune.example.demo.admin.entites.User;
import org.springframework.data.repository.CrudRepository;

public interface ReposSalle extends CrudRepository<User, Integer> {


}
