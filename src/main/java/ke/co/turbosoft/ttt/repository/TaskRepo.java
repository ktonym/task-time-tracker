package ke.co.turbosoft.ttt.repository;

import ke.co.turbosoft.ttt.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
