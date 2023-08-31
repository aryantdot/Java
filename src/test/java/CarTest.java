import static java.lang.System.out;

public class CarTest {

    boolean isOpen;

    class Car {

        void roshan(){
            print("Car is on");
            isOpen = false;
        }
        void off(){
            print("Car is off");
        }
        void doorOpen(){
            print("Car is open");
        }
        void harkat(){

        }
        private void print(String kossher) {
            out.println(kossher);
        }
    }
}
