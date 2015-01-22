package ke.co.turbosoft.ttt.repository;

import ke.co.turbosoft.ttt.entity.TaskLog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskLogRepo extends JpaRepository<TaskLog, Long> {

}
