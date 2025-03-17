package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public class r0 extends AbstractList<String> implements G, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f69376a;

    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f69377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f69378b;

        a(int i10) {
            this.f69378b = i10;
            this.f69377a = r0.this.f69376a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f69377a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f69377a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f69377a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f69377a.hasPrevious();
        }

        public int nextIndex() {
            return this.f69377a.nextIndex();
        }

        public int previousIndex() {
            return this.f69377a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f69380a;

        b() {
            this.f69380a = r0.this.f69376a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f69380a.next();
        }

        public boolean hasNext() {
            return this.f69380a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r0(G g10) {
        this.f69376a = g10;
    }

    public void f0(C9575h hVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public String get(int i10) {
        return (String) this.f69376a.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public List<?> l() {
        return this.f69376a.l();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public Object n(int i10) {
        return this.f69376a.n(i10);
    }

    public int size() {
        return this.f69376a.size();
    }

    public G w() {
        return this;
    }
}
