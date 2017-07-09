package new30_06;

/**
 * Created by Вождь on 30.06.2017.
 */
public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Мяв-мяв");
    }

    @Override
    public void feed() {
        System.out.println("Я їм рибу");
    }
}
