public class Main { //do zadania 1
    public static void main(String[] args) {
        int[] tab1={1,2,3,5};
        int[] tab2={4,5,6};
        int[] sumaTab;

        Zadanie1 zadanie1 = new Zadanie1();
        sumaTab = zadanie1.sumaTablic(tab1,tab2);

        //drukuj tablice z sumami
        for(int i=0;i<tab1.length;i++){
            System.out.println(sumaTab[i]);
        }

    }
}
