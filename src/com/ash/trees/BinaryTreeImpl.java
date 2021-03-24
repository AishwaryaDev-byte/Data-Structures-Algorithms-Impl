package com.ash.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeImpl {

    Node root;

//    public BinaryTreeImpl(){
//        this.root=null;
//    }

    class Node{

        int data;
        Node left;
        Node right;

        public Node(int item){
            this.data=item;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args){

        BinaryTreeImpl bst=new BinaryTreeImpl();



        bst.insertFunction(10);
        bst.insertFunction(3);
        bst.insertFunction(9);
        bst.insertFunction(12);
        bst.insertFunction(18);
        bst.insertFunction(99);

        //System.out.println(bst.root.data);

        bst.printLeavesNoRec(bst.root);

        //bst.inOrderTraversal(bst.root);
        //bst.postOrderTraversal(bst.root);

        //bst.preOrderTraversal(bst.root);
        //bst.preOrderNoRec(bst.root);


    }

    public void insertFunction(int key){
        root=insertRec(root,key);
    }


    public Node getRoot(){
        return this.root;
    }

    /*
    * Java function to find if a binary tree is empty or not
    * Time complexity is O(1) for both best and worst case.
    *
    *@return true if BST is empty
    * */

    public boolean isEmpty(){
        return root==null;
    }

    public int size(){

        return 0;
    }

    public void printLeaves(Node root){

        if(root==null){

            return;
        }
        if(root.left==null && root.right==null){

            System.out.println(root.data);
        }
        printLeaves(root.left);
        printLeaves(root.right);

    }

    public void printLeavesNoRec(Node root){

        Stack<Node> stack=new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current=stack.pop();
            if(current.left==null && current.right==null){
                System.out.println(current.data);
            }
            if(current.right!=null){
                stack.push(current.right);
            }
            if(current.left!=null){
                stack.push(current.left);
            }
        }

    }


    public Node search(Node root, int key){
        if(root.data==key){
            return root;
        }
        else if(root.data<key){
            return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }

    /*
    * Insertion always happens at the leaf node*/
    public Node insertRec(Node r,int key){

        Node newNode=new Node(key);
        if(r==null){
            r=newNode;
            return r;
        }

        else if(r.data<key){
            r.right=insertRec(r.right,key);
        }
        else if(r.data>key){
            r.left=insertRec(r.left,key);
        }

        return r;

    }

    public void preOrderNoRec(Node root){
        Stack<Node> nodes=new Stack();

        nodes.push(root);

        while(!nodes.isEmpty()){

            Node current=nodes.pop();
            System.out.println(current.data);

            if(current.right!=null)
                nodes.push(current.right);
            if(current.left!=null)
                nodes.push(current.left);
        }

    }

    public void preOrderTraversal(Node r){

        if(r==null){
            return;
        }
        System.out.println(r.data);
        preOrderTraversal(r.left);
        preOrderTraversal(r.right);
    }

    public void inOrder(Node r){
        if(r==null){
            return;
        }
        inOrder(r.left);
        System.out.println(r.data);
        inOrder(r.right);
    }


    public List<Integer> inOrderTraversal(Node root){

        List<Integer> output_arr=new ArrayList<>();

        if(root==null){
            return output_arr;
        }

        Stack<Node> stack=new Stack<>();

        Node currNode=root;
        while (currNode!=null || !stack.isEmpty()){
            while (currNode!=null){
                stack.push(currNode);
                currNode=currNode.left;
            }

            currNode=stack.pop();
            output_arr.add(currNode.data);
            System.out.println(currNode.data);
            currNode=currNode.right;


        }

        return output_arr;
    }

    public void postOrder(Node r){
        if(r==null)
        {
            return;
        }
        postOrder(r.left);
        postOrder(r.right);
        System.out.println(r.data);
    }

    public List<Integer> postOrderTraversal(Node root){
        List<Integer> output_arr=new ArrayList();

        if(root==null){
            return output_arr;
        }
        Stack<Node> stack=new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current=stack.peek();
            if(current.left==null && current.right==null){

                Node n=stack.pop();
                output_arr.add(n.data);
                System.out.println(n.data);

            }
            if(current.right!=null){
                stack.push(current.right);
                current.right=null;
            }
            if(current.left!=null){
                stack.push(current.left);
                current.left=null;
            }
        }
        return output_arr;
    }

//
//    private Node createTree() {
//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n==-1){
//            return null;
//        }
//
//        Node newNode=new Node(n);
//
//        root=newNode;
//
//        System.out.println("Enter left child");
//
//        newNode.left=createTree();
//
//        System.out.println("Enter right child");
//
//        newNode.right=createTree();
//
//        return newNode;
//
//    }
}
