public class Student {
    //instance variables//
    String name;
    int rollno;
    int [] marks;

    int Totalmarks(){
        int Studmarks=0;
        for(int mark :marks){
             Studmarks = Studmarks + mark;
        }
        return Studmarks;
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Hema";
        S1.rollno = 001;
        S1.marks = new int[]{47, 78, 53, 67, 80};

        Student S2 = new Student();
        S2.name = "Abi";
        S2.rollno = 012;
        S2.marks = new int[]{70, 78, 73, 67, 90};
        System.out.println(S1.Totalmarks());
        System.out.println(S2.Totalmarks());
    }

    }


