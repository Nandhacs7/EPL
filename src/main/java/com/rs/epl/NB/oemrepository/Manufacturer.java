package com.rs.epl.NB.oemrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.epl.NB.oementity.Manufacturermaster;


public interface Manufacturer extends JpaRepository<Manufacturermaster, Integer> {

}
