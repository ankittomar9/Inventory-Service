package com.company.inventoryService.repository;

import com.company.inventoryService.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository  extends JpaRepository<Venue,Long> {

}
