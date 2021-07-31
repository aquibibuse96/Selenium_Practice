public class java_Basics1 {

    public static void main(String [] args){

        //System.out.println("Hello");
        int a = 2;
        int b = 3;
        int sum = a+b;
        System.out.println("SUM is " + sum);

        java_Basics2 parent = new java_Basics2();
        parent.validateHeader();
        System.out.println("Addittion : " + parent.add(a,b));
    }

}
