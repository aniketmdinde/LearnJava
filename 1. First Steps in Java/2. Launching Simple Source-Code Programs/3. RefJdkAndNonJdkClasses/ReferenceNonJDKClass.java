import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {
    public static void main(String[] args) {
      IO.println(RandomUtils.nextInt());
   }
}

/*
    To launch install from https://commons.apache.org/proper/commons-lang/
    java -cp /path/to/commons-lang3-3.12.0.jar ReferenceNonJDKClass.java
*/