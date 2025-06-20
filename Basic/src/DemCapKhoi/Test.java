package DemCapKhoi;

	// Lặp 2 vòng lặp mỗi vòng lặp ngoài tăng từ a đến bé <=n 
	// vòng lặp trong cũng tăng từ b đến bé <=n
	// sau đó nhân lần lượt lại với nhau nếu == n thì đêm biến count tăng lên một
public class Test {
	//Đếm cặp khối 
	/*
	 Cho n, đếm tất cả 'a' và 'b' thỏa mãn điều kiện a^3 + b^3 = n. 
	 Trong đó (a, b) và (b, a) được coi là hai cặp khác nhau
	 
	Đầu vào: n = 9 
	Đầu ra: 2 
	Giải thích : 1^3 + 2^3 = 9 và 2^3 + 1^3 = 9
	 * */ 
	public static int dem(int n) {
		int count = 0;
		for(int a =1;a<=n;a++) {
			for(int b = 1; b <= n; b++) {
				if(a*a*a + b*b*b == n) {
					count ++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int n =9;
		int result = dem(n);
		System.out.println(result);
	}
}
