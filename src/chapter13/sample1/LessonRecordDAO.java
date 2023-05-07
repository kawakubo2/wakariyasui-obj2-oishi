package chapter13.sample1;

import java.util.Random;

public class LessonRecordDAO {
    public void getList() throws CannotGetLessonRecordException {
        Random r = new Random();
        if (r.nextInt(101) >= 80) {
            throw new CannotGetLessonRecordException("受講記録の取得に失敗しました。");
        }
        System.out.println("受講記録に取得に成功しました。");
    }
}
