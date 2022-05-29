package sbnz.integracija.example;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.facts.Soil;

@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

	private final KieContainer kieContainer;

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
		kieSession.fireAllRules();
		//System.out.println("RECOMMENDED: " + kieSession.getGlobal("recommendation"));
		kieSession.dispose();
		return s;
	}
}
