public class Main {
    public static void main(String[] args) {

        Employee[] employersarray = {
                new Employee("Ivanov","HR","Ivanov@mail.ru","02",3565, 57),
                new Employee("Petrov","SEO","Petrov@mail.ru","03",30656,34),
                new Employee("Sidorov","CEO","Sidorov@mail.ru","04",37656,94),
                new Employee("Konev","Manager","Konev@mail.ru","05",35656,19),
                new Employee("Kozlov","Lol","Kozlov@mail.ru","007",30656,15),
        };
        printEmployeeAge(employersarray, 40);
    }

    static void printEmployeeAge (Employee[] employersarray, int age){
        for (int i = 0; i < employersarray.length ; i++) {
     if (employersarray[i].getAge() > age){
         employersarray[i].printInfo();
     }
        }

    }

}


