package r0;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.P;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr0/k;", "LU0/A1;", "", "a", "(Lr0/k;LU0/m;I)LU0/A1;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: r0.f  reason: case insensitive filesystem */
public final class C5814f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: r0.f$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f28590c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f28591d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f28592e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: r0.f$a$a  reason: collision with other inner class name */
        static final class C0449a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<C5812d> f28593a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f28594b;

            C0449a(List<C5812d> list, C4899r0<Boolean> r0Var) {
                this.f28593a = list;
                this.f28594b = r0Var;
            }

            /* renamed from: c */
            public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
                if (jVar instanceof C5812d) {
                    this.f28593a.add(jVar);
                } else if (jVar instanceof C5813e) {
                    this.f28593a.remove(((C5813e) jVar).a());
                }
                this.f28594b.setValue(b.a(!this.f28593a.isEmpty()));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f28591d = kVar;
            this.f28592e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f28591d, this.f28592e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f28590c;
            if (i10 == 0) {
                y.b(obj);
                ArrayList arrayList = new ArrayList();
                C16532g<j> c10 = this.f28591d.c();
                C0449a aVar = new C0449a(arrayList, this.f28592e);
                this.f28590c = 1;
                if (c10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final A1<Boolean> a(k kVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1805515472, i10, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && mVar.V(kVar)) || (i10 & 6) == 4;
        Object D11 = mVar.D();
        if (z10 || D11 == aVar.a()) {
            D11 = new a(kVar, r0Var, (C17164e<? super a>) null);
            mVar.u(D11);
        }
        P.g(kVar, (p) D11, mVar, i11);
        if (C4895p.J()) {
            C4895p.R();
        }
        return r0Var;
    }
}
