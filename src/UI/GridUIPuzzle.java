//package UI;
//import com.company.FileHelper;
//import com.company.Board;
//import com.company.PuzzleSolver;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.IOException;
//
///**
// * Created by Walid on 2016-06-01.
// */
//public class GridUIPuzzle extends JFrame implements Runnable {
//
//    private static final int FRAME_WIDTH = 600;
//    private static final int FRAME_HEIGHT = 500;
//    private PrincipalPanel pPanel;
//    private GridPanel gPanel;
//    private MenuPuzzle menuPuzzle;
//    private  OptionPanel oPanel;
//    private Board gPuzzle;
//    private PuzzleSolver pSolver;
//    private static final String gridFile = "test2.puzzle";
//
//    public GridUIPuzzle(String title) {
//        super(title);
//    }
//
//    public void init() throws IOException {
//        setSize(FRAME_WIDTH,FRAME_HEIGHT);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        gPuzzle = new Board(FileHelper.getPuzzleFromFile(gridFile));
//        pSolver = new PuzzleSolver(gPuzzle);
//        pPanel = new PrincipalPanel();
//        gPanel = new GridPanel(gPuzzle,pSolver);
//        oPanel = new OptionPanel(gPanel);
//        pPanel.add(gPanel, BorderLayout.CENTER);
//        pPanel.add(oPanel,BorderLayout.SOUTH);
//        setContentPane(pPanel);
//        menuPuzzle = new MenuPuzzle(gPanel);
//        setJMenuBar(menuPuzzle);
//        gPuzzle.addObserver(gPanel);
//        pSolver.addObserver(gPanel);
//        this.setVisible(true);
//
//    }
//
//    public void run() {
//        try {
//            init();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
