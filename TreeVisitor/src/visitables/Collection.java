package visitables;

import visitables.ConcreteVisitable;
import visitors.Visitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection<VisitableInterface>  {
    private List<VisitableInterface> list;

    public Collection() {
       list = new ArrayList<VisitableInterface>();
    }

    public void accept(Visitor visitor){
        VisitableInterface test = (VisitableInterface) new ConcreteVisitable();
        test.acc bept(visitor);
    }


}
