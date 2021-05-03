package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "kadri", "ozcan", "2002", "284598745895"));
	}

}
