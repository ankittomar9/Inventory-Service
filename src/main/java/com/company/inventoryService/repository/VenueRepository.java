package com.company.inventoryService.repository;

import com.company.inventoryService.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository  extends JpaRepository<Venue,Long> {

}
