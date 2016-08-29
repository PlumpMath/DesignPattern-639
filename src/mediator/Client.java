package mediator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediatorStructrue mediatorStructrue = new MediatorStructrue();
		HouseOwner houseOwner = new HouseOwner("房东", mediatorStructrue);
		Tenant tenant = new Tenant("房客", mediatorStructrue);
		mediatorStructrue.setHouseOwner(houseOwner);
		mediatorStructrue.setTenantPerson(tenant);
		tenant.contact("who have house to ..?");
		houseOwner.contact("I have house");
					
		
		
	}

}
