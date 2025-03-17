package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.n2  reason: case insensitive filesystem */
final class C7519n2 implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f49359a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f49360b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o2 f49361c;

    C7519n2(o2 o2Var, int i10) {
        this.f49361c = o2Var;
        this.f49360b = i10;
        this.f49359a = o2Var.f49362a.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f49359a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f49359a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f49359a.next();
    }

    public final int nextIndex() {
        return this.f49359a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f49359a.previous();
    }

    public final int previousIndex() {
        return this.f49359a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
