public class App {
    public static void main(String[] args) throws Exception {
        int array[] = new int[1000];
        gauß_sum(array);
    }

    //Array wird befüllt
    public static void gauß_sum(int[] array){
        for (int i = 0; i < 1000; i++)
        {
            array[i] = i;
        }
        add_Array(array);
    }

    //Alle Elemente des Arrays werden aufaddiert
    public static void add_Array(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        print_sum(sum);
    }

    //Die Summe wird geprintet
    public static void print_sum(int sum)
    {
        System.out.println("Die Summe ist: " + sum);
    }
}

/*
 * Dies ist eine Sequentielle Bindung, da alle Methoden in diesem Modul
 * nacheinander abgearbeitet werden.
 */
