public class maindVeter {

    public static void main(String[] args) {
        //criando um pet
        Pet pet1 = new Pet("logan","15","pitibull");

        Cliente cliente1 = new Cliente("Caique","21",pet1);

        System.out.println(cliente1);
    }

}
