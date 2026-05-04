package BinarySearchTree;
import java.util.*;


public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            //left subtree
            root.left = insert(root.left, data);
        }else{
            //right subtree
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root==null) return false;
        if(root.data==key) return true;
        if(root.data>key){ 
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node findInroderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right = delete(root.right, val);
        } else if(root.data > val){
            root.left = delete(root.left, val);
        } else{
            //case 1: Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2: Single Child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            //Case 3: Both Children
            Node IS = findInroderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data >=k1 && root.data <=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1){
            printInRange(root.left, k1, k2);
        } else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right==null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1); 
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        } else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static Node SortedArrayToBST(int arr[], int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = SortedArrayToBST(arr, start, mid-1);
        root.right = SortedArrayToBST(arr, mid+1, end);
        return root;
    }

    public static void getInOrder(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }
    public static Node createBalanceBST(ArrayList<Integer> inorder, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBalanceBST(inorder, start, mid-1);
        root.right = createBalanceBST(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root){
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);
        //sorted inorder -> balance BST
        return createBalanceBST(inorder, 0, inorder.size()-1);
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo =largestBST(root.left);
        Info rightInfo =largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        if(root.data <=leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size,min,max);
        }
        return new Info(false, size, min, max);
    }

    public static Node mergeBSTs(Node root1, Node root2){
        //Step 1: Get Inorder for root1
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInOrder(root1, inorder1);

        //Step 2: Get Inorder for root2
        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInOrder(root2, inorder2);

        // Step 3: Merge
        int i=0,j=0;
        ArrayList<Integer> finalInorder = new ArrayList<>();
        while(i<inorder1.size() && j<inorder2.size()){
            if(inorder1.get(i)<=inorder2.get(j)){
                finalInorder.add(inorder1.get(i++));
            } else{
                finalInorder.add(inorder2.get(j++));
            }
        }

        while(i<inorder1.size()){
            finalInorder.add(inorder1.get(i++));
        }

        while(j<inorder2.size()){
            finalInorder.add(inorder2.get(j++));
        }
        return createBalanceBST(finalInorder, 0, finalInorder.size()-1);
    }

    public static void main(String args[]){

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
