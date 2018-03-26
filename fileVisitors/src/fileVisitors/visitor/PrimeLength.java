
package fileVisitors.visitor;

import fileVisitors.AVLTree.AVLNode;
import fileVisitors.AVLTree.AVLTreeBuilder;
import fileVisitors.util.PrimeLengthCheck;


public class PrimeLength implements VisitorI{

   PrimeLengthCheck plc;
 
   public PrimeLength(PrimeLengthCheck plIn)
   {
       plc=plIn;
   }

    @Override
    public void visit(AVLTreeBuilder tree) {
        
        
         plc.checkPrimeLength(tree.root); 
    }
     
    
    
    
    
    
    
}
