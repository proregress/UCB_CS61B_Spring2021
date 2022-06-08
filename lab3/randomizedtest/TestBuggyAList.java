package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove(){
        AListNoResizing<Integer> listNoResizing = new AListNoResizing<>();
        listNoResizing.addLast(4);
        listNoResizing.addLast(5);
        listNoResizing.addLast(6);

        BuggyAList<Integer> buggyAList = new BuggyAList<>();
        buggyAList.addLast(4);
        buggyAList.addLast(5);
        buggyAList.addLast(6);

        assertTrue(listNoResizing.size() == buggyAList.size());

        /**
         * 此处有疑问：为什么assertEquals和assertTrue直接比较两个数组对象均不正确？ps：removeLast()有返回值
         */
//        listNoResizing.removeLast();
//        buggyAList.removeLast();
//        assertEquals(buggyAList,listNoResizing);
        assertEquals(buggyAList.removeLast(),listNoResizing.removeLast());

//        listNoResizing.removeLast();
//        buggyAList.removeLast();
//        assertEquals(buggyAList,listNoResizing);
        assertEquals(buggyAList.removeLast(),listNoResizing.removeLast());

//        listNoResizing.removeLast();
//        buggyAList.removeLast();
//        assertEquals(buggyAList,listNoResizing);
        assertEquals(buggyAList.removeLast(),listNoResizing.removeLast());

    }

    /**
     * StdRandom.uniform(0, 2)生成随机数，随机操作
     */
    @Test
    public void randomizedTest(){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> bug = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");

                // buggy addLast
                bug.addLast(randVal);
                System.out.println("buggyAddLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);

                // buggy size
                int buggySize = bug.size();
                System.out.println("buggySize: " + buggySize);

                //compare
                assertTrue(size == buggySize);
            } else if (operationNumber == 2) {
                if(L.size() == 0){
                    continue;
                }
                //getLast
                int last = L.getLast();
                System.out.println("getLast: " + last);

                // buggyGetLast
                int buggyGetLast = bug.getLast();
                System.out.println("buggyGetLast: " + buggyGetLast);

                //compare
                assertEquals(last,buggyGetLast);
            } else if (operationNumber == 3) {
                if(L.size() == 0){
                    continue;
                }
                //removeLast
                int last = L.removeLast();
                System.out.println("removeLast: " + last);

                // buggyRemoveLast
                int buggyRemoveLast = bug.removeLast();
                System.out.println("buggyRemoveLast: " + buggyRemoveLast);

                //compare
                assertEquals(last,buggyRemoveLast);
            }
        }
    }

}
