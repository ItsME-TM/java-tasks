package problem1;

import java.util.List;

public class problem1 {
    public Integer sumForLoop(List<Integer> list){
        try {
            if(list.isEmpty()){
                throw new Exception("List is empty");
            }
            Integer sum = 0;
            for (Integer i : list){
                sum = sum + i;
            }
            return sum;
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
            return null;
        }
    };

    public Integer sumWhileLoop(List<Integer> list ){
        try {
            if (list.isEmpty()){
                throw new Exception("List is empty");
            }
            Integer sum = 0;
            int index = list.size();
            while(index > 0){
                sum = sum + list.get(index - 1);
                index--;
            }
            return sum;
        } catch (Exception e) {
            System.err.println("Exception occured: " + e.getMessage());
            return null;
        }
    };

    public Integer sumRecursion (List<Integer> list){
        try {
            if(list.isEmpty()){
                throw new Exception("List is empty");
            }
            Integer sum = 0;
            if (list.size() == 1){
                return list.get(0);
            }
            sum = list.get(0) + sumRecursion(list.subList(1, list.size()));
            return sum;
        } catch (Exception e) {
            System.err.println("Exception occured: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //list
        List <Integer> list = List.of(1, 2, 3, 4, 5);
        problem1 p1 = new problem1();

        //result from for loop
        Integer result = p1.sumForLoop(list);
        System.out.println("Sum from for loop: " + result);

        //result from while loop
        Integer result2 = p1.sumWhileLoop(list);
        System.out.println("Sum from while loop: " + result2);

        //result from recursion
        Integer result3 = p1.sumRecursion(list);
        System.out.println("Sum from recursion: " + result3);
    }
}
