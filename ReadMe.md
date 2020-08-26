# 第一天
+ 配置git
   * git push -u origin master
   * origin https://github.com/wwyuj/JavaCode.git
+ 第一个Java程序

```
则涉及的java的自动转型.
第二句比较简单,先解释第二句.
"\n"是一个字符串,表示换行.
其实第二句就是输出System.out.print(0+"\n"),
即一个整形  +  一个字符串,这里的加号是连接符,会把整形0当成字符串,自动转型,  
即:System.out.print("6\n")这条语句会输出0和一个换行.
第一句等于System.out.print(0+'\n') ,请注意,这里,0是一个整形
'\n'是一个字符型(char),整形和字符型之间的加号是加法的意思,
'\n'发生自动转型,转为整形,'\n' 换行的ascii码为10.所以  0+10=10.

   public static void main(String[] args) throws InterruptedException {
 
         String A = "hello world!";
         for (int j = 0; j <20 ; j++) {
             String filename = getRandomString(5);
             sleep(1000);
             System.out.println(j+"\n"+A+filename);
             System.out.println(j+'\n'+A+filename);
         }
 
     }
 
     public static String getRandomString(int length) {
         String str = "0123456789";
         Random random = new Random();
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < length; i++) {
             int number = random.nextInt(10);
             sb.append(str.charAt(number));
         }
         return sb.toString();
     }  


 
```
    
         

        
  