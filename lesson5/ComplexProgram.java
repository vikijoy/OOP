package lesson5;
import Models.DeductModelC;
import Models.DivideModelC;
import Models.MultyModelC;
import Models.SumModelC;

import java.util.Scanner;

public class ComplexProgram {
    public static void complex(){
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действие - +, -, *, / \n или введите q для возврата в калькулятор рациональных чисел");
                String key = scanner.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "+":
                        PresenterC pC = new PresenterC(new SumModelC(), new View());
                        pC.buttonClick("+");

                        break;
                    case "-":
                        pC = new PresenterC(new DeductModelC(), new View());
                        pC.buttonClick("-");
                        break;
                    case "*":
                        pC = new PresenterC(new MultyModelC(), new View());
                        pC.buttonClick("*");
                        break;
                    case "/":
                        pC = new PresenterC(new DivideModelC(), new View());
                        pC.buttonClick("/");
                        break;
                    case "q":
                        Program.main(new String[]{""});

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
    }