public class Counter {

    private int startValue;

    public Counter(){

    }

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public int value(){
        return startValue;
    }

    public void increase(){
        this.startValue += 1;
    }

    public void decrease(){
        this.startValue -= 1;

    }

    public void increase(int increaseBy){
        if(increaseBy > 0){
            startValue += increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            startValue -= decreaseBy;
        }

    }

}


/*
 * public int value() returns the current value of the counter
 * public void increase() increases the value by 1
 * public void decrease() decreases the value by 1
 */