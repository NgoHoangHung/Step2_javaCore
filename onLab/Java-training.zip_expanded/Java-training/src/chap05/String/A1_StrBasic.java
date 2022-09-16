package chap05.String;

public class A1_StrBasic {
	public static void main(String[] args) {
		
		//009 contain()
		//study003_parseInt();
		study029_trim();
		
		}
	
/*030 Phương thức valueOf trong java String
	 * Được sử dụng để chuyển đổi kiểu dữ liệu khác thành chuỗi.
	 * Bằng việc sử dụng phương thức valueOf(), bạn có thể chuyển int thành chuỗi,
	 * long thành chuỗi, boolean thành chuỗi, float thành chuỗi, double thành chuỗi,
	 *  char thành chuỗi, mảng char thành chuỗi, đối tượng thành chuỗi.
	 * cú pháp public String trim() 
	 */
	public  static void study030_valueOf() {
		int value = 30541531;
		  String s1 = String.valueOf(value);
		  System.out.println(s1 + 1045);
//		  s1.matches(s1)
	}
 	
	/*029 Phương thức trim() trong Java String
	 * Phương thức trim() được sử dụng để xoá khoảng trắng ở đầu và cuối chuỗi 
	 * Giá trị unicode của khoảng trắng là '\u0020'. 
	 * Phương thức trim() kiểm tra giá trị unicode trước và sau chuỗi 
	 * nếu tồn tại thì xoá bỏ khoảng trắng đi và trả về chuỗi không có khoảng trắng ở đầu và cuối
	 *cú pháp 
	 *public String trim() 
	 */
	public static void study029_trim() {
		  String s1 = "  hello string   ";
		  System.out.println(s1 + "java"); 
		  System.out.println(s1);
		  System.out.println(s1.trim() + "java");
		  s1=s1.trim();
		  System.out.println(s1);
	}
	/* Phương thức toUpperCase() trong java String
	 * Được sử dụng để chuyển chuỗi về dạng chữ hoa
	 * Hoạt động giống hệt phương thức toUpperCase(Locale.getDefault())
	 * nó sử dụng locale mặc định
	 * cú pháp: public String toUpperCase()
	 * public String toUpperCase(Locale locale)
	 */
	public static void study028_toUpperCase() {
		  String s1 = "HELLO stRIng";
		  String s1Upper = s1.toUpperCase();
		  System.out.println(s1Upper);
	}

	/*027 Phương thức toLowerCase trong java String
	 * Phương thức toLowerCase() được sử dụng để chuyển chuỗi về dạng chữ thường 
	 * Phương thức toLowerCase hoạt động giống y chang phương thức toLowerCase(Locale.getDèault())
	 * nó sử dụng locale mặc định
	 * cú pháp public String toLowerCase()
	 * public String toLowerCase(Locale locale)
	 */
	public static void study027_toLowerCase() {
		String s1 = "kj HKJ jk KjhkHkjHkjHkjG";
		String s1lower = s1.toLowerCase();
		
			System.out.print(s1lower);
	}
	
	/*026 phương thức toCharArray trong java String
	 * Phương thức toCharArray được sử dụng để chuyển đổi chuỗi thành các mảng kí tự
	 * 	Nó trả về một mảng kí tự có độ dài của chuỗi
	 * cú pháp
	 * public char[] toCharArray
	 */
	public static void study026_toCharArray() {
		String s1 = "hello alf;lsjad l;kasdjfl;sad";
		char[] ch = s1.toCharArray();
		for(int i =0; i< ch.length; i++) {
			System.out.print(ch[i]+ "--");
		}
	}

