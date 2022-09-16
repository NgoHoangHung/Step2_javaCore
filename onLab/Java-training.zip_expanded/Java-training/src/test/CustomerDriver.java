package test;

public class CustomerDriver {
    public static void main(String[] args) {
    	A1_Test_Stack_Heap customer; // defines a reference to a Customer
        customer = new A1_Test_Stack_Heap(); // Creates a new Customer object
        customer.setBalance(12506.45f);
        System.out.println(customer.toString());
    }
}
