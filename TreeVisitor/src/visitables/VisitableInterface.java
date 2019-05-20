package visitables;

import visitors.Visitor;

public interface VisitableInterface {
    public void accept(Visitor visitor);
}
