public class AdditionDemo {

        public void addNos(){
            // Intear Addition
            int no1 = 10;
            int no2 = 20;

            // float Addition
            float a = 12.2f;
            float b = 10.3f;

            //double Addition
            double x = 9865554;
            double y = 6765544;

            System.out.println("intsum" + (no1+no2));
            System.out.println("floatsum" + (a+b));
            System.out.printf("doublesum" + (x+y));
        }
        public static void main(String[] args){
            AdditionDemo demo = new AdditionDemo();
            demo.addNos();
        }
    }
