public class Main {
    public static void main(String[] args) {
        MyTable table = new MyTable();
        table.add('k', "Karim");
        table.add('l', "Luke");
        table.add('m', "McGrath");
        System.out.println(table.get('k'));
        System.out.println(table.get('l'));
        System.out.println(table.get('m'));
        System.out.println(table);
    }
}
