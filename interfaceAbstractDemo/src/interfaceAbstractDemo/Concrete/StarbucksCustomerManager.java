package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
					System.out.println("Saved to database : " + customer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
	}


	
}
