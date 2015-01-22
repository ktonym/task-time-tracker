package ke.co.turbosoft.ttt.repository;

import ke.co.turbosoft.ttt.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
