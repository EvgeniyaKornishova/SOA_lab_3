package ru.ifmo.soa.lab3.primaryBack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ifmo.soa.lab3.primaryBack.entities.DBLocation;

public interface LocationRepository extends JpaRepository<DBLocation, Long> {

}
