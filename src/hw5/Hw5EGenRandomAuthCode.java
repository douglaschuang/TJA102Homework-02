package hw5;
// 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
// genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
// 與數字的亂數組合
public class Hw5EGenRandomAuthCode {
	public static void main(String[] args) {
		Hw5EGenRandomAuthCode gr = new Hw5EGenRandomAuthCode();
		System.out.println(gr.getAuthCode(8));
	}
	
	public String getAuthCode(int numberCount) {
		// 依據傳入的數字大小, 亂數產生相同長度的驗證碼
		char[] table = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'
				}; // 定義可產生的英數字陣列(0~9+大小寫英文字, 共62個字)
		String authCode = "";
		int index = 0;
		
		for(int i = 0; i < numberCount; i++) {
			index = (int)(Math.random()*(62+1)); // 亂數取得英數字陣列的index
			authCode = authCode + String.valueOf(table[index]); // 組合取得的字元
		}
		
		return authCode;
	}
}
