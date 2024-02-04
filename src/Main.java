import java.util.Arrays;


public class Main {

    public static void main(String[] args)       {

        String [] arr ={"stationer","table","стул","полы"};

        StringArrayManipulator manipulator = new StringArrayManipulator(arr);
        manipulator.printArray();
        manipulator.addString("333333555");
        manipulator.reverseString();
        manipulator.printArray();
    }
}

