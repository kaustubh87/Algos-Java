/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchingparenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author kvin
 */
public class MatchingParenthesis {

    /**
     * @param args the command line arguments
     */
    
    
    public static final Map<Character, Character> matchingParentMap = new HashMap<>();
    public static final Set<Character> openingParentSet = new HashSet<>();
    
    static{
    matchingParentMap.put(')', '(');
    matchingParentMap.put('}', '{');
    matchingParentMap.put(']', '[');
    openingParentSet.addAll(matchingParentMap.values());
    
    
    }
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Enter string to check for matching parenthesis");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        
        boolean result = hasMatchingParen(input);
        System.out.println(result);
        
    }
    
    public static boolean hasMatchingParen(String input){
        
        try{
        
            Stack<Character> parenStack = new Stack<Character>();
            for(int i=0; i<input.length();i++)
            {
                char ch = input.charAt(i);
                
                if(openingParentSet.contains(ch))
                {
                    parenStack.push(ch);
                
                }
                if(matchingParentMap.containsKey(ch)){
                Character lastParam = parenStack.pop();
                if(lastParam != matchingParentMap.get(ch))
                {
                    return false;
                
                }
                        
                
                }
            
            }
            
            return parenStack.isEmpty();
        
        }catch(Exception e){
            
        }
    
    
        return false;
    }
    
}
