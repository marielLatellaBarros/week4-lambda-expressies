package be.pxl.ja.week4.oefening1;

public class NumberSelector {
    private NumberMachine numberMachine;

    public NumberSelector(NumberMachine numberMachine) {
        this.numberMachine = numberMachine;
    }

    public String showEvenNumbers(){

         return numberMachine.processNumbers(new NumberFilter() {
            @Override
            public boolean check(int number) {
                if (number % 2 == 0) {
                    return true;
                }
                return false;
            }
        });
    }
}
