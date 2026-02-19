import java.util.*;
class TreeConstruction{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;   
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int myHeight = Math.max(leftHeight, rightHeight)+1;
        return myHeight;
    }
    public static int DiameterOftree(Node root){ //O(N^2)
        if(root==null){
            return 0;
        }
        int diam1 = DiameterOftree(root.left);
        int diam2 =  DiameterOftree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) +1;
        return Math.max(diam1, Math.max(diam2, diam3));
    }
    static class treeinfo{
        int ht;
        int diam;
        treeinfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static treeinfo diameter2(Node root){
        if(root==null){
            return new treeinfo(0, 0);
        }
        treeinfo left = diameter2(root.left);
        treeinfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht, right.ht)+1;
        int myDiam = Math.max(left.ht+right.ht+1, Math.max(left.diam, right.diam));
        treeinfo myInfo = new treeinfo(myHeight, myDiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Maximum Diameter of tree: "+diameter2(root).diam);
        

    }
}