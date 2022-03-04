package def;

public class BClass {
public static void main(String args[]) {
	System.out.println("bauuuuuu");
	System.out.println("SCHIMBAREEEE");
	System.out.println("bauuuuuu");
}

public static boolean coolInt() {
	for (int i = 0; i < 10; i++) {
		if(i!=3) {
			if(System.currentTimeMillis() > 100000) {
				return false;
			}
			System.out.println("i!=3");

		}
	}
	return true;
}


public static int coolInt2() {
	for (int i = 0; i < 10; i++) {
		if(i!=3) {
			System.out.println("i!=2");
		}
	}
	return 0;
}


public static int coolInt3() {
	for (int i = 0; i < 10; i++) {
		if(i!=3) {
			System.out.println("i!=0");
		}
	}
	return 0;
}
}
