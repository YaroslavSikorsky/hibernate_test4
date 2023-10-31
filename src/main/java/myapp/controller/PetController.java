package myapp.controller;


import myapp.model.Pet;
import myapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/hibernate_test4/pets")
public class PetController {


	private final PetService petService;


	@Autowired
	public PetController(PetService petService) {
		this.petService = petService;
	}


	@GetMapping
	public List<Pet> getAllPets() {
		return petService.getAllPets();
	}


	@GetMapping("/{id}")
	public Pet getPetById(@PathVariable Long id) {
		return petService.getPetById(id);
	}


	@PostMapping
	public Pet createPet(@RequestBody Pet pet) {
		return petService.createPet(pet);
	}


	@PutMapping("/{id}")
	public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
		pet.setId(id);
		return petService.updatePet(pet);
	}


	@DeleteMapping("/{id}")
	public void deletePet(@PathVariable Long id) {
		petService.deletePet(id);
	}
}