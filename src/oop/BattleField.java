package oop;

import oop.enums.Direction;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BattleField extends JPanel{

//    final int BF_WIDTH = 576;
//    final int BF_HEIGHT = 576;
//
//    final int QUADRANT_SIZE = 64;
//
//    final int UP = 1;
//    final int DOWN = 2;
//    final int LEFT = 3;
//    final int RIGHT = 4;
//
//    final int TOP_Y = BF_HEIGHT - QUADRANT_SIZE;
//    final int TOP_X = BF_WIDTH - QUADRANT_SIZE;
//
//    String[][] objects = {
//                        {"B", "B", "B", "G", "G", "W", "G", "W", "B"},
//                        {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
//                        {"B", "B", "B", "G", "G", "G", "G", "G", "B"},
//                        {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
//                        {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
//                        {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
//                        {"B", "G", "G", "G", "G", "W", "G", "W", "B"},
//                        {"G", "B", "B", "G", "G", "W", "G", "W", "B"},
//                        {"B", "B", "B", "G", "G", "W", "G", "W", "B"},
//                        };
//
//    Direction direction = Direction.LEFT;
//
//    int bulletX = -100;
//    int bulletY = -100;
//
//    int tankX = 256;
//    int tankY = 256;
//
//
//
//    void move(Direction direction) throws Exception {
//        this.direction = direction;
//
//        if (dontCanMove()) {
//            System.out.println("Can't move!!!");
//            fire();
//            return;
//        }
//
//        for (int i = 0; i < QUADRANT_SIZE; i++) {
//            if (direction == 1) {
//                tankY--;
//            } else if (direction == 2) {
//                tankY++;
//            } else if (direction == 3) {
//                tankX--;
//            } else if (direction == 4) {
//                tankX++;
//            }
//
//            Thread.sleep(33);
//            repaint();
//        }
//    }
//
//    void moveToQuadrant(int y, int x){
//
//    }
//
//    void moveRandom() throws Exception{
//        Random random = new Random();
//        int direction = random.nextInt(4) + 1;
//        move(direction);
//    }
//
//    boolean dontCanMove(){
//        return (direction == UP && tankY == 0) || (direction == DOWN && tankY == TOP_Y)
//                || (direction == LEFT && tankX == 0) || (direction == RIGHT && tankX == TOP_X)
//                || nextObject(direction).equals("B");
//    }
//
//    String nextObject(int direction){
//
//        int x = tankX;
//        int y = tankY;
//
//        switch(direction){
//            case UP:
//                y -= 64;
//                break;
//            case DOWN:
//                y += 64;
//                break;
//            case LEFT:
//                x -= 64;
//                break;
//            case RIGHT:
//                x += 64;
//                break;
//        }
//        return objects[y/ QUADRANT_SIZE][x/ QUADRANT_SIZE];
//    }
//
//    boolean processInterception(){
//        int y = bulletY/64;
//        int x = bulletX/64;
//
//        if(objects[y][x].equals("B") && y >= 0 && y <= 8 && x >= 0 && x <= 8){
//            objects[y][x] = "G";
//            return true;
//        }
//        return false;
//    }
//
//    void fire() throws Exception{
//        bulletX = tankX + 25;
//        bulletY = tankY + 25;
//
//        while((bulletX > 0) && (bulletX < BF_WIDTH) && (bulletY > 0) && (bulletY < BF_HEIGHT)){
//            switch (direction){
//                case 1:
//                    bulletY--;
//                    break;
//                case 2:
//                    bulletY++;
//                    break;
//                case 3:
//                    bulletX--;
//                    break;
//                case 4:
//                    bulletX++;
//                    break;
//
//            }
//
//            if(processInterception()){
//                destroyBullet();
//            }
//
//            Thread.sleep(10);
//            repaint();
//        }
//
//        destroyBullet();
//    }
//
//    void destroyBullet(){
//        bulletX = -100;
//        bulletY = -100;
//        repaint();
//    }
//
//    void runTheGame() throws Exception{
////        while(tankY != BF_HEIGHT - 64){
////            move(2);
////        }
////        while(tankX != 0){
////            move(LEFT);
////        }
//        while(true) {
////            move(LEFT);
//            moveRandom();
//            //            fire();
//        }
//    }
//
//
//    public static void main(String[] args) throws Exception {
//	// write your code here
////        System.out.println("Hello World !!!");
//        BattleField battleField = new BattleField();
//        battleField.runTheGame();
//    }
//
//    BattleField(){
//        JFrame frame = new JFrame("Dendy Tanks");
//        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 38));
//        frame.getContentPane().add(this);
//        frame.setLocation(0, 0);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
////        g.setColor(Color.RED);
//
//
//        for(int y = 0;  y < 9; y++) {
//            for (int x = 0; x < 9; x++) {
//                switch (objects[y][x]) {
//                    case "B":
//                        g.setColor(new Color(246, 20, 79));
//                        break;
//                    case "W":
//                        g.setColor(new Color(90, 156, 246));
//                        break;
//                    case "G":
//                        g.setColor(new Color(245, 239, 246));
//                        break;
//                }
//                g.fillRect(x * QUADRANT_SIZE, y * QUADRANT_SIZE, QUADRANT_SIZE, QUADRANT_SIZE);
//            }
//        }
//
//        g.setColor(Color.DARK_GRAY);
//
//        g.fillRect(tankX, tankY, QUADRANT_SIZE, QUADRANT_SIZE);
//
//        g.setColor(Color.GREEN);
//
//
//
//        if(direction  == 1){
//            g.fillRect(tankX + 20, tankY, 24, 34);
//        } else if(direction == 2){
//            g.fillRect(tankX + 20, tankY + 30, 24, 34);
//        } else if(direction == 3) {
//            g.fillRect(tankX, tankY + 20, 34, 24);
//        } else if(direction == 4) {
//            g.fillRect(tankX + 30, tankY + 20, 34, 24);
//        }
//
//        g.setColor(Color.YELLOW);
//        g.fillRect(bulletX, bulletY, 14, 14);
//    }
}
