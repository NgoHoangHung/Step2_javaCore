package test;

	import java.math.BigDecimal;
	import java.util.Locale;
	 
	public class A1_Test_Stack_Heap {
	    private String name;
	    private int accountNumber;
	    private Locale locale;
	    private BigDecimal balance;
	 
	    public A1_Test_Stack_Heap() {
	        this.name = "Default Customer";
	        this.accountNumber = 12345;
	        this.locale = Locale.ENGLISH;
	        this.balance = new BigDecimal("0");
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) throws Exception {
	        if (name == null) {
	            throw new Exception("Names must not be null");
	        } else {
	            this.name = name;
	        }
	    }
	 
	    public int getAccountNumber() {
	        return accountNumber;
	    }
	 
	    public void setAccountNumber(int accountNumber) {
	        this.accountNumber = accountNumber;
	    }
	 
	    public BigDecimal getBalance() {
	        return balance;
	    }
	 
	    public void setBalance(float balance) {
	        this.balance = new BigDecimal(balance);
	    }
	 
	    public String toString() {
	        java.text.NumberFormat format;
	        format = java.text.NumberFormat.getCurrencyInstance(locale);
	        return format.format(balance);
	    }
	}
}
