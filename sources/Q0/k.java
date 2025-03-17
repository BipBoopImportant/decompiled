package Q0;

import XH.C16807N;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.C5530a;
import m0.C5546i;
import m0.C5568x;
import m0.M;
import m0.y0;
import nI.C17642l;
import r0.j;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lm0/a;", "Lc2/h;", "target", "Lr0/j;", "from", "to", "LXH/N;", "d", "(Lm0/a;FLr0/j;Lr0/j;LdI/e;)Ljava/lang/Object;", "Lm0/D;", "a", "Lm0/D;", "OutgoingSpecEasing", "Lm0/y0;", "b", "Lm0/y0;", "DefaultIncomingSpec", "c", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final C5525D f12012a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final y0<h> f12013b = new y0(120, 0, M.d(), 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final y0<h> f12014c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final y0<h> f12015d;

    static {
        C5568x xVar = new C5568x(0.4f, 0.0f, 0.6f, 1.0f);
        f12012a = xVar;
        C5568x xVar2 = xVar;
        f12014c = new y0(150, 0, xVar2, 2, (DefaultConstructorMarker) null);
        f12015d = new y0(120, 0, xVar2, 2, (DefaultConstructorMarker) null);
    }

    public static final Object d(C5530a<h, ?> aVar, float f10, j jVar, j jVar2, C17164e<? super C16807N> eVar) {
        C5546i<h> a10 = jVar2 != null ? j.f12011a.a(jVar2) : jVar != null ? j.f12011a.b(jVar) : null;
        if (a10 != null) {
            Object f11 = C5530a.f(aVar, h.m(f10), a10, (Object) null, (C17642l) null, eVar, 12, (Object) null);
            return f11 == C17187b.f() ? f11 : C16807N.f139792a;
        }
        Object t10 = aVar.t(h.m(f10), eVar);
        return t10 == C17187b.f() ? t10 : C16807N.f139792a;
    }
}
