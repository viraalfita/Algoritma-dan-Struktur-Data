<div align="center">

# Algoritma dan Struktur Data

<img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" alt="Gambar" style="height: 200px">

<p>Vira Alfita Yunia</p>
<p>TI-1B</p>
<p>29</p>
<p>2341720055</p>

</div>

<hr>

## Pertemuan 13 (Tree)

### Percobaan 1

<p>Kode program</p>
<p>Node29.java</p>

    package Pertemuan13.Percobaan;

    public class Node29 {
        int data;
        Node29 left;
        Node29 right;

        public Node29() {

        }

        public Node29(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

<p>BinaryTree29.java</p>

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
    }

<p>BinaryTreeMain29.java</p>
    package Pertemuan13.Percobaan;

    public class BinaryTreeMain29 {
        public static void main(String[] args) {
        BinaryTree29 bt = new BinaryTree29();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("Preorder traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("Inorder traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("Postorder traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node: " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");

        System.out.print("Preorder traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        }
    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Percobaan 1.png">

#### Pertanyaan

<strong><p>Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?<p></strong>

<p>Karena pada binary search tree data sudah diurutkan dari kiri ke kanan sehingga proses pencarian data menjadi lebih cepat.</p>

<strong><p>Untuk apakah di class Node, kegunaan dari atribut left dan right?<p></strong>

<p>Kegunaan atribut left dan right yaitu untuk menunjukkan posisi node untuk child dari node tersebut.</p>

<strong><p>a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?<p></strong>

<p>a. Kegunaan dari atribut root adalah untuk mengetahui posisi node paling atas dari sebuah tree.</p>
<p>b. Nilai dari root saat pertama kali diinisiasi adalah null</p>

<strong><p>Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?<p></strong>

<p>Node akan dimasukkan pada root dalam tree tersebut.</p>

<strong><p>Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?
if(data<current.data){
if(current.left!=null){
current = current.left;
}else{
current.left = new Node(data);
break;
}
}

<p>
</strong>

<p>Dalam method add(), kode ini bertujuan untuk menambahkan nilai data baru ke dalam tree di tempat yang tepat, di mana setiap node kiri memiliki nilai yang lebih kecil dari node induknya, dan setiap node kanan memiliki nilai yang lebih besar.</p>

### Percobaan 2

<p>Kode program</p>
<p>BinaryTreeArray29.java</p>

    public class BinaryTreeArray29 {
        int[] data;
        int idxLast;

        public BinaryTreeArray29() {
            data = new int[10];
        }

        public void populateData(int data[], int idxLast) {
            this.data = data;
            this.idxLast = idxLast;
        }

        public void traverseInOrder(int idxStart) {
            if (idxStart <= idxLast) {
                traverseInOrder(2 * idxStart + 1);
                System.out.print(data[idxStart] + " ");
                traverseInOrder(2 * idxStart + 2);
            }
        }

    }

<p>BinaryTreeArrayMain29.java</p>

    public class BinaryTreeArrayMain29 {
        public static void main(String[] args) {
            BinaryTreeArray29 bta = new BinaryTreeArray29();
            int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
            int idxLast = 6;
            bta.populateData(data, idxLast);
            System.out.print("\nInOrder Traversal: ");
            bta.traverseInOrder(0);
            System.out.println("\n");
        }
    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Percobaan 2.png">

#### Pertanyaan

<strong><p>Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?<p></strong>

<p>data    : Array untuk menyimpan data-data pada node</p>
<p>idxLast : Variabel untuk menyimpan index pada posisi terakhir pada array</p>

<strong><p>Apakah kegunaan dari method populateData()?<p></strong>

<p>Method ini mengisi array dengan data dan mengatur indeks terakhir dengan nilai yang diberikan</p>

<strong><p>Apakah kegunaan dari method traverseInOrder()?<p></strong>

<p>Method ini berfungsi untuk menampilkan data dengan metode penelusuran In Order (Kiri - Root - Kanan)</p>

<strong><p>Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan rigth child masing-masing?<p></strong>

<p>Left child berada di posisi indeks ke 5 (2i + 1)</p>
<p>Right child berada di posisi indeks ke 6 (2i + 2)</p>

<strong><p>Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?<p></strong>

<p>Menetapkan bahwa indeks terakhir yang terisi dalam array data adalah 6 yang artinya elemen-elemen yang valid dalam array data hanya sampai indeks ke-6</p>

### Tugas

#### Binary Tree

<p>Kode program</p>
<p>BinaryTree29.java</p>

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
        } // No 1

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
        } // No 2

        public int findMax() {
            if (isEmpty()) {
                System.out.println("Tree is empty");
            }
            Node29 current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        } // No 2

        public int countLeafNodes(Node29 node) {
            if (node == null) {
                return 0;
            }
            if (node.left == null && node.right == null) {
                return 1;
            }
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        } // No 4

        public void printLeafNodes(Node29 node) {
            if (node != null) {
                if (node.left == null && node.right == null) {
                    System.out.print(node.data + " ");
                }
                printLeafNodes(node.left);
                printLeafNodes(node.right);
            }
        } // No 3

    }

<p>BinaryTreeMain29.java</p>

    package Pertemuan13.Percobaan;

    public class Main {
    public static void main(String[] args) {
    BinaryTree29 tree = new BinaryTree29();

            tree.addRecursive(50);
            tree.addRecursive(30);
            tree.addRecursive(70);
            tree.addRecursive(20);
            tree.addRecursive(40);
            tree.addRecursive(60);
            tree.addRecursive(80);

            System.out.println("Nilai paling kecil di dalam tree : " + tree.findMin());
            System.out.println("Nilai paling besar di dalam tree : " + tree.findMax());

            System.out.print("Pre-Order traversal              : ");
            tree.traversePreOrder(tree.root);
            System.out.println();

            System.out.print("In-Order traversal               : ");
            tree.traverseInOrder(tree.root);
            System.out.println();

            System.out.print("Post-Order traversal             : ");
            tree.traversePostOrder(tree.root);
            System.out.println();

            System.out.print("Leaf nodes                       : ");
            tree.printLeafNodes(tree.root);
            System.out.println();

            System.out.println("Jumlah leaf nodes                : " + tree.countLeafNodes(tree.root));
        }
    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Tugas BT.png">

#### Binary Tree Array

<p>BinaryTreeArray29.java</p>

    public class BinaryTreeArray29 {
        int[] data;
        int idxLast;

        public BinaryTreeArray29() {
            data = new int[10];
        }

        public void populateData(int data[], int idxLast) {
            this.data = data;
            this.idxLast = idxLast;
        }

        public void add(int data) {
            if (idxLast + 1 < this.data.length) {
                this.data[++idxLast] = data;
            } else {
                System.out.println("Pohon sudah penuh");
            }
        } // No 5 a

        public void traverseInOrder(int idxStart) {
            if (idxStart <= idxLast) {
                traverseInOrder(2 * idxStart + 1);
                System.out.print(data[idxStart] + " ");
                traverseInOrder(2 * idxStart + 2);
            }
        }

        public void traversePreOrder(int idxStart) {
            if (idxStart <= idxLast) {
                System.out.print(data[idxStart] + " ");
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        } // No 5 b

        public void traversePostOrder(int idxStart) {
            if (idxStart <= idxLast) {
                traversePostOrder(2 * idxStart + 1);
                traversePostOrder(2 * idxStart + 2);
                System.out.print(data[idxStart] + " ");
            }
        } // No 5 b
    }

<p>BinaryTreeArrayMain29.java</p>

    public class BinaryTreeArrayMain29 {
        public static void main(String[] args) {
            BinaryTreeArray29 bta = new BinaryTreeArray29();
            bta.add(10);
            bta.add(5);
            bta.add(15);
            bta.add(2);
            bta.add(7);
            bta.add(12);
            bta.add(20);

            System.out.print("InOrder: ");
            bta.traverseInOrder(0);
            System.out.println();

            System.out.print("PreOrder: ");
            bta.traversePreOrder(0);
            System.out.println();

            System.out.print("PostOrder: ");
            bta.traversePostOrder(0);
            System.out.println();
        }
    }

<p>Hasil ketika dijalankan</p>
<img src="gambar/Tugas BTA.png">
