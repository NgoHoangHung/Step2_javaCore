package OOP.oop;

public class Fraction {
	private int numerator;
	private int denominator;
//setter getter
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {//thiet lap gia tri cho mau so
		this.denominator = denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {// thiet lap gia trị cho tu so
		this.numerator = numerator;
	}
	
//	public Fraction()
//	{
//		
//	}
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
		fractionA.normalize();
		fractionB.normalize();
		switch(operator) {
		case("+"):
			this.add(fractionA, fractionB);
		break;
		case("-"):
			this.sub(fractionA, fractionB);
		break;
		case("*"):
		case("x"):
		case("X"):
		case("."):
			this.multiply(fractionA, fractionB);
		break;
		case("/"):
		case(":"):
			this.divide(fractionA, fractionB);
		break;
		default:
			this.add(fractionA, fractionB);
		break;
		}
	}
	// Tổng 2 phân số x/y + a/b = (x*b + a*y)/y*b
		public void add(Fraction fractionA, Fraction fractionB) {
		this.setNumerator(fractionA.getNumerator()*fractionB.getDenominator()
				+fractionB.getNumerator()*fractionA.getDenominator());
		this.setDenominator(fractionA.getDenominator()*fractionB.getDenominator());
		this.normalize();
		}

		// Hiệu 2 phân số x/y - a/b = (x*b - a*y)/y*b
		public void sub(Fraction fractionA, Fraction fractionB) {
			this.setNumerator(fractionA.getNumerator()*fractionB.getDenominator()
					-fractionB.getNumerator()*fractionA.getDenominator());
			this.setDenominator(fractionA.getDenominator()*fractionB.getDenominator());
			this.normalize();
		}

		// Tích 2 phân số x/y * a/b = (x*a)/(y*b)
		public void multiply(Fraction fractionA, Fraction fractionB) {
			this.setNumerator(fractionA.getNumerator()*fractionB.getNumerator());
			this.setDenominator(fractionA.getDenominator()*fractionB.getDenominator());
			this.normalize();
		}

		// Thương 2 phân số x/y / a/b = (x*b)/(y*a)
		public void divide(Fraction fractionA, Fraction fractionB) {
			this.setNumerator(fractionA.getNumerator()*fractionB.getDenominator());
			this.setDenominator(fractionA.getDenominator()*fractionB.getNumerator());
			this.normalize();
		}


	// Tạo phần hiển thị cho phân số
	public String print() {
		return this.getNumerator() + "/" + this.getDenominator();
	}

	// Rút gọn phân số
	public void normalize() {
		int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
		if(ucln>1) 
			{
				
				this.setNumerator(this.getNumerator()/ucln);
				this.setDenominator(this.getDenominator()/ucln);
			}
		
	}

	//uoc chung lon nhat
	private int UCLN(int x, int y) {
		int result = Math.min(x, y);
		while (result >= 1) {
			if (x % result == 0 && y % result == 0) {
				return result;
			}
			 result--;
		}
	return 1;
	}
//kiem tra tinh toi gian
	public boolean checkNormalize() {
		if(this.UCLN(this.getNumerator(),this.getDenominator()) == 1 ) 
			return true;
		return false;
	}

}
