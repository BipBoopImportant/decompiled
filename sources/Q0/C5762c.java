package q0;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import m0.C5552l;
import m0.C5554m;
import m0.C5570z;
import nI.C17642l;
import p0.C5678A;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq0/c;", "Lq0/b;", "", "Lm0/m;", "Lm0/z;", "decayAnimationSpec", "<init>", "(Lm0/z;)V", "Lp0/A;", "scope", "offset", "velocity", "Lkotlin/Function1;", "LXH/N;", "onAnimationStep", "Lq0/a;", "b", "(Lp0/A;FFLnI/l;LdI/e;)Ljava/lang/Object;", "a", "Lm0/z;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q0.c  reason: case insensitive filesystem */
final class C5762c implements C5761b<Float, C5554m> {

    /* renamed from: a  reason: collision with root package name */
    private final C5570z<Float> f27596a;

    public C5762c(C5570z<Float> zVar) {
        this.f27596a = zVar;
    }

    public /* bridge */ /* synthetic */ Object a(C5678A a10, Object obj, Object obj2, C17642l lVar, C17164e eVar) {
        return b(a10, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar, eVar);
    }

    public Object b(C5678A a10, float f10, float f11, C17642l<? super Float, C16807N> lVar, C17164e<? super C5760a<Float, C5554m>> eVar) {
        Object a11 = C5768i.f(a10, f10, C5552l.c(0.0f, f11, 0, 0, false, 28, (Object) null), this.f27596a, lVar, eVar);
        return a11 == C17187b.f() ? a11 : (C5760a) a11;
    }
}
