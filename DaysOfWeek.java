public class DaysOfWeek{
    public enum Days{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;
    }
    public static void main(String[] args){
        Days currentDay = Days.Tuesday; /*You must change it into what current day today*/

        switch(currentDay){
            case Monday:
                System.out.println("It's Monday! Back to school.");
                break;

            case Tuesday:
                System.out.println("It's Tuesday! Keep going.");
                break;

            case Wednesday:
                System.out.println("It's Wednesday! Keep up the good work.");
                break;

            case Thursday:
                System.out.println("It's Thursday! You're doing a great job.");
                break;

            case Friday:
                System.out.println("It's Friday! Yes,you did it.");
                break;

            case Saturday:
                System.out.println("It's Saturday! It's time to rest.");
                break;

            case Sunday:
                System.out.println("It's Sunday! It's a Church Day.");
                break;
        default:
            System.out.println("Invalid Input");

        }
    }
}