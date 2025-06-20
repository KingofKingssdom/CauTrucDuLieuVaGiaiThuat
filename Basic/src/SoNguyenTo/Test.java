package SoNguyenTo;
// Lý thuyết ý tưởng
/*
 	- Số nguyên tố là số chia hết cho 1 và chính nó 
 	- Lặp số từ 2 đến bé hơn số n, nếu số n chia lần lượt cho số lặp vào, mỗi số
 	chia cho thứ tự tăng dần, nếu chỉ càn chia một số mà lấy dư ra là 0 thì số 
 	đó không là số nguyên tố
 	In ra kết quả
 * */
public class Test {
	public static boolean check(int n) {
		for(int i = 2; i < n ;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean result = check(9);
		System.out.println(result);
	}
}
