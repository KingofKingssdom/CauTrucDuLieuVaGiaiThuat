package LyThuyet;

public class Hashing {
	// Hashing là gì?
	/*
	 * Hashing giống như việc bạn muốn lưu một món đồ vào trong một cái 
	 * tủ có nhiều ngăn, và bạn cần một cách để quyết định món đó nên để
	 *  vào ngăn số mấy.
	 * 
	 *  Thay vì nhớ từng món ở đâu, bạn có một công thức tính (gọi là hàm 
	 *  băm — hash function), nó nhận tên món đồ (gọi là key) rồi trả 
	 *  về số thứ tự ngăn (index) để bỏ vào.
	 *  
	 *  
	  Ví dụ:

		Bạn có cái chìa khóa tên là "ab"
		
		Dùng công thức: cộng mã số từng chữ rồi chia lấy dư cho số ngăn
		
		Ví dụ: "a" = 1, "b" = 2 → 1 + 2 = 3
		
		Nếu tủ có 7 ngăn thì 3 mod 7 = 3 → bỏ vào ngăn số 3.
	
	 */
	// Bảng băm (Hash Table) là gì?
	/*
	Nó chính là cái tủ bạn vừa tưởng tượng:

		Mỗi ngăn là một vị trí để lưu giá trị.

		Mỗi món đồ có 1 khóa riêng (key) và giá trị kèm theo (value).

		Khi bạn cần tìm đồ, chỉ cần tính lại số ngăn rồi tới đó lấy.
	*/
	// Va chạm (Collision) là gì?
	/*
	Ví dụ:

		"ab" tính ra ngăn số 3.
		
		"ba" cũng ra ngăn số 3.
		
		Lúc này có hai món ở cùng một ngăn → gọi là va chạm.
	*/
	
	// Giải quyết va chạm thế nào?
	/*
		Có 2 cách:
		Danh sách liên kết (chaining): mỗi ngăn là 1 cái danh sách chứa nhiều món.
		
		Dời tuyến tính (linear probing): nếu ngăn đó đầy thì kiếm ngăn kế tiếp còn trống.
	*/
	
	// Hệ số tải (Load factor) là gì?
	/*
		Giống như bạn coi tủ của mình đã đầy bao nhiêu phần trăm:

		Nếu tủ có 10 ngăn, mà đã chứa 7 món → 7/10 = 0.7
		
		Giá trị mặc định hay đặt là 0.75 → khi vượt quá thì nên làm gì đó.
	*/
	
	// Rehashing là gì?
	/*
		Khi hệ số tải quá cao (tủ quá đầy), ta:

		Tăng kích thước tủ lên gấp đôi
		
		Tính lại vị trí cho từng món theo công thức mới
		
		Đưa lại vào các ngăn mới.
	*/
	
}
