
/**
 * Write a description of class sdrgrg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sdrgrg
{
    
    
        /*
         * Complete the function below.
         */
        static String[] braces(String[] values) {
        String[] solution = new String [values.length];
        char[] braces = new char[100];
        int nEle = 0;
        for(int i=0; i<values.length;i++){
            solution[i] = "YES";

                

            for(int j=0; j<values[i].length();j++){
                if(values[i].charAt(0)==')'||values[i].charAt(0)=='}'||values[i].charAt(0)==']'){
                    solution[i] = "NO";
                    break;
                }
                nEle = 0;
                if(values[i].charAt(j)=='('){
                    braces[nEle] = values[i].charAt(j);
                    nEle++;
                }
                else if(values[i].charAt(j)=='{'){
                    braces[nEle] = values[i].charAt(j);
                    nEle++;
                }
                else if(values[i].charAt(j)=='['){
                    braces[nEle] = values[i].charAt(j);
                    nEle++;
                }
                else if(values[i].charAt(j)==')'){
                    if(braces[nEle-1]=='('){
                        nEle--;
                    }
                    else{
                       solution[i]= "NO";
                       break;
                   }
                }
                else if(values[i].charAt(j)=='}'){   
                     if(braces[nEle-1]=='{'){
                        nEle--;
                    }
                    else{
                       solution[i]= "NO";
                       break;
                    }
                }
                else if(values[i].charAt(j)==']'){   
                     if(braces[nEle-1]=='['){
                        nEle--;
                    }
                    else{
                       solution[i]= "NO";
                       break;
                    }
                }
               /*if(j==values[i].length()&&nEle==0){
                    solution[i] = "YES";
                    break;
                }
                else */if (j==values[i].length()&&nEle!=0){
                    solution[i] = "NO";
                    break;
                }
            }
        }
            return solution;
    }
}
}