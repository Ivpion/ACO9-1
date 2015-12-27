package ua.artcode.algo.data_structure.tree;

import ua.artcode.algo.data_structure.common.MyMap;

import java.util.Comparator;

/**
 * Created by serhii on 27.12.15.
 */
public class MyBST<K, V> implements MyMap<K, V> {

    private TreeNode<K, V> root;
    private int size;

    private Comparator<K> comparator;

    public MyBST(Comparator<K> comparator) {
        this.comparator = comparator;
    }

    @Override
    public V put(K key, V value) {
        if (root == null) {
            root = new TreeNode<>(key, value, null, null, null);
        } else {
            TreeNode<K, V> iter = root;
            while (iter != null) {
                int compareRes = comparator.compare(key, iter.key);

                if (compareRes < 0) {
                    if (iter.left == null) {
                        iter.left = new TreeNode<>(key, value, root, null, null);
                        break;
                    } else {
                        //repeat action (recursion)
                        iter = iter.left;
                    }
                } else if (compareRes > 0) {
                    if (iter.right == null) {
                        iter.right = new TreeNode<>(key, value, root, null, null);
                        break;
                    } else {
                        //repeat action (recursion)
                        iter = iter.right;
                    }
                } else {
                    V old = iter.value;
                    iter.value = value;
                    size++;
                    return old;
                }

            }
        }

        size++;
        return null;
    }

    @Override
    public V get(K key) {

        TreeNode<K, V> found = find(root, key);

        return found != null ? found.value : null;
    }

    @Override
    public boolean containsKey(K key) {

        TreeNode<K, V> found = find(root, key);

        return found != null;
    }

    private TreeNode<K, V> find(TreeNode<K, V> iter, K key) {
        if (iter == null) {
            return null;
        }

        int compareRes = comparator.compare(key, iter.key);

        if (compareRes < 0) {
            return find(iter.left, key);
        } else if (compareRes > 0) {
            return find(iter.right, key);
        } else {
            return iter;
        }

        /*return compareRes < 0 ? find(iter.left, key) :
                                    compareRes > 0 ?
                                                find(iter.right, key) : iter;*/
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return traverse(root);
    }

    private String traverse(TreeNode<K, V> iter) {
        if (iter == null) {
            return "";
        }

        String left = traverse(iter.left);
        String own = iter.toString() + "->";
        String right = traverse(iter.right);

        return left + own + right;
    }

    private static class TreeNode<K, V> {

        K key;
        V value;

        TreeNode<K, V> parent;
        TreeNode<K, V> left;
        TreeNode<K, V> right;

        public TreeNode(K key, V value, TreeNode<K, V> parent,
                        TreeNode<K, V> left, TreeNode<K, V> right) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

}
