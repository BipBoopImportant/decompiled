package eJ;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: eJ.x  reason: case insensitive filesystem */
public class C17213x extends AbstractList<String> implements RandomAccess, C17204o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17204o f143123a;

    /* renamed from: eJ.x$a */
    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f143124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f143125b;

        a(int i10) {
            this.f143125b = i10;
            this.f143124a = C17213x.this.f143123a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f143124a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f143124a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f143124a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f143124a.hasPrevious();
        }

        public int nextIndex() {
            return this.f143124a.nextIndex();
        }

        public int previousIndex() {
            return this.f143124a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: eJ.x$b */
    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f143127a;

        b() {
            this.f143127a = C17213x.this.f143123a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f143127a.next();
        }

        public boolean hasNext() {
            return this.f143127a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C17213x(C17204o oVar) {
        this.f143123a = oVar;
    }

    public C17193d b1(int i10) {
        return this.f143123a.b1(i10);
    }

    public void h1(C17193d dVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public String get(int i10) {
        return (String) this.f143123a.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public List<?> l() {
        return this.f143123a.l();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public int size() {
        return this.f143123a.size();
    }

    public C17204o w() {
        return this;
    }
}
