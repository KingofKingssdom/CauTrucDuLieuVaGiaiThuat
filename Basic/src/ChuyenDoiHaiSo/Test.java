package ChuyenDoiHaiSo;
// Lý thuyết ý tưởng 

/*
 Cho hai số cần đổi là đầu vào áp dụng theo công thức toán học 
 	a = 10 , b = 20
 	a  = a + b = 10 + 20 = 30 (a mới mang giá trị 30)
 	b = a - b = 30 - 20 = 10 ( b mới mang giá trị 10)
 	a = a - b = 30 - 10 = 20 (a lúc này lại mang giá trị mới 20)
 	Đổi chỗ đc giá trị
  
 * */
public class Test {
	// Cho hai số a,b in ra số b,a
	public static void swap(int a, int b) {
		int sum = a + b;
		b = sum - b;
		a = sum - b;
		System.out.println("Giá trị a sau khi đổi " +a);
		System.out.println("Giá trị b sau khi đổi " + b);
		
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a, b);
	}
}
