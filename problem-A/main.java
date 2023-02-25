public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 10, 10);
        for (int i = 0; i < 10; i++) {
            movablePoint.moveRight();
            movablePoint.moveDown();
        }
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(100, 100, 20, 20, 20);
        System.out.println(movableCircle);
        for (int i = 0; i < 5; i++) {
            movableCircle.moveDown();
            movableCircle.moveRight();
            System.out.println(movableCircle);
        }

        Movable[] movable = new Movable[10];
        for (int i = 0; i < 10; i+=2) {
            movable[i] = new MovablePoint(i, i, 5, 5);
            movable[i + 1] = new MovableCircle(i, i, 5, 5, 20);
        }
        for (Movable m: movable) {
        
            System.out.println(m instanceof MovableCircle);
            System.out.println(m.getClass().getName());
        }


    }
}
