package com.myblog.myblog11;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee("mike", 30, "benguluru"),
                new Employee("mik", 25, "chenneie"),
                new Employee("hike", 40, "goa")

        );


        Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(e ->e.getCity()));

        for(Map.Entry<String,List<Employee>> entry : result.entrySet()){
            String city=entry.getKey();
            List<Employee> employeeWithAge=entry.getValue();
            System.out.println(city);
            for(Employee e:employeeWithAge){
                System.out.println(e.getName());
                System.out.println(e.getCity());

            }
        }

    }


//        Supplier<Integer> s=()->new Random().nextInt(500);
//        Integer result = s.get();
//        System.out.println(result);
//        System.out.println(new Random().nextInt(500));
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        // Using Predicate to filter even numbers
//        Predicate<Integer> isEven = num -> num % 2 == 0;
//
//        boolean test = isEven.test(10);
//
//        System.out.println(test);

//        Predicate<String> val=str->str.equals("mike");
//
//        boolean results=val.test("mik");
//
//        System.out.println(results);

//        List<Integer> number = Arrays.asList(10, 20, 30, 40, 50, 70, 77, 99, 88, 33);
//        List<Integer> ood_num = number.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(ood_num);


//        List<Integer> data = Arrays.asList(10,20,50,50);
//        List<Integer> newNumber = data.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(newNumber);
//
//
//        List<String> upper = Arrays.asList("mike","mohan","sita");
//        List<String> up = upper.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(up);

//
//        List<String> data=Arrays.asList("alok","jiya","mohan","anu");
//        List<String> sort = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(sort);

//        List<Integer> sort=Arrays.asList(49,8,37,58,2,49,2,58);
//        List<Integer>s=sort.stream().distinct().collect(Collectors.toList());
//        System.out.println(s);

//        Consumer<Integer> results= number-> System.out.println(number);
//        results.accept(100);
//        List<String> names=Arrays.asList("mike","nike","sike");
//        Consumer<String> val=name-> System.out.println(name);
//        names.forEach(val);

//        Function<String, Integer> stringLength = s -> s.length();
//
//        Integer val=stringLength.apply("milk");
//
//
//        System.out.println(val);
//
//
//        Function<Integer,Integer>results=i->i+10;
//        Integer rs=results.apply(30);
//        System.out.println(rs);

}

