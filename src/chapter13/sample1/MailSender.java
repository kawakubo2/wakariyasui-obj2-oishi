package chapter13.sample1;

import java.util.Random;

public class MailSender {
    public void send() throws MailException {
        Random r = new Random();
        if (r.nextInt(101) >= 80) {
            throw new MailException("メールの送信に失敗しました。");
        }
        System.out.println("メールの送信に成功しました。");
    }
}
