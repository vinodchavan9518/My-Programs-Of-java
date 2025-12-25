package InterfaceAndAbstract.MethodOverridingAndOverding;
public class Payment_Processing {

	public static void main(String[] args) {

	paymentGateway(new UPIPayment(), new DebitCardPayment(), new CerditCardPaymen());

	}

	public static void paymentGateway(payment... payments)

	{
		for (payment p : payments) {
			p.processPayment();
	}

	}

    }

class payment {
	public void processPayment() {
		System.out.println("Processing Payment");
	}
    }

class CerditCardPaymen extends payment {
	public void processPayment() {
		System.out.println("Processing  Cardit card payment");
	}
    }

class DebitCardPayment extends payment {
	public void processPayment() {
	System.out.println("Processing Debit Card payment");
	}
}

class UPIPayment extends payment {
	public void processPayment() {
		System.out.println("Processing UPI payment");
	}
}