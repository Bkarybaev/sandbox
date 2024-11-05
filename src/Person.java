public class Person {
    String name;
    String surName;
    int age;
    int res = 2024 ;

    public String getInfo(){
        return String.format("""
                name : %s
                sure name: %s
                age : %s
             """,name,surName,res-age);
    }
}
