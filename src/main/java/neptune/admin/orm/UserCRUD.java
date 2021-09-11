package neptune.admin.orm;

import neptune.admin.entites.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserCRUD extends CrudRepository<User, Integer> {

    @Query("SELECT p from User p where  p.email = :email and  p.password = :pwd")
    public User getUserByEmailAndPassword(@Param("email") String email, @Param("pwd") String password);

}
