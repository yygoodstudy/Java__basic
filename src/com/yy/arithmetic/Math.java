package com.yy.arithmetic;

/**
 * @date 2023/3/12
 */
public class Math {

    public static void main(String[] args) {
        Integer maxVi = getMaxVi();
        System.out.println("maxVi = " + maxVi);
    }

    /**
     * ni：每种水果的最大采摘数量
     * wi：每种水果的重量
     * vi：每种水果的维生素含量
     * 要求：在采摘水果的总重量不超过1000的情况下，猴子最多可以获得多少维生素？
     */
    public static Integer getMaxVi() {
        // 采摘重量不能超过5
        int w = 5;
        int max_vi = 0;
        int number_01 = 0, number_02 = 0, number_03 = 0;
        for (int i = 0; i <= 2; i++) { // 第3种水果
            for (int j = 0; j <= 4; j++) { // 第1种水果
                for (int z = 0; z <= 1; z++) { // 第2种水果
                    int weight = i * 4 + j * 1 + z * 2;
                    int vi = i * 5 + j * 2 + z * 4;
                    if (weight <= w && vi > max_vi) {
                        max_vi = vi;
                        number_01 = i;
                        number_02 = j;
                        number_03 = z;
                    }
                }
            }
        }
        System.out.println("猴子可按以下方式采摘，获得最多的维生素：");
        System.out.println("1）采摘第一种水果" + number_02 + "个，" + number_02 + "个水果的重量为" + number_02 + "," + number_02 + "个水果维生素含量为" + number_02 * 2);
        System.out.println("2）采摘第二种水果" + number_03 + "个，" + number_03 + "个水果的重量为" + number_03 * 2 + "," + number_03 + "个水果维生素含量为" + number_03 * 4);
        System.out.println("3）采摘第三种水果" + number_01 + "个，" + number_01 + "个水果的重量为" + number_01 * 4 + "," + number_01 + "个水果维生素含量为" + number_01 * 5);
        System.out.println("水果的总的维生素含量最多为" + (number_02 * 2 + number_03 * 4 + number_01 * 5));
        return max_vi;
    }

}
