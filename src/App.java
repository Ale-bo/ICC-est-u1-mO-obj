
import controllers.ManagePeople;
//import models.Person;

public class App {

    public static void main(String[] args) {
        //Person person = new Person( "Ivanna", 18);
        //System.out.println(person.getName());
        ManagePeople mG = new ManagePeople();
        mG.sortPeopleByAge();
        mG.sortPeopleByName();
    }

}

