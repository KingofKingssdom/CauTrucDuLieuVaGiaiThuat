package TimThuTrongTuan;
// Ý tưởng thuật toán 

/*
 	Phương pháp dựa trên công thức để tính ngày trong tuần là phương pháp hiệu 
 	quả để tính ngày bằng các phép tính số học đơn giản. Phương pháp này tận 
 	dụng các mã tháng và mã năm được tính toán trước để xác định ngày trong 
 	một ngày nhất định
 	
 	Công thức
 	dayOfWeek = (d + monthCode + yearCode) % 7
  	
  	Các bước tính toán:
	Bước 1: Tính mã tháng : Mỗi tháng có một mã tháng được xác định trước và 
	giá trị của mỗi tháng như sau:
	Tháng 1 và tháng 10 = 6, 
	tháng 2 = 2 (1 đối với năm nhuận), 
	tháng 3 và tháng 11 = 2, 
	tháng 4 và tháng 7 = 5, 
	tháng 5 = 0, 
	tháng 6 = 3, 
	tháng 8 = 1, 
	tháng 9 và tháng 12 = 4
	
	Bước 2: Tính Mã năm : Mã năm được tính dựa trên hai chữ số cuối của năm. 
	Các bước như sau:
		- Lấy hai chữ số cuối của năm. Đối với năm 1995, hai chữ số cuối là 95.
		- Nhân với 1,25 : 95×1,25=118,75
		- Lấy giá trị sàn của kết quả (tức là số nguyên lớn nhất nhỏ hơn hoặc bằng kết quả)
		- Áp dụng modulo 7 : 118%7=5
		- Nếu năm là bội số của 400, hãy sử dụng hai chữ số cuối như hiện tại và không thay đổi gì.
 	
 	Bước 3: Áp dụng Điều chỉnh thế kỷ: Điều chỉnh theo thế kỷ của năm:
		Đối với những năm từ 100 đến 199: Thêm 5.
		Đối với những năm từ 200 đến 299: Thêm 3.
		Đối với những năm từ 300 đến 399: Thêm 1 .
		Bước này được sử dụng để tính đến sự dịch chuyển của ngày do năm thế kỷ (ví dụ: 1800, 1900).
 	
 	Bước 4: Áp dụng công thức 
 	
 * */
public class Test {

	/*
	 Với một ngày (ngày, tháng, năm), nhiệm vụ là xác định ngày trong tuần 
	 mà ngày đó rơi vào. Hàm này phải có khả năng tính toán ngày cho bất 
	 kỳ ngày nào trong quá khứ hoặc tương lai. Hàm này phải trả về các giá 
	 trị từ 0 đến 6 trong đó 0 có nghĩa là Chủ Nhật, 1 là Thứ Hai
	 
	 Ví dụ
	 d = 20 m = 6 y = 2025
	 đầu ra là thứ sáu
	 
	 * */
	public static int caculation(int day, int month, int year) {
		// Mã tháng
		int[] monthCode = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
		// Điều chỉnh năm cho tháng 1 và tháng 2
		if(month < 3) {
			year =-1; // Nếu tháng là tháng 1 và tháng 2, coi chúng là một phần của năm trước
		}
		
		// Tính toán mã năm
		int yearCode = (year % 100) + (year % 100) /4;
		
		// Điều chỉnh mã năm cho thế kỉ 
		yearCode = (yearCode + (year / 100) / 4 + 5 * (year / 100)) % 7;
		
		return (day + monthCode[month -1] + yearCode) % 7;
	}
	
	public static void main(String[] args) {
		int day = 20;
		int month = 6;
		int year = 2025;
		int result = caculation(day, month, year);
		if(result == 0) {
			System.out.println("Chúa Nhật");
		}
		else if(result == 1) {
			System.out.println("Thứ hai");
		}
		else if(result == 2) {
			System.out.println("Thứ ba");
		}
		else if(result == 3) {
			System.out.println("Thứ tư");
		}
		else if(result == 4) {
			System.out.println("Thứ năm");
		}
		else if(result == 5) {
			System.out.println("Thứ sáu");
		}
		else if(result == 6) {
			System.out.println("Thứ bảy");
		}
		
	}
}
