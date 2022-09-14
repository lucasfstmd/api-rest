package ApiRest.restapiMYSQL.repository;

import ApiRest.restapiMYSQL.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {



}
