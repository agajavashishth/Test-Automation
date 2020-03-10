import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  
 * @version
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void testDuplicateAuthors()
    {
        SalesItem salesIte1 = new SalesItem("Test1", 1000);
        assertEquals(true, salesIte1.addComment("John", "SYSC", 4));
        assertEquals(false, salesIte1.addComment("John", "SYSC", 5));
    }

    @Test
    public void testRatingRange()
    {
        SalesItem salesIte1 = new SalesItem("Test2", 2000);
        assertEquals(false, salesIte1.addComment("test2", "example", 6));
        assertEquals(false, salesIte1.addComment("test2.1", "example2", 0));
    }

    @Test
    public void testThreeComments()
    {
        SalesItem salesIte1 = new SalesItem("TEST", 2000);
        assertEquals(true, salesIte1.addComment("one", "example", 1));
        assertEquals(true, salesIte1.addComment("two", "example", 2));
        assertEquals(true, salesIte1.addComment("three", "example", 3));
    }

    @Test
    public void testFindMostHelpfulComment()
    {
        SalesItem salesIte1 = new SalesItem("book1", 1000);
        assertEquals(true, salesIte1.addComment("John", "best", 5));
        assertEquals(false, salesIte1.addComment("Jack", "excellent", 6));
        assertEquals(true, salesIte1.addComment("Jill", "good", 4));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(2);
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertEquals(comment1, comment1);
        assertEquals("John", comment1.getAuthor());
        assertEquals(5, comment1.getRating());
        comment1.upvote();
        assertEquals(2, comment1.getVoteCount());
    }
}








