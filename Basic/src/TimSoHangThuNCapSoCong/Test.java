package TimSoHangThuNCapSoCong;
// Lý thuyết ý tưởng 
/*
 	- áp dụng công thức Tn = a1 + (n-1)(a2 -a1)
 * */
public class Test {
	// Viết hàm tìm số hạng thứ n của cấp số công
	/*
	 Cho hai số nguyên a1 và a2, lần lượt là số hạng đầu tiên và số hạng thứ 
	 hai của một Cấp số cộng, bài toán là tìm số hạng thứ n  
	 của cấp số cộng 
	 
		Đầu vào : a1 = 2, a2 ​​= 3, n = 4 
		Đầu ra : 5 
		Giải thích: Chuỗi là 2, 3, 4, 5, 6, .... , do đó số hạng thứ 4 là 5.
	 */
	public static int check(int a1, int a2, int n) {
		int result = a1 + (n-1)*(a2 -a1);
		return result;
	}
	public static void main(String[] args) {
		int a1 = 2;
		int a2 = 3;
		int n = 4;
		int result = check(a1, a2, n);
		System.out.println(result);
	}
}
