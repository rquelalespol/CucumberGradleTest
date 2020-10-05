package steps;

import io.cucumber.java.en.*;
import devCode.Code;

public class TestSteps {
	private Code premium = new Code();
	
	@Given("^Is a man$")
	public void IsMan() {
		premium.setGen('M');
	}

	@Given("^Is a woman$")
	public void IsWoman() {
		premium.setGen('F');
	}

	@And("^Is (\\d+) years old$")
	public void IsAge(int age) {
		premium.setAge(age);
	}
	 
	@And("^Is single$")
	public void IsSingle() {
		premium.setMarry('N');
	}
	
	@And("^Is married$")
	public void IsMarried() {
		premium.setMarry('Y');
	}

	@Then("^Calculate the premium$")
	public void Calculate() {
		premium.CalculatePremium();
	}
	
	@Then("^Show the Insurance premium$")
	public void Show() {
		int premiumvalue = premium.getPrevium();
		System.out.println("The premium is "+String.valueOf(premiumvalue));		
	}
	
}
