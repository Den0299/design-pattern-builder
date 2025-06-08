public class Main {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setFirstName("Mario");
        personBuilder.setLastName("Rossi");
        personBuilder.setAge(30);
        personBuilder.setAddress("via Roma 1");
        Person person1 = personBuilder.build();

        PersonBuilder personBuilder2 = new PersonBuilder();
        personBuilder2.setFirstName("Luca");
        personBuilder2.setLastName("Bianchi");
        personBuilder2.setAge(25);
        personBuilder2.setAddress("Via Milano 10");
        Person person2 = personBuilder2.build();


        System.out.println(person1);
        System.out.println(person2);

    }
}