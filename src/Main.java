import java.util.Random;
import java.util.random.RandomGenerator;

        public class Main {
            public static void main(String[] args) {

                System.out.println("результат 1:" +AgeAndTemperature (generateRandomAge(),25));
                System.out.println("результат 2:" + AgeAndTemperature(generateRandomAge(),22));
                System.out.println("результат 3:" + AgeAndTemperature(generateRandomAge(), -3));
                System.out.println("результат 4:" + AgeAndTemperature(generateRandomAge(), -8));
                System.out.println("результат 5:" + AgeAndTemperature(generateRandomAge(),17));
            }

            public static String AgeAndTemperature(int AgeOfHuman, int Temperature) {
                String goToPark = "Можно идти в парк";
                String stayHome = "Останьтесь Дома";
                if (AgeOfHuman >= 23 && AgeOfHuman <= 48 && Temperature >= 23 && Temperature <= 37) {
                    return goToPark;
                }

                else if (AgeOfHuman < 23 && Temperature >= 0 && Temperature <= 28) {
                    return goToPark;
                }


                else if (AgeOfHuman>48 && Temperature >=-8 && Temperature <=25){
                    return goToPark;

                }


                else {
                    return stayHome;
                }





            }
            public static int generateRandomAge(){
                Random age = new Random();

                int ageOfPerson = age.nextInt(100);

                return ageOfPerson;

            }

        }


