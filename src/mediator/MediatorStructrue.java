package mediator;

public class MediatorStructrue implements Mediator {

	HouseOwner houseOwner;
	Tenant tenantPerson;
	
	public HouseOwner getHouseOwner() {
		return houseOwner;
	}


	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}


	public Tenant getTenantPerson() {
		return tenantPerson;
	}


	public void setTenantPerson(Tenant tenantPerson) {
		this.tenantPerson = tenantPerson;
	}


	public MediatorStructrue(HouseOwner houseOwner, Tenant tenantPerson) {
		super();
		this.houseOwner = houseOwner;
		this.tenantPerson = tenantPerson;
	}

	
	public MediatorStructrue() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void contact(String message, Person person) {
		// TODO Auto-generated method stub
		if(person == houseOwner){
			tenantPerson.getMessage(message);
		}else houseOwner.getMessage(message);
	}

}
