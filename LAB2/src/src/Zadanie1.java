public class Zadanie1 {
    int[] sumaTablic(int[] tab1, int[] tab2){
        int[] sumaTab = new int[tab1.length];
        if(tab1.length != tab2.length){
            return sumaTab;
        }else{
            for(int i=0;i<tab1.length;i++){
                sumaTab[i] = tab1[i] + tab2[i];
            }
            return sumaTab;
        }

    }
}
