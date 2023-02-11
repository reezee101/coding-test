package first;

//dfs(재귀함수)
//자기가 자기 자신을 호출 
import java.util.*;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      main.dfs(n);
   }
   

   public void dfs(int n) {   
      if(n == 0) {
         return;
      }else {
         System.out.print(n + " ");   //4 3 2 1... 
         dfs(n-1);
         System.out.print(n + " ");   //1 2 3 4 ... (stack frame을 사용하기 때문 )
      }
   }
}



//dfs(재귀함수)
//재귀함수로 이진수 출력 
import java.util.*;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      main.dfs(n);
   }
   

   public void dfs(int n) {   
       if(n == 0) {
          return;
       }else {
          dfs(n/2);
          System.out.print(n%2 + " ");

       }
   }
}





//dfs(재귀함수)
//재귀함수로 팩토리얼(1~n 까지의 곱)
import java.util.*;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      System.out.println(main.dfs(n));
   }
   

   public int dfs(int n) {   
       if(n == 1) {
          return 1;
       }else {
         return n * dfs(n-1);
       }
   }
}


피보나치 재귀함수 방법 1
//dfs(재귀함수)
//피보나치 수열 (앞의 2개의 수 합하여 다음 수 만들기)
//배열로 for문 돌려서 구현가능, 재귀함수로 구현 가능
//배열이 성능이 더 좋음(stack 안 써도 돼서)
import java.util.*;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      for (int i = 1; i <= n; i++) {
         System.out.print(main.dfs(n) + " ");
      }
   }
   
   public int dfs(int n) {   
       if(n == 1) {
          return 1;
       }else if(n == 2){
         return 1;
       }else{
          return dfs(n-2) + dfs(n-1);
       }
   }
}


피보나치 재귀함수 방법 2
//dfs(재귀함수)
//피보나치 수열 (앞의 2개의 수 합하여 다음 수 만들기)
//배열로 for문 돌려서 구현가능, 재귀함수로 구현 가능
//배열이 성능이 더 좋음(stack 안 써도 돼서)
import java.util.*;

public class Main {

   static int[] fibo;
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      fibo = new int[n+1];
      main.dfs(n);
      for (int i = 1; i <= n; i++) {
         System.out.print(fibo[i] + " ");
      }
   }
   
   public int dfs(int n) {   
       if(n == 1) {
          return fibo[n] = 1;
       }else if(n == 2){
         return fibo[n] = 1;
       }else{
          return fibo[n] = dfs(n-2) + dfs(n-1);
       }
   }
}



피보나치 재귀함수 방법 3
//dfs(재귀함수)
//피보나치 수열 (앞의 2개의 수 합하여 다음 수 만들기)
//배열로 for문 돌려서 구현가능, 재귀함수로 구현 가능
//배열이 성능이 더 좋음(stack 안 써도 돼서)
import java.util.*;

public class Main {

   static int[] fibo;
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Main main = new Main();

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      fibo = new int[n+1];
      main.dfs(n);
      for (int i = 1; i <= n; i++) {
         System.out.print(fibo[i] + " ");
      }
   }
   
   public int dfs(int n) {   
      
      if(fibo[n] > 0) {
         return fibo[n];   //재귀로 뻗을 필요 없이 바로 배열에 저장된 값 return(배열은 기본 0으로 초기화되므로)
      }
      
       if(n == 1) {
          return fibo[n] = 1;
       }else if(n == 2){
         return fibo[n] = 1;
       }else{
          return fibo[n] = dfs(n-2) + dfs(n-1);
       }
   }
}