public class SpliteMethod {
    String s="He is a very very good boy, isn't he?";
    String []arr=s.split("-");
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr.length-1;j++){
                if(arr[i].length()>arr[j].length()){
                      String t=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=t;

                }
            }
        }
    }
    public static void main(String[] args) {
        SpliteMethod obj=new SpliteMethod();
        obj.display();
    }
}
