package com.company.codingproblems;

import com.company.codingproblems.structures.TreeNode;

public class BalancedTreeSolution {

    public Boolean isBalanced(TreeNode root){
        if(root != null){
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if(Math.abs(left - right) > 1){
                return false;
            } else if(!isBalanced(root.right)){
                return false;
            } else if(!isBalanced(root.left)){
                return false;
            }
        }
        return true;
    }

    private int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return 1 + Math.max(left, right);
    }



}
