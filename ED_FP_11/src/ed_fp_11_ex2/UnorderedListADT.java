package ed_fp_11_ex2;

public interface UnorderedListADT<T> extends ListADT<T>{
    
    public void addToFront(T element);

    public void addToRear(T element);

    public void addAfter(T element, T atual) throws ElementDoesntExistException;
}
