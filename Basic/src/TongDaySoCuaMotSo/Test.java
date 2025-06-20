package TongDaySoCuaMotSo;
// Lý thuyết ý tưởng 
/*
 	Chạy vòng lặp với số n khác 0 
 	Chia lấy dư từng chữ số cho 10
 	sau mỗi lần chia cho 10 để giam đi một đơn vị
 	cộng tổng hết chữ số chia lấy dư ra 
 	in ra kết quả 
 * */
public class Test {
	/*
	 Cho một số n , hãy tìm tổng các chữ số của nó.
		Đầu vào: n = 687 
		Đầu ra: 21 
		Giải thích: Tổng các chữ số của nó là: 6 + 8 + 7 = 21 
	 */  
	public static int tong(int n) {
		int sum =0;
		while(n!= 0) {
			int last = n % 10;
			sum += last;
		  	n = n/ 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n = 678;
		int result = tong(n);
		System.out.println(result);
	}
}
