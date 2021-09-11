package neptune.admin.orm;

import neptune.admin.entites.User;
import org.springframework.data.repository.CrudRepository;

public interface ReposSalle extends CrudRepository<User, Integer> {


}
