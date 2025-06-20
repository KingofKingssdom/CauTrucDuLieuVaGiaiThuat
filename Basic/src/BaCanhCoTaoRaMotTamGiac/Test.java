package BaCanhCoTaoRaMotTamGiac;
// Lý thuyết ý tưởng
/*
 Có 3 cạnh, thì cứ cộng 2 cạnh lại mà lớn hơn cạnh còn lại thì nó tạo thành một tam giác
 
 * */
public class Test {
	/*
	 Cho 3 canh a = 10, b = 7, c = 5. Viết hàm kiểm tra xem 3 cạnh này có tạo 
	 thành một tam giác hay không
	 * */
	public static boolean check(int a, int b, int c) {
		if(a+b > c && a + c > b && b + c > a) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 5;
		boolean result = check(a, b, c);
		System.out.println(result);
	}
}
