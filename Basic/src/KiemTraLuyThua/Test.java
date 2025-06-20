package KiemTraLuyThua;

public class Test {
	// Lý thuyết ý tưởng
	// Tăng số từ n = 0 đến bé hơn hoặc bằng y, nếu lũy thừa kết quả ra là == y
	// thì true, còn bé hơn hoặc lớn hơn y  thì là false;
	
	public static boolean check(int x, int y) {
		if (y == 1) return true; // vì x^0 = 1
	    long power = 1;
	    while (power < y) {
	        power *= x;
	        if (power == y) {
	            return true;
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		boolean result = check(x, y);
		System.out.println(result);
	}
}
