package JAVA_Practice;

public class String_StrintBuffer_StringBuilder {
    // public static void main(String[] args) {
        
    // }


    /*                       |     String         |        StringBuffer    |        StringBuilder
    ------------------------------------------------------------------------------------------------------  
                             |                    |                        |                     
     *      Storage          |  Heap area, SCP    |       Heap area        |       Heap area
     *                       |                    |                        |                  
     *     objects           |    immutable       |        mutable         |        mutable
     *                       |                    |                        |  
     *     memory            |if we change the    |consumes less memory    | consumes less memory
     *                       |value of string a lot|                       |
     *                       |of time, it will allocate|                   |  
     *                       |more memory         |  
     *                       |                    |                        |
     *    ThreadSafe         |not thread safe     | all methods are synch- |non-synchronised methods and thread safe
     *                       |                    |ronised & thus it is    |
     *                       |                    |thread safe             |
     *                       |                    |                        |
     *  performance          |    slow            |fast as compare to sring|fast as compare to StringBuffer
     *                       |                    |                        | 
     *   use                 |if data is not      |if data is changing     |if data is changing frequently
     *                       |changing frequently | frquently              |
     */
}
