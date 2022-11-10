package com.java.springboot.test.springbootbackend.controller;
import com.java.springboot.test.springbootbackend.exception.ResourceNotFoundException;
import com.java.springboot.test.springbootbackend.model.AngelUser;
import com.java.springboot.test.springbootbackend.repository.AngelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping

public class AngelHelperController {

    @Autowired
     private AngelRepository angelRepository;

  @GetMapping("/api/angelhelper")
    public List<AngelUser> getAllangeldata(){
	  return  angelRepository.findAll();
     
        
       
    }

   // build create employee REST API
    @PostMapping("api/angelhelper/{create}")
    public AngelUser create(@RequestBody  AngelUser angel) {
    	return angelRepository.save(angel);
    	
    	
    	 
          }

  // build get employee by id REST API
    @GetMapping("/api/angelhelper/{id}")
    public ResponseEntity<AngelUser> getangeldataById(@PathVariable  long id){
        AngelUser angel = angelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("angel not exist with id:" + id));
        return ResponseEntity.ok(angel);
    }

    // build update employee REST API
    @PutMapping("/api/angelhelper/{id}")
    public ResponseEntity<AngelUser> updateangeldata(@PathVariable long id,@RequestBody AngelUser angelDetails) {
        AngelUser updateangel = angelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("angel not exist with id: " + id));

        updateangel.setFirstName(angelDetails.getFirstName());
        updateangel.setLastName(angelDetails.getLastName());
        updateangel.setEmailId(angelDetails.getEmailId());
        updateangel.setcontact(angelDetails.getcontact());
        updateangel.setAddress(angelDetails.getAddress());
        updateangel.setPincode(angelDetails.getPincode());

   
		angelRepository.save(updateangel);

        return ResponseEntity.ok(updateangel);
    }

    // build delete employee REST API
    @DeleteMapping("/api/angelhelper/{id}")
    public ResponseEntity<HttpStatus> deleteangeldata(@PathVariable long id){

        AngelUser angel = angelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("angel not exist with id: " + id));

        angelRepository.delete(angel);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}