package presenter;

import view.View;

import model.Model;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
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
        System.out.println("");
    }
}