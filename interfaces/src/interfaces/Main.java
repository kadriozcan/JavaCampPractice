package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new SmsLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer engin = new Customer(1, "Engin", "Demirog");

		customerManager.add(engin);
	}

}
