package OOP1;

class methods {

    //java methods can be overloaded, you can use the same names for a method but specify the parametes, one can have more parameters than the other
        private static void addnums(int a,int b){
            System.out.println("Sum: " + (a + b) + "\n");
        }

        private static void addnums(int j, int k,int m){
            System.out.println("sum :" + (j+k+m));
        }

        public static void main(String[] args) {
            addnums(1,3);
            addnums(1, 4, 4);
//            from one class we can create a thousand of objects
            methods newMtd = new methods();
            // newMtd.access();
        }
}
