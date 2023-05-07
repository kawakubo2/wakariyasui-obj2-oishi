package chapter13.sample1;

import java.util.Random;

public class InvoicePDFCreator {
    public void create() throws PDFException {
        Random r = new Random();
        if (r.nextInt(101) >= 80) {
            throw new PDFException("請求書の作成に失敗しました。");
        }
        System.out.println("請求書の作成に成功しました。");
    }
}
