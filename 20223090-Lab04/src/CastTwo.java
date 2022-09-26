
class CastTwo {
public static void main(String args[]) {
	byte byte1 ;
	short short1;
	char char1 = '\ud55c'; //유니코드=한
	int int1;
	float float1 = 3.6f;
	
	byte1 = (byte) char1; //char->byte타입으로 바꿔서 byte1에 저장
	System.out.print("char1 = "+char1 + " =>\t byte1 = "+byte1); // 처음 char타입(한)을 출력 후 char타입을 byte타입으로 바꾼 byte1(92)값을 출력
	System.out.println(" => \t(char)"+byte1 +" = "+(char) byte1); //byte타입인 byte1(92)을 출력 후 다시 byte->char 타입으로(\) 바꾸어서 출력
	
	short1 = (short) char1; //char->short 타입으로 바꿔서 short1에 저장
	System.out.print("char1 = "+char1 + " =>\t short1 = "+short1); //처음 char타입(한)을 출력 후 char타입을 short타입으로 바꾼 short1(-10916)값을 출력
	System.out.println(" => \t(char)"+short1 +" = "+(char) short1);//short타입인 short1(-10916)을 출력 후 다시 short->char타입으로 바꾼 값(한)을 출력
	
	int1 = char1;//int에다가 char타입인 char1의 값을 처장
	System.out.print("char1 = "+char1 + " =>\t int1 = "+int1); //처음 char타입(한)을 출력 후 char타입을 int타입으로 바꾼 int1(54620)값을 출력
	System.out.println(" => \t(char)"+int1 +" = "+(char) int1);//int타입인 int1(54620) 출력 후 int->char타입으로 바꾼 값(한)을 출력
	
	int1 = (int) float1; // float(32 bits) => int(32 bits)  int1에 float->int타입으로 바꾼 값을 저장
	System.out.print("float1 = "+float1 + " => \t int1 = "+int1); //처음 float타입(3.6)값을 출력 후 float->int타입으로 변환한 int1(3)값을 출력
	System.out.println(" => \t(float)"+int1 +" = "+(float) int1); //int타입인 int1(3)값을 출력후 int->float타입으로 바꾼 값을(3.0) 출력
	
	short1 = -134; //short타입
	byte1 = (byte) short1; //byte1에 short->byte타입으로 바꾼 값을 저장
	System.out.println("short1 = "+short1 + " => \t byte1 = "+byte1); //short 타입인 short1(-134)값을 출력 후 byte 타입인 byte1(122)의 값을 출력
} 
}