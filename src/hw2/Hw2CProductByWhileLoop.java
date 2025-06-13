package hw2;

//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
public class Hw2CProductByWhileLoop {

	public static void main(String[] args) {
		int sum = 1, count = 1;

		while (count <= 10) { // 計算1~10的連乘積
			sum *= count;
			count++;
		}

		System.out.println("1～10的連乘積(1*2*3*…*10)=" + sum);
	}
}
