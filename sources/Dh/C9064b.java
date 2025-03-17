package Dh;

import IC.C13023e;
import SC.N;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"LDh/b;", "", "LSC/N;", "variant", "LIC/e;", "text", "", "propagateClick", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "<init>", "(LSC/N;LIC/e;ZLnI/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LSC/N;", "f", "()LSC/N;", "b", "LIC/e;", "e", "()LIC/e;", "c", "Z", "d", "()Z", "LnI/l;", "()LnI/l;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.b  reason: case insensitive filesystem */
public final class C9064b {

    /* renamed from: e  reason: collision with root package name */
    public static final int f59172e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final N f59173a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f59174b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59175c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f59176d;

    public C9064b(N n10, C13023e eVar, boolean z10, C17642l<? super Integer, C16807N> lVar) {
        C17542s.j(n10, "variant");
        C17542s.j(eVar, "text");
        C17542s.j(lVar, "onClick");
        this.f59173a = n10;
        this.f59174b = eVar;
        this.f59175c = z10;
        this.f59176d = lVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N b(int i10) {
        return C16807N.f139792a;
    }

    public final C17642l<Integer, C16807N> c() {
        return this.f59176d;
    }

    public final boolean d() {
        return this.f59175c;
    }

    public final C13023e e() {
        return this.f59174b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9064b)) {
            return false;
        }
        C9064b bVar = (C9064b) obj;
        return this.f59173a == bVar.f59173a && C17542s.e(this.f59174b, bVar.f59174b) && this.f59175c == bVar.f59175c && C17542s.e(this.f59176d, bVar.f59176d);
    }

    public final N f() {
        return this.f59173a;
    }

    public int hashCode() {
        return (((((this.f59173a.hashCode() * 31) + this.f59174b.hashCode()) * 31) + Boolean.hashCode(this.f59175c)) * 31) + this.f59176d.hashCode();
    }

    public String toString() {
        N n10 = this.f59173a;
        C13023e eVar = this.f59174b;
        boolean z10 = this.f59175c;
        C17642l<Integer, C16807N> lVar = this.f59176d;
        return "ButtonConfig(variant=" + n10 + ", text=" + eVar + ", propagateClick=" + z10 + ", onClick=" + lVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9064b(SC.N r1, IC.C13023e r2, boolean r3, nI.C17642l r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0005
            r3 = 1
        L_0x0005:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x000e
            Dh.a r4 = new Dh.a
            r4.<init>()
        L_0x000e:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.C9064b.<init>(SC.N, IC.e, boolean, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
