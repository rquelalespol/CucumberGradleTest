package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import devCode.Code;

public class steps {
	private Code premium = new Code();
	
	@Given("^Is a man$")
	public void IsMan() throws Throwable{
		premium.setGen('M');
	}

	@Given("^Is a woman$")
	public void IsWoman() throws Throwable{
		premium.setGen('F');
	}

	@And("^Is (\\d+) years old$")
	public void IsAge(int age) throws Throwable{
		premium.setAge(age);
	}
	 
	@And("^Is single$")
	public void IsSingle() throws Throwable{
		premium.setMarry('N');
	}
	
	@And("^Is married$")
	public void IsMarried() throws Throwable{
		premium.setMarry('Y');
	}

	@Then("^Calculate the premium$")
	public void Calculate() throws Throwable{
		premium.CalculatePremium();
	}
	
	@Then("^Show the Insurance premium$")
	public void Show() {
		int premiumvalue = premium.getPrevium();
		System.out.println("The premium is "+String.valueOf(premiumvalue));		
	}
}
