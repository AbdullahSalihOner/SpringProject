package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //Annotation
@RequestMapping ("/api/brands")
public class BrandsController {
	private BrandService brandsService;

	@Autowired
	public BrandsController(BrandService brandsService) {
		super();
		this.brandsService = brandsService;
	}
	
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandsService.getAll();
	}
}
