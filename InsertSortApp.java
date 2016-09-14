
/**
 * Muhammad Amar Waqas
 * Student ID: 1022832
 */
class InsertSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(22);
        arr.insert(22);

        arr.display();                // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();                // display them again

        System.out.println("The median value is " + arr.median());
        System.out.println("All duplicate numbers will now be deleted");
        arr.noDups();
        arr.display();

        System.out.println("The new median is " + arr.median());

    }  // end main()
}  // end class InsertSortApp
