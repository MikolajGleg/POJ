public class Main {
    public static void main(String[] args) {

        int[] miles = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Miles" + "    " + "Kilometers");
        for(int i=0;i<miles.length;i++){
            if(i == 9){
                System.out.println(miles[i] + "       " + miles[i]*1.609);
            }else{
                System.out.println(miles[i] + "        " + miles[i]*1.609);
            }

        }

    }
}