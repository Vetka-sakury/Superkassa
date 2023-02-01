package com.example.superkassa.repository;

import com.example.superkassa.model.ExampleObject;
import com.example.superkassa.model.Json;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

public interface ExampleRepository extends JpaRepository<ExampleObject, Integer>{

    @Transactional (isolation= Isolation.SERIALIZABLE)
    @Modifying(clearAutomatically = true)
    @Query("UPDATE ExampleObject t SET t.obj=?1 WHERE t.id=?2")
    void update(Json newJson, int id);

    @Override
    Optional<ExampleObject> findById(Integer integer);
}
