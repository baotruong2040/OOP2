package Ex2;
public class main {

    public static void main(String[] args) {
        Author[] authors1 = new Author[2];
        authors1[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors1[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors1, 19.99 , 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorNames());
        
    }
}