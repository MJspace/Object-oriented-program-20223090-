
class CastTwo {
public static void main(String args[]) {
	byte byte1 ;
	short short1;
	char char1 = '\ud55c'; //�����ڵ�=��
	int int1;
	float float1 = 3.6f;
	
	byte1 = (byte) char1; //char->byteŸ������ �ٲ㼭 byte1�� ����
	System.out.print("char1 = "+char1 + " =>\t byte1 = "+byte1); // ó�� charŸ��(��)�� ��� �� charŸ���� byteŸ������ �ٲ� byte1(92)���� ���
	System.out.println(" => \t(char)"+byte1 +" = "+(char) byte1); //byteŸ���� byte1(92)�� ��� �� �ٽ� byte->char Ÿ������(\) �ٲپ ���
	
	short1 = (short) char1; //char->short Ÿ������ �ٲ㼭 short1�� ����
	System.out.print("char1 = "+char1 + " =>\t short1 = "+short1); //ó�� charŸ��(��)�� ��� �� charŸ���� shortŸ������ �ٲ� short1(-10916)���� ���
	System.out.println(" => \t(char)"+short1 +" = "+(char) short1);//shortŸ���� short1(-10916)�� ��� �� �ٽ� short->charŸ������ �ٲ� ��(��)�� ���
	
	int1 = char1;//int���ٰ� charŸ���� char1�� ���� ó��
	System.out.print("char1 = "+char1 + " =>\t int1 = "+int1); //ó�� charŸ��(��)�� ��� �� charŸ���� intŸ������ �ٲ� int1(54620)���� ���
	System.out.println(" => \t(char)"+int1 +" = "+(char) int1);//intŸ���� int1(54620) ��� �� int->charŸ������ �ٲ� ��(��)�� ���
	
	int1 = (int) float1; // float(32 bits) => int(32 bits)  int1�� float->intŸ������ �ٲ� ���� ����
	System.out.print("float1 = "+float1 + " => \t int1 = "+int1); //ó�� floatŸ��(3.6)���� ��� �� float->intŸ������ ��ȯ�� int1(3)���� ���
	System.out.println(" => \t(float)"+int1 +" = "+(float) int1); //intŸ���� int1(3)���� ����� int->floatŸ������ �ٲ� ����(3.0) ���
	
	short1 = -134; //shortŸ��
	byte1 = (byte) short1; //byte1�� short->byteŸ������ �ٲ� ���� ����
	System.out.println("short1 = "+short1 + " => \t byte1 = "+byte1); //short Ÿ���� short1(-134)���� ��� �� byte Ÿ���� byte1(122)�� ���� ���
} 
}