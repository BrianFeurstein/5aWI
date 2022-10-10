import java.util.ArrayList;
import java.util.List;

public class sortNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);

        sortList(list);

    }


    public static List sortList(List<Integer> list) {
        int i = 1;
        int n = 0;


        while (i < list.size()) {
            n = 0;
            for (int j = i; j > 0; j--) {
                if (list.get(i) < list.get(j - 1)) {
                    n++;
                } else break;
            }
            if (n == 0) {
            } else {
                int unsortedValue = list.get(i);
                list.remove(i);
                list.add(i - n, unsortedValue);
            }
            i++;
            System.out.println(list);
        }

        return list;


    }
    public static int[] revert(int[] data){
        for(int i = 0; i <data.length;i++ ){
            System.out.println(data);
        }
    return data;
    }


}

