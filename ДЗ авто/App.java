import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        Auto[] auto = { new Auto("BMW", "X5", "Седан", 150, 0),
                new Auto("BMW", "M4", "Седан", 100, 1),
                new Auto("Mers", "s200", "Седан", 120,2),
                new Auto("Mers", "гелик", "??", 1000,3),
        };
        Client client = new Client("Коликов", "Егор");

        System.out.println("Список доступных авто:");
        for (Auto i : auto) {

            
            System.out.println(i.getId() + " " + i.getAuto());
        }
        ;
        System.out.println("Под каим номером вам приглянулся авто?");
        Order order = new Order(auto[scanner.nextInt()], client, 0, false);
        System.out.println("На сколько дней?");
        order.renta(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ждем одобрения администратора");
        String answer = scanner.nextLine();
        switch (answer) {
            case "y":
                order.approve(true);
                System.out.println("Аренда одобрена, перейдем к оплате. C вас " + order.getRentalTime()*order.Auto.getPricePerDay() + "рублей. Оплачиваем?");
                System.out.println(order.Auto.getAuto());
                break;
            case "No":
                System.out.println("Вам отказано в услуге по причине");
                order.reasonRefusal(scanner.nextLine());
                break;
            default:
                break;
        }

        answer = scanner.nextLine();

        switch (answer) {
            case "y":
                Pay pay = new Pay();
                if (pay.getStatus() == true){
                    order.paid(true);
                    auto[order.Auto.getId()].access(false);
                }
                break;
                case "No":
                System.out.println("Пока");
                break;
        
            default:
                break;
        }
        System.out.println("Возвраете, давайте оценим");
        
        order.returnCar(scanner.nextLine());
}
}