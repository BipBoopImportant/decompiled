package Fp;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LFp/c;", "", "Lkotlin/Function0;", "LXH/N;", "onClicked", "<init>", "(LnI/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "c", "()LnI/a;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f81004a;

    public c() {
        this((C17631a) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N b() {
        return C16807N.f139792a;
    }

    public final C17631a<C16807N> c() {
        return this.f81004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C17542s.e(this.f81004a, ((c) obj).f81004a);
    }

    public int hashCode() {
        return this.f81004a.hashCode();
    }

    public String toString() {
        C17631a<C16807N> aVar = this.f81004a;
        return "EthicsDetailsPrivacyPolicy(onClicked=" + aVar + ")";
    }

    public c(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onClicked");
        this.f81004a = aVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(nI.C17631a r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0009
            Fp.b r1 = new Fp.b
            r1.<init>()
        L_0x0009:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fp.c.<init>(nI.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
