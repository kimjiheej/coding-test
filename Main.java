import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		int i,j;
		int p,q;
		int k=1;
		int num1;
		int num2;
		Nation[] list = new Nation[5];
		list[0] = new Nation("�ѱ�",1500,300);
		list[1] = new Nation("�߱�",3000,800);
		list[2] = new Nation("�Ϻ�",2000,500);
		list[3] = new Nation("�̱�",2500,750);
		list[4] = new Nation("����",2200,1000);

		Vaccine[] list1 = new Vaccine[3];
		list1[0] = new Vaccine("���1",25);//1
		list1[1] = new Vaccine("���2",50);//2
		list1[2] = new Vaccine("���3",100);//3


		do {
			System.out.println("----------------------");
			System.out.println("     �ڷγ�  ����  ����           ");
			System.out.println("----------------------");
			System.out.println("1.�������");
			System.out.println("2.������ ���� ����");
			System.out.println("3.���ӽ���");
			System.out.println("4.��������");
			num = sc.nextInt();

			switch(num) {
			case 1:
				for(i=0; i<list1.length; i++)
				{
					System.out.println("��� �̸� : "+ list1[i].name);
					System.out.println("��� ġ���� : "+ (int)list1[i].treatment+"%");
					System.out.println("\n");
				}
				break;
			case 2:
				for(j=0; j<list.length; j++)
				{
					System.out.println("���� ����: "+list[j].nation);
					System.out.println("�α���: "+ list[j].population+"��");
					System.out.println("���� �α���: "+ list[j].infection+"��");
					System.out.println("\n");
				}
				break;
			case 3:
			{

				System.out.println("����� ���(1~3)�� ����� ������ ����(1~5)�� ��ȣ�� ���ʴ�� �Է��ϼ���");
				p = sc.nextInt();
				q = sc.nextInt();
				System.out.println("1��° �õ�");
				System.out.println("���õ� ���:"+list1[p-1].name+","+"ġ����:"+list1[p-1].treatment+"%");
				System.out.println("���õ� ���:"+list[q-1].nation+","+"�α���: "+list[q-1].population+"��"+"�����ڼ�"+list[q-1].infection+"��");
				System.out.println("===============================");
				System.out.println("1�� ��� ���� �� ������ ���� ���� ����");
				System.out.println("===============================");
				if(k==1)//list1 = vaccine i �� ������ q�� ������
				{
					for(i=0; i<list.length; i++)
					{

						if(i==q-1)
							list[q].infection *= ((list1[p-1].treatment)/100);

						System.out.println("���� ����: "+list[i].nation);
						System.out.println("�α���: "+list[i].population);
						System.out.println("���� �α���: "+list[i].infection);

					}
					while(true)
					{
						System.out.println(k+"��° �õ�");
						num1 = (int)(Math.random()*5);
						num2 = (int)(Math.random()*3);
						System.out.println("���õ� ���: "+list1[num2].name+","+"ġ����: "+list1[num2].treatment+"%");
						System.out.println("���õ� ����: "+list[num1].nation+","+"�α���: "+list[num1].population+"�� , "+"�����ڼ�"+list[num1].infection+"��");
						System.out.println("=================================");
						System.out.println(k+"�� ��� ���� �� ������ ���� ���� ����");
						System.out.println("================================");
						k++;

						for(j=0; j<list.length; j++)
						{

							if(j==num1)
								list[j].infection *= ((list1[num2].treatment)/100);
							else
								list[j].infection += (list[j].infection * 0.15);

							System.out.println("���� ����: "+list[j].nation);
							System.out.println("�α���: "+list[j].population);
							System.out.println("���� �α���: "+list[j].infection);
						}

						if(k==5)
							break;
					}

					break;
				}

			}

			}
		}while(num!=4);
	}
}

