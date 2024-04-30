//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant rst1 = new Restaurant("NOA","Ukraine","Lviv");
        Menu menu1 = new Menu(33,20,"Have a childrens menu");
        Visitors vistr1 = new Visitors(475,392,83);

        System.out.println("Клас Restaurant:");
        System.out.println("Name: " + rst1.name);
        System.out.println("Country: " + rst1.country);
        System.out.println("City: " + rst1.city);

        System.out.println("Клас Menu:" );
        System.out.println("Numbers of meals: " + menu1.numberOfmeals);
        System.out.println("Numbers of drinks: " + menu1.numberOfdrinks);
        System.out.println("Childrens menu: " + menu1.childrensMenu);

        System.out.println("Клас Visitors:");
        System.out.println("Number of visitors: " + vistr1.numberOfvisitors);
        System.out.println("Leave a positive feedback: " + vistr1.positiveFeedback);
        System.out.println("Leave a negative feedback: " + vistr1.negativeFeedback);

        }
    }
