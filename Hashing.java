public class Hashing {
    public static void main(String args[]) 
    {
        int key[] = new int[]{27, 53, 13, 10, 138, 109, 49, 174, 26, 24}; // key values
        int a[] = new int[13];      // hash table size
        int N = a.length;          // calculate size of hash table
        
        for (int i = 0; i < key.length; i++) 
        { // iterate each key value from key array
            int k = key[i]; // get the current key
            int ip = k % N;
            int q = k / N;
            int offset;
            if (q % N != 0) {
                offset = q % N;
            }
            else
            {
                offset = 19; // using 19 as the prime number 4k+3
            }
            
            while (a[ip] != 0)
            {     // checking whether collision occurs or not
                ip = (ip + offset) % N; 
            }
            a[ip] = k;    // store key value to hash table
        }
        
        // Print the hash table
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array[" + i + "] = " + a[i]);
        }
    }
}
