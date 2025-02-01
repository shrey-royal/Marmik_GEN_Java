public class StringClasses {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Bhaji");
        
        System.out.println(str.capacity());
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}

/*
StringBuffer class is used to create mutable String objects.
Thread Safe (multiple thread can't access it simultaneously)

default capacity: 16

append(String s)
insert(int offset, String s)
replace(int startindex, int endindex, String s)
delete(int startindex, int endindex)
reverse()
capacity() - new cpaacity will be allocated to the string acc. to ((oldCapacity*2) + 2)
ensureCapacity(int minimumCapacity)
charAt(int index)
length()
substring(int beginIndex)
substring(int beginIndex, int endIndex)

*/