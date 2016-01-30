package String;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Imran Bijapuri
 */
public class Word_Ladder {
    public static void main(){
        
    }
    
    public void getShortestTransformation(String start, String end, Set<String> set){
        Stack<Word> stack = new Stack<Word>();
        LinkedList<String> list = new LinkedList<>();
        list.add(start);
        stack.push(new Word(list, 1));  
        while(!stack.isEmpty()){
            Word w = stack.pop();
            StringBuilder str = new StringBuilder(w.list.get(w.list.size()-1));
            if(str.toString().equals(end)){
                System.out.println(w.list);
            }else{
                for(int i = 0; i < str.length(); i++){
                    for(int j = 0; j < 26; j++){
                        if(set.contains(str.replace(i, i, (char) (j + 97) + ""))){
                            w.list.add(str.replace(i, i, (char) (j + 97) + "").toString());
                            w.count++;
                            stack.push(w);
                        }
                    }
                }
            }
        }
    }
    
    class Word{
        List<String> list = new LinkedList<>();
        int count;
        public Word(List<String> list, int count){
            this.list = list;
            this.count = count;
        }
    }
}
