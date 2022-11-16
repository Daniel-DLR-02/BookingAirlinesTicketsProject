package com.example.airlinestickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinestickets.model.Ticket;

public interface TicketRepos extends JpaRepository<Ticket,Long> {
    
}
