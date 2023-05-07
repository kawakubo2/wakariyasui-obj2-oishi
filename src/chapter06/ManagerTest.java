package chapter06;

import java.lang.reflect.Method;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager(110, "森下樹", 32, "プロジェクトマネージャ");
        System.out.println(manager.getId() + "\t" + manager.getName() + "\t" 
            + manager.getAge() + "\t" + manager.getTitle());
        System.out.println("クラス名:" + manager.getClass().getName());
        System.out.print("メソッド名: ");
        for (Method m: manager.getClass().getMethods()) {
            System.out.println(m.getName());
        }
        
    }
}
