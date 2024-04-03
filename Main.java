import model.DivModel;
import model.MulModel;
import model.SumModel;
import presenter.Presenter;
import presenter.PresenterLogDecarator;
import view.View;

public class Main {
    public static void main(String[] args) {
        Presenter sum = new PresenterLogDecarator(new SumModel(), new View());
        sum.calculate("Сумма: ");
        Presenter mul = new PresenterLogDecarator(new MulModel(), new View());
        mul.calculate("Умножение: ");
        Presenter div = new PresenterLogDecarator(new DivModel(), new View());
        div.calculate("Деление: ");
    }
}