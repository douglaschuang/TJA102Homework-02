package hw4;

import java.util.Scanner;

/*
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
 * 表如下：
 * 員工編號/身上現金: 	25/2500, 32/800, 8/500, 19/1000, 27/1200
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
 * 員工編號: 25 19 27 共3 人!」
 */
public class Hw4BBorrowMoney {
	public static void main(String[] args) {
		int borrowAmount = 0;
		int totalEmp = 0;
		// 宣告員工編號及金額陣列(每筆資料代表員工編號/身上現金)
		int emp[][] = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲借的金額(正整數):");
		
		if (sc.hasNextInt()) {
			borrowAmount=sc.nextInt();
		}
		
		for(int x = 0; x < emp.length; x++) {
			if (emp[x][1] >= borrowAmount) { // 如果該員工金額大於等於預借金額
				System.out.print(emp[x][0]+"\t");
				totalEmp++;
			}
		}
		System.out.println("共"+totalEmp+"人可借.");
	}

}
