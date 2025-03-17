package e;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.P;
import U0.p1;
import XH.C16807N;
import f1.C5301c;
import f1.C5309k;
import g.C5316e;
import g.C5317f;
import h.C5403a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Lh/a;", "contract", "Lkotlin/Function1;", "LXH/N;", "onResult", "Le/i;", "a", "(Lh/a;LnI/l;LU0/m;I)Le/i;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.c  reason: case insensitive filesystem */
public final class C5280c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "LU0/M;", "LU0/L;", "b", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$a */
    static final class a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5278a<I> f23144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5316e f23145d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f23146e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5403a<I, O> f23147f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<O, C16807N>> f23148g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/c$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e.c$a$a  reason: collision with other inner class name */
        public static final class C0366a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5278a f23149a;

            public C0366a(C5278a aVar) {
                this.f23149a = aVar;
            }

            public void b() {
                this.f23149a.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5278a<I> aVar, C5316e eVar, String str, C5403a<I, O> aVar2, A1<? extends C17642l<? super O, C16807N>> a12) {
            super(1);
            this.f23144c = aVar;
            this.f23145d = eVar;
            this.f23146e = str;
            this.f23147f = aVar2;
            this.f23148g = a12;
        }

        /* access modifiers changed from: private */
        public static final void c(A1 a12, Object obj) {
            ((C17642l) a12.getValue()).invoke(obj);
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            this.f23144c.b(this.f23145d.m(this.f23146e, this.f23147f, new C5279b(this.f23148g)));
            return new C0366a(this.f23144c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$b */
    static final class b extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f23150c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final <I, O> C5286i<I, O> a(C5403a<I, O> aVar, C17642l<? super O, C16807N> lVar, C4889m mVar, int i10) {
        C5403a<I, O> aVar2 = aVar;
        C4889m mVar2 = mVar;
        int i11 = i10;
        if (C4895p.J()) {
            C4895p.S(-1408504823, i11, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        A1<T> q10 = p1.q(aVar2, mVar2, i11 & 14);
        A1<T> q11 = p1.q(lVar, mVar2, (i11 >> 3) & 14);
        String str = (String) C5301c.e(new Object[0], (C5309k) null, (String) null, b.f23150c, mVar, 3072, 6);
        C5317f a10 = C5284g.f23165a.a(mVar2, 6);
        if (a10 != null) {
            C5316e activityResultRegistry = a10.getActivityResultRegistry();
            Object D10 = mVar.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                D10 = new C5278a();
                mVar2.u(D10);
            }
            C5278a aVar4 = (C5278a) D10;
            Object D11 = mVar.D();
            if (D11 == aVar3.a()) {
                D11 = new C5286i(aVar4, q10);
                mVar2.u(D11);
            }
            C5286i<I, O> iVar = (C5286i) D11;
            boolean F10 = mVar2.F(aVar4) | mVar2.F(activityResultRegistry) | mVar2.V(str) | mVar2.F(aVar2) | mVar2.V(q11);
            Object D12 = mVar.D();
            if (F10 || D12 == aVar3.a()) {
                a aVar5 = new a(aVar4, activityResultRegistry, str, aVar, q11);
                mVar2.u(aVar5);
                D12 = aVar5;
            }
            C5316e eVar = activityResultRegistry;
            String str2 = str;
            C5403a<I, O> aVar6 = aVar;
            P.a(eVar, str2, aVar6, (C17642l) D12, mVar, (i11 << 6) & 896);
            if (C4895p.J()) {
                C4895p.R();
            }
            return iVar;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
    }
}
