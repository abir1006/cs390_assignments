package Problem_3;

public class Driver {
    public static void main(String[] args) {
        Figure figures[] = new Figure[4];
        figures[0] = new UpwardHat();
        figures[1] = new DownwardHat();
        figures[2] = new FaceMaker();
        figures[3] = new Vertical();

        for (Figure figure: figures) {
             figure.getFigure();
        }

        System.out.println();

        for (Figure figure: figures) {
            System.out.print(figure.getClass().getSimpleName() + ": ");
            figure.getFigure();
            System.out.println();
        }

    }
}
