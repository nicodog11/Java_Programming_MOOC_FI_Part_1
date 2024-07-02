
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        int totalCents1 = this.euros * 100 + this.cents;
        int totalCents2 = decreaser.euros() * 100 + decreaser.cents();

        int resultCents = totalCents1 - totalCents2;

        if (resultCents < 0) {
            return new Money(0, 0);
        }

        int newEuros = resultCents / 100;
        int newCents = resultCents % 100;

        return new Money(newEuros, newCents);
    }
}