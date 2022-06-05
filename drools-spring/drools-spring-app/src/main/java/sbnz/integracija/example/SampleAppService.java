package sbnz.integracija.example;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.Fertilizer;
import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Soil;

@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

	private final KieContainer kieContainer;
	
	@Autowired
	private OperationService operationService;

	@Autowired
	public SampleAppService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public Item getClassifiedItem(Item i) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(i);
		kieSession.fireAllRules();
		kieSession.dispose();
		return i;
	}
	public Soil getClassifiedSoil(Soil s) {
		KieSession kieSession = kieContainer.newKieSession();
		//kieSession.setGlobal("recommendation", "prazno");
		kieSession.insert(s);
		kieSession.setGlobal("operationService", operationService);
		kieSession.insert(new Fertilizer("NPK 8 16 24", 8, 16, 24));
		kieSession.insert(new Fertilizer("NPK 6 12 24", 6, 12, 24));
		kieSession.insert(new Fertilizer("NPK 8 24 16", 8, 24, 16));
		kieSession.insert(new Fertilizer("MAP 11 52 0 + Kalijum 0 0 30", 11, 52, 30));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 2 x Kalijum 0 0 30", 11, 52, 60));
		kieSession.insert(new Fertilizer("1 x MAP 11 52 0 + 3 x Kalijum 0 0 30", 11, 52, 90));
		kieSession.insert(new Fertilizer("MAP 11 52 0", 11, 52, 1));
		kieSession.insert(new Fertilizer("Kalijum 0 0 30", 1, 1, 30));
		kieSession.fireAllRules();
		//System.out.println("RECOMMENDED: " + kieSession.getGlobal("recommendation"));
		kieSession.dispose();
		return s;
	}
}
