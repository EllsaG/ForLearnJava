
package Lesson22;

public class Chelovek {
    public final String pol;
    public Chelovek(String pol){
        this.pol = pol;
    }
    
    private StringBuilder name;
    
    
    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder (name);// пишется для того чтобы с помощью этого метода нельзя было изменить переменную
        return sb;
    }    
    public void setName(StringBuilder s){
        name = s;
    }
    
    
    private int vozrast;
    public int getVozrast(){
        int v = vozrast;// пишется для того чтобы с помощью этого метода нельзя было изменить переменную
        return v;
    }    
    public void setVozrast(int v){
        if (v>0){
            vozrast = v;
        }
    }
    
    
    private int ves;
        public int getVes(){
            int v = ves; // пишется для того чтобы с помощью этого метода нельзя было изменить переменную
        return v;
    }    
    public void setVes(int v){
        if (v>0){
            ves = v;
        }
    }
}

class Test{
    public static void main (String []args){
        Chelovek c = new Chelovek ("male");
        c.setName(new StringBuilder ("Kolya"));
        c.getName().append("!!!");
        c.setVes(50);
        c.setVozrast(15);
        
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
        c.setVes(-50);
        System.out.println(c.getVes());
        
    }
    
    
    
}