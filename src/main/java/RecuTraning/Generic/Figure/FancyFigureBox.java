package RecuTraning.Generic.Figure;

public class FancyFigureBox<T extends Figure> {

    private T element;
/*
    public FigureBox(T element) {
        this.element = element;
    }
*/
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
