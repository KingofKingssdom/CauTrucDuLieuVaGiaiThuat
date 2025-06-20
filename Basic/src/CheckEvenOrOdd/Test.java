package CheckEvenOrOdd;

// Lý thuyết ý tưởng cần làm 
 /*
  Cho số đầu vào lấy số đó chia lấy dư cho 2 nếu bằng 0 thì là số chẵn, 
  nếu khác 0 là số lẻ
  * */
public class Test {
	// Hàm kiểm tra xem số đã cho là số chắn hay lẻ
	public static boolean check(int x) {
		if(x % 2 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int x = 11;
		boolean result = check(x);
		if(result) {
			System.out.println("Số chẵn");
		}
		else {
			System.out.println("Số lẻ");
		}
	}
}
