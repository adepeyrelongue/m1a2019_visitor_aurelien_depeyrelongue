package visitors;

import sun.reflect.generics.tree.Tree;

import java.util.List;

public interface Visitor {
    public Tree visitTree (Tree t, List<Tree> trees, int i);
    public DuoTree visitPartition(Tree t, List<Tree> trees);
}
