package hw1;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {
//        4
//        change();
//        6
        threeDel();
    }

    public static void threeDel(){
        try {
            FileWriter wr = new FileWriter("wfile.txt");
            FileReader read = new FileReader("rfile.txt");

            Scanner sc = new Scanner(read);
            while (sc.hasNextLine()){
                String oldLine = sc.nextLine();
                String[] ol= oldLine.split(" ");
                String newLine = "";
                String checkWord = "";
                int checkIndex = 0;
                int check = 0;
                for (int i=0;i<ol.length;i++){
                    if (ol[i].length()>=3&&ol[i].length()<=5&&check%2!=0){
                        ol[i]="";
                        check++;
                    }else if(ol[i].length()>=3&&ol[i].length()<=5&&check%2==0){
                        checkWord = ol[i];
                        checkIndex = i;
                        ol[i]="";
                        check++;
                    }
                }
                if (check%2!=0){
                    ol[checkIndex]=checkWord;
                }
                for(int i=0; i<ol.length;i++){
                    if(ol[ol.length-1].equals("")||ol[ol.length-1].equals(" "));
                    else if(i==ol.length-1){
                        newLine = newLine+ol[i]+"\n";
                    }else {
                        newLine = newLine+ol[i]+" ";
                    }
                }
                wr.append(newLine);
            }
            read.close();
            wr.close();
        }catch (IOException e){
            System.out.println("here is problem with file reading");
            e.printStackTrace();
        }
    }
//    public static void cipher(){
//        try {
//            FileWriter wr = new FileWriter("cipher.txt");
//            FileReader read = new FileReader("text.txt");
//
//            Scanner sc = new Scanner(read);
//            ArrayList<Integer> lineLength= new ArrayList<>();
//            int lineCount=0;
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                lineLength.add(line.length());
//                lineCount++;
//            }
//            BufferedWriter buf= new BufferedWriter(wr);
//            read.close();
//            wr.close();
//        }catch (IOException e){
//            System.out.println("here is problem with file reading");
//            e.printStackTrace();
//        }
//    }
    public static void change(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("it's task #4. Please, add how much letters must be in your new file");
        int n = scanner.nextInt();
        try {
            FileWriter wr = new FileWriter("wfile.txt");
            FileReader read = new FileReader("rfile.txt");

            Scanner sc = new Scanner(read);
            while (sc.hasNextLine()&&n!=0){
                String line = sc.nextLine();
                int n1=n-line.length();

                if (n1<0){
                    line=line.substring(0,line.length()+n1);
                    wr.write(line);
                    break;
                }
                if(line.equals(""));
                else wr.write(line+" ");
            }
            read.close();
            wr.close();
        }catch (IOException e){
            System.out.println("here is problem with file reading");
            e.printStackTrace();
        }
    }
}