	/*025 phương thức subString () trả về chuỗi con của một chuỗi
	 * Chúng ta truyền chỉ số bắt đầu và chỉ số kết thúc cho phương thức subString()
	 * với chỉ số bắt đầu tính từ 0 và chỉ số kết thúc tính từ 1
	 * public String substring(int startIndex)
	 * public String substring(int startIndex, int enđInex)
	 */
	public static void study025_subString() {
		String s1 = "hellojava";
		System.out.println(s1.substring(3,4));
		System.out.println(s1.substring(3));
	}
	/*024 Phương thức startsWith trong Java String
	 * Được sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không
	 * nếu đúng trả về true, sai trả về false
	 * cú pháp:
	 * public boolean startsWith(String prefix)
	 * public boolean startsWith(String prefix, int offset)
	 */
	public static void study024_startsWith() {
		String s1 = "java string startsWith() method sample";
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.startsWith("java string"));
	}
	/*023 Phương thức split() trong java String
	 * Tách một chuỗi theo biểu thức chính quy(regular expressrion)
	 * cú pháp: public String split(String regex)
	 * public String split(String regex, int limit)
	 */
	public static void study023_split() {
		String str1 = "java string split method by viettuts";
		String[] words = str1.split("\\s");
		for(String w: words) {
			System.out.println(w);
		}
		
	}
	/*022Phương thức replaceAll trong Java String
	 * Phương thức này trả về một chuỗi thay thế tất cả các chuỗi kí tự phù hợp với regex
	 * cú pháp: public String replaceAll(String regex, String replacement)
	 */
	public static void study022_replaceAll() {
		String s1 = "My name is Hung, My name is....";
		String replaceString = s1.replaceAll("\\s", "--");
		System.out.println(replaceString);
	}
	/*021 Phương thức replace() trong java String
	 * Được sử dụng để thay thế tất cả các kí tự hoặc chuỗi cũ thành kí tự hoặc chuỗi mới 
	 * cú pháp
	 * public String replace(char oldChar, char newChar)
	 * public String replace(CharSequence target, CharSequence replacement)
	 */
		public static void study021_replace() {
		 String s1 = "viettuts is a very good website";
		 String replaceString1 = s1.replace('v','l');
		 System.out.println(replaceString1);
		 
		 String replaceString2 = s1.replace("is", "was");
		 System.out.println(replaceString2);
	}

	/*020 Phương thức length trong java String
	 * Phương thức length() trả về độ dài của chuỗi(Tổng số kí tự theo mã unicode)
	 * Cú pháp: public int length()
	 */
	public static void study020() {
		String s1 = "java";
		String s2 = "python";
		System.out.println("String length is: " + s1.length());
		System.out.println("String length is: " + s2.length());
	}
	
	/* 019 Phương thức lastIndexOf() trong Java String
	 * Trả về chỉ số cuối của kí tự hoặc chuỗi con
	 * Nếu không tìm thấy trả về giá trị -1
	 * Giá trị Index được tính từ 0
	 * cú pháp:
	 * int lastIndexOf(int ch)
	 * int lastIndexOf(int ch, int fromIndex)
	 * int lastIndexOf(String substring)
	 * int lastIndexOf(String substring, int fromIndex)
	 */
	public static void study019_lastIndexOf() {
		String s1 = "this is index of example";
		int index1 = s1.lastIndexOf('s');
		int index2 = s1.lastIndexOf("am");
		System.out.println(index1);
		System.out.println(index2);
	}
	/*018 Phương thức join trong Java String
	 * Phương thức join() trả về một chuỗi được nối với nhau bởi dấu phân tách
	 * Trong phương thức join chuỗi, dấu phân tách được sử dụng cho mỗi chuỗi được nối
	 * Trong trường hợp chuỗi bằng null, gía trị null được thêm vào
	 * Có hai dạng của phương thức join()
	 * cú pháp:
	 * public static String join(CharSequence delimiter, CharSequence...elements)
	 * public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
	 */
	public static void study018_join() {
		String joinString1 = String.join(" .... ", "welcome", "to", "java");
		System.out.println(joinString1);
			
		
	}
	/*017 phương thức isEmpty trong Java String
	 * Phương thức isEmpty() khi chuỗi trống trả về true, ngươc lại trả về false
	 * cú pháp:
	 * public boolean isEmpty()
	 */
	public static void study017_isEmpty() {
		String s1 ="";
		String s2 = "hello java";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
	}
	/* 016 Phương thức intern trong Java string 
	 * Phương thứ này có thể được sử dụng để trả về chuỗi từ Pool chứa hằng số chuỗi khi 
	 * nó được tạo bởi từ khoá new
	 * Cú pháp: public String intern()
	 */
	public static void study016_intern() {
		  String s1 = new String("hello");
		  String s2 = "hello";
		  String s3 = s1.intern();//trả về chuỗi từ Pool
		  System.out.println(s1 == s2);//false vì reference là khác nhau
		  System.out.println(s2 == s3);//true vì reference là giống nhau 
	}
	
	/*015 Phương thức indexOf trong Java String
	 * Phương thức indexOf trả về chỉ số của giá trị kí tự đã cho hoặc chuỗi con
	 * Nếu không tìm thấy trả lại giá trị -1
	 * Chỉ số (index) được đếm từ 0
	 * Cú pháp:
	 * int indexOf(int ch) //Trả về vị trí của giá trị Char đã cho
	 * 
	 * int indexOf(int ch, int fromIndex)//Trả về vị trí của giá trị char đã cho
	 * tính từ vị trí fromIndex
	 * 
	 * int indexOf(String substring) // trả về vị trí của chuỗi con
	 * 
	 * int indexOf(String substring, int fromIndex) //Trả về vị trí chuỗi con đã cho 
	 * tính từ vị trí fromIndex
	 */
	public static void study015_indexOf() {
		  String s1 = "this1 is23 index45 of 67example89";
		   
		  //Truyền vào chuỗi con
		  int index1 = s1.indexOf("is");
		  int index2 = s1.indexOf("index");
		  System.out.println("1. " + index1 + "  " + index2);//2 8  
		 
		  //Tìm trong chuỗi kí tự tham chiếu tính từ chỉ số thứ..
		  int index3 = s1.indexOf("is", 4);
		  System.out.println("2. " + index3);//5
		 
		  //Truyền vào giá trị Char
		  int index4 = s1.indexOf('s');
		  System.out.println("3. " + index4);//3 
		  int index5 = s1.indexOf(7);
		  System.out.println("4. " + index5);
	}
	
	/* 014 Phương thức getChar trong Java String
	 * Phương thức getChars() sao chép nội dung của chuỗi thành mảng Char cụ thể
	 * Có 4 đối số truyền vào phương thức getChars()
	 * public void getChars(int srcBeginIndex, int srcendIndex,
	 * 								 char[] destination, int dstBeginIndex)
	 */
	public static void study014_getChars() {
			String str = new String("hello Java how are you?");
			char[] ch = new char[4];
			try {
			str.getChars(6, 10, ch, 0);
		    System.out.println(ch);
			} 
				catch (Exception ex) {
					System.out.println(ex);
			}
	}
	
	/*013 Phương thức getBytes trong Java String
	 * Phương thức getBytes() trả về mảng Byte của chuỗi
	 * public byte[] getBytes()
	 * public byte[] getBytes(Charset charset)
	 * public byte[] gestBytes(String charsetName) throws UnsupportedEncodingException
	 */
	public static void study013_getBytes() {
		  String s1 = "evn 11 cua bac";
		  byte[] barr = s1.getBytes();
		  for (int i = 0; i < barr.length; i++) {
		  System.out.println(s1.charAt(i) +" có giá trị " + barr[i]);
		  }
		 }
	
	/*012 Phương thức format() trong lớp String trả về một chuỗi được format theo miền địa phương
	 * Nếu ta không chỉ định miền địa phương trong phương thức String.format() 
	 * thì trình biên dịch sẽ tự độgn sử dụng miên mặc định bằng cách gọi phương thức 
	 * Locale.getDefault() 
	 * Cú pháp
	 *  public static String format(String fỏmat, Object...args)
	 * 	public static String format(Locale locale, String format, Object...ảgs)
	 * Phương thức format() của java giống như hàm sprint() trong C 
	 */
    public static void study012_format() {
		  String name = "sonoo";
		  String sf1 = String.format("name is %s", name);
		  String sf2 = String.format("value is %f", 32.33434);
		  String sf3 = String.format("value is %32.12f", 32.33434);
		 
		  System.out.println(sf1);
		  System.out.println(sf2);
		  System.out.println(sf3);
	}
	
	/*011 Phương thức equals() so snhá hai chuỗi đưa ra dựa trên nội dung của chuỗi
	 * Nếu hai chuỗi khác nhau nó trả về false 
	 * Bằng nhau thì trả về true
	 * Phương thức equals của lớp String được ghi đè từ pt equals() của lớp Object
	 * Cú pháp public boolean equals(Object anotherObject
	 */
	public static void study011_equals() {
		 String s1 = "java";
		  String s2 = "java";
		  String s3 = "JAVA";
		  String s4 = "python";
		  System.out.println(s1.equals(s2));
		  System.out.println(s1.equals(s3));
		  System.out.println(s1.equals(s4));
		
	}
	
	/*
	 * 010 Phuong thức endsWith()
	 * Phương thức này kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định
	 * trả về true nếu chuỗi kết thúc với hậu tố đã cho, ngược lại trả về false
		cú pháp: public boolean endWith(String suffix)
	 */
	public static void study010_endsWith() {
		  String s1 = "hello java";
		  System.out.println(s1.endsWith("t"));
		  System.out.println(s1.endsWith("java"));
	}
	
	/* 009 cau truc contains() 
	 * Phương thức này tìm kiếm chuỗi kí tự tham chiếu trong chuỗi chính
	 * Nó trả về true nếu chuỗi các giá trị char được tìm thấy  trong chuỗi này.
	 * nếu ko tìm thấy sẽ trả về false 
	 */
	public static void study009_contains() {
		String name = "what do you know about me";
		  System.out.println(name.contains("do you know"));
		  System.out.println(name.contains("about"));
		  System.out.println(name.contains("hello"));
	}
	
	/*008 cau truc compareTo
		So sánh các chuối cho trước với chuối hiện tại theo thứ tự từ điển
		Nó sẽ trả về số dương, số âm hoặc số 0
		-, nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương
		- nếu s1 < s2 trả về số âm
		- nếu s1 = s2 trả về 0
	*/
	public static void study008_compareTo() {
		  String s1 = "hello";
		  String s2 = "hello";
		  String s3 = "leklo";
		  String s4 = "hemlo";
		  System.out.println(s1.compareTo(s2));
		  System.out.println(s1.compareTo(s3));
		  System.out.println(s1.compareTo(s4));
	}
	
	/*007 cau truc lenh concat
	 * Phương thức concat() sẽ nối thêm chuỗi được chỉ định vào cuối chuỗi đã cho
	 */
	public static void study007()
	{
		 String s1 = "java string";
		  s1.concat("is immutable");
		  System.out.println(s1);
		  s1 = s1.concat(" is immutable so assign it explicitly");
		  System.out.println(s1);
	}
	//006 sự dư thừa vùng nhớ
	public static void study006() {
		String str1 = "JAVA is not difficult"; // địa chỉ ô xxxxx1
				str1 = "Android is not difficult";// địa chỉ ở ô xxxxx2
				str1 = "Android is easy";		// địa chỉ ở ô xxxxx3
		
	}
	//005so sánh hai chuỗi equals và equalsIgnoreCase
	public static void study005_quals_equalsIgnoreCase() {
			String str1 = "Android.vn";
			String str2 = "android.vn";
			System.out.println("So sánh phân biệt chữ hoa và chữ thường: "+ str1.equals(str2));
			System.out.println("So sánh không phân biệt : "+ str1.equalsIgnoreCase(str2));
		}
	
	//004 so sanh chuoi
	public static void study004() {
		String str1 = "java";
//		String str2 = "java";
		String str2 = "jaVa";
//		String str2 = new String("java");
		
		if(str1 == str2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
	}
 	
	// 003 Integer.ParseInt() chuyen doi chuoi thanh gia tri so
	public static void study003_parseInt() {
		String str1 = "1234";
		System.out.println("Giá trị khi ta chưa chuyển đổi: " + str1 + 6);
		int num1 = Integer.parseInt(str1);
		System.out.printf("gia tri sau khi ta chuyen doi: %d",num1 + 6);
	}
	
	// 002 Noi chuoi		
	public static void study002_concat() {
		String str1 = "evn";
		String str2 = "11 cua bac";
		String str3 = str1.concat(" ").concat(str2);
		String str4 = str1 +" " + str2;
		System.out.println(str3);
		System.out.println(str4);
	}
	
	// 001 Khoi tao doi tuong chuoi
	public static void study001() {
		//Case 01
		String str1 = "Java is not difficult";
		
		//Case 02
		String str2 = new String();
		str2 = "Java is not difficult";
		
		String str3 = new String("Java is not difficult");
	}

}


























