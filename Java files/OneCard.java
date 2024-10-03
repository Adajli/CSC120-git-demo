public class OneCard{

    // Attributes
    private Student owner;
    private double balance;

    //Constructor
    public OneCard(Student s, double amt){
        this.owner = s;
        if (amt < 0) {
            throw new RuntimeException("Cannot create a OneCard with a negative starting balance.");
        }
        this.balance = amt;
    }

    // Getters
    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return owner.getName();
    }

    // // Setter
    // public void setOwner(String new_name) {
    //     if (this.owner.getName() != new_name) {
    //         this.owner = new_name;
    //     } else {
    //         throw new RuntimeException("Name unchanged.");
    //     }
    // }

    // Methods
    public void deposit(double amt) {
        this.balance += amt;
    }

    /**
     * Tests whether the balance on the card 
     * is sufficient to cover a charge
     * @param amt the desired charge
     * @return T/F: whether the balance is sufficient
     */
    public boolean canAfford(double amt) {
        return this.balance >= amt;
    }

    public void spend(double amt) {
        if (this.canAfford(amt)) {
            this.balance -= amt;
        } else {
            throw new RuntimeException("Low balance! Cannot afford " + amt);
        }
    }

    public String toString() {
        return this.owner + " has a balance of $" + Double.toString(this.balance);
    }

    public static void main(String[]args) {
        Student me = new Student("Jordan",new School("Smith College",20));
        OneCard myCard = new OneCard(me, 3.00);
        try {
            myCard.spend(10.);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        System.out.println(myCard);
    }
    

}
