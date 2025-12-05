package problem2;

import java.util.List;

public class problem2 {
    public List<Object> combineList(List<Integer> intList, List<String> stringList){
        try {
            if(intList.isEmpty() || stringList.isEmpty()){
                throw new Exception("One of the list is empty");
            }
            List<Object> combinedList = new java.util.ArrayList<>();
            //find minimum size of the lists
            int minSize = Math.min(intList.size(), stringList.size());
            for(int i = 0; i < minSize; i++){
                combinedList.add(stringList.get(i));
                combinedList.add(intList.get(i));
            }
            //add remaining elements from the longer list
            if(intList.size() > minSize){
                combinedList.addAll(intList.subList(minSize, intList.size()));
            } else if(stringList.size() > minSize){
                combinedList.addAll(stringList.subList(minSize, stringList.size()));
            }
            return combinedList;
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("a", "b", "c");
        problem2 p2 = new problem2();
        
        List<Object> combinedList = p2.combineList(intList, stringList);
        System.out.println("Combined List: " + combinedList);
        }
}
