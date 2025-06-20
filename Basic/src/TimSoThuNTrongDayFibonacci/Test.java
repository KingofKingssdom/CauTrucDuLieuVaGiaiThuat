package TimSoThuNTrongDayFibonacci;

// Dãy fibonacci là dãy mà số bắt đầu là 0 và 1 và các số hạng sau sẽ lần lượt
// là 2 số đứng trươc cộng lại: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

//Ý tưởng thuật toán 
// Nếu n <=1 thì nó sẽ trả ra luôn n ( là 1 hoặc 0)
// Nếu ngược lại thì đệ quy lại bằng tổng 2 hàm (n-1) + (n-2) 
public class Test {
	/*
	 Với số nguyên dương n , nhiệm vụ là tìm số Fibonacci thứ n .
	 Ví dụ
	  n = 2;
	  đầu ra là 1
	  
	 * */
	public static int nthFibonacci(int n) {
		if(n <=1) {
			return n;
		}
		
		return nthFibonacci(n-1) + nthFibonacci(n-2);
	}
	public static void main(String[] args) {
		int n = 3;
		int result = nthFibonacci(n);
		System.out.println(result);
	}
}
