package com.cg.tourmanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

	@SpringBootTest
	class TourInformationSystemDaoTest {
		@Autowired
		TourInformationSystemRepository tourrepo;
		
		@Test
		public void testGetPackageById() {
			TourInformationSystem tour = tourrepo.getById(20);
			System.out.println(tour.getPackageId()); 
			assertEquals(tour.getPackageId(), 20); 
		}
		
		@Test
		void testGetAllItemsNotNull() {
			List<TourInformationSystem> tourlist = tourrepo.findAll();
			assertNotNull(tourlist);
		}
	

	}


