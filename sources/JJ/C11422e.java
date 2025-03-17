package jj;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Ljj/e;", "Ljj/d;", "", "max", "<init>", "(I)V", "b", "()I", "", "c", "()Z", "LXH/N;", "a", "()V", "I", "getMax", "count", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jj.e  reason: case insensitive filesystem */
public final class C11422e implements C11421d {

    /* renamed from: a  reason: collision with root package name */
    private final int f98574a;

    /* renamed from: b  reason: collision with root package name */
    private int f98575b;

    public C11422e(int i10) {
        this.f98574a = i10;
    }

    public void a() {
        this.f98575b = 0;
    }

    public int b() {
        int i10 = this.f98575b + 1;
        this.f98575b = i10;
        return i10;
    }

    public boolean c() {
        return this.f98575b >= this.f98574a;
    }
}
