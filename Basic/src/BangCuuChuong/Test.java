package BangCuuChuong;

// Lý thuyết về cách làm
 /*
  - Tạo một vòng lặp từ vị trí i bằng 0 đến vị trị bé hơn hoặc bằng 10
  - Cho một con số tương ứng với bảng cửu chương cần tạo 
  - Lấy số đó nhân với chỉ mục theo thứ tự của vòng lặp sẽ cho ra đc kết quả

  * */

public class Test {
	
	// Viết một hàm cho một số nhiệm vụ hiện ra bảng cửu chương số đó
	public static void cuuChuong(int x) {
		for(int i =0;i<=10;i++) {
			int y = x * i;
			System.out.println(x + " x " + i + " = " + y);
		}
	}
	
	public static void main(String[] args) {
		int x = 5;
		cuuChuong(x);
	}
}
