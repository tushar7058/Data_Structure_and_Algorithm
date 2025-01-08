 public  class Main {
    public static void main(String[] args) {
        System.out.println("Hello wolrd");
    }
}

class Employee extends Main {
    public void check() {
        System.out.println("Success.");
    }

    public static void view(Main c) {
        if (c instanceof Employee) {
            Employee b1 = (Employee) c;
            b1.check();
        }
    }

    public static void main(String[] args) {
        Main c = new Employee();
        Employee.view(c);
    }
}