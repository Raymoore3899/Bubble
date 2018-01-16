package Bubble;



public class BubbleSort{
	
	
    public static void main(String[] args){
    	int da[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98};  
    	 System.out.println("排序之前：");
    	 BubbleSort.output(da);
    	 System.out.println();
    	  
    	 System.out.println("排序之后：");
    	 BubbleSort.bubble(da);
    	 BubbleSort.output(da);
    }
    
	public static  void bubble(int[] a){	
	    int temp=0;  
	    for(int i=0;i<a.length-1;i++){  
	        for(int j=0;j<a.length-1-i;j++){  
	        if(a[j]>a[j+1]){  
	            temp=a[j];  
	            a[j]=a[j+1];  
	            a[j+1]=temp;  
	          }  
	        }  
	    }  	  
	}
	
	  public static void output(int[] a){
	        for(int i=0;i<a.length;i++){
	                System.out.print(a[i]+"\t");
	            }
	        }

}
