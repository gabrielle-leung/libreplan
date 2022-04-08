package project.Outils;

/*
* Class comprenant les outils pour debug
*/
public class Debug {


    /*
    * Fonction qui fait appelle à Thread.sleep(int), pour faciliter le debug
    */
    public static void w4it(int t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*****
     * 
     * FONCTION à venirprint
     * */
    public static void print(String msg){
        System.out.println(msg);
    }
    
}
