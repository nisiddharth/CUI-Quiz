import java.io.*;
class Quiz
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int diff=0;
		System.out.println("________________________________________________________________________________");
        System.out.println("Loading ...");
        for(int i=0;i<=99999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Connecting to server ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Installing drivers ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Updating machine ...");
        for(int i=0;i<=9999999;i++)
        {
			System.out.print("");
        }
        System.out.println("Generating questions ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Creating hidden database ...");
        for(int i=0;i<=9999999;i++)
        {
			System.out.print("");
        }
        System.out.println("Saving your account information ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Scanning your mind ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Deleting older records ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Generating Ultra HD Graphics ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Increasing file memory ...");
        for(int i=0;i<=9999999;i++)
        {
			System.out.print("");
        }
        System.out.println("Conferencing to software developer ...");
        for(int i=0;i<=9999999;i++)
        {
			System.out.print("");
        }
        System.out.println("Trying to Start ...");
        for(int i=0;i<=99999999;i++)
        {
            System.out.print("");
        }
        System.out.println("Continuing with original task ...");
        for(int i=0;i<=9999999;i++)
        {
            System.out.print("");
        }
        System.out.println("________________________________________________________________________________");
        System.out.println();
		System.out.println("******  *    *  ***  ******                                  ");
		System.out.println("*    *  *    *   *       *                                   ");
		System.out.println("* *  *  *    *   *      *                                    ");
		System.out.println("*  * *  *    *   *     *                                     ");
		System.out.println("******  ******  ***  ******                                  ");
		System.out.println("      *                                                      ");
		System.out.println("                                                             ");
		System.out.println("                             -By Nishchal Siddharth Pandey!!!");
        System.out.println("________________________________________________________________________________");
        System.out.println();
		System.out.print("Enter Your Name : ");
		String name=br.readLine();
		System.out.println();
		System.out.println("You can now use the Number Pad of Keyboard for playing Quiz from here!!!");
		System.out.println();
		System.out.println("Q.1 : Which Country is Closest to Southernmost Tip Of India? : ");									//Q.1
		System.out.println("Options:");
		System.out.println("1 : Sri Lanka");
		System.out.println("2 : Malaysia");
		System.out.println("3 : Indonesia");
		System.out.println("4 : Lakshadweep");
		System.out.print("Ans.1 : Enter Option (1-4) : ");
		int a=Integer.parseInt(br.readLine());
		if(a==3)
		{
			System.out.println("Right Answer!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Indonesia is closest to the Southernmost Tip of India(Indira Point).");
			diff++;
		}
		System.out.println();
		System.out.println("Q.2 : Which is the Oldest Desert In the World? : ");												//Q.2
		System.out.println("Options:");
		System.out.println("1 : Atacama Desert");
		System.out.println("2 : Sahara Desert");
		System.out.println("3 : Thar Desert");
		System.out.println("4 : Namib Desert");
		System.out.print("Ans.2 : Enter Option (1-4) : ");
		int b=Integer.parseInt(br.readLine());
		if(b==4)
		{
			System.out.println("Correct!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The Oldest Desert in the World is Namib Desert.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.3 : Who Designed The city of New Delhi? : ");														//Q.3
		System.out.println("Options:");
		System.out.println("1 : Akbar");
		System.out.println("2 : Edwin Lutyens");
		System.out.println("3 : Lord Dalhousie");
		System.out.println("4 : Humayun");
		System.out.print("Ans.3 : Enter Option (1-4) : ");
		int c=Integer.parseInt(br.readLine());
		if(c==2)
		{
			System.out.println("Well Done!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Edwin Lutyens designed the city of New Delhi.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.4 : Which South American Desert is the Driest in the World? : ");									//Q.4
		System.out.println("Options:");
		System.out.println("1 : Atacama Desert");
		System.out.println("2 : Sahara Desert");
		System.out.println("3 : Thar Desert");
		System.out.println("4 : Namib Desert");
		System.out.print("Ans.4 : Enter Option (1-4) : ");
		int d=Integer.parseInt(br.readLine());
		if(d==1)
		{
			System.out.println("Good!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The Driest Desert in the World is Atacama Desert.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.5 : Which has the oldest written constitution in existence? : ");									//Q.5
		System.out.println("Options:");
		System.out.println("1 : Sudan");
		System.out.println("2 : Cambodia");
		System.out.println("3 : United States");
		System.out.println("4 : Switzerland");
		System.out.print("Ans.5 : Enter Option (1-4) : ");
		int e=Integer.parseInt(br.readLine());
		if(e==3)
		{
			System.out.println("Excellent!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("United States has the oldest constitution in Existence.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.6 : Where is the Haji Ali Dargah located? : ");													//Q.6
		System.out.println("Options:");
		System.out.println("1 : Chile");
		System.out.println("2 : India");
		System.out.println("3 : New Zealand");
		System.out.println("4 : Iceland");
		System.out.print("Ans.6 : Enter Option (1-4) : ");
		int f=Integer.parseInt(br.readLine());
		if(f==2)
		{
			System.out.println("Awesome!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Haji Ali Dargah is located in India.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.7 : What is the study of Fish known as? : ");														//Q.7
		System.out.println("Options:");
		System.out.println("1 : Ichthyology");
		System.out.println("2 : Piscatory");
		System.out.println("3 : Fishology");
		System.out.println("4 : Piscilogy");
		System.out.print("Ans.7 : Enter Option (1-4) : ");
		int g=Integer.parseInt(br.readLine());
		if(g==1)
		{
			System.out.println("Very Good!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The study of Fish is known as Ichthyology.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.8 : On which planet have the strongest winds of the Solar System been Recorded? : ");				//Q.8
		System.out.println("Options:");
		System.out.println("1 : Jupiter");
		System.out.println("2 : Earth");
		System.out.println("3 : Venus");
		System.out.println("4 : Neptune");
		System.out.print("Ans.8 : Enter Option (1-4) : ");
		int h=Integer.parseInt(br.readLine());
		if(h==4)
		{
			System.out.println("Right Answer!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The strongest wind in Solar System have been Discovered on Neptune.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.9 : When did the Wright Brothers fly their first AirCraft? : ");									//Q.9
		System.out.println("Options:");
		System.out.println("1 : 1903");
		System.out.println("2 : 1800");
		System.out.println("3 : 1909");
		System.out.println("4 : 1899");
		System.out.print("Ans.9 : Enter Option (1-4) : ");
		int i=Integer.parseInt(br.readLine());
		if(i==1)
		{
			System.out.println("Correct!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The Wright Brothers flied there First AirCraft in 1903.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.10 : The Royal Time at the Royal Observatory at which place in England is taken to be the Internationally accepted Universal Time? : ");  //Q.10
		System.out.println("Options:");
		System.out.println("1 : London");
		System.out.println("2 : Greenwich");
		System.out.println("3 : Russia");
		System.out.println("4 : Yorkshire");
		System.out.print("Ans.10 : Enter Option (1-4) : ");
		int j=Integer.parseInt(br.readLine());
		if(j==2)
		{
			System.out.println("Well Done!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The Royal Time at the Royal Observatory at Greenwich in England is taken to be the Internationally accepted Universal Time.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.11 : Which is the worlds highest lake? : ");						//Q.11
		System.out.println("Options:");
		System.out.println("1 : Caspian Sea");
		System.out.println("2 : Dead Sea");
		System.out.println("3 : Lake Titicaca");
		System.out.println("4 : Lake Mansarovar");
		System.out.print("Ans.11 : Enter Option (1-4) : ");
		int k=Integer.parseInt(br.readLine());
		if(k==3)
		{
			System.out.println("Good!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The worlds highest lake is Lake Titicaca.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.12 : Name a country which shares its borders with India and has a King? : ");			//Q.12
		System.out.println("Options:");
		System.out.println("1 : China");
		System.out.println("2 : Pakistan");
		System.out.println("3 : Nepal");
		System.out.println("4 : Bhutan");
		System.out.print("Ans.12 : Enter Option (1-4) : ");
		int l=Integer.parseInt(br.readLine());
		if(l==4)
		{
			System.out.println("Excellent!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Bhutan is a country which shares its borders with India and has a King.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.13 : What is the minimum age for casting a vote in a general election of India? : ");		//Q.13
		System.out.println("Options:");
		System.out.println("1 : 21 years");
		System.out.println("2 : 18 years");
		System.out.println("3 : 25 years");
		System.out.println("4 : 16 years");
		System.out.print("Ans.13 : Enter Option (1-4) : ");
		int m=Integer.parseInt(br.readLine());
		if(m==2)
		{
			System.out.println("Awesome!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("The minimum age for casting a vote in a general election of India is 18 years.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.14 : Who Invented the first steam locomotive? : ");					//Q.14
		System.out.println("Options:");
		System.out.println("1 : Alexander Graham Bell");
		System.out.println("2 : Thomas Alva Edison");
		System.out.println("3 : Stephenson");
		System.out.println("4 : J.R.D. Tata");
		System.out.print("Ans.14 : Enter Option (1-4) : ");
		int n=Integer.parseInt(br.readLine());
		if(n==3)
		{
			System.out.println("Very Good!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Stephenson Invented the first steam locomotive.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.15 : The Country which ranks second in land area is? : ");			//Q.15
		System.out.println("Options:");
		System.out.println("1 : China");
		System.out.println("2 : Canada");
		System.out.println("3 : India");
		System.out.println("4 : Australia");
		System.out.print("Ans.15 : Enter Option (1-4) : ");
		int o=Integer.parseInt(br.readLine());
		if(o==2)
		{
			System.out.println("Right Answer!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Canada is the country which ranks second in the land area.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.16 : Meteorology deals with? : ");									//Q.16
		System.out.println("Options:");
		System.out.println("1 : Weather");
		System.out.println("2 : Meteors");
		System.out.println("3 : Metals");
		System.out.println("4 : Earthquakes");
		System.out.print("Ans.16 : Enter Option (1-4) : ");
		int p=Integer.parseInt(br.readLine());
		if(p==3)
		{
			System.out.println("Correct!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Meteorology deals with Metals.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.17 : Who has been the first woman President of India? : ");			//Q.17
		System.out.println("Options:");
		System.out.println("1 : Mira Nair");
		System.out.println("2 : Sarojini Naidu");
		System.out.println("3 : Indira Gandhi");
		System.out.println("4 : Prathibha Devisingh Patil");
		System.out.print("Ans.17 : Enter Option (1-4) : ");
		int q=Integer.parseInt(br.readLine());
		if(q==4)
		{
			System.out.println("Well Done!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Prathibha Devisingh Patil has been the first woman President of India.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.18 : Which of the following channels seperate the Andaman and Nicobar Islands? : ");													//Q.18
		System.out.println("Options:");
		System.out.println("1 : Ten Degree Channel");
		System.out.println("2 : Nine Degree Channel");
		System.out.println("3 : Eight Degree Channel");
		System.out.println("4 : Six Degree Channel");
		System.out.print("Ans.18 : Enter Option (1-4) : ");
		int r=Integer.parseInt(br.readLine());
		if(r==1)
		{
			System.out.println("Good!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Ten Degreee Channel seperates the Andaman and Nicobar Islands.");
			diff++;
		}
		System.out.println();
		System.out.println("Q.19 : Who developed the World Wide Web? : ");													//Q.19
		System.out.println("Options:");
		System.out.println("1 : Timothy Bernes Lee");
		System.out.println("2 : Jim Osborn");
		System.out.println("3 : Gordon Moore");
		System.out.println("4 : James Watt");
		System.out.print("Ans.19 : Enter Option (1-4) : ");
		int s=Integer.parseInt(br.readLine());
		if(s==1)
		{
			System.out.println("Excellent!");
			sum++;
		}
		else
		{
			System.out.println("Wrong Answer:");
			System.out.println("Timothy Berner Lee has developed the World Wide Web.");
			diff++;
		}
        System.out.println();
        System.out.println("________________________________________________________________________________");
		System.out.println();
		int total=sum+diff;
		System.out.println("Total Questions Correctly Answered : "+sum);
        System.out.println("Total Questions Wrongly Answered : "+diff);
		System.out.println("Total Questions Answered : "+total);
		System.out.println();
        System.out.println("________________________________________________________________________________");
        System.out.println();
        System.out.print("Do you want to see your report card [Yes OR No] : ");
        char re=(char)br.read();
		if(re=='Y' || re =='y')
        {
            System.out.println("________________________________________________________________________________");
            System.out.println("Your Name : "+name);
            System.out.println();
            System.out.println("Total Number of Correct   Answers  = "+sum);
            System.out.println("Total Number of Wrong     Answers  = "+diff);
            System.out.println("Total Number of Questions Answered = "+total);
            System.out.println();
            System.out.println("________________________________________________________________________________");
			System.out.println();
		}
		System.out.println();
                System.out.println("________________________________________________________________________________");
		System.out.println();		
		System.out.println("This Software is Freeware and Freely Distributable, You can copy and distribute this application to your Relatives and Friends Free of Cost !!!");
		System.out.println();
		System.out.println("Thank You "+name+" for playing the Quiz !!!");
		System.out.println();
		System.out.println("________________________________________________________________________________");
		System.out.println();
	}
}
