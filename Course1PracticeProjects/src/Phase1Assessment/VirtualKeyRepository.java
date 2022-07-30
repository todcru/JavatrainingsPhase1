package Phase1Assessment;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyRepository {
    public static void main(String[] args)  {
        File folder = new File("E:\\JAVAFSD\\Javatrainings\\Javatrainings\\Course1PracticeProjects\\src\\Phase1Assessment\\ProjectDirectory");
        folder.mkdirs();
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println(" Welcome to LockedMe.com \n" + " This application was developed by Aswin Kumar M \n");
            System.out.println(" © All rights reserved \n");
            System.out.println("******************************************************************************* \n");
            System.out.println(" \n Select any of the following functions to execute :- *******   \n ");
            System.out.println("  1. To display the files in ascending order");
            System.out.println("  2. To execute User Enabled Operations");
            System.out.println("  3. Terminate Program");
            
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:

                    File arr[] = folder.listFiles();
                    Arrays.sort(arr);

                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;


                case 2:
                    Boolean temp = true;
                    while(temp) {
                        System.out.println(" 1. To Add a file ");
                        System.out.println(" 2. To Delete a file ");
                        System.out.println(" 3. To Search a specified file ");
                        System.out.println(" 4. Previous Menu");
                        System.out.println(" 5. Terminate Program");


                        int choice2 = scan.nextInt();

                        switch (choice2) {
                            case 1:
                                
                                System.out.println("Enter a file name");
                                String name = scan.next();
                                if(new File(folder,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File folder1 = new File(folder, name);
                                    folder1.mkdir();
                                    if (new File(folder, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }

                                break;


                            case 2:
                                System.out.println("Enter a file name");
                                String name1 = scan.next();
                                boolean folder2 = new File(folder, name1).exists();
                                System.out.println(folder2);
                                if (folder2 == true) {
                                    File folder3 = new File(folder, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("file does not exist");
                                }
                                
                                break;


                            case 3:
                                System.out.println("Enter a keyword to search");
                                String search = scan.next();

                                File arr1[] = folder.listFiles();
                                for(int a=0;a<arr1.length;a++){
                                    if(arr1[a].getName().startsWith(search)){
                                        System.out.println(arr1[a]);
                                    }else{
                                        System.out.println("No file found");
                                    }
                                }
                                break;

                            case 4:

                                temp = false;
                                break;

                            case 5:

                                System.out.println(" Program Terminated Successfully \n\n ==============================================================");
                                System.exit(0);
                            default:
                                System.out.println("Input correct value and retry");

                        }

                    }
                    break;

                case 3:
                    System.out.println(" Program Terminated Successfully \n ==============================================================");
                    System.exit(0);

                default:
                    System.out.println("Input correct value and retry");
                    break;

            }
        }
    }

}




