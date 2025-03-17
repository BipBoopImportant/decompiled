package androidx.compose.ui.platform;

import U0.C4884j0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(LnI/l;LdI/e;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.q0  reason: case insensitive filesystem */
public final class C5128q0 {

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.q0$a */
    static final class a extends l implements C17642l<C17164e<? super R>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19558c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Long, R> f19559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Long, ? extends R> lVar, C17164e<? super a> eVar) {
            super(1, eVar);
            this.f19559d = lVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new a(this.f19559d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super R> eVar) {
            return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19558c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<Long, R> lVar = this.f19559d;
                this.f19558c = 1;
                obj = C4884j0.c(lVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final <R> Object a(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        C5126p0 p0Var = (C5126p0) eVar.getContext().get(C5126p0.f19555h0);
        return p0Var == null ? C4884j0.c(lVar, eVar) : p0Var.w(new a(lVar, (C17164e<? super a>) null), eVar);
    }
}
