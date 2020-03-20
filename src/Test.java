import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Scanner;
public   class Test {
    public static void main(String[] args) {
//        int a = 0x10;
//        System.out.printf("%x\c
//          Scanner scanner = new Scanner(System.in);
//          System.out.println("请输入您要判断的年份：");
//          int year = scanner.nextInt();
//          System.out.println(IsLeapYear(year));
//    }
//    public static boolean IsLeapYear(int year) {
//        if (year % 100 == 0) {
//            if (year % 400 == 0) {
//                System.out.println("是世纪闰年");
//            } else {
//                System.out.println("不是闰年");
//                return false;
//            }
//        } else {
//            if (year % 100 == 0) {                      //简单的判断闰年
//                System.out.println("是普通闰年");
//            } else {
//                System.out.println("不是闰年");
//                return false;
//            }
//        }
//        return true;
        Scanner scanner = new Scanner(System.in);
        double sum =0;
        int num =0;
        while (scanner.hasNextDouble()){
            double temp = scanner.nextDouble();
            sum+=temp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        scanner.close();
   }
}
//    private  static  String userName = "admin";
//    private  static String password = "123456";
//    public static void main(String[] args) {
//        try {
//            login("admin","123456");
//        } catch (UserError userError) {
//            userError.printStackTrace();
//        } catch (PasswordError passwordError){
//            passwordError.printStackTrace();
//        }
//    }
//    public static void login(String userName , String password) throws  UserError,PasswordError{
//        if(!Test.password.equals(userName)){
//            //TODO处理用户名错误
//            throw new UserError("用户名错误")
//        }
//        if(!Test.password.equals(password)){
//            //TODO处理密码错误
//            throw new PasswordError("密码错误");
//        }
//        System.out.println("登录成功！");
//    }
//}
//
////        String set1 =
////                "     1  3  5  7\n" +
////                        "9 11 13 15\n" +
////                        "17 19 21 23\n" +
////                        "25 27 29 31n";
////        String set2 =
////                "2 3 6 7\n" +
////                        "10 11 14 15\n" +
////                        "18 19 22 23\n " +
////                        "26 27 30 32 ";
////        String set3 =
////                "4 5 6 7\n" +
////                        "12 13 14 15\n" +
////                        "20 21 22  23\n" +
////                        "28 29 30 31";
////        String set4 =
////                "8 9 10 11\n" +
////                        "12 13 14 15\n" +
////                        "24  25 26 27\n" +
////                        "28 29 30 31";
////        String set5 =
////                "16 17 18 19\n" +
////                        "20 21 22 23\n" +
////                        "24 25 26 27\n" +
////                        " 28 29 30 31";
////
////        int day = 0;
////        int answer = JOptionPane.showConfirmDialog(null,
////                "Is your birthday in these numbers?\n" + set1);
////        if(answer == JOptionPane.YES_OPTION){
////            day+=1;
////        }
////         answer = JOptionPane.showConfirmDialog(null,
//                "Is your birthday in these numbers?\n" + set2);
//        if(answer == JOptionPane.YES_OPTION){
//            day+=2;
//        }
//         answer = JOptionPane.showConfirmDialog(null,
//                "Is your birthday in these numbers?\n" + set3);
//        if(answer == JOptionPane.YES_OPTION){
//            day+=4;
//        }
//         answer = JOptionPane.showConfirmDialog(null,
//                "Is your birthday in these numbers?\n" + set4);
//        if(answer == JOptionPane.YES_OPTION){
//            day+=8;
//        }
//         answer = JOptionPane.showConfirmDialog(null,
//                "Is your birthday in these numbers?\n" + set5);
//        if(answer == JOptionPane.YES_OPTION){
//            day+=16;
//            JOptionPane.showMessageDialog(null,     //猜生日
//                    "Your birthday is" + day + "!");
//        }
//        int number =(int)(Math.random() * 101);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a magic number between 0 and 100");
//        int guess = -1;
//        while (guess!=number){
//            System.out.println("\n Enter your guess :");
//            guess = scanner.nextInt();
//            if(guess == number){
//                System.out.println("Yes, the number is " + number);  //猜数字游戏
//            }else if(guess<number){
//                System.out.println("Your guess too low");
//            }else{
//                System.out.println("Your guess too high");
//            }
//        }
//        final int NUMBER_OF_QUESTIONS = 5;
//        int correctCount = 0;
//        int count = 0;
//        long startTime = System.currentTimeMillis();
//        String output = "";
//        Scanner scanner = new Scanner(System.in);
//        while (count < NUMBER_OF_QUESTIONS) {
//            int number1 = (int) (Math.random() * 101);
//            int number2 = (int) (Math.random() * 101);
//            if (number1 < number2) {
//                int temp = number1;
//                number1 = number2;
//                number2 = temp;
//            }
//            System.out.println("What is " + number1 + " - " + number2 + "?");
//            int answer = scanner.nextInt();
//            if (number1 - number2 == answer) {
//                System.out.println("Your answer is correct!");
//                correctCount++;
//            } else {
//                System.out.println("Your answer is wrong.\n" +
//                        number1 + " - " + number2 + " should be " + (number1 - number2));
//                count++;
//                output += "\n" + number1 + " - " + number2 + "=" +
//                        answer + ((number1 - number2 == answer) ? " correct " : "wrong ");
//            }
//            long endTime = System.currentTimeMillis();
//            long testTime = endTime - startTime;
//            System.out.println("Correct count is " + correctCount + "\nTest time is"
//                    + testTime / 1000 + " seconds\n " + output);
//        }
//          int arr[] ={1,2,3,4,5};
//         try {
//            System.out.println("before");
//            System.out.println("arr[100]"); //异常处理
//            System.out.println("after");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        int arr [] ={1,2,3};
//        try(Scanner scanner = new Scanner(System.in);) {
//            int num = scanner.nextInt();
//            System.out.println(" num = " + num);
//        } catch (Exception e) {           //回收资源
//            e.printStackTrace();
//        }
//        System.out.println(divde(10,0));
//    public static int divde(int x, int y){
//        if(y==0){
//            throw  new ArithmeticException("抛出除0异常");
//        }
//        return  x/y;


