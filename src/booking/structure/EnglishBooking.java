package booking.structure;

public class EnglishBooking {
    private final String head, body, footer;
    public EnglishBooking(String head, String body, String footer) {
        this.head = head;
        this.body = body;
        this.footer = footer;
    }
    public void printBooking() {
        System.out.printf(head + "\n" + body + "\n" + footer + "\n");
    }
}