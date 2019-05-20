package visitables;

import sun.reflect.generics.tree.Tree;
import visitors.Visitor;

import java.util.ArrayList;

public class ConcreteVisitable implements Visitable{
    private Tree t ;
    @Override
    public void accept(Visitor visitor) {
        System.out.println(visitor.visitTree(t, new ArrayList<Tree>(),0));
        System.out.println(visitor.visitPartition(t, new ArrayList<Tree>()));
    }
}
