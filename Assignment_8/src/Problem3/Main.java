package Problem3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Marketing> marketingList = new ArrayList<>();
        add(marketingList, "John key", "iPhone", 200);
        add(marketingList, "Harry mey", "MacBook", 2000);
        add(marketingList, "Lucas Kenedy", "Apple watch", 600);
        add(marketingList, "Mikel Gorge ", "iPad", 1100);
        add(marketingList, "Paul ", "Apple TV", 15000);
        remove(marketingList, 1);
        System.out.println("Size of the list: " + marketingList.size());
        sortSalesAmount(marketingList);
        System.out.println("List sorted by sales amount:");
        System.out.println(marketingList);

        List<Marketing> moreThan1000List = listMoreThan1000Sales(marketingList);
        sortByEmployeeName(moreThan1000List);
        System.out.println("List sorted by employee name whose sales amount is more than 1000:");
        System.out.println(moreThan1000List);

    }

    public static void add(ArrayList<Marketing> marketingList, String employeeName, String productName, double salesAmount) {
        marketingList.add(new Marketing(employeeName, productName, salesAmount));
    }

    public static void remove(ArrayList<Marketing> marketingList, int index) {
        marketingList.remove(index);
    }

    public static void sortSalesAmount(ArrayList<Marketing> list) {
        Collections.sort(list, new Comparator<Marketing>(){
            @Override
            public int compare(Marketing obj1, Marketing obj2) {
                return Double.compare(obj1.salesAmount, obj2.salesAmount);
            }
        });
    }

    public static List<Marketing> listMoreThan1000Sales(ArrayList<Marketing> list) {
        ArrayList<Marketing> newList = new ArrayList<Marketing>();
        for (Marketing e: list) {
            if (e.salesAmount > 1000.00) {
                newList.add(e);
            }
        }
        return newList;
    }

    public static void sortByEmployeeName(List<Marketing> list) {
        Collections.sort(list, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing obj1, Marketing obj2) {
                return obj1.employeeName.compareTo(obj2.employeeName);
            }
        });
    }
}
