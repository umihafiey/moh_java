package Chapter5;

public class Array {
    public static void main(String[] args) {
        //$people = [] //php
        //bil data dlm array = 3; fixed
        String[] people = new String[3];
        people[0] = "Abu";
        people[1] = "Bakar";
        people[2] = "Camelia";
        //people[3] = "Daud"; <= akan error sbb array declare hanya 3
        
        System.out.println(people[2]);
        
        //int[] bil = new int => x boleh
        Integer [] bil = new Integer[5];
        int[] jum = {1,2,3,4};
        
        for (int i=0; i<jum.length; i++) {
            System.out.println(jum[1]);
        }
        
        int j = 0;
        while (j < jum.length) {
            //System.out.println(jum[j]);
            System.out.printf("Val = %s ", jum[j]);
            j++;
        }
        
        
    }
}
