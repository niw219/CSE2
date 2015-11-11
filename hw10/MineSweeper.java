//Nicole Weber
//CSE 002
//HW 10

//import the scanner
import java.util.Scanner; 

//define a class
public class MineSweeper {
    
    //add a main method
    public static void main(String [] args) {
        
        //call the scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //prompt user for size of board
        System.out.print("What size board do you want? (Choose an integer between 2 and 30): ");
        
        //call a method for the scanner to accept user input
        int N = myScanner.nextInt();
        
        //create a 2D array
        String [][] board = new String [N][N];
        
        //prompt user for number of mines
        System.out.print("How many mines do you want? (Choose an integer between 1 and " + N*N +"): ");
    
        //call a method for the scanner to accept user input
        int M = myScanner.nextInt();
        
        //add data to board
        for(int a=0; a<N; a++) {
            for (int b=0; b<N; b++) {
                board[a][b]="_";
            }
        }
        
        //add mines in random locations
        for (int c=1; c<=M; c++) {
            
            int x=(int)(Math.random()*N);
            int y=(int)(Math.random()*N);
            
            if (board[x][y]=="_")
            {
            board[x][y]="M";
            }
            
            else 
            {
                c--;
            }

            }
            
            //calculate number of mines adjacent to each cell
            for (int f=0; f<N-1; f++) {
                for (int g=0; g<N-1; g++) {
                    if (board[g][f]!="M") {
                    
                    int adj=0;
                    
                    int left=g-1;
                    int up=f-1;
                    int right=g+1;
                    int down=f+1;
                    
                    if(left>=0) {
                    if(board[left][f]=="M") {
                        adj++;
                    }
                    }
                    if(right<N) {
                    if(board[right][f]=="M") {
                        adj++;
                    }
                    }
                    if(up>=0) {
                    if(board[g][up]=="M") {
                        adj++;
                    }
                    }
                    if(down<N) {
                    if(board[g][down]=="M") {
                        adj++;
                    }
                    }
                    if (left>=0 && up>=0)
                    if(board[left][up]=="M") {
                        adj++;
                    }
                    if (left>=0 && down<N)
                    if(board[left][down]=="M") {
                        adj++;
                    }
                    if(right<N && up>=0) {
                    if(board[right][up]=="M") {
                        adj++;
                    }
                    }
                    if(right<N && down>=0) {
                    if(board[right][down]=="M") {
                        adj++;
                    }
                    }
                    if (adj!=0) {
                    String val=""+adj;
                    board[g][f]=val;
                    }
                    else {
                        board[g][f]="_";
                    }
                }
                
                }
            }
            
            for (int h=0; h<N; h++) {
                for (int i=0; i<N; i++) {
                    System.out.print(board[h][i]);
                }
                System.out.println();
            }
        }
            
        }
        
