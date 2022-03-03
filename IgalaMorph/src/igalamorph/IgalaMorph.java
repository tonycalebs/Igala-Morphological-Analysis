/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igalamorph;

import javax.swing.JOptionPane;

/**
 *
 * @author CALEB
 */
public class IgalaMorph {
public static String Noun = "", Verb="",prefix="", suff="";
int k,j;

private static final int INC = 50;
    char[] b = new char[INC];

    /**
     * @param args the command line arguments
     */
       
    
    public static String N(String s){
       int l = s.length();
       String ss="";
       char[]n = new char[1];
       int i = 0;
       n[i]=s.charAt(i);
          
       if (n[i] == 'a'|| n[i] =='e'||n[i] =='i'||n[i] =='o'||n[i] =='u'||n[i] =='ẹ'||n[i] =='ọ'||n[i] =='ẹ'||n[i] =='ẹ'||n[i] =='é'||n[i]=='ù' ||n[i]=='à'||n[i]=='ọ')
           ss = "Noun";
       else if (n[i] == 'A'|| n[i] =='E'||n[i] =='I'||n[i] =='O'||n[i] =='U')
           ss = "Noun";
       else{  
       // if (s=="tule"||s=="gbiti"||s=="dudu"||s=="kpikpa"||s=="ko"||s=="ukpereji"||s=="udokulu"||s=="ojoji"||s=="alumeji"||s=="abibo")
       //     ss="adjective";
       // else if(s=="pee"||s=="yee")
        //   ss = "Adverb";
        // else
           ss= "Verb";
       }
         
       return ss;
   }
    
   
  public static String stripPrefixes ( String str) {

     String[] prefixes = { "am", "ab", "ib", "e","ek", "agw", "akp", "el", "ak","u","ukp", "uk","k","a"};

     int last = prefixes.length;
     for ( int i=0 ; i<last; i++ ) {
         if ( str.startsWith( prefixes[i] ) ) {
            String temp = "";
            for ( int j=0 ; j< str.length()-prefixes[i].length(); j++ )
                temp += str.charAt( j+prefixes[i].length() );
            return temp;
         }
     }
     
     return str;
  }
        
  
  public static String wPrefix(String s){
      
      if (s.startsWith("am")==true)
          prefix = "am";
      else if (s.startsWith("e")==true)
          prefix = "e";
      else if (s.startsWith("ek")==true)
          prefix = "ek";
      else if (s.startsWith("ab")==true)
          prefix = "ab";
      else if (s.startsWith("ib")==true)
          prefix = "ib";
      else if (s.startsWith("agw")==true)
          prefix = "agw";
      else if (s.startsWith("am")==true)
          prefix = "am";
      else if (s.startsWith("akp")==true)
          prefix = "akp";
      else if (s.startsWith("el")==true)
          prefix = "el";
       else if (s.startsWith("ak")==true)
          prefix = "ak";
       else if (s.startsWith("u")==true)
          prefix = "u";
       else if (s.startsWith("uk")==true)
          prefix = "uk";
      else if (s.startsWith("eg")==true)
          prefix = "eg";
      else if (s.startsWith("k")==true)
          prefix = "k";
       else if (s.startsWith("a")==true)
          prefix = "a";
      
     
      return prefix;
  }
  
  
  
  
  
  
  
     private final boolean begins(String s)
   {  int l = s.length();
      int o = k-l+1;
      if (o < 0) return false;
      for (int i = l; i > o; i--) if (b[o+i] != s.charAt(i)) return false;
      j = k-l;
      return true;
   }
    
}
