package ch.zhaw.stuhelp.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ch.zhaw.stuhelp.model.Modul;


public interface ModulRepository extends MongoRepository<Modul,String>{
    List<Modul> findByPriceLessThan(Double price);
    List<Modul> findByPriceBetween(Double min, Double max);

    Page<Modul> findByPriceLessThan(Double price, Pageable pageable);
    Page<Modul> findByPriceBetween(Double min, Double max, Pageable pageable);

}
