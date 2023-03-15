public class default_values {

int a;

short b;

long c;

double g;

float h;

char m;

void show(){

System.out.println("short" +b );

System.out.println( "long" +c );
System.out.println("double :"+g );

System.out.println("float"+h );

System.out.println( "char"+m );
}

public static void main(String args[]){

default_values object = new default_values();
System.out.println("Default Values");
object.show();


}
}
