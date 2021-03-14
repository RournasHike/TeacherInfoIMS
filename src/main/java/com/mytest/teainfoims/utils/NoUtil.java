package com.mytest.teainfoims.utils;

import java.util.Random;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/28
 */
public class NoUtil {


    private String[] ranNum=new String[]{"0","1","2","3","4","5","6","7","8","9"};

    /**
     * 生成教师职工编号
     * @param collegeId 学院id
     * @param deptId 系部id
     * @return
     */
    public static String randomNo(String collegeId,String deptId,Boolean isForeign){
        StringBuilder stringBuilder=new StringBuilder(collegeId+deptId);
        Random random = new Random();
        //随机生成流水号
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(10);
            stringBuilder.append(index);
        }
        if(isForeign){
            return "L"+stringBuilder.toString();
        }else{
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(randomNo("01","02",false));
        System.out.println(randomNo("01","02",true));
    }
}
