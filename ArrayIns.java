
/**
 * Muhammad Amar Waqas
 * Student ID: 1022832
 */
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
{
    int count = 0;
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayIns(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------

    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems-count; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void insertionSort()
    {
        int in, out;

        for(out=1; out<nElems; out++)     // out is dividing line
        {
            long temp = a[out];            // remove marked item
            in = out;                      // start shifts at out
            while(in>0 && a[in-1] >= temp) // until one is smaller,
            {
                a[in] = a[in-1];            // shift item to right
                --in;                       // go left one position
            }
            a[in] = temp;                  // insert marked item
        }  // end for
    }  // end insertionSort()

    public long median()
    {
        int in, out;

        for(out=1; out<nElems; out++)     // out is dividing line
        {
            long temp = a[out];            // remove marked item
            in = out;                      // start shifts at out
            while(in>0 && a[in-1] >= temp) // until one is smaller,
            {
                a[in] = a[in-1];            // shift item to right
                --in;                       // go left one position
            }
            a[in] = temp;                  // insert marked item
        } 

        int j = nElems;
        int y = j/2;
        int x = j%2;
        if(x == 1)
            return a[y];
        else
        {
            long z = (a[y] + a[y-1]);
            long g = z/2;
            return g;
        }
    }

    public void noDups()
    {
        int dups = 0; 
        int start = 0;
        int end = 0;
        for(int d=nElems; d>=1; d--)
        {
            if(a[d]==a[d-1])
                count++;
        }
        for(int i = 0; i < nElems; i++)
        {
            for(int j = 1; j < nElems; j++)
            {
                if(a[i] == a[j])
                {
                    start = j;
                    for (int k = j; k < nElems; k++)
                    {
                        //dups++;
                        if (a[i] != a[k])
                        {
                            end = k - 1;
                            break;
                        }
                    }
                }
                if( a[i] == a[j])
                {
                    dups++;
                    break;
                }
            }
            if( dups > 0)
            {
                for( int s =nElems; s > 0; s--)
                {
                    a[start] = a[end];
                    start++;
                    end++;

                }
            }
        }
    }
}

//--------------------------------------------------------------
// end class ArrayIns
////////////////////////////////////////////////////////////////
