
package Lesson27_28;

public class Test15 {
    void marafon(int temperaturaVozduxa, int tempBega)throws PodvernutNoguException{
        if(tempBega>12){
            throw new PodvernutNoguException("Temp bega bil shlichkom bolshoi: "+ tempBega);
        }
        if(temperaturaVozduxa>32){
            throw new SveloNoguException ();
        }
        System.out.println("Vi probejali marafon");
    }
    
    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(20, 13);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Vlybom sluchae vi poluchite grammotu");
        }
    }
}

class PodvernutNoguException extends Exception {

    PodvernutNoguException(String message) {
        super(message);
    }
    PodvernutNoguException() {}
}

class SveloNoguException extends RuntimeException {

    SveloNoguException(String message) {
        super(message);
    }
    
    SveloNoguException() {}
}
