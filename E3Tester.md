/**
 * On Mac/Linux:
 * javac -cp .:junit-cs211.jar *.java         # compile everything
 * java -cp .:junit-cs211.jar E3Tester        # run tester
 * <p>
 * On windows replace colons with semicolons: (: with ;)
 * javac -cp .;junit-cs211.jar *.java         # compile everything
 * java -cp .;junit-cs211.jar E3Tester        # run tester
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class E3Tester {
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("E3Tester");
    }

    /**
     This is a helper method, not an actual test

     Notice that:
     - the @Test annotation is missing
     - the visibility is private
     */
    private boolean someHelp(String someParameter) {
        return true;
    }

    /**
     This is an empty test; it's always a pass
     Not a useful test!
     */
    @Test
    public void test_Point_01() {

        //Point p1 = new Point(123,345,345);
    }

    /**
     This test always fails
     Not a useful test either!
     */
    @Test
    public void test_Point_02() {
        fail();
    }




    // add your own tests here

    /**
     * check Point.constructor
     */
    @Test
    public void test_Point_03()
    {

        Point p3 = new Point(333,444,555); // should pass
    }

    /**
     * check Point.toString
     */
    @Test
    public void test_Point_04()
    {

        Point p4 = new Point(123,-123,321); // should failed
    }

    /**
     * check Point.equals
     */
    @Test
    public void test_Point_05()
    {
        Point p5 = new Point(23,55,33); // test should pass
    }

    /**
     * check Point.distance
     */
    @Test
    public void test_Point_06()
    {
        Point p5 = new Point(-23,55,33); // test should fail
    }

    // more tests needed...



    @Test
    public void test_Point_equals()
    {
        Point a = new Point(123,123,123);
        Point b = new Point(123,23,123);


        b.equals(a); // points should not be equal


    }


}
