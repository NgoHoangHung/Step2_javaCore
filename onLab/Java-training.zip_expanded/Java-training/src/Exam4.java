import java.util.Scanner;
public class Exam4 {
	public static void main(String[] args) {
		String[] Anser_keys = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Tiến hành nhập số liệu đáp án");
		for( int index = 0; index < 10; index++) {
			System.out.printf("Câu %d:\n",index+1);
			Anser_keys[index ] = sc.nextLine();
		}
		
		String[][] Student_Of_Anser = new String[5][10];
		
		//câu B: Tiến hành nhập câu trả lời của 5 bạn
		for(int i = 0; i< 5; i++) {
			System.out.printf("Câu trả lời của bạn thứ %d: \n",i+1);
			for(int j = 0; j< 10; j ++) {
				System.out.printf("Câu số %d: ",j+1);
				Student_Of_Anser[i][j] = sc.nextLine();
			}
			System.out.println("=============================");
		}
// Câu C: Tìm bạn có nhiều câu trả lời đúng nhất
		int[] count1 = {0,0,0,0,0};
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j< 10 ; j++) {
				if (Student_Of_Anser[i][j] == Anser_keys[j]) {
					count1[i]++;
				}
			}
		}
		int max_count = count1[0];
		for(int i =0; i<5;i++) {
			if(max_count< count1[i]) {
				max_count = count1[i];
			}
		}
		
		for(int i =0; i<5;i++) {
			if(count1[i] == max_count) {
				System.out.printf("Bạn %d là người có số điểm cao nhất!", i+1);
			}
		}
		//reset count
		
		
//Câu D
		
		int min_count = count1[0];
		for(int i =0; i<5;i++) {
			if(min_count> count1[i]) {
				min_count = count1[i];
			}
		}
		for(int i =0; i<5;i++) {
			if(count1[i] == min_count) {
				System.out.printf("Bạn %d là người có số điểm thấp nhất!", i+1);
			}
		}

// Câu e
		int[] count2 = {0,0,0,0,0};
		for(int i = 0; i<5;i++) {
			for(int j =0; j<10;j++) {
				if( Student_Of_Anser[i][j] == "A") {
					count2[i]++;
				}
			}
		}
		int A_Anser = count2[0];
		for(int i =0; i<5;i++) {
			if(count2[i] == A_Anser) {
				System.out.printf("Bạn %d là người chọn nhiều đáp án A nhất!", i+1);
			}
		}
	}
}






























