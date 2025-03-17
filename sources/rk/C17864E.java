package rK;

import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5589L;
import nI.p;
import nI.r;
import o1.C5667g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00052$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function4;", "", "Lo1/g;", "LXH/N;", "onTransformation", "LrK/D;", "a", "(LnI/r;)LrK/D;", "Ln0/L;", "terminationPriority", "b", "(LrK/D;Ln0/L;LdI/e;)Ljava/lang/Object;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.E  reason: case insensitive filesystem */
public final class C17864E {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrK/A;", "LXH/N;", "<anonymous>", "(LrK/A;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.TransformableStateKt$stopTransformation$2", f = "transformableState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rK.E$a */
    static final class a extends l implements p<C17860A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146731c;

        a(C17164e<? super a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17860A a10, C17164e<? super C16807N> eVar) {
            return ((a) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f146731c == 0) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final C17863D a(r<? super Float, ? super C5667g, ? super Float, ? super C5667g, C16807N> rVar) {
        C17542s.j(rVar, "onTransformation");
        return new C17870e(rVar);
    }

    public static final Object b(C17863D d10, C5589L l10, C17164e<? super C16807N> eVar) {
        Object a10 = d10.a(l10, new a((C17164e<? super a>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
