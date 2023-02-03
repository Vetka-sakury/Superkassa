package com.example.superkassa.repository;

import com.example.superkassa.model.ExampleObject;
import com.example.superkassa.model.Json;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.*;
import java.util.Optional;

public interface ExampleRepository extends JpaRepository<ExampleObject, Integer>{

    @Modifying(clearAutomatically = true)
    @Query("UPDATE ExampleObject t SET t.obj=?1 WHERE t.id=?2")
    void update(Json newJson, int id);

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<ExampleObject> findById(Integer id);
}
