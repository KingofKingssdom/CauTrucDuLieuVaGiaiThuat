package TimSo_n_GanNhatChiaHetCho_m;
// Lý thuyết ý tưởng 

/*
 - Chúng ta tìm giá trị n/m. 
 - Sau đó, chúng ta tìm giá trị gần nhất trong hai khả năng. 
 - Một là q * m, khả năng kia là (m * (q + 1)) hoặc (m * (q - 1)) 
 tùy thuộc vào việc một trong hai số đã cho là số âm hay không
 * */
public class Test {
	/*
	 Viết hàm cho hai số nguyên n và m (m != 0) . Tìm số gần n nhất và chia hết cho m . 
	 Nếu có nhiều hơn một số như vậy, thì in ra số có giá trị tuyệt đối lớn 
	 nhất
	 Ví dụ
	 	Đầu vào : n = 13, m = 4 
		Đầu ra : 12 
		Giải thích : 12 gần 13 nhất và chia hết cho 4.
	 * */
	public static int check(int n, int m) {
		int q = n/m;
		int n1 = m*q;
		int n2 = (n*m) > 0 ? (m*(q+1)) : (m*(q-1));
		
		if(Math.abs(n-n1)< Math.abs(n -n2)) {
			return n1;
		}
		return n2;
	}
	public static void main(String[] args) {
		int n = 13;
		int m = 4;
		int result = check(n, m);
		System.out.println(result);
	}
	
}
