package Collections;

import java.util.Collection;
import java.util.Iterator;

public class SafeIterator {
    public Collection collection;
    public Iterator iterator;
    public SafeIterator(Collection collection){
        synchronized(collection){
            for(Object obj : collection)
                this.collection.add(obj);
        }
        iterator = this.collection.iterator();
    }
    
    
    public boolean hasNext(){
        return this.iterator.hasNext();
    }
    
    public Object next(){
        return this.iterator.next();
    }
}
