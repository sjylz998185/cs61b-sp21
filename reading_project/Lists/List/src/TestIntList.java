import org.junit.Test;
import org.junit.Assert;

public class TestIntList {
    @Test
    public void testIntListGet(){
        IntList x = new IntList(1,null);
        x.rest = new IntList(2,null);
        System.out.println(x.rest);
        x.rest.rest = new IntList(3,null);
        x.rest.rest.rest = new IntList(4,null);
        IntList result = x.rest.rest;
        IntList getIntList = x.get(2);
        org.junit.Assert.assertEquals(result,getIntList);
    }

}
