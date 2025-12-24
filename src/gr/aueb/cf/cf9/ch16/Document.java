package gr.aueb.cf.cf9.ch16;

public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("This is a Document");
    }
}
