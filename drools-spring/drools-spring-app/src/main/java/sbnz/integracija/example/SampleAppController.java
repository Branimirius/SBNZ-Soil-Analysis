package sbnz.integracija.example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dto.SoilDTO;
import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Soil;

@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping(value = "api")
@RestController
public class SampleAppController {
	private static Logger log = LoggerFactory.getLogger(SampleAppController.class);

	@Autowired
	private final SampleAppService sampleService;

	@Autowired
	public SampleAppController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}
	
	//get users
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/recommend")
	public Soil getFertilizerRecommendation(@RequestBody SoilDTO soilDTO){
		Soil newSoil = new Soil(soilDTO.getpH(), soilDTO.getHumus(), soilDTO.getCarbonate(), soilDTO.getNitrogen(), soilDTO.getPhosphorous(), soilDTO.getPotassium(), soilDTO.getPlant());

		log.debug("Soil request received for: " + newSoil);
		System.out.println("Soil request received for: " + newSoil.toString());

		Soil s2 = sampleService.getClassifiedSoil(newSoil);
		//Item i1 = sampleService.getClassifiedItem(new Item("brufen", 350.0, 350.0 ));
		return s2;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/plant")
	public Soil getPlantRecommendation(@RequestBody SoilDTO soilDTO){
		Soil newSoil = new Soil(soilDTO.getpH(), soilDTO.getHumus(), soilDTO.getCarbonate(), soilDTO.getNitrogen(), soilDTO.getPhosphorous(), soilDTO.getPotassium(), soilDTO.getPlant());

		log.debug("Plant request received for: " + newSoil);
		System.out.println("Plant request received for: " + newSoil.toString());

		Soil s2 = sampleService.getPlantRecommendation(newSoil);
		//Item i1 = sampleService.getClassifiedItem(new Item("brufen", 350.0, 350.0 ));
		return s2;
	}

	@RequestMapping(value = "/item", method = RequestMethod.GET, produces = "application/json")
	public Soil getQuestions(@RequestParam(required = true) double pH,
			@RequestParam(required = true) double humus,
			@RequestParam(required = true) double carbonate,
			@RequestParam(required = true) double nitrogen,
			@RequestParam(required = true) double phosphorous,
			@RequestParam(required = true) double potassium,
			@RequestParam(required = true) String plant) {

		Soil newSoil = new Soil(pH, humus, carbonate, nitrogen, phosphorous, potassium, plant);

		log.debug("Soil request received for: " + newSoil);
		System.out.println("Soil request received for: " + newSoil.toString());

		Soil s2 = sampleService.getClassifiedSoil(newSoil);
		//Item i1 = sampleService.getClassifiedItem(new Item("brufen", 350.0, 350.0 ));
		return s2;
	}
	
	
	
}
