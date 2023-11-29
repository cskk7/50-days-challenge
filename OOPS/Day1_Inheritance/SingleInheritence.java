package OOPS.Day1_Inheritance;

// Here, the attributes from SampleClass are inherited to SingleInheritence class

public class SingleInheritence extends SampleClass{
    public static void main(String[] args) {
        SampleClass object = new SampleClass();
        object.LearningJava();
        object.PractisingJava();
        object.TeachJava();
    }
}

class SampleClass{
    void LearningJava(){
        System.out.println("I am learning Java");
    }

    void PractisingJava(){
        System.out.println("I am practising Java");
    }

    void TeachJava(){
        System.out.println("Tomorrow, I will teach Java");
    }
}

/*
 Output:
I am learning Java
I am practising Java
Tomorrow, I will teach Java
 */