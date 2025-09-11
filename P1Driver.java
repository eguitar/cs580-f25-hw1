class P1Driver {
    public static void main(String[] args) {
        
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", 111111111, 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", 222222222, 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", 333333333, 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", 444444444, 15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", 555555555, 1700);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", 666666666, 95000);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", 777777777, 22, 40000);

        System.out.println(employee1.print());
        System.out.println(employee2.print());
        System.out.println(employee3.print());
        System.out.println(employee4.print());
        System.out.println(employee5.print());
        System.out.println(employee6.print());
        System.out.println(employee7.print());
    }
}