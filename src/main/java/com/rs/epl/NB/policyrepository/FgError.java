package com.rs.epl.NB.policyrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.epl.NB.oementity.FristgenErrors;

public interface FgError extends JpaRepository<FristgenErrors, String> {

}
