import java.util.*;
import java.util.LinkedList;
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
    public static boolean isIdentical(Node node, Node subRoot){
        if(node==null && subRoot==null){
            return true;
        } else if(node==null || subRoot ==null || node.data !=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subroot);
        boolean rightAns = isSubtree(root.right, subroot);

        return leftAns || rightAns;
    }

    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void TopView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left !=null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    
    public static void KthLevel(Node root, int level, int K){
        if(root==null){
            return;
        }
        if(level==K){
            System.out.print(root.data+ " ");
            return;
        }
        KthLevel(root.left, level+1, K);
        KthLevel(root.right, level+1, K);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node LowestCommonAncestor(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //last common ancestor
        int i=0;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        //Last equal node => i-1th index
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca(Node root, int n1, int n2){
        if(root==null || root.data == n1 || root.data == n2 ){
            return root;
        }
        Node leftLca = lca(root.left,n1,n2);
        Node rightLca = lca(root.right,n1,n2);

        //leftLCA= val, rightLCA = null
        if(rightLca==null){
            return leftLca;
        }
        //rightLCA = val, rightLCA = null
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if (leftDist == -1){
            return rightDist+1;
        } else {
            return leftDist+1;
        }
    }

    public static int minDistance(Node root, int n1,int n2 ){
        Node lca = lca(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1+dist2;
    }

    public static int KAncestor(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftChild + rightChild + newRight;
        return data;
    }

    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println("Maximum Diameter of tree: "+diameter2(root).diam);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // TopView(root);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // // subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));

        // int k = 3;
        // KthLevel(root, 1, k);
        // System.out.print(lca(root,4,7).data);
        // System.out.println(minDistance(root, 4, 6));
        // KAncestor(root, 5, 2);
        transform(root);
        preOrder(root);
    }
}