package presenter;

import java.time.LocalDate;

import model.Model;
import view.View;

public class PresenterLogDecarator extends Presenter{

    public PresenterLogDecarator(Model m, View v) {
        super(m, v);
    }
    public void calculate(String operation) {
        model.setRealX(view.getValue("Введите действительную часть первого числа: "));
        model.setImageX(view.getValue("Введите мнимую часть первого числа: "));
        model.setRealY(view.getValue("Введите действительную часть второго числа: "));
        model.setImageY(view.getValue("Введите мнимую часть второго числа: "));
        System.out.print(operation);
        view.print(model.resultReal(), "");
        if(model.resultImage() > 0){
            System.out.print("+");
            view.print(model.resultImage(), "i");
		}else if(model.resultImage() < 0){
            view.print(model.resultImage(), "i");
        }
        System.out.println(" расчитано "+LocalDate.now());
    }
}
