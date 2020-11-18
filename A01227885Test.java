package ArquitecturaA01227885;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MyTest{

    private List <Integer> list;

    public void newList(){
        list = new ArrayList<>();
    }
    
    @Test
    public void getSizeOfList1() {
        newList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assert.assertEquals(4, list.size());
    }
    public void getSizeOfList2() {
        newList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(1);
        Assert.assertEquals(3, list.size());
    }

    public void getSizeOfList3() {
        newList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();
        Assert.assertEquals(0, list.size());
}
    public void clearList1() {
        newList();
        list.add(1);
        list.clear();
        Assert.assertEquals(0, list.size());
    }
    public void clearList2() {
        newList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();
        list.add(1);
        list.clear();
        Assert.assertEquals(0, list.size());
    }
    public void clearList3() {
        newList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();
        list.clear();
        Assert.assertEquals(0, list.size());
    }



    @Test
    public void clearList4(){
        newList();
        list.clear();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void addItem(){
        newList();
        this.list.add(2);
        Assert.assertEquals(2, (int) list.get(0));

    }

    @Test
    public void addItem2(){
        newList();
        int [] array = new int[10];
        array[0] = 1;
        this.list.add(array[0]);
        Assert.assertEquals(array[0],(int) list.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void addItem3() {
        List<Integer> list = null;
        list.add(0);
    }

    @Test
    public void checkIfItemExists1(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        Assert.assertTrue(list.contains(3));
    }

    @Test
    public void checkIfItemExists2(){
        newList();
        Assert.assertFalse(list.contains(3));
    }

    @Test
    public void checkIfItemExists3(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        Assert.assertFalse(list.contains(5));
    }

    @Test
    public void getElementByIndex1(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        Assert.assertEquals(4,(int) list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByIndex2(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        list.get(5);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByIndex3(){
        newList();
        list.get(2);
    }


    @Test
    public void searchIndexOfAnObject1(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        Assert.assertEquals(1,(int) list.indexOf(3));
    }

    @Test
    public void searchIndexOfAnObject2(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(3);
        Assert.assertEquals(1,(int) list.indexOf(3));
    }

    @Test
    public void searchIndexOfAnObject3(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(3);
        Assert.assertEquals(-1,(int) list.indexOf(7));
    }

    @Test
    public void removeItemByIndex1(){
        newList();
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        Assert.assertEquals(3,(int) list.get(1));
        this.list.remove(1);
        Assert.assertEquals(4,(int) list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeItemByIndex2(){
        newList();
        this.list.add(4);
        this.list.add(7);
        this.list.add(9);
        list.remove(15);

    }

    @Test(expected = NullPointerException.class)
    public void removeItemByIndex3(){
        List<Integer> list = null;
        list.remove(1);

    }


}
