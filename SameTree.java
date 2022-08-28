/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
        bool SameTree(TreeNode* p, TreeNode* q) {
            for(int i = 0; i < p.val && q.val; i++){
                if(p.val != null && q.val != null){
                    return true;
                }
            return false;
            }
        }
        return SameTree(p.left, q.left) && SameTree(p.right, q.right);
    };

/*     bool SameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null ){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return SameTree(p.left, q.left) && SameTree(p.right, q.right);
    }
}; */