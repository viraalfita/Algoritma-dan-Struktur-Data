package Pertemuan13.Percobaan;

public class BinaryTree29 {
    Node29 root;

    public BinaryTree29() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node29(data);
        } else {
            Node29 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node29(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node29(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    System.out.println("Data already exists");
                    break;
                }
            }
        }
    }

    public void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    private Node29 addRecursive(Node29 current, int data) {
        if (current == null) {
            return new Node29(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            System.out.println("Data already exists");
            return current;
        }

        return current;
    }

    public boolean find(int data) {
        Node29 current = root;
        while (current != null) {
            if (data == current.data) {
                return true;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public void traversePreOrder(Node29 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node29 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void traverseInOrder(Node29 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public Node29 getSuccessor(Node29 del) {
        Node29 successorParent = del;
        Node29 successor = del.right;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        Node29 current = root;
        Node29 parent = root;
        boolean isLeftChild = true;
        while (current.data != data) {
            parent = current;
            if (data < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node29 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    public int findMin() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node29 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node29 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public int countLeafNodes(Node29 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public void printLeafNodes(Node29 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

}
