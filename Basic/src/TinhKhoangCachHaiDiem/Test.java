package TinhKhoangCachHaiDiem;
// Lý thuyết 
// để tính khoảng cách áp dụng công thức 
// d = Math.sqrt((a2-a1)^2) + (b2-b1)^2); 
public class Test {
	// cho 2 điểm với tọa độ A(a1,b1) và B(a2, b2). Viết hàm tính khoảng cách 
	// 2 điểm này
	public static double khoangCach(double a1, double b1, double a2, double b2) {
		double tung = Math.pow((a2-a1),2);
		double hoanh = Math.pow((b2-b1), 2);
		double d = Math.sqrt((tung + hoanh));
		return d;
	}
	public static void main(String[] args) {
		double result = khoangCach(3, 4, 7, 7);
		System.out.println(result);
	}
}
