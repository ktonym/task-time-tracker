package ke.co.turbosoft.ttt.repository;

import ke.co.turbosoft.ttt.entity.Company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, Long> {

}
