import java.util.List;

public class Test1 {

    int getMinimum(List<Integer> ints) {
        return ints.stream().mapToInt(Integer::intValue).min().getAsInt();
    }

}
