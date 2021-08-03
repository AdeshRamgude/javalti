package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@Table(name = "ICICIBank")
@DiscriminatorValue("ICICI")
public class ICICIBank extends Bank
{
      private String lombardInsurance;

	public ICICIBank(int bankid, String bankName, String location, String lombardInsurance) {
		super(bankid, bankName, location);
		this.lombardInsurance = lombardInsurance;
	}

	public ICICIBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLombardInsurance() {
		return lombardInsurance;
	}

	public void setLombardInsurance(String lombardInsurance) {
		this.lombardInsurance = lombardInsurance;
	}

	
      
}