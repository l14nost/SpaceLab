package algorithm.Task2;

import java.util.*;

public class Tree {
    char value;
    Tree left;
    Tree right;

    public Tree(char value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public String recurs(){
        String res = " "+value;
        if(left!=null){
            res+= left.recurs();
        }
        if (right!=null) {
            res+=right.recurs();
        }
        return res;
    }
    public String iterDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        String res = "";
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            res += node.value;
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return res;
    }
    public String iterWide(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        String res = "";
        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            res += node.value;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return res;
    }


}
