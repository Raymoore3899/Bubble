package Bubble;



public class BubbleSort{
    public static void main(String[] args){
        int score[] = {66, 79, 55, 87, 99,200, 89, 99, 100};
        for (int i = 0; i < score.length -1; i++){    //�����n-1������
            for(int j = 0 ;j < score.length - i - 1; j++){    
            	if(score[j] < score[j + 1]){    //��С��ֵ����������
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }            
            
            
            System.out.print("��" + (i + 1) + "����������");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
            }
            
            System.out.println("");
        }
        
            System.out.print("������������");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
       }
    }
}