package p108;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		{
			List<Hero> heroes = new ArrayList<Hero>();
			heroes.add(new Hero("斎藤"));
			heroes.add(new Hero("鈴木"));

			Iterator<Hero> it = heroes.iterator();
			while(it.hasNext())
			{
				Hero e = it.next();
				System.out.println(e.getName());
			}
		}
		{
			Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
			heroes.put(new Hero("斎藤"), 3);
			heroes.put(new Hero("鈴木"), 7);
			for(Hero key: heroes.keySet())
			{
				int value = heroes.get(key);
				System.out.println(key.getName() + "が倒した敵=" + value);
			}

		}
	}

}
