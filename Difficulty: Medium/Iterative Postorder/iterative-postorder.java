//{ Driver Code Starts
// Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> res = g.postOrder(root);
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.print("\n");
            t--;
        
System.out.println("~");
}
    }
}

// Position this line where user code will be pasted.

// } Driver Code Ends


// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    Node root;
    int num;
    Pair(Node root, int num){
        this.root=root; this.num=num;
    }
}

class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        //ArrayList<Integer> preorder = new ArrayList<>();
        //ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node,1));
        while(!st.isEmpty()){
            Node curr = st.peek().root;
            int num = st.peek().num;
            st.pop();
            if(num==1){
                num++;
                //st.pop();
                st.push(new Pair(curr,num));
                //preorder.add(curr.data);
                if(curr.left!=null) st.push(new Pair(curr.left,1));
            }
            else if(num==2){
                num++;
                //st.pop();
                st.push(new Pair(curr,num));
                //inorder.add(curr.data);
                if(curr.right!=null)st.push(new Pair(curr.right,1));
            }
            else if(num==3){
                //st.pop();
                postorder.add(curr.data);
            }
        }
        //System.out.println("PREORDER " + preorder);
        //System.out.println("INORDER " + inorder);
        //System.out.println("POSTORDER "+ postorder);
        return postorder;
    }
}