package leetcode1161;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalFunction {
	 public int maxLevelSum(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        
	        int smallestLevel = 0;
	        int currentLevel = 0;
	        int maxSum = Integer.MIN_VALUE;
	        
	        Queue<TreeNode> queue = new LinkedList<>();
	        
	        queue.offer(root);
	        
	        while(!queue.isEmpty()){
	            currentLevel++;
	            
	            int size = queue.size();
	            
	            int sum = 0;
	            
	            for(int i = 0; i < size; i++){
	                TreeNode current = queue.poll();
	                
	                sum += current.val;
	                
	                if(current.left != null){
	                    queue.offer(current.left);
	                }
	                
	                if(current.right != null){
	                    queue.offer(current.right);
	                }
	            }
	            
	            if(sum > maxSum){
	                maxSum = sum;
	                smallestLevel = currentLevel;
	            }
	        }
	        
	        
	        return smallestLevel;
	    }
	
}
