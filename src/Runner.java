import by.gsu.training.final1.Trip;

public class Runner {
    public static void main(String[] args) {

        Trip[] tripArray = new Trip[5];

        tripArray[0] = new Trip("Кирилл Пархоменко", 200000, 12000, 5);
        tripArray[1] = null;
        tripArray[2] = new Trip("Всеволод Власенко",1234545, 472354,2);
        tripArray[3] = new Trip("Максим Лапушко", 47329787, 6456456, 10);
        tripArray[4] = new Trip();

        for (Trip objTrip:tripArray) {
            if(objTrip != null){
                objTrip.show();
            }
        }

        tripArray[4].setTripExpenses(2354535);


    }
}
