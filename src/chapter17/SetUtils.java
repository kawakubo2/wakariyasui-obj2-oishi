package chapter17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

enum SetType { HASH, LINKED_HASH, TREE }
public class SetUtils<E> {
    SetType type;
    public SetUtils(SetType type) {
        this.type = type;
    }
    private Set<E> createSet() throws IllegalArgumentException {
        Set<E> result;
        switch(this.type) {
            case HASH:
                result = new HashSet<E>();
                break;
            case LINKED_HASH:
                result = new LinkedHashSet<E>();
                break;
            case TREE:
                result = new TreeSet<E>();
                break;
            default:
                throw new IllegalArgumentException("存在しないSetの型です。");
        }
        return result;
    }
    public Set<E> union(Set<E> set1, Set<E> set2) throws IllegalArgumentException {
        Set<E> result = createSet();
        result.clear();
        for (E e : set1) {
            result.add(e);
        }
        for (E e : set2) {
            result.add(e);
        }
        return result;
    }
    public Set<E> intersect(Set<E> set1, Set<E> set2) throws IllegalArgumentException {
        Set<E> result = createSet();
        for (E e: set1) {
            if (set2.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }
    public Set<E> except(Set<E> set1, Set<E> set2) throws IllegalArgumentException {
        Set<E> result = createSet();
        for (E e: set1) {
            if (!set2.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
