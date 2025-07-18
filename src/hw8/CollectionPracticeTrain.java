package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// • 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//- (202, "普悠瑪", "樹林", "花蓮", 400)
//- (1254, "區間", "屏東", "基隆", 700)
//- (118, "自強", "高雄", "台北", 500)
//- (1288, "區間", "新竹", "基隆", 400)
//- (122, "自強", "台中", "花蓮", 600)
//- (1222, "區間", "樹林", "七堵", 300)
//- (1254, "區間", "屏東", "基隆", 700)

// • 請寫一隻程式，能印出不重複的Train物件
// • 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
// • 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
// • (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

public class CollectionPracticeTrain {
	public static void main(String[] args) {
		// (以下三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		
		// 1. 請寫一隻程式，能印出不重複的Train物件
		System.out.println("== 印出不重複的Train物件 ==");
		
		Set<Train> st = new HashSet<>();
		st.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		st.add(new Train(1254, "區間", "屏東", "基隆", 700));
		st.add(new Train(118, "自強", "高雄", "台北", 500));
		st.add(new Train(1288, "區間", "新竹", "基隆", 400));
		st.add(new Train(122, "自強", "台中", "花蓮", 600));
		st.add(new Train(1222, "區間", "樹林", "七堵", 300));
		st.add(new Train(1254, "區間", "屏東", "基隆", 700));
		// Set - 使用迭代器列出
		Iterator<Train> it = st.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		
		// 2. 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("== 以班次編號由大到小印出 ==");
		
		List<Train> lst = new ArrayList<>();
		lst.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		lst.add(new Train(1254, "區間", "屏東", "基隆", 700));
		lst.add(new Train(118, "自強", "高雄", "台北", 500));
		lst.add(new Train(1288, "區間", "新竹", "基隆", 400));
		lst.add(new Train(122, "自強", "台中", "花蓮", 600));
		lst.add(new Train(1222, "區間", "樹林", "七堵", 300));
		lst.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(lst); // List 排序
		// List - 使用for列出
		for(int count = 0; count < lst.size(); count++) {
			Train tr = lst.get(count);
			System.out.println(tr.toString());
		}
		
		System.out.println("==讓班次編號由大排到小印出， 還可以不重複印出Train物件==");
		// 3. 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		List<Train> lst2 = new ArrayList<>();
		for(Train tr : st) {
			lst2.add(tr);  // 從前面的Set取值 (不重複物件), 然後加入List
		}
	
		Collections.sort(lst2); // List 排序
		// List - 使用foreach列出
		for(Train tr : lst2) {
			System.out.println(((Train)tr).toString());
		}
		
	}
}
