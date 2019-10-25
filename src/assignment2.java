import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("How many Students data are to be entered?");
        N = input.nextInt();
        int a[] = new int[N];
        Student[] s = new Student[N];
          for(int j = 0; j<N;j++){
              s[j] = new Student();
              s[j].getInfo(fname,lname,id,standing,email,address);
              s[j].displayInfo();
          }
    }
     static class Student {
         private String fname;
         private String lname;
         private int id;
         private int standing;
         private String email;
         private String address;

         public void getInfo(String f, String l, int i, int s, String e, String a) {
             fname = f;
             lname = l;
             id = i;
             standing = s;
             email = e;
             address = a;
             Scanner input = new Scanner(System.in);
             System.out.println("First Name?");
             f = input.nextLine();
             input.nextLine();
             System.out.println("Last Name?");
             l = input.nextLine();
             input.nextLine();
             System.out.println("PeopleSoft ID?");
             i = input.nextInt();
             input.nextLine();
             System.out.println("Class Standing?");
             s = input.nextInt();
             input.nextLine();
             System.out.println("Email?");
             e = input.nextLine();
             input.nextLine();
             System.out.println("Address?");
             a = input.nextLine();
         }
         public void displayInfo() {
             getInfo(fname, lname, id, standing, email, address);
             System.out.println("Student Details, Department of ILT");
             System.out.println("First Name:" + fname + "\t" + "Last Name:" + lname + "\t" + "PeopleSoft ID:" + id + "\t" + "Class Standing:" + standing + "\t" + "Email:" + email + "\t" + "Address" + address);
         }

     }
}