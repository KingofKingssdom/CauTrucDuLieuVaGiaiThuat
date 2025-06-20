package TongSoTuNhien;

public class Test {
	// Viết hàm tính tổng số tự nhiên
	// Ví dụ cho vào một số n ra kết quả là n + (n-1)
	public static void tongSoTuNhien(int n) {
		int sum = 0;
		for(int i = 1;i<= n;i++) {
			sum += i;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int n = 3;
		 tongSoTuNhien(n);
		
	}
}
