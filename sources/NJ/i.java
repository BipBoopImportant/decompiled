package Nj;

import QJ.Q;
import XH.C16807N;
import XH.x;
import cp.e;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LNj/i;", "LNj/h;", "Lcp/e;", "uriParser", "LRy/a;", "scanAndGoSettingsRepo", "<init>", "(Lcp/e;LRy/a;)V", "Lcp/e$a;", "", "c", "(Lcp/e$a;)Z", "", "value", "a", "(Ljava/lang/String;)Z", "Lcp/e;", "b", "LRy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final e f83795a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Ry.a f83796b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.domain.usecase.ValidateUpptackaUriUseCaseImpl$isValid$1", f = "ValidateUpptackaUriUseCase.kt", l = {34}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f83797c;

        /* renamed from: d  reason: collision with root package name */
        int f83798d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.a f83799e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f83800f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e.a aVar, i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f83799e = aVar;
            this.f83800f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f83799e, this.f83800f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
            r4 = r4.p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
            if (kotlin.jvm.internal.C17542s.e(r0, r4) != false) goto L_0x0065;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r3.f83798d
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r0 = r3.f83797c
                java.lang.String r0 = (java.lang.String) r0
                XH.y.b(r4)
                goto L_0x004d
            L_0x0013:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x001b:
                XH.y.b(r4)
                java.util.regex.Pattern r4 = H2.e.f7056c
                cp.e$a r1 = r3.f83799e
                java.lang.String r1 = r1.b()
                java.util.regex.Matcher r4 = r4.matcher(r1)
                boolean r4 = r4.matches()
                if (r4 == 0) goto L_0x0064
                cp.e$a r4 = r3.f83799e
                java.lang.String r4 = r4.a()
                Nj.i r1 = r3.f83800f
                Ry.a r1 = r1.f83796b
                TJ.g r1 = r1.b()
                r3.f83797c = r4
                r3.f83798d = r2
                java.lang.Object r1 = TJ.C16534i.D(r1, r3)
                if (r1 != r0) goto L_0x004b
                return r0
            L_0x004b:
                r0 = r4
                r4 = r1
            L_0x004d:
                com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r4 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r4
                if (r4 == 0) goto L_0x005c
                com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings r4 = r4.p()
                if (r4 == 0) goto L_0x005c
                java.lang.String r4 = r4.a()
                goto L_0x005d
            L_0x005c:
                r4 = 0
            L_0x005d:
                boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r4)
                if (r4 == 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r2 = 0
            L_0x0065:
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Nj.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(e eVar, Ry.a aVar) {
        C17542s.j(eVar, "uriParser");
        C17542s.j(aVar, "scanAndGoSettingsRepo");
        this.f83795a = eVar;
        this.f83796b = aVar;
    }

    private final boolean c(e.a aVar) {
        return ((Boolean) C16312j.b((C17168i) null, new a(aVar, this, (C17164e<? super a>) null), 1, (Object) null)).booleanValue();
    }

    public boolean a(String str) {
        C17542s.j(str, "value");
        Object a10 = this.f83795a.a(str);
        if (x.e(a10) == null) {
            return c((e.a) a10);
        }
        return false;
    }
}
