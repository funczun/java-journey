package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int input = sc.nextInt();
        HttpStatus status = HttpStatus.findByCode(input);
        if (status == null) {
            System.out.println("Unknown HTTP code: " + input);
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isOK = " + status.isOK());
        }
    }
}
