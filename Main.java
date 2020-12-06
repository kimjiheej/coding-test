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
		list[0] = new Nation("한국",1500,300);
		list[1] = new Nation("중국",3000,800);
		list[2] = new Nation("일본",2000,500);
		list[3] = new Nation("미국",2500,750);
		list[4] = new Nation("독일",2200,1000);

		Vaccine[] list1 = new Vaccine[3];
		list1[0] = new Vaccine("백신1",25);//1
		list1[1] = new Vaccine("백신2",50);//2
		list1[2] = new Vaccine("백신3",100);//3


		do {
			System.out.println("----------------------");
			System.out.println("     코로나  종식  게임           ");
			System.out.println("----------------------");
			System.out.println("1.백신정보");
			System.out.println("2.감염된 국가 정보");
			System.out.println("3.게임시작");
			System.out.println("4.게임종료");
			num = sc.nextInt();

			switch(num) {
			case 1:
				for(i=0; i<list1.length; i++)
				{
					System.out.println("백신 이름 : "+ list1[i].name);
					System.out.println("백신 치료율 : "+ (int)list1[i].treatment+"%");
					System.out.println("\n");
				}
				break;
			case 2:
				for(j=0; j<list.length; j++)
				{
					System.out.println("감염 국가: "+list[j].nation);
					System.out.println("인구수: "+ list[j].population+"명");
					System.out.println("감염 인구수: "+ list[j].infection+"명");
					System.out.println("\n");
				}
				break;
			case 3:
			{

				System.out.println("사용할 백신(1~3)과 백신을 적용할 국가(1~5)의 번호를 차례대로 입력하세요");
				p = sc.nextInt();
				q = sc.nextInt();
				System.out.println("1번째 시도");
				System.out.println("선택된 백신:"+list1[p-1].name+","+"치료율:"+list1[p-1].treatment+"%");
				System.out.println("선택된 백신:"+list[q-1].nation+","+"인구수: "+list[q-1].population+"명"+"감염자수"+list[q-1].infection+"명");
				System.out.println("===============================");
				System.out.println("1차 백신 투여 후 감염된 나라에 대한 정보");
				System.out.println("===============================");
				if(k==1)//list1 = vaccine i 는 국가임 q는 국가임
				{
					for(i=0; i<list.length; i++)
					{

						if(i==q-1)
							list[q].infection *= ((list1[p-1].treatment)/100);

						System.out.println("감염 국가: "+list[i].nation);
						System.out.println("인구수: "+list[i].population);
						System.out.println("감염 인구수: "+list[i].infection);

					}
					while(true)
					{
						System.out.println(k+"번째 시도");
						num1 = (int)(Math.random()*5);
						num2 = (int)(Math.random()*3);
						System.out.println("선택된 백신: "+list1[num2].name+","+"치료율: "+list1[num2].treatment+"%");
						System.out.println("선택된 나라: "+list[num1].nation+","+"인구수: "+list[num1].population+"명 , "+"감염자수"+list[num1].infection+"명");
						System.out.println("=================================");
						System.out.println(k+"차 백신 투여 후 감염된 나라에 대한 정보");
						System.out.println("================================");
						k++;

						for(j=0; j<list.length; j++)
						{

							if(j==num1)
								list[j].infection *= ((list1[num2].treatment)/100);
							else
								list[j].infection += (list[j].infection * 0.15);

							System.out.println("감염 국가: "+list[j].nation);
							System.out.println("인구수: "+list[j].population);
							System.out.println("감염 인구수: "+list[j].infection);
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

