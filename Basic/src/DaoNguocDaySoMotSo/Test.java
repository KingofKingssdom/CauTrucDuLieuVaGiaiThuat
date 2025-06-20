package DaoNguocDaySoMotSo;
// Lý thuyết ý tưởng 
/*
  Lấy số cho n chia lấy dư cho 10
  Số dư đó sẽ cộng với một biến và một biến đó nhân cho 10 để tăng đơn vị lên
  sau mỗi lần lặp sẽ chia giảm đi một đơn vị
  in ra kết quả đã đảo ngược
  
 * */
public class Test {
	/*
	 Cho một số nguyên n, tìm chữ số đảo ngược của nó.
	 	Đầu vào: n = 122 
		Đầu ra: 221 
		Giải thích: Bằng cách đảo ngược các chữ số của số, số đó sẽ 
		đổi thành 221.
	 * */
	public static int daoNguoc(int n) {
		int resevse = 0;
		while(n != 0) {
			resevse = resevse * 10 + n % 10;
			n = n / 10;
		}
		return resevse;
	}
	public static void main(String[] args) {
		int n = 221;
		int result = daoNguoc(n);
		System.out.println(result);
	}
}
