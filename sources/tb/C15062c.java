package tB;

import O0.J0;
import O0.L0;
import O0.N0;
import QJ.Q;
import U0.C4889m;
import U0.L;
import U0.M;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import sB.C15035a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LO0/L0;", "snackbarHostState", "LsB/a;", "action", "Lkotlin/Function1;", "", "LXH/N;", "onOpenListClicked", "Lkotlin/Function0;", "onDismissed", "", "showOpenListAction", "c", "(LO0/L0;LsB/a;LnI/l;LnI/a;ZLU0/m;II)V", "listpicker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tB.c  reason: case insensitive filesystem */
public final class C15062c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.ui.ListModifiedSnackbarKt$ListModifiedSnackbar$2$1", f = "ListModifiedSnackbar.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: tB.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f131058c;

        /* renamed from: d  reason: collision with root package name */
        Object f131059d;

        /* renamed from: e  reason: collision with root package name */
        Object f131060e;

        /* renamed from: f  reason: collision with root package name */
        Object f131061f;

        /* renamed from: g  reason: collision with root package name */
        Object f131062g;

        /* renamed from: h  reason: collision with root package name */
        Object f131063h;

        /* renamed from: i  reason: collision with root package name */
        Object f131064i;

        /* renamed from: j  reason: collision with root package name */
        int f131065j;

        /* renamed from: k  reason: collision with root package name */
        int f131066k;

        /* renamed from: l  reason: collision with root package name */
        int f131067l;

        /* renamed from: m  reason: collision with root package name */
        boolean f131068m;

        /* renamed from: n  reason: collision with root package name */
        int f131069n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C15035a f131070o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Context f131071p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ L0 f131072q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f131073r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f131074s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f131075t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tB.c$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3242a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f131076a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f131077b;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
            static {
                /*
                    sB.a$a[] r0 = sB.C15035a.C3239a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    sB.a$a r2 = sB.C15035a.C3239a.ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    sB.a$a r3 = sB.C15035a.C3239a.REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f131076a = r0
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r3 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x002a }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
                L_0x002a:
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0032 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
                L_0x0032:
                    f131077b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tB.C15062c.a.C3242a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15035a aVar, Context context, L0 l02, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar, boolean z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f131070o = aVar;
            this.f131071p = context;
            this.f131072q = l02;
            this.f131073r = aVar2;
            this.f131074s = lVar;
            this.f131075t = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f131070o, this.f131071p, this.f131072q, this.f131073r, this.f131074s, this.f131075t, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            v vVar;
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f131069n;
            if (i10 == 0) {
                y.b(obj);
                C15035a aVar = this.f131070o;
                C15035a.C3239a a10 = aVar != null ? aVar.a() : null;
                int i11 = a10 == null ? -1 : C3242a.f131076a[a10.ordinal()];
                if (i11 == -1) {
                    return C16807N.f139792a;
                }
                if (i11 == 1) {
                    vVar = new v(kotlin.coroutines.jvm.internal.b.e(Oo.b.f84517U), kotlin.coroutines.jvm.internal.b.e(Oo.b.f84324A6));
                } else if (i11 == 2) {
                    vVar = new v(kotlin.coroutines.jvm.internal.b.e(Oo.b.f84848y8), kotlin.coroutines.jvm.internal.b.e(Oo.b.f84858z8));
                } else {
                    throw new t();
                }
                int intValue = ((Number) vVar.a()).intValue();
                int intValue2 = ((Number) vVar.b()).intValue();
                String d10 = this.f131070o.d();
                if (d10 == null || d10.length() == 0 || this.f131070o.c().length() == 0) {
                    str = this.f131071p.getString(intValue2);
                } else {
                    String c10 = this.f131070o.c();
                    str = this.f131071p.getString(intValue, new Object[]{this.f131070o.d(), "\"" + c10 + "\""});
                }
                C17542s.g(str);
                J0 j02 = J0.Short;
                String string = this.f131071p.getString(Oo.b.f84527V);
                boolean z10 = this.f131075t;
                String str2 = z10 ? string : null;
                L0 l02 = this.f131072q;
                this.f131058c = vVar;
                this.f131059d = str;
                this.f131060e = str;
                this.f131061f = j02;
                this.f131062g = str2;
                this.f131063h = string;
                this.f131064i = string;
                this.f131065j = intValue;
                this.f131066k = intValue2;
                this.f131068m = z10;
                this.f131067l = 0;
                this.f131069n = 1;
                obj2 = L0.f(l02, str, str2, false, j02, this, 4, (Object) null);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str3 = (String) this.f131064i;
                String str4 = (String) this.f131063h;
                String str5 = (String) this.f131062g;
                J0 j03 = (J0) this.f131061f;
                String str6 = (String) this.f131060e;
                String str7 = (String) this.f131059d;
                v vVar2 = (v) this.f131058c;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = C3242a.f131077b[((N0) obj2).ordinal()];
            if (i12 == 1) {
                this.f131073r.invoke();
            } else if (i12 == 2) {
                C17642l<String, C16807N> lVar = this.f131074s;
                if (lVar != null) {
                    lVar.invoke(this.f131070o.b());
                }
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tB/c$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tB.c$b */
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f131078a;

        public b(C17631a aVar) {
            this.f131078a = aVar;
        }

        public void b() {
            this.f131078a.invoke();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(O0.L0 r17, sB.C15035a r18, nI.C17642l<? super java.lang.String, XH.C16807N> r19, nI.C17631a<XH.C16807N> r20, boolean r21, U0.C4889m r22, int r23, int r24) {
        /*
            r8 = r17
            r9 = r18
            r10 = r20
            r11 = r23
            java.lang.String r0 = "snackbarHostState"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onDismissed"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 1637265002(0x6196ae6a, float:3.4744743E20)
            r1 = r22
            U0.m r12 = r1.k(r0)
            r1 = r24 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0023
            r1 = r11 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0032
            boolean r1 = r12.V(r8)
            if (r1 == 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r11
            goto L_0x0033
        L_0x0032:
            r1 = r11
        L_0x0033:
            r3 = r24 & 2
            r4 = 32
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 48
            goto L_0x004b
        L_0x003c:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r12.V(r9)
            if (r3 == 0) goto L_0x0048
            r3 = r4
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r1 = r1 | r3
        L_0x004b:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            r13 = r19
            goto L_0x0066
        L_0x0054:
            r3 = r11 & 384(0x180, float:5.38E-43)
            r13 = r19
            if (r3 != 0) goto L_0x0066
            boolean r3 = r12.F(r13)
            if (r3 == 0) goto L_0x0063
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r3
        L_0x0066:
            r3 = r24 & 8
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006f:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007e
            boolean r3 = r12.F(r10)
            if (r3 == 0) goto L_0x007b
            r3 = r6
            goto L_0x007d
        L_0x007b:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r3
        L_0x007e:
            r3 = r24 & 16
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r14 = r21
        L_0x0088:
            r15 = r1
            goto L_0x009c
        L_0x008a:
            r14 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0086
            r14 = r21
            boolean r15 = r12.b(r14)
            if (r15 == 0) goto L_0x0098
            r15 = r7
            goto L_0x009a
        L_0x0098:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r15
            goto L_0x0088
        L_0x009c:
            r1 = r15 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r5) goto L_0x00af
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            r12.L()
        L_0x00ac:
            r5 = r14
            goto L_0x016b
        L_0x00af:
            if (r3 == 0) goto L_0x00b2
            r14 = 1
        L_0x00b2:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00be
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.shoppinglist.listpicker.ui.ListModifiedSnackbar (ListModifiedSnackbar.kt:35)"
            U0.C4895p.S(r0, r15, r3, r5)
        L_0x00be:
            XH.N r0 = XH.C16807N.f139792a
            r3 = -1866911478(0xffffffff90b9310a, float:-7.304519E-29)
            r12.W(r3)
            r3 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != r6) goto L_0x00cd
            r16 = 1
            goto L_0x00cf
        L_0x00cd:
            r16 = 0
        L_0x00cf:
            java.lang.Object r1 = r12.D()
            if (r16 != 0) goto L_0x00dd
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r5 = r16.a()
            if (r1 != r5) goto L_0x00e5
        L_0x00dd:
            tB.a r1 = new tB.a
            r1.<init>(r10)
            r12.u(r1)
        L_0x00e5:
            nI.l r1 = (nI.C17642l) r1
            r12.P()
            r5 = 6
            U0.P.c(r0, r1, r12, r5)
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r12.Q(r0)
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            r0 = -1866906610(0xffffffff90b9440e, float:-7.307449E-29)
            r12.W(r0)
            r0 = r15 & 112(0x70, float:1.57E-43)
            if (r0 != r4) goto L_0x0105
            r0 = 1
            goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            boolean r1 = r12.F(r5)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r15
            if (r1 != r7) goto L_0x0113
            r1 = 1
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            r0 = r0 | r1
            r1 = r15 & 14
            if (r1 != r2) goto L_0x011b
            r1 = 1
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            r0 = r0 | r1
            if (r3 != r6) goto L_0x0121
            r1 = 1
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            r0 = r0 | r1
            r1 = r15 & 896(0x380, float:1.256E-42)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 != r2) goto L_0x012b
            r1 = 1
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            r0 = r0 | r1
            java.lang.Object r1 = r12.D()
            if (r0 != 0) goto L_0x013b
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0154
        L_0x013b:
            tB.c$a r7 = new tB.c$a
            r16 = 0
            r0 = r7
            r1 = r18
            r2 = r5
            r3 = r17
            r4 = r20
            r5 = r19
            r6 = r14
            r8 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.u(r8)
            r1 = r8
        L_0x0154:
            nI.p r1 = (nI.p) r1
            r12.P()
            int r0 = r15 >> 3
            r0 = r0 & 14
            U0.P.g(r9, r1, r12, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ac
            U0.C4895p.R()
            goto L_0x00ac
        L_0x016b:
            U0.Y0 r8 = r12.n()
            if (r8 == 0) goto L_0x0186
            tB.b r12 = new tB.b
            r0 = r12
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r12)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tB.C15062c.c(O0.L0, sB.a, nI.l, nI.a, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final L d(C17631a aVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new b(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(L0 l02, C15035a aVar, C17642l lVar, C17631a aVar2, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        c(l02, aVar, lVar, aVar2, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
