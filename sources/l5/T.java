package l5;

import XH.C16807N;
import YH.C16877v;
import androidx.work.C;
import androidx.work.C7032a;
import androidx.work.C7034c;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.G;
import androidx.work.H;
import androidx.work.N;
import androidx.work.Q;
import androidx.work.S;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import s5.C8716B;
import s5.C8739u;
import s5.v;
import t5.C8812g;
import t5.C8813h;
import u5.C8877a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll5/t;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/c;", "configuration", "", "Ll5/v;", "schedulers", "Ls5/u;", "newWorkSpec", "", "", "tags", "Landroidx/work/S$b;", "d", "(Ll5/t;Landroidx/work/impl/WorkDatabase;Landroidx/work/c;Ljava/util/List;Ls5/u;Ljava/util/Set;)Landroidx/work/S$b;", "Ll5/O;", "name", "Landroidx/work/T;", "workRequest", "Landroidx/work/C;", "c", "(Ll5/O;Ljava/lang/String;Landroidx/work/T;)Landroidx/work/C;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class T {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f54656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54657d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.work.T f54658e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: l5.T$a$a  reason: collision with other inner class name */
        static final class C0866a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.work.T f54659c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O f54660d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f54661e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0866a(androidx.work.T t10, O o10, String str) {
                super(0);
                this.f54659c = t10;
                this.f54660d = o10;
                this.f54661e = str;
            }

            public final void invoke() {
                C8812g.b(new C8501F(this.f54660d, this.f54661e, C7042k.KEEP, C16877v.e(this.f54659c)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O o10, String str, androidx.work.T t10) {
            super(0);
            this.f54656c = o10;
            this.f54657d = str;
            this.f54658e = t10;
        }

        public final void invoke() {
            C0866a aVar = new C0866a(this.f54658e, this.f54656c, this.f54657d);
            v f10 = this.f54656c.w().f();
            List<C8739u.b> s10 = f10.s(this.f54657d);
            if (s10.size() <= 1) {
                C8739u.b bVar = (C8739u.b) C16877v.y0(s10);
                if (bVar == null) {
                    aVar.invoke();
                    return;
                }
                C8739u i10 = f10.i(bVar.f55934a);
                if (i10 == null) {
                    throw new IllegalStateException("WorkSpec with " + bVar.f55934a + ", that matches a name \"" + this.f54657d + "\", wasn't found");
                } else if (!i10.n()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                } else if (bVar.f55935b == Q.c.CANCELLED) {
                    f10.a(bVar.f55934a);
                    aVar.invoke();
                } else {
                    C8739u e10 = C8739u.e(this.f54658e.d(), bVar.f55934a, (Q.c) null, (String) null, (String) null, (C7037f) null, (C7037f) null, 0, 0, 0, (C7036e) null, 0, (C7032a) null, 0, 0, 0, 0, false, (H) null, 0, 0, 0, 0, 0, (String) null, 16777214, (Object) null);
                    C8523t t10 = this.f54656c.t();
                    C17542s.i(t10, "processor");
                    WorkDatabase w10 = this.f54656c.w();
                    C17542s.i(w10, "workDatabase");
                    C7034c p10 = this.f54656c.p();
                    C17542s.i(p10, "configuration");
                    List<C8525v> u10 = this.f54656c.u();
                    C17542s.i(u10, "schedulers");
                    S.b unused = T.d(t10, w10, p10, u10, e10, this.f54658e.c());
                }
            } else {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls5/u;", "spec", "", "a", "(Ls5/u;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C8739u, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f54662c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C8739u uVar) {
            C17542s.j(uVar, "spec");
            return uVar.n() ? "Periodic" : "OneTime";
        }
    }

    public static final C c(O o10, String str, androidx.work.T t10) {
        C17542s.j(o10, "<this>");
        C17542s.j(str, "name");
        C17542s.j(t10, "workRequest");
        N n10 = o10.p().n();
        String str2 = "enqueueUniquePeriodic_" + str;
        C8877a c10 = o10.x().c();
        C17542s.i(c10, "workTaskExecutor.serialTaskExecutor");
        return G.c(n10, str2, c10, new a(o10, str, t10));
    }

    /* access modifiers changed from: private */
    public static final S.b d(C8523t tVar, WorkDatabase workDatabase, C7034c cVar, List<? extends C8525v> list, C8739u uVar, Set<String> set) {
        String str = uVar.f55910a;
        C8739u i10 = workDatabase.f().i(str);
        if (i10 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (i10.f55911b.b()) {
            return S.b.NOT_APPLIED;
        } else {
            if (!(i10.n() ^ uVar.n())) {
                boolean k10 = tVar.k(str);
                if (!k10) {
                    for (C8525v a10 : list) {
                        a10.a(str);
                    }
                }
                workDatabase.runInTransaction((Runnable) new S(workDatabase, i10, uVar, list, str, set, k10));
                if (!k10) {
                    androidx.work.impl.a.h(cVar, workDatabase, list);
                }
                return k10 ? S.b.APPLIED_FOR_NEXT_RUN : S.b.APPLIED_IMMEDIATELY;
            }
            b bVar = b.f54662c;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.invoke(i10)) + " Worker to " + ((String) bVar.invoke(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    /* access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, C8739u uVar, C8739u uVar2, List list, String str, Set set, boolean z10) {
        C8739u uVar3 = uVar;
        String str2 = str;
        v f10 = workDatabase.f();
        C8716B g10 = workDatabase.g();
        C8716B b10 = g10;
        v vVar = f10;
        C8739u e10 = C8739u.e(uVar2, (String) null, uVar3.f55911b, (String) null, (String) null, (C7037f) null, (C7037f) null, 0, 0, 0, (C7036e) null, uVar3.f55920k, (C7032a) null, 0, uVar3.f55923n, 0, 0, false, (H) null, uVar.i(), uVar.f() + 1, uVar.g(), uVar.h(), 0, (String) null, 12835837, (Object) null);
        if (uVar2.h() == 1) {
            e10.p(uVar2.g());
            e10.q(e10.h() + 1);
        }
        v vVar2 = vVar;
        vVar2.p(C8813h.c(list, e10));
        b10.c(str2);
        b10.d(str2, set);
        if (!z10) {
            vVar2.r(str2, -1);
            workDatabase.e().a(str2);
        }
    }
}
