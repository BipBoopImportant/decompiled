package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

public class BasicMarker implements Marker {
    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = -2849567615646933777L;
    private final String name;
    private List<Marker> referenceList = new CopyOnWriteArrayList();

    BasicMarker(String str) {
        if (str != null) {
            this.name = str;
            return;
        }
        throw new IllegalArgumentException("A marker name cannot be null");
    }

    public void add(Marker marker) {
        if (marker == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        } else if (!contains(marker) && !marker.contains((Marker) this)) {
            this.referenceList.add(marker);
        }
    }

    public boolean contains(Marker marker) {
        if (marker == null) {
            throw new IllegalArgumentException("Other cannot be null");
        } else if (equals(marker)) {
            return true;
        } else {
            if (!hasReferences()) {
                return false;
            }
            for (Marker contains : this.referenceList) {
                if (contains.contains(marker)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Marker)) {
            return this.name.equals(((Marker) obj).getName());
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasChildren() {
        return hasReferences();
    }

    public boolean hasReferences() {
        return this.referenceList.size() > 0;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public Iterator<Marker> iterator() {
        return this.referenceList.iterator();
    }

    public boolean remove(Marker marker) {
        return this.referenceList.remove(marker);
    }

    public String toString() {
        if (!hasReferences()) {
            return getName();
        }
        Iterator<Marker> it = iterator();
        StringBuilder sb2 = new StringBuilder(getName());
        sb2.append(' ');
        sb2.append(OPEN);
        while (it.hasNext()) {
            sb2.append(it.next().getName());
            if (it.hasNext()) {
                sb2.append(SEP);
            }
        }
        sb2.append(CLOSE);
        return sb2.toString();
    }

    public boolean contains(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        } else if (this.name.equals(str)) {
            return true;
        } else {
            if (!hasReferences()) {
                return false;
            }
            for (Marker contains : this.referenceList) {
                if (contains.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
