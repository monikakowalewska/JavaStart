package AgregacjaKompozycja;

public class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public double getCashBorrowed() {
        return cashBorrowed;
    }

    public void setCashBorrowed(double cashBorrowed) {
        this.cashBorrowed = cashBorrowed;
    }

    public double getCashReturned() {
        return cashReturned;
    }

    public void setCashReturned(double cashReturned) {
        this.cashReturned = cashReturned;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }
    public Credit(){}
    public Credit(Person borrower,double cashBorrowed,double cashReturned,double interestRate,int termMonths){
        this.borrower=borrower;
        this.cashBorrowed=cashBorrowed;
        this.cashReturned=cashReturned;
        this.interestRate=interestRate;
        this.termMonths=termMonths;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "Bior¹cy kredyt to =" + borrower +
                ", pieni¹dze po¿yczone=" + cashBorrowed +
                ", pieni¹dze oddane=" + cashReturned +
                ", stopa procentowa=" + interestRate +
                ", iloœæ miesiêcy=" + termMonths +
                '}';
    }
}
