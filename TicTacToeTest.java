//package chapterEight;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//public class TicTacToeTest {
//    TicTacToe ticTacToe;
//    Board board;
//    @BeforeEach
//    public void setUp(){
//        ticTacToe = new TicTacToe();
//        board = ticTacToe.getBoard();
//    }
//
//    @Test
//    public void ticTacToeHasABoardTest(){
//
//        assertNotNull(board);
//    }
//    @Test
//    public void ticTacToeBoardIsEmptyByDefault(){
//        assertSame(Position.EMPTY, ticTacToe.getBoard().getPosition());
//
//    }
//
//    @Test
//    public void ticTacToeHasPosition(){
//
//        assertSame(Position.X, ticTacToe.getBoard().getPosition());
//    }
//}
