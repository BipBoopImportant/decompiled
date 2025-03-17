package Dh;

import U0.C4889m;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"LDh/D;", "", "", "pageIndex", "", "LDh/b;", "buttons", "Lkotlin/Function0;", "LXH/N;", "onPageShown", "content", "<init>", "(ILjava/util/List;LnI/a;LnI/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "LnI/a;", "e", "()LnI/a;", "d", "LnI/p;", "()LnI/p;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D {

    /* renamed from: e  reason: collision with root package name */
    public static final int f59167e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f59168a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C9064b> f59169b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f59170c;

    /* renamed from: d  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f59171d;

    public D(int i10, List<C9064b> list, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        C17542s.j(list, "buttons");
        C17542s.j(aVar, "onPageShown");
        C17542s.j(pVar, "content");
        this.f59168a = i10;
        this.f59169b = list;
        this.f59170c = aVar;
        this.f59171d = pVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N b() {
        return C16807N.f139792a;
    }

    public final List<C9064b> c() {
        return this.f59169b;
    }

    public final p<C4889m, Integer, C16807N> d() {
        return this.f59171d;
    }

    public final C17631a<C16807N> e() {
        return this.f59170c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f59168a == d10.f59168a && C17542s.e(this.f59169b, d10.f59169b) && C17542s.e(this.f59170c, d10.f59170c) && C17542s.e(this.f59171d, d10.f59171d);
    }

    public final int f() {
        return this.f59168a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f59168a) * 31) + this.f59169b.hashCode()) * 31) + this.f59170c.hashCode()) * 31) + this.f59171d.hashCode();
    }

    public String toString() {
        int i10 = this.f59168a;
        List<C9064b> list = this.f59169b;
        C17631a<C16807N> aVar = this.f59170c;
        p<C4889m, Integer, C16807N> pVar = this.f59171d;
        return "PageData(pageIndex=" + i10 + ", buttons=" + list + ", onPageShown=" + aVar + ", content=" + pVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ D(int r1, java.util.List r2, nI.C17631a r3, nI.p r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0005
            r1 = 0
        L_0x0005:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x000e
            Dh.C r3 = new Dh.C
            r3.<init>()
        L_0x000e:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.D.<init>(int, java.util.List, nI.a, nI.p, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
