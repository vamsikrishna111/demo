package com.sairam.demo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface formRepoistory extends CrudRepository<Form,Long> {
// List<Form> findBypassport_number(String passport_number);


}
