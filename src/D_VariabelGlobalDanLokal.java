public class D_VariabelGlobalDanLokal {

    static int varGlobal = 34;

    public static void main(String[] args) {
        varGlobal=25;
        System.out.println("varGlobal diakses di method main dengan nilai =" + varGlobal);
        double varLokal = 3.14;
        System.out.println("varLokal hanya bisa diakses di method main dengan nilai =" + varLokal);
        aksesVariabelLOkal();
    }

  public static void aksesVariabelLOkal(){
      System.out.println("varGlobal bisa diakses di method aksesVariabelLokal dengan nilai =" + varGlobal);
    //varLokal=2.5;
      System.out.println("varLokal tidak bisa diakses di method aksesVariabelLokal ini");
    }
}
