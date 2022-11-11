package com.ironhack.interfaces_and_abstract_classes;


import java.math.BigDecimal;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numList = {4,1,3,2,5};
        int sum = 52;
        balancer(numList,sum);
        System.out.println(Arrays.toString(numList));
    }
    public static int[] balancer(int[] numList, int sum) {
        boolean sumIsNotHigher = true;
        while (sumIsNotHigher) {
            //calculo suma
            int tempSum = 0;
            for (int i = 0; i < numList.length; i++) {
                tempSum = tempSum + numList[i];
            }

            //compruebo si la suma es menor
            if (tempSum < sum) {
                //sum is lower
                //find smallest and add 1
                int smallest = numList[0];
                for (int i = 0; i < numList.length; i++) {
                    if (numList[i] < smallest  ) {
                        smallest = numList[i];
                        numList[i] = numList[i] + 1;
                    }else if (i == numList.length-1){
                        numList[0]=smallest +1;
                    }
                }
            }else{
                sumIsNotHigher = false;
                return numList;
            }

        }
        return numList;
    }

    public static class Employee {
        String name;
        BigDecimal salary;
        Employee supervisor;

        public Employee (String name, BigDecimal salary, Employee supervisor){
            this.name = name;
            this.salary = salary;
            this.supervisor = supervisor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public Employee getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(Employee supervisor) {
            this.supervisor = supervisor;
        }
    }
}