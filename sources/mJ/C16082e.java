package MJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u0012\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"LMJ/e;", "K", "V", "T", "", "LMJ/t;", "node", "", "LMJ/u;", "path", "<init>", "(LMJ/t;[LMJ/u;)V", "", "pathIndex", "i", "(I)I", "LXH/N;", "f", "()V", "c", "d", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "a", "[LMJ/u;", "h", "()[LMJ/u;", "b", "I", "getPathLastIndex", "()I", "k", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.e  reason: case insensitive filesystem */
public abstract class C16082e<K, V, T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final u<K, V, T>[] f136419a;

    /* renamed from: b  reason: collision with root package name */
    private int f136420b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f136421c = true;

    public C16082e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        C17542s.j(tVar, "node");
        C17542s.j(uVarArr, "path");
        this.f136419a = uVarArr;
        uVarArr[0].n(tVar.m(), tVar.i() * 2);
        this.f136420b = 0;
        f();
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (!this.f136419a[this.f136420b].i()) {
            for (int i10 = this.f136420b; -1 < i10; i10--) {
                int i11 = i(i10);
                if (i11 == -1 && this.f136419a[i10].k()) {
                    this.f136419a[i10].m();
                    i11 = i(i10);
                }
                if (i11 != -1) {
                    this.f136420b = i11;
                    return;
                }
                if (i10 > 0) {
                    this.f136419a[i10 - 1].m();
                }
                this.f136419a[i10].n(t.f136443e.a().m(), 0);
            }
            this.f136421c = false;
        }
    }

    private final int i(int i10) {
        if (this.f136419a[i10].i()) {
            return i10;
        }
        if (!this.f136419a[i10].k()) {
            return -1;
        }
        t<? extends K, ? extends V> d10 = this.f136419a[i10].d();
        if (i10 == 6) {
            this.f136419a[i10 + 1].n(d10.m(), d10.m().length);
        } else {
            this.f136419a[i10 + 1].n(d10.m(), d10.i() * 2);
        }
        return i(i10 + 1);
    }

    /* access modifiers changed from: protected */
    public final K d() {
        c();
        return this.f136419a[this.f136420b].c();
    }

    /* access modifiers changed from: protected */
    public final u<K, V, T>[] h() {
        return this.f136419a;
    }

    public boolean hasNext() {
        return this.f136421c;
    }

    /* access modifiers changed from: protected */
    public final void k(int i10) {
        this.f136420b = i10;
    }

    public T next() {
        c();
        T next = this.f136419a[this.f136420b].next();
        f();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
