import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode (int d){
        data=d;
        left=null;
        right=null;
    }
}

class binarysearch
{
    TreeNode root =null;
    void insert(int d){
        root=insert(root,d);
    }
    TreeNode insert(TreeNode curr,int d){
      if(curr==null){
          TreeNode node=new TreeNode(d);
          return node;
      }  
      if(curr.data>d){
          curr.left=insert(curr.left,d);
      }
      else{
           curr.right=insert(curr.right,d);
      }
      return curr;
    }
       
       void pre_order(){
           pre_order(root);
       } 
       
       void pre_order(TreeNode curr){
           if(curr==null){
               return;
           }
           System.out.println(curr.data+" ");
           pre_order(curr.left);
           pre_order(curr.right);
       }
       
        void post_order(){
           post_order(root);
       } 
       
       void post_order(TreeNode curr){
           if(curr==null){
               return;
           }
           
           post_order(curr.left);
           post_order(curr.right);
           System.out.println(curr.data+" ");
       }
    
     void in_order(){
           in_order(root);
       } 
       
       void in_order(TreeNode curr){
           if(curr==null){
               return;
           }
           
           in_order(curr.left);
           System.out.println(curr.data+" ");
           in_order(curr.right);
           
       } 
       
        boolean search(int key) {
            return search(key, root);
        }
        boolean search(int key,TreeNode curr){
            if(curr==null){
               return false;
            } 
            else if(curr.data==key){
               return true;
            }
           else if(key<curr.data)
           {
               System.out.print(curr.data+"->");
               return search(key,curr.left);
           }else {
                System.out.print(curr.data+"->");
               return search(key,curr.right);
           }
       }
       
       void level_order(){
           Queue<TreeNode>que=new linkedlist<>();
           que.offer(root);
           while(!que.isEmpty()){
               TreeNode curr=que.remove();
               System.out.println(curr.data+" ");
               if(curr.left!=null){
                   que.offer(curr.left);
               }if(curr.right!=null){
                   que.offer(curr.right);
               }
           }
       }
}
    
    



public class binarysearchtree
{
	public static void main(String[] args) {
	binarysearch bst=new binarysearch();
	bst.insert(40);
	bst.insert(20);
	bst.insert(30);
    bst.insert(70);
	bst.insert(10);
	bst.insert(50);
	bst.insert(60);
	System.out.println(" ");
	bst.pre_order();
	System.out.println(" ");
	bst.post_order();
	System.out.println(" ");
	bst.in_order();
	System.out.println(bst.search(50));
	bst.level_order();
	
	}
}

