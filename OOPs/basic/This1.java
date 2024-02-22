package OOPs.basic;

class Income {
    float income;

    public void setIncome(float income)
    {
        this.income = income;
    }

    void printIncome()
    {
        System.out.println("income is: "+ income);
    }
}

class This1{
    public static void main(String[] args) {
        Income in = new Income();
        in.setIncome(1256.36f);
        in.printIncome();
    }
}