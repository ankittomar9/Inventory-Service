package com.company.inventoryService.repository;

import com.company.inventoryService.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface EventRepository extends JpaRepository<Event, Long> {
}
