<<<<<<< HEAD
package com.tuobo.sort;

import org.testng.annotations.Test;

public class SoftTest {

    @Test
    public void testBubble() {
        int[] arr = {1, 30, 42, 3, 65, 78, 54, 43};
        System.out.println("The length of array: " + arr.length);
        System.out.print("Before Soft: ");
        Bubble.display(arr);
        Bubble.sort(arr);
        System.out.print("After Soft: ");
        Bubble.display(arr);
    }

}
=======
package com.tuobo.sort;

import org.testng.annotations.Test;

public class SoftTest {

    @Test
    public void testBubble() {
        int[] arr = {1, 30, 42, 3, 65, 78, 54, 43};
        System.out.println("The length of array: " + arr.length);
        System.out.print("Before Soft: ");
        Bubble.display(arr);
        Bubble.sort(arr);
        System.out.print("After Soft: ");
        Bubble.display(arr);
    }

}
>>>>>>> b5efd6bd2b550ff28a0c5ba0030df568fb12fefd
