class P4Driver {
    public static void main(String[] args) {         
        Instructor prof = new Instructor("Nima","Davarpanah","3-2636");
        Textbook book = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course1 course1 = new Course1("Advanced Software Engineering",prof,book);

        course1.print();

        System.out.println("------------------------------------------");

        Instructor prof1 = new Instructor("Nima","Davarpanah","3-2636");
        Textbook book1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Instructor prof2 = new Instructor("Yunsheng","Wang","8-9");
        Textbook book2 = new Textbook("Design Patterns", "Erich Gamma", "Longman Publishing");
        Course2 course2 = new Course2("Advanced Software Engineering",prof1,prof2,book1,book2);

        course2.print();
    }
}