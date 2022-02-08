package Task9;

public class JoiningInOneArray {
//    public static void main(String[] args) {
        public static void joinInOneArray(int[] array1, int[] array2, int elementK) {
            int n = 0;
            int[] array3 = new int[array1.length + array2.length];
            for (int i = 0; i < array3.length; i++) {
                if (i >= elementK && n < array2.length) {
                    array3[i] = array2[i - elementK];
                    n++;
                } else {
                    array3[i] = array1[i - elementK];
                }
            }
        }
            
}



