package neptune.admin.metiers;

import neptune.admin.entites.User;
import neptune.admin.orm.UserCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMetier implements IUserMetier {

    @Autowired
    private UserCRUD userCRUD;

    @Override
    public Boolean authentify(String email, String pwd) {
        User user = userCRUD.getUserByEmailAndPassword(email, pwd);
        if(user != null) {
            return true;
        }
        return false;
    }
}
