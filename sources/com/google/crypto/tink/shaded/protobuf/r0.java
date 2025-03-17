package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class r0 extends AbstractList<String> implements G, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f68085a;

    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f68086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f68087b;

        a(int i10) {
            this.f68087b = i10;
            this.f68086a = r0.this.f68085a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f68086a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f68086a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f68086a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f68086a.hasPrevious();
        }

        public int nextIndex() {
            return this.f68086a.nextIndex();
        }

        public int previousIndex() {
            return this.f68086a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f68089a;

        b() {
            this.f68089a = r0.this.f68085a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f68089a.next();
        }

        public boolean hasNext() {
            return this.f68089a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r0(G g10) {
        this.f68085a = g10;
    }

    public void O2(C9525h hVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public String get(int i10) {
        return (String) this.f68085a.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public List<?> l() {
        return this.f68085a.l();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public Object n(int i10) {
        return this.f68085a.n(i10);
    }

    public int size() {
        return this.f68085a.size();
    }

    public G w() {
        return this;
    }
}
