

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  Vashishth
 * @version 4th March 2020
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
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

    @Test
    public void testCommentCreation()
    {
        Comment comment1 = new Comment("John", "example", 4);
        comment1.getFullDetails();
    }

    @Test
    public void testUpvote()
    {
        Comment comment1 = new Comment("John", "example", 3);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(3, comment1.getVoteCount());
    }

    @Test
    public void testDownvote()
    {
        Comment comment1 = new Comment("John", "example", 4);
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-4, comment1.getVoteCount());
    }
}



