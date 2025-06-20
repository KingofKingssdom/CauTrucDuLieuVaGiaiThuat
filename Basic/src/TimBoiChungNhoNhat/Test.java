package TimBoiChungNhoNhat;
// Lý thuyết ý tưởng 
//Ta bắt đầu từ vị trí có 2 số ta sẽ lấy số lớn nhất trong 2 số đó chia cho số nhỏ nhất trong hai 
// số đó, nếu chia lấy dư bằng 0 thì ta sẽ trả ra số đó
// nếu không thì sẽ tiếp tục cộng lại số lớn nhất đến khi đạt đc chia hết 
public class Test {
	/*
	 Cho 2 số a, b tìm BCNN của 2 số đó
	 Ví dụ: a = 4, b = 6, BCNN là số chia hết cho 4 và 6 mà nhỏ nhất là số 12
	 * */
	public static int BCNN(int a, int b) {
		int greater = Math.max(a, b);
		int smallest = Math.min(a, b);
		for(int i = greater;;i +=greater) {
			if(i % smallest == 0) {
				return i;
			}
		}
	}
	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int result = BCNN(a, b);
		System.out.println(result);
	}
}
