package inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

@Entity
@Table(name="Bank")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "FROMBANK" , discriminatorType = DiscriminatorType.STRING)
public class Bank {
	@Id
    private int bankid;
    private String bankName;
    private String location;
    
	public Bank(int bankid, String bankName, String location) {
		super();
		this.bankid = bankid;
		this.bankName = bankName;
		this.location = location;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
