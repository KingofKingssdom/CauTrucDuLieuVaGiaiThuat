package GiaiThuaCuaMotSo;

public class Test {
	// Giai thừa của một số
 /*
  Cho số n (n >=0), hãy tìm giai thừa của nó . Giai thừa của n được định nghĩa 
  là 1 x 2 x ... x n. Với n = 0, giai thừa là 1
  
  Ví dụ:
		Đầu vào : n = 5 
		Đầu ra : 120 
		Giải thích : 5! = 5 * 4 * 3 * 2 * 1 = 120
  * */
	public static int giaiThua(int n) {
		int m = 1;
		for(int i =1;i<=n;i++) {
			m *=i;
		}
		return m;
	}
	public static void main(String[] args) {
		int n = 0;
		int result = giaiThua(n);
		System.out.println(result);
	}
}
