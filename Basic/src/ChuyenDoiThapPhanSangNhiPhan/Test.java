package ChuyenDoiThapPhanSangNhiPhan;
// Ý tưởng thuật toán
// Chia lấy ra số dư đó thêm vào chuỗi từ ngược trở lên

public class Test {
	/*
	Cho một số thập phân n, chuyển ra thành số nhị phân
	 * */
	public static void chuyenDoi(int n) {
		StringBuilder stringBuilder = new StringBuilder();
		while(n>0) {
			int bit = n%2;
			stringBuilder.append( (char) ('0' + bit));
			n = n /2;
		}
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}
	public static void main(String[] args) {
		int n =12;
		chuyenDoi(n);
	}
}
