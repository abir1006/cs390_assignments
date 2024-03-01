package Problem_1;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("1000 N 4th St", "Fairfield", "IA", "52557");
        Address address2 = new Address("123 Street", "Chicago", "IL", "60601");
        Address address3 = new Address("321 w street", "Chicago", "NY", "60601");

        Customer customer1 = new Customer("Bob", "Lee", "332-221-4444");
        customer1.setBillingAddress(address1);

        Customer customer2 = new Customer("Charls", "Ben", "332-441-5555");
        customer2.setBillingAddress(address2);

        Customer customer3 = new Customer("Patric", "Sam", "322-432-3333");
        customer3.setBillingAddress(address3);

        Customer[] customers = {customer1, customer2, customer3};

        for(Customer customerObj: customers) {
            if (customerObj.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customerObj);
            }
        }

    }
}
