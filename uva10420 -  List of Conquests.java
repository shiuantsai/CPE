import java.util.*;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


class main{

    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int cases = scn.nextInt();
        String country[] = new String[cases];
        Set<String> set = new HashSet<String>();
     
        
        for(int i=0;i<cases;i++){
        	country[i] = scn.next(); //存放國家名稱
        	set.add(country[i]);     //使用set在存放一份國家名稱。Set特性：不會存放相同的Object。
        	String no = scn.nextLine();  //因為姓名沒有用到，所以不重要。
        }
        
        Arrays.sort(country);        //對國家名稱做排序
        String st[] = set.toArray(new String[set.size()]); //集合轉陣列
        Arrays.sort(st);	 	     //對國名稱家做排序

        //接著比較st跟country這兩個陣列
		for(int i=0;i<st.length;i++){
				int count=0;
			for(int j=0;j<cases;j++){
				if(st[i].equals(country[j]))
					count++;
			}
			System.out.println(st[i]+" "+count);
		}


	}
}



/*
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        int cases=sc.nextInt();
        String country[]=new String[cases];
       	Set<String> set=new HashSet<String>();
         
         
        for(int i=0;i<cases;i++){
            country[i]=sc.next(); //存放國家名稱
            set.add(country[i]); //使用set在存放一份國家名稱。Set特性：不會存放相同的Object。
            String No=sc.nextLine(); //因為姓名沒有用到，所以不重要。
        }
         
        //由於如果國家數目相同會需要比較國家名稱，故先把國家名稱進行排列。
        Arrays.sort(country);
        String st[]=set.toArray(new String[set.size()]);
        Arrays.sort(st);
         
        //拿剛剛set存放的國家名稱去跟剛剛另一份array的資料做比較，計算有多少個相同的國家名稱。
        for(int i=0;i<st.length;i++){
            int count=0;
            for(int j=0;j<cases;j++){
                if(st[i].equals(country[j])) count++;
            }
            //Output
            System.out.println(st[i]+" "+count);    
        }
    }
}
*+/
//*/
