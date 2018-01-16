package Bubble;



public class BubbleSort{
    public static void main(String[] args){
        int score[] = {66, 79, 55, 87, 99,200, 89, 99, 100};
        for (int i = 0; i < score.length -1; i++){    //最多做n-1趟排序
            for(int j = 0 ;j < score.length - i - 1; j++){    
            	if(score[j] < score[j + 1]){    //把小的值交换到后面
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }            
            
            
            System.out.print("第" + (i + 1) + "次排序结果：");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
            }
            
            System.out.println("");
        }
        
            System.out.print("最终排序结果：");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
       }
    }
}