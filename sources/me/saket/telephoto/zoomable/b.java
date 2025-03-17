package me.saket.telephoto.zoomable;

import E1.h0;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5546i;
import pK.C17765j;
import pK.C17769n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lme/saket/telephoto/zoomable/b;", "Lme/saket/telephoto/zoomable/c;", "", "maxZoomFactor", "<init>", "(Ljava/lang/Float;)V", "LpK/n;", "state", "Lo1/g;", "centroid", "LXH/N;", "a", "(LpK/n;JLdI/e;)Ljava/lang/Object;", "b", "Ljava/lang/Float;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    private final Float f144589b;

    public b() {
        this((Float) null, 1, (DefaultConstructorMarker) null);
    }

    public Object a(C17769n nVar, long j10, C17164e<? super C16807N> eVar) {
        C17765j f10 = nVar.f();
        if (!f10.a()) {
            f10 = null;
        }
        if (f10 == null) {
            return C16807N.f139792a;
        }
        Float f11 = this.f144589b;
        float floatValue = f11 != null ? f11.floatValue() : nVar.d().a();
        if (floatValue - h0.c(f10.e()) < 0.05f) {
            Object b10 = C17769n.b(nVar, (C5546i) null, eVar, 1, (Object) null);
            return b10 == C17187b.f() ? b10 : C16807N.f139792a;
        }
        Object a10 = C17769n.a(nVar, floatValue, j10, (C5546i) null, eVar, 4, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && C17542s.e(this.f144589b, ((b) obj).f144589b);
    }

    public int hashCode() {
        Float f10 = this.f144589b;
        if (f10 == null) {
            return 0;
        }
        return f10.hashCode();
    }

    public String toString() {
        Float f10 = this.f144589b;
        return "CycleZoomOnDoubleClick(maxZoomFactor=" + f10 + ")";
    }

    public b(Float f10) {
        this.f144589b = f10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : f10);
    }
}
