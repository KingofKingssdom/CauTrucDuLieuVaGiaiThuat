package TongBinhPhuongSoTuNhien;
// Lý thuyết ý tưởng 

/*
  - lặp qua từng chỉ mục theo tăng dần từ 1 đến n
  - mỗi lần lặp thì chỉ mục sẽ đc bình phương lên
  - Kết quả sau mỗi lần thì cộng với một biến tổng 
  - trả ra kết quả biến  tổng đó
 * */
public class Test {
	// Với số nguyên dương n, ta phải tìm tổng bình phương của n số tự nhiên đầu tiên
	// Ví dụ
	// Đầu vào : n = 2 
	// Đầu ra : 5 
	// Giải thích : 1^2+2^2 = 5
	public static void tongBinhPhuong(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int n = 2;
		tongBinhPhuong(n);
	}
}
