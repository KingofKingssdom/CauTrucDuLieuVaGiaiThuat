package InSoMatDoiDienXucXac;
// Lý thuyết ý tưởng
/*
 	Cho một số từ 1 đến 6, nếu số nhập vố > 6 và < 1 thi sai 
 	Mặt đối diện như sau 
 	nếu là 1 đối diện là 6 
 	nếu là 2 đối diện là 5
 	nếu là 3 đối diện là 4
 	nếu là 4 đối diện là 3
 	nếu là 5 đối diện là 2
 	nếu là 6 đối diện là 1
 	Cuối cùng cứ nhập vào số nào là in ra số đối diện
 * */
	
public class Test {
	public static void matDoiDienXucXac(int x) {
		 switch (x) {
		case 1: {
			System.out.println("Mặt đối diện là: 6");
			break; 
		}
		case 2: {
			System.out.println("Mặt đối diện là: 5");
			break; 
		}
		case 3: {
			System.out.println("Mặt đối diện là: 4");
			break; 
		}
		case 4: {
			System.out.println("Mặt đối diện là: 3");
			break; 
		}
		case 5: {
			System.out.println("Mặt đối diện là: 2");
			break; 
		}
		case 6: {
			System.out.println("Mặt đối diện là: 1");
			break; 
		}
		default:
			throw new IllegalArgumentException("mặt đối diện nhập vào kh đúng: " + x);
			
		}
	}
	public static void main(String[] args) {
		int x = 21;
		matDoiDienXucXac(x);
	}
}
