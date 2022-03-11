/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Motorcycle;

/**
 * 
 */
@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
	
}
