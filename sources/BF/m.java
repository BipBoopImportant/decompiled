package bf;

import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.Comparator;
import java.util.List;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019¨\u0006("}, d2 = {"Lbf/m;", "Landroidx/lifecycle/f0;", "LSl/b;", "getMarketLinksUseCase", "<init>", "(LSl/b;)V", "", "Lbf/l;", "D", "(LdI/e;)Ljava/lang/Object;", "", "url", "LXH/N;", "G", "(Ljava/lang/String;)V", "m", "LSl/b;", "Lip/b;", "n", "Lip/b;", "_openUrl", "Landroidx/lifecycle/F;", "o", "Landroidx/lifecycle/F;", "E", "()Landroidx/lifecycle/F;", "openUrl", "Lkf/a;", "p", "_errors", "q", "C", "errors", "Landroidx/lifecycle/K;", "r", "Landroidx/lifecycle/K;", "_sections", "s", "F", "sections", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final Sl.b f65430m;

    /* renamed from: n  reason: collision with root package name */
    private final C11410b<String> f65431n;

    /* renamed from: o  reason: collision with root package name */
    private final F<String> f65432o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11410b<C9977a> f65433p;

    /* renamed from: q  reason: collision with root package name */
    private final F<C9977a> f65434q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final K<List<l>> f65435r;

    /* renamed from: s  reason: collision with root package name */
    private final F<List<l>> f65436s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.auth.help.HelpViewModel$2", f = "HelpViewModel.kt", l = {102}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f65437c;

        /* renamed from: d  reason: collision with root package name */
        int f65438d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f65439e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bf.m$a$a  reason: collision with other inner class name */
        public static final class C1149a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e(Integer.valueOf(((l) t10).b()), Integer.valueOf(((l) t11).b()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f65439e = mVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f65439e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            K k10;
            Object f10 = C17187b.f();
            int i10 = this.f65438d;
            if (i10 == 0) {
                y.b(obj);
                K j10 = this.f65439e.f65435r;
                m mVar = this.f65439e;
                this.f65437c = j10;
                this.f65438d = 1;
                Object h10 = mVar.D(this);
                if (h10 == f10) {
                    return f10;
                }
                k10 = j10;
                obj = h10;
            } else if (i10 == 1) {
                k10 = (K) this.f65437c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.postValue(C16877v.g1((Iterable) obj, new C1149a()));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65440a;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Sl.g[] r0 = Sl.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Sl.g r1 = Sl.g.AccessibilityFeedback     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Sl.g r1 = Sl.g.ChildProductRegistration     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Sl.g r1 = Sl.g.ComplaintsBook     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Sl.g r1 = Sl.g.ContactCustomerService     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Sl.g r1 = Sl.g.Imprint     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Sl.g r1 = Sl.g.SaferHome     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Sl.g r1 = Sl.g.PrivacyAndSecurity     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Sl.g r1 = Sl.g.RecallInformation     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                Sl.g r1 = Sl.g.OrderTerms     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                Sl.g r1 = Sl.g.PrivacyPolicy     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                Sl.g r1 = Sl.g.ShopAndGoTerms     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                Sl.g r1 = Sl.g.BuyGiftCards     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                Sl.g r1 = Sl.g.EULA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                Sl.g r1 = Sl.g.EnvironmentalTax     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                Sl.g r1 = Sl.g.FamilyTermsAndConditions     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                Sl.g r1 = Sl.g.GeneralTerms     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                Sl.g r1 = Sl.g.Impressum     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                f65440a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.m.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.auth.help.HelpViewModel", f = "HelpViewModel.kt", l = {120}, m = "getHelpSections")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f65441c;

        /* renamed from: d  reason: collision with root package name */
        Object f65442d;

        /* renamed from: e  reason: collision with root package name */
        Object f65443e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f65444f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f65445g;

        /* renamed from: h  reason: collision with root package name */
        int f65446h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f65445g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f65444f = obj;
            this.f65446h |= Integer.MIN_VALUE;
            return this.f65445g.D(this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"bf/m$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f65447a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, m mVar) {
            super(aVar);
            this.f65447a = mVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f65447a.f65433p.postValue(C9977a.b.f75068c);
        }
    }

    public m(Sl.b bVar) {
        C17542s.j(bVar, "getMarketLinksUseCase");
        this.f65430m = bVar;
        C11410b<String> bVar2 = new C11410b<>();
        this.f65431n = bVar2;
        this.f65432o = bVar2;
        C11410b<C9977a> bVar3 = new C11410b<>();
        this.f65433p = bVar3;
        this.f65434q = bVar3;
        K<List<l>> k10 = new K<>();
        this.f65435r = k10;
        this.f65436s = k10;
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(dI.C17164e<? super java.util.List<? extends bf.l>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof bf.m.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            bf.m$c r0 = (bf.m.c) r0
            int r1 = r0.f65446h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f65446h = r1
            goto L_0x0018
        L_0x0013:
            bf.m$c r0 = new bf.m$c
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f65444f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f65446h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r14 = r0.f65443e
            Sl.g[] r14 = (Sl.g[]) r14
            java.lang.Object r14 = r0.f65442d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f65441c
            bf.m r14 = (bf.m) r14
            XH.y.b(r1)
            goto L_0x0069
        L_0x0035:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003d:
            XH.y.b(r1)
            Sl.b r1 = r13.f65430m
            Sl.g r5 = Sl.g.AccessibilityFeedback
            Sl.g r6 = Sl.g.ComplaintsBook
            Sl.g r7 = Sl.g.ContactCustomerService
            Sl.g r8 = Sl.g.ChildProductRegistration
            Sl.g r9 = Sl.g.SaferHome
            Sl.g r10 = Sl.g.Imprint
            Sl.g r11 = Sl.g.PrivacyAndSecurity
            Sl.g r12 = Sl.g.RecallInformation
            Sl.g[] r3 = new Sl.g[]{r5, r6, r7, r8, r9, r10, r11, r12}
            TJ.g r1 = r1.a(r3)
            r0.f65441c = r13
            r0.f65442d = r14
            r0.f65443e = r3
            r0.f65446h = r4
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x0069
            return r2
        L_0x0069:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0133
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r1, r0)
            r14.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L_0x007e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0137
            java.lang.Object r1 = r0.next()
            Sl.h r1 = (Sl.h) r1
            Sl.g r2 = r1.b()
            int[] r3 = bf.m.b.f65440a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L_0x0121;
                case 2: goto L_0x0113;
                case 3: goto L_0x0105;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00e9;
                case 6: goto L_0x00db;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00bf;
                case 9: goto L_0x009f;
                case 10: goto L_0x009f;
                case 11: goto L_0x009f;
                case 12: goto L_0x009f;
                case 13: goto L_0x009f;
                case 14: goto L_0x009f;
                case 15: goto L_0x009f;
                case 16: goto L_0x009f;
                case 17: goto L_0x009f;
                default: goto L_0x0099;
            }
        L_0x0099:
            XH.t r14 = new XH.t
            r14.<init>()
            throw r14
        L_0x009f:
            XH.u r14 = new XH.u
            Sl.g r0 = r1.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LinkType "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " not implemented"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L_0x00bf:
            bf.s r2 = new bf.s
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x00cd:
            bf.r r2 = new bf.r
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x00db:
            bf.t r2 = new bf.t
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x00e9:
            bf.q r2 = new bf.q
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x00f7:
            bf.d r2 = new bf.d
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x0105:
            bf.c r2 = new bf.c
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x0113:
            bf.b r2 = new bf.b
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
            goto L_0x012e
        L_0x0121:
            bf.a r2 = new bf.a
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.a()
            r2.<init>(r3, r1)
        L_0x012e:
            r14.add(r2)
            goto L_0x007e
        L_0x0133:
            java.util.List r14 = YH.C16877v.n()
        L_0x0137:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.m.D(dI.e):java.lang.Object");
    }

    public final F<C9977a> C() {
        return this.f65434q;
    }

    public final F<String> E() {
        return this.f65432o;
    }

    public final F<List<l>> F() {
        return this.f65436s;
    }

    public final void G(String str) {
        C17542s.j(str, "url");
        if (str.length() == 0) {
            this.f65433p.postValue(C9977a.C1360a.f75067c);
        } else {
            this.f65431n.e(str);
        }
    }
}
