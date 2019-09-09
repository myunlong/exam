package com.demo.exam;

import java.util.*;

/**
 * @ClassName Exam17
 * @Description 【字节跳动】
 * @Author Yunlong
 * @Date 2019/9/8 20:02
 * @Version 1.0
 */
public class Exam17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }
        Map<String, Integer> times = new LinkedHashMap<>();
        for (int i = 1; i < N; i++) {
            int flag = existNum(Arrays.copyOfRange(num, 0, i), num[i]);
            if (flag != -1) {
                if (times.containsKey(flag + "")) {
                    times.replace(flag + "", times.get(flag + ""), times.get(flag + "") + 1);
                } else {
                    times.put(flag + "", 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(times.entrySet());
        Collections.sort(list, (o1, o2) -> (o1.getValue() - o2.getValue()));
        System.out.println(list.get(list.size() - 1).getKey());
    }

    private static int existNum(int[] arr, int key) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= key) {
                return arr[i];
            }
        }
        return -1;
    }
}
