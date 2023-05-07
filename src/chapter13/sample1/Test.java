package chapter13.sample1;

public class Test {
    public static void main(String[] args) {
        try {
            LessonRecordDAO dao = new LessonRecordDAO();
            dao.getList();
            InvoicePDFCreator creator = new InvoicePDFCreator();
            creator.create();
            MailSender sender = new MailSender();
            sender.send();
        } catch (CannotGetLessonRecordException e) {
            System.out.println(e);
        } catch (PDFException e) {
            System.out.println(e);
        } catch (MailException e) {
            System.out.println(e);
        }
    }
}
