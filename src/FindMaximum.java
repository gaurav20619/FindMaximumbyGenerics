public class FindMaximum <T extends Comparable<T>>{ //generic class 
    T x;
    T y;
    T z;

    FindMaximum(T x, T y, T z) {//parameterized constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMaximum () {// testMaximum method 

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }
public static void main(String[] args) {
    FindMaximum<Integer> compareInteger = new FindMaximum<Integer>(15, 32, 45);
        System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
        FindMaximum<Float> comapareFloat = new FindMaximum<Float>(15.1F, 32.2F, 45.3F);
        System.out.println("Maximum number out of three float is: " + comapareFloat.testMaximum());
        FindMaximum<String> compareString = new FindMaximum<String>("Apple", "Banana", "Peach");
        System.out.println("Maximum among three string is: " + compareString.testMaximum());
    }
}
