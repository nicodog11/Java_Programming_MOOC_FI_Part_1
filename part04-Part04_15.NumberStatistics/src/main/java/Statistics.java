
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = count;
        this.sum = sum;

    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count = count;
    }

    public int sum() {
        return this.sum = sum;
    }

    public double average() {
        // write code here
        if(this.count > 0){
            return (double) this.sum/this.count;
        }else{
            return 0;
        }
    }
}
