package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StateRepo extends JpaRepository<State, String> {
	
	@Query("SELECT new com.PincodeWise.StateOrderResponse(p.stateCode,s.stateNameCaps,d.districtName) FROM Pincode p JOIN District d ON p.districtCode = d.districtCode JOIN State s ON p.stateCode = s.stateCode ")
	 public List<StateOrderResponse> getStateDis();

}
