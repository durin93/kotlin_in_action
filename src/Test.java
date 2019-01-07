import strings.ChangeName;

public class Test {


//    public void test(){
//        System.out.println("테스ㅡ트");
//    }
    public static void test(String... strings){
        for(String str: strings){
            System.out.println(str);
        }
    }

    public static String[] split(){
        return "12.345-6.A".split(".");
    }
}
