 import java.util.Random;
 
 class StringExample {
    public static void main(String[] args) {
       
        
        String[] names = {"Ratul", "Amartya", "Rocket", "Partha", "Sourav", "Soumen", "Saswata", "tina", "bapi", "Tarun", "Suman"
    
    };

        sort(names);

        for(String name : names)
            System.out.println(name);
    }

    public static void sort(String[] elements){
        for(int i=0; i<elements.length; i++){
            boolean flag = true;

            for(int j=0; j<elements.length-1-i; j++){
                if(elements[j].compareTo(elements[j+1])>0){
                    String temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                    flag = false;
                }
            }

            if(flag){
                break;
            }



        }
    }
    
}
