public class Container {

    private int liquidAmount;

    public Container(){
    }

    public int contains(){
        return this.liquidAmount;
    }

    public void add(int amount){
        if(amount > 0){
            this.liquidAmount += amount;
        }
        if(liquidAmount > 100){
            liquidAmount = 100;
        }
    }

    public void remove(int amount){
        if(amount > 0){
            this.liquidAmount -= amount;
            if(liquidAmount < 0){
                liquidAmount = 0;
            }
        }
    }
    public String toString(){
        return this.liquidAmount + "/100";
    }
}


/* 


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add")){
                if(amount > 0){
                    first += amount;
                    if(first > 100){
                        first = 100;
                    }
                }
            }else if(command.equals("move")){
                if(amount > 0){
                    if(amount > first){
                        second += first;
                        first = 0;
                    }else{
                        first -= amount;
                        second += amount;
                    }
                    if(second > 100){
                        second = 100;
                    }
                }
            }else if(command.equals("remove")){
                if(amount > 0){
                    second -= amount;
                    if(second < 0){
                        second = 0;
                    }
                }
            }
 */