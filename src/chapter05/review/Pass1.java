package chapter05.review;

import lib.Input;

public class Pass1 {
    public static void main(String[] args) {
        String csvString = Input.getString("カンマ区切の数値");
        StdStat stat = new StdStat(csvString);
        System.out.println("合　計=" + stat.total());
        System.out.println("平　均=" + stat.avg());
        System.out.println("最大値=" + stat.max());
        System.out.println("データ数=" + stat.count());
    }
}
