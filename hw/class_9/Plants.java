package task07_07.lesson.lesson2;

/**
 * Created by User on 08.07.2017.
 */
public class Plants {
    private int size;
    private Color color;
    private Type type;

    public enum Color {
        Blue, Red, White
    }

    public enum Type {
        Rose, Chamomile, Violet
    }

    public Plants(int size, String color, String type) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "red":
                return Color.Red;
            case "white":
                return Color.White;
            default:
                throw new ColorException("Input only color blue, red or white");
        }

    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "rose":
                return Type.Rose;
            case "chamomile":
                return Type.Chamomile;
            case "violet":
                return Type.Violet;
            default:
                throw new TypeException("Input only type rose, chamomile or violet");
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
