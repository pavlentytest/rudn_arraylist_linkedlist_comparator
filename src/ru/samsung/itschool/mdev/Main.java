package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Collections
        List-ы (Списки) => ArrayList, LinkedList, Queue, Stack (классы)

        Set-ы (Множества) => TreeSet, HashSet... (классы)

        Map-ы (Словарь ключ=>значение) => Hashtable, HashMap, LinkedHashMap, TreeMap...

        https://habr.com/ru/post/188010/

         */

        Collection list = new ArrayList(); // интерфейс


  //      ArrayList arrayList = new ArrayList();

        //arrayList.
        List arrayList2 = new ArrayList<>();

        // List arrayList3 = new List {};

        ArrayList<String> arrayList1 = new ArrayList<>();
        var arr = new ArrayList<String>();
        var a = 100;

        //Collections // это класс - со статичными методами

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start =  System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add begin: "+(end-start));
        start =  System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add begin: "+(end-start));
        // --------------------------------------------------------
        start =  System.nanoTime();
        for(int i=30000;i<60000;i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get middle: "+(end-start));

        start =  System.nanoTime();
        for(int i=30000;i<60000;i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get middle: "+(end-start));
        // ------------------------------------------------------

        start =  System.nanoTime();
        for(int i=0;i<30000;i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add end:  "+(end-start));

        start =  System.nanoTime();
        for(int i=0;i<30000;i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add end: "+(end-start));

        // Stack
        // LIFO - Last in - First out
        // Queue
        // FIFO - First in - First out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // кладем в стек
            queue.offer(s); // кладем в очередь
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // удаляем c конца и печатем из стека
        }
        System.out.println();
        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " "); // удаляем с начала и печатаем
        }

        //Collections.sort()
                //Arrays.sort()

        // инициализируем массив
        int intArr[] = {30, 20, 5, 12, 55};

        // сортируем его
        Arrays.sort(intArr);

        int retVal = Arrays.binarySearch(intArr, 16);
        System.out.println("Элемент с о значением 12 находится по индексу " + retVal);

        ArrayList<Integer> aList = new ArrayList(Arrays.asList(intArr));
        Collections.sort(aList);

        class City {
            private String name;
            private int population;

            public City(String name, int population) {
                this.name = name;
                this.population = population;
            }
        }

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",234234));
        cities.add(new City("Berlin",2345345));
        cities.add(new City("Tokyo",24562456));
        cities.add(new City("Munich",545644));

        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
               // return o2.population-o1.population;
                return o2.name.compareTo(o1.name);
            }
        };

        Collections.sort(cities,sort_by);
        for(City c: cities) {
            System.out.println(c.population + "-" + c.name);
        }

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Barsik",4));
        animals.add(new Animal("Bobik",5));
        animals.add(new Animal("Rex",10));

        Collections.sort(animals);
        for(Animal aa: animals) {
            System.out.println(aa.getAge() + "-" + aa.getName());
        }








    }
}
