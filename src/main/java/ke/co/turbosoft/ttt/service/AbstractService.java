package ke.co.turbosoft.ttt.service;

import java.util.List;



public interface AbstractService<T> {
	
	List<T> findAll();
	T findOne(Long id);
	void delete(T t);
	T save(T t);

}
