package com.demo.main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine().trim();
        String str = "12315462";

        char[] chars = new char[27];// [0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        chars[0] = '0';
        chars[1] = 'A';
        for (int i = 2; i < 27; i++) {
            chars[i] = (char) (chars[1] + i - 1);
        }

        char[] ch = str.toCharArray();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < ch.length - 1; i+=2) {
            //(i,j)
            int temp = Integer.parseInt(ch[i] + "" + ch[i + 1]);
            if (temp<=26){
                sb2.append(chars[temp]);
            }
            sb2.append(chars[temp/10]);
            sb2.append(chars[temp%10]);
        }
        System.out.println(sb2.toString());


        /*StringBuffer sb1 = new StringBuffer();
        for (int i=0;i<ch.length;i++){
            sb1.append(chars[Integer.parseInt(ch[i]+"")]);
        }
        String result = sb1.toString();
        System.out.println(result);*/

    }
}
