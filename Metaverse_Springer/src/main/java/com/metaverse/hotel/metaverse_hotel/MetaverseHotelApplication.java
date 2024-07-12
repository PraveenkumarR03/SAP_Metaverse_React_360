package com.metaverse.hotel.metaverse_hotel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.metaverse.hotel.metaverse_hotel.controller.UserController;
import com.metaverse.hotel.metaverse_hotel.model.User;
import com.metaverse.hotel.metaverse_hotel.model.UserRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = {User.class,UserRepository.class,UserController.class})
public class MetaverseHotelApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MetaverseHotelApplication.class, args);
	}
	@Autowired
	UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("praveen", "kumar","praveen@gmail.com"));
		userRepo.save(new User("harish", "prasath", "harishprasathvg@gmail.com"));
		
	}

}
