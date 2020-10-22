import java.util.Scanner;

public class CookieConverter {
    public static int cookiesNumber = 0;
    public static String [] allCookies = new String [20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Paste your cookie below");
        String cookie = scanner.nextLine();
        convert(cookie);
        System.out.println("Here are your converted cookies:");
        Do.space(1);
        formatCookie();
    }


    public static void formatCookie() {
        for(int i = 0; i < cookiesNumber+1; i++){
            if(i != cookiesNumber-1) {
                try {
                    String name = allCookies[i].substring(0, allCookies[i].indexOf('='));
                    String value = allCookies[i].substring(allCookies[i].lastIndexOf('=') + 1, allCookies[i].length() - 1);

                    //printing the cookies
                    System.out.println("Cookie ck"+ i + " = new Cookie(\"" + name + "\", \"" + value + "\");");
                    System.out.println("driver.manage().addCookie(ck"+i+");");
                    Do.space(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void convert(String cookie){
        int firstIndex = 0;
        int length = cookie.length()-1;
        for(int i = 0; i < length; i++){

            if(cookie.charAt(i)+cookie.charAt(i+1) == ';'+' '){
                allCookies[cookiesNumber] = cookie.substring(firstIndex,  i+1);
                firstIndex = i+2;
                cookiesNumber++;
            }
        }
        cookiesNumber++;
        allCookies[cookiesNumber] = cookie.substring(1+ cookie.lastIndexOf(' '));

    }
}