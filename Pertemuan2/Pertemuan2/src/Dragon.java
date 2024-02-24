public class Dragon {
    int x = 0, y = 0, width = 5, height = 5;

    void moveLeft() {
        x--;
        printPosition();
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        printPosition();
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y--;
        printPosition();
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y++;
        printPosition();
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.printf("Position : (%d, %d)\n", x, y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game over");
    }
}
