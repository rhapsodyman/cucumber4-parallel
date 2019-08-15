package steps;

import java.util.Date;

import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;

public class Steps {

	@Given("Step from {string} in {string} feature file")
	public void step(String scenario, String file) throws InterruptedException {

//		for (int i = 0; i < 5; i++) {
		System.out.println(String.format("Thread ID - %s - %s from %s feature file time %s.\n",
				Thread.currentThread().getId(), scenario, file, new Date()));
//			Thread.sleep(1000);
//		}

	}
}