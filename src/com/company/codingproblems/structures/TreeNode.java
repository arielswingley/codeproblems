package com.company.codingproblems.structures;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int _val){
        this.val = _val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int _val, TreeNode _left, TreeNode _right){
        this.val = _val;
        this.left = _left;
        this.right = _right;
    }

}
