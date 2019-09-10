package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam20
 * @Description TODO
 * @Author Yunlong
 * @Date 2019/9/9 20:22
 * @Version 1.0
 */
public class Exam20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int result = fun(N);
        System.out.println(result);
    }

    private static int fun(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        List<Integer> num = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            num.add(i);
        }
        int tail = n - 1;

        int rank = 0;

        while (!num.isEmpty()) {
            int temp = num.size() % 5;

            if (temp == 0) {
                if (num.get(num.size() - 1) == tail) {

                    if (num.size() / 5 != 1) {
                        rank += num.size() / 5;
                        break;
                    } else {
                        rank++;
                        break;
                    }
                }
                num.remove(num.size());

            } else {
                if (num.get(temp - 1) == tail) {
                    rank++;
                    break;
                }
                num.remove(temp - 1);
            }
            rank++;
        }

        return rank;
    }
}
