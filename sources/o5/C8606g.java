package o5;

import QJ.C16283A;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.C7055y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import s5.C8739u;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lo5/f;", "Ls5/u;", "spec", "LQJ/M;", "dispatcher", "Lo5/e;", "listener", "LQJ/F0;", "d", "(Lo5/f;Ls5/u;LQJ/M;Lo5/e;)LQJ/F0;", "Landroid/content/Context;", "context", "Lo5/c;", "a", "(Landroid/content/Context;)Lo5/c;", "", "Ljava/lang/String;", "TAG", "", "b", "J", "DefaultNetworkRequestTimeoutMs", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o5.g  reason: case insensitive filesystem */
public final class C8606g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f55241a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f55242b = 1000;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: o5.g$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f55243c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8605f f55244d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8739u f55245e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8604e f55246f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo5/b;", "it", "LXH/N;", "c", "(Lo5/b;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o5.g$a$a  reason: collision with other inner class name */
        static final class C0885a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C8604e f55247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C8739u f55248b;

            C0885a(C8604e eVar, C8739u uVar) {
                this.f55247a = eVar;
                this.f55248b = uVar;
            }

            /* renamed from: c */
            public final Object emit(C8601b bVar, C17164e<? super C16807N> eVar) {
                this.f55247a.d(this.f55248b, bVar);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8605f fVar, C8739u uVar, C8604e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f55244d = fVar;
            this.f55245e = uVar;
            this.f55246f = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f55244d, this.f55245e, this.f55246f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f55243c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<C8601b> b10 = this.f55244d.b(this.f55245e);
                C0885a aVar = new C0885a(this.f55246f, this.f55245e);
                this.f55243c = 1;
                if (b10.collect(aVar, this) == f10) {
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

    static {
        String i10 = C7055y.i("WorkConstraintsTracker");
        C17542s.i(i10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f55241a = i10;
    }

    public static final C8602c a(Context context) {
        C17542s.j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new C8602c((ConnectivityManager) systemService, 0, 2, (DefaultConstructorMarker) null);
    }

    public static final F0 d(C8605f fVar, C8739u uVar, M m10, C8604e eVar) {
        C17542s.j(fVar, "<this>");
        C17542s.j(uVar, "spec");
        C17542s.j(m10, "dispatcher");
        C17542s.j(eVar, "listener");
        C16283A b10 = J0.b((F0) null, 1, (Object) null);
        F0 unused = C16314k.d(S.a(m10.plus(b10)), (C17168i) null, (T) null, new a(fVar, uVar, eVar, (C17164e<? super a>) null), 3, (Object) null);
        return b10;
    }
}
