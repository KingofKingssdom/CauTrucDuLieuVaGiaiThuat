package TimUocChungLonNhat;
// Sử dụng thuật toán Euclid
/*
 	Thuật toán Euclid:
Nếu a = 0, thì ƯCLN(a, b) = b.
Nếu b = 0, thì ƯCLN(a, b) = a.
Nếu a > b, thì thay a bằng a - b.
Nếu b > a, thì thay b bằng b - a.
Lặp lại các bước 1-4 cho đến khi a = b. ƯCLN(a, b) là giá trị chung đó.
 * */
public class Test {
	// Viết hàm tìm ước chung lớn nhất 2 số
	// Ví dụ 
	// a = 20 chia 4 
	// b = 28 chia 4 
	// đầu vào là a, b đầu ra là 4
	public static int UCLN(int a, int b) {
		// Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b) {
            if (a % b == 0)
                return b;
            return UCLN(a - b, b);
        }
        if (b % a == 0)
            return a;
        return UCLN(a, b - a);
	}
	public static void main(String[] args) {
		int a = 20;
		int b = 28;
		int result = UCLN(a,b);
		System.out.println(result);
	}
}
