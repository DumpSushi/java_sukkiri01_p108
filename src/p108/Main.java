package p108;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Hero> list = new ArrayList<Hero>();
		list.add(new Hero("斎藤"));
		list.add(new Hero("鈴木"));

		Iterator<Hero> it = list.iterator();
		while(it.hasNext())
		{
			Hero e = it.next();
			System.out.println(e.getName());
		}

	}

}
