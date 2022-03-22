package Polymorphism;

public class OverridingPrac extends OverloadingPrac{
        public static void main(String[] args){
            OverridingPrac ovr=new OverridingPrac();
            ovr.execution();

        }
        void methodA(){

            System.out.println("B1");
        }
        void execution(){
            OverridingPrac ovr=new OverridingPrac();
            super.methodA();
            this.methodA();
        }

    }

