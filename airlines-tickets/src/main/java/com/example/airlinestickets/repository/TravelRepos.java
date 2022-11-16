package com.example.airlinestickets.repository;

import java.util.List;

import com.example.airlinestickets.model.Dto.TravelFilterQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinestickets.model.Travel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TravelRepos extends JpaRepository<Travel,Long> {

    List<Travel> findByDepartLocation(String origin);

    @Query(
            value = "SELECT depart_location FROM travel t GROUP BY depart_location",
            nativeQuery = true)
    List<String> getAllOrigins();


    @Query(
            value = "SELECT * FROM travel t " +
                    "WHERE t.depart_location = :#{#travelQuery.departLocation} " +
                    "AND t.destiny_location = :#{#travelQuery.destinyLocation} " +
                    "AND t.travel_date = :#{#travelQuery.date} " +
                    "AND t.travel_type = :#{#travelQuery.type}",
            nativeQuery = true)
    List<Travel> filterTravelsByFilterTravelQuery(@Param("travelQuery") TravelFilterQuery travelQuery);
    
}
