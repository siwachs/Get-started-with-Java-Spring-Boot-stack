# Java Advance

ArrayList and List
Map and Hashmap
Optional
Streams (Parllel Process), Map, Filters, forEach
interface

1. Difference Between int[] (Array) and ArrayList<Integer> in Java
   Use int[] when performance and memory efficiency matter.
   Use ArrayList<Integer> when you need dynamic resizing and flexibility. 🚀
   Use List<E> when coding for flexibility (so you can switch between ArrayList, LinkedList, etc.).
   Use ArrayList<E> when you are sure that you need a resizable array-backed list.

2. Maps
   Use HashMap → When you just need fast access (O(1)) and ordering doesn’t matter.
   Use LinkedHashMap → When you need fast access and insertion order must be maintained.
   Use TreeMap → When you need sorting by key.

3. Optional
   Optional<T> is a container class introduced in Java 8 that is used to avoid null references and prevent NullPointerException. It is part of the java.util package.
   Avoids NullPointerException (NPE)
   Makes code more readable & explicit about missing values
   Encourages functional-style programming
   Reduces unnecessary null checks
