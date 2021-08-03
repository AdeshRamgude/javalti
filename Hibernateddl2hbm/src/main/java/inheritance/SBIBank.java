package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@Table(name="SBIBANK")
@DiscriminatorValue("SBI")
public class SBIBank extends Bank
{
      private String carLoanInt;

	public SBIBank(int bankid, String bankName, String location, String carLoanInt) {
		super(bankid, bankName, location);
		this.carLoanInt = carLoanInt;
	}

	public SBIBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCarLoanInt() {
		return carLoanInt;
	}

	public void setCarLoanInt(String carLoanInt) {
		this.carLoanInt = carLoanInt;
	}

      
}