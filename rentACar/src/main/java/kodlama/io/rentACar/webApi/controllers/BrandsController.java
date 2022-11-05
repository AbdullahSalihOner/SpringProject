package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

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
	public List<GetAllBrandsResponse> getAll(){
		return brandsService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandsService.add(createBrandRequest);
	}
}
