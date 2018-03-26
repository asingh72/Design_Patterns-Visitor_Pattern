
package fileVisitors.visitor;

import fileVisitors.AVLTree.AVLNode;
import fileVisitors.AVLTree.AVLTreeBuilder;
import fileVisitors.util.PalindromeCheck;


public class PalindromeHighlight implements VisitorI {

  
  PalindromeCheck pc;
  
  public PalindromeHighlight(PalindromeCheck pcIn)
  {
      pc=pcIn;
      
  }
    

    @Override
    public void visit(AVLTreeBuilder tree) {
        
        
        pc.checkPalimdrome(tree.root);
        
        
        
        
    }
    
}
