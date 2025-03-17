package Yw;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.P;
import U0.o1;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import dI.C17164e;
import e.C5280c;
import e.C5286i;
import f1.C5301c;
import f1.C5309k;
import g.C5312a;
import g.C5318g;
import h.C5407e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a \u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b*\u0016\u0010\f\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u000f²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\u00028\n@\nX\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00028\n@\nX\u0002"}, d2 = {"LXH/v;", "LU0/A1;", "", "Lkotlin/Function0;", "LXH/N;", "Lcom/ingka/ikea/permissions/location/TriggerLocationSettingsCheck;", "h", "(LU0/m;I)LXH/v;", "Landroid/content/Context;", "Landroid/app/Activity;", "g", "(Landroid/content/Context;)Landroid/app/Activity;", "TriggerLocationSettingsCheck", "isLocationEnabled", "triggerCheck", "permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.permissions.location.PromptUserToEnableLocationComposableKt$rememberPromptUserToEnableLocation$1$1", f = "PromptUserToEnableLocationComposable.kt", l = {70}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118114c;

        /* renamed from: d  reason: collision with root package name */
        Object f118115d;

        /* renamed from: e  reason: collision with root package name */
        Object f118116e;

        /* renamed from: f  reason: collision with root package name */
        Object f118117f;

        /* renamed from: g  reason: collision with root package name */
        int f118118g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f118119h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Activity f118120i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5286i<C5318g, C5312a> f118121j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f118122k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f118123l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity, C5286i<C5318g, C5312a> iVar, C4899r0<Boolean> r0Var, C4899r0<Boolean> r0Var2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f118120i = activity;
            this.f118121j = iVar;
            this.f118122k = r0Var;
            this.f118123l = r0Var2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f118120i, this.f118121j, this.f118122k, this.f118123l, eVar);
            aVar.f118119h = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: QJ.Q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r1 = r24
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f118118g
                r3 = 1
                if (r2 == 0) goto L_0x0030
                if (r2 != r3) goto L_0x0028
                java.lang.Object r0 = r1.f118117f
                xa.l r0 = (xa.C8971l) r0
                java.lang.Object r0 = r1.f118116e
                xa.l r0 = (xa.C8971l) r0
                java.lang.Object r0 = r1.f118115d
                na.m r0 = (na.m) r0
                java.lang.Object r0 = r1.f118114c
                na.h$a r0 = (na.h.a) r0
                java.lang.Object r0 = r1.f118119h
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r25)     // Catch:{ Exception -> 0x0026 }
                goto L_0x0089
            L_0x0026:
                r0 = move-exception
                goto L_0x0094
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0030:
                XH.y.b(r25)
                java.lang.Object r2 = r1.f118119h
                QJ.Q r2 = (QJ.Q) r2
                U0.r0<java.lang.Boolean> r4 = r1.f118122k
                boolean r4 = Yw.d.m(r4)
                if (r4 == 0) goto L_0x0253
                android.app.Activity r4 = r1.f118120i
                if (r4 != 0) goto L_0x0045
                goto L_0x0253
            L_0x0045:
                na.h$a r4 = new na.h$a
                r4.<init>()
                com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a
                r6 = 100
                r5.<init>((long) r6)
                com.google.android.gms.location.LocationRequest r5 = r5.a()
                na.h$a r4 = r4.a(r5)
                java.lang.String r5 = "addLocationRequest(...)"
                kotlin.jvm.internal.C17542s.i(r4, r5)
                android.app.Activity r5 = r1.f118120i
                na.m r5 = na.g.c(r5)
                java.lang.String r6 = "getSettingsClient(...)"
                kotlin.jvm.internal.C17542s.i(r5, r6)
                na.h r6 = r4.b()
                xa.l r6 = r5.d(r6)
                java.lang.String r7 = "checkLocationSettings(...)"
                kotlin.jvm.internal.C17542s.i(r6, r7)
                r1.f118119h = r2     // Catch:{ Exception -> 0x0026 }
                r1.f118114c = r4     // Catch:{ Exception -> 0x0026 }
                r1.f118115d = r5     // Catch:{ Exception -> 0x0026 }
                r1.f118116e = r6     // Catch:{ Exception -> 0x0026 }
                r1.f118117f = r6     // Catch:{ Exception -> 0x0026 }
                r1.f118118g = r3     // Catch:{ Exception -> 0x0026 }
                java.lang.Object r4 = cK.C17078d.g(r6, r1)     // Catch:{ Exception -> 0x0026 }
                if (r4 != r0) goto L_0x0089
                return r0
            L_0x0089:
                U0.r0<java.lang.Boolean> r0 = r1.f118123l     // Catch:{ Exception -> 0x0026 }
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch:{ Exception -> 0x0026 }
                Yw.d.l(r0, r4)     // Catch:{ Exception -> 0x0026 }
                goto L_0x0250
            L_0x0094:
                boolean r4 = r0 instanceof com.google.android.gms.common.api.l
                java.lang.String r10 = "|"
                java.lang.String r11 = "b"
                java.lang.String r12 = "m"
                java.lang.String r13 = "main"
                java.lang.String r14 = "Kt"
                r9 = 36
                r8 = 2
                r7 = 0
                if (r4 == 0) goto L_0x0177
                e.i<g.g, g.a> r4 = r1.f118121j     // Catch:{ SendIntentException -> 0x00c3 }
                g.g$a r5 = new g.g$a     // Catch:{ SendIntentException -> 0x00c3 }
                com.google.android.gms.common.api.l r0 = (com.google.android.gms.common.api.l) r0     // Catch:{ SendIntentException -> 0x00c3 }
                android.app.PendingIntent r0 = r0.c()     // Catch:{ SendIntentException -> 0x00c3 }
                java.lang.String r3 = "getResolution(...)"
                kotlin.jvm.internal.C17542s.i(r0, r3)     // Catch:{ SendIntentException -> 0x00c3 }
                r5.<init>((android.app.PendingIntent) r0)     // Catch:{ SendIntentException -> 0x00c3 }
                g.g r0 = r5.a()     // Catch:{ SendIntentException -> 0x00c3 }
                r4.a(r0)     // Catch:{ SendIntentException -> 0x00c3 }
                r23 = r7
                goto L_0x0249
            L_0x00c3:
                r0 = move-exception
                qv.e r3 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00d7:
                boolean r17 = r4.hasNext()
                if (r17 == 0) goto L_0x00ee
                java.lang.Object r15 = r4.next()
                r6 = r15
                qv.b r6 = (qv.C11819b) r6
                boolean r6 = r6.b(r3, r7)
                if (r6 == 0) goto L_0x00d7
                r5.add(r15)
                goto L_0x00d7
            L_0x00ee:
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
                r6 = 0
            L_0x00f4:
                boolean r15 = r4.hasNext()
                if (r15 == 0) goto L_0x0169
                java.lang.Object r15 = r4.next()
                r17 = r15
                qv.b r17 = (qv.C11819b) r17
                if (r5 != 0) goto L_0x0111
                java.lang.String r5 = "Error launching location settings resolution"
                java.lang.String r5 = qv.C11818a.a(r5, r0)
                if (r5 != 0) goto L_0x010d
                goto L_0x0169
            L_0x010d:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x0111:
                if (r6 != 0) goto L_0x0158
                java.lang.Class r6 = r2.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r15 = 0
                java.lang.String r7 = HJ.C15854t.s1(r6, r9, r15, r8, r15)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r15, r8, r15)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x0130
                goto L_0x0134
            L_0x0130:
                java.lang.String r6 = HJ.C15854t.P0(r7, r14)
            L_0x0134:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                r9 = 1
                boolean r7 = HJ.C15854t.b0(r7, r13, r9)
                if (r7 == 0) goto L_0x0145
                r7 = r12
                goto L_0x0146
            L_0x0145:
                r7 = r11
            L_0x0146:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                r9.append(r10)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
            L_0x0158:
                r20 = 0
                r18 = r3
                r19 = r6
                r21 = r0
                r22 = r5
                r17.a(r18, r19, r20, r21, r22)
                r7 = 0
                r9 = 36
                goto L_0x00f4
            L_0x0169:
                U0.r0<java.lang.Boolean> r0 = r1.f118123l
                r2 = 0
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r2)
                Yw.d.l(r0, r3)
                r23 = 0
                goto L_0x0249
            L_0x0177:
                qv.e r3 = qv.e.WARN
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x018a:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x01a2
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                r9 = 0
                boolean r7 = r7.b(r3, r9)
                if (r7 == 0) goto L_0x018a
                r5.add(r6)
                goto L_0x018a
            L_0x01a2:
                r9 = 0
                java.util.Iterator r15 = r5.iterator()
                r4 = 0
                r5 = 0
            L_0x01a9:
                boolean r6 = r15.hasNext()
                if (r6 == 0) goto L_0x01bf
                java.lang.Object r6 = r15.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x01c7
                java.lang.String r4 = "Location settings exception is not resolvable"
                java.lang.String r4 = qv.C11818a.a(r4, r0)
                if (r4 != 0) goto L_0x01c3
            L_0x01bf:
                r23 = r9
                goto L_0x0240
            L_0x01c3:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x01c7:
                r17 = r4
                if (r5 != 0) goto L_0x0216
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 0
                r7 = 36
                java.lang.String r9 = HJ.C15854t.s1(r4, r7, r5, r8, r5)
                r7 = 46
                java.lang.String r9 = HJ.C15854t.o1(r9, r7, r5, r8, r5)
                int r18 = r9.length()
                if (r18 != 0) goto L_0x01ea
                goto L_0x01ee
            L_0x01ea:
                java.lang.String r4 = HJ.C15854t.P0(r9, r14)
            L_0x01ee:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r7 = 1
                boolean r9 = HJ.C15854t.b0(r9, r13, r7)
                if (r9 == 0) goto L_0x01ff
                r9 = r12
                goto L_0x0200
            L_0x01ff:
                r9 = r11
            L_0x0200:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r9)
                r5.append(r10)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r16 = r4
                r9 = 0
                goto L_0x021a
            L_0x0216:
                r7 = 1
                r9 = 0
                r16 = r5
            L_0x021a:
                r18 = 0
                r4 = r6
                r5 = r3
                r19 = r9
                r6 = r16
                r20 = r7
                r9 = 36
                r21 = 46
                r23 = 0
                r7 = r18
                r18 = r8
                r8 = r0
                r22 = r9
                r9 = r17
                r4.a(r5, r6, r7, r8, r9)
                r5 = r16
                r4 = r17
                r8 = r18
                r9 = r23
                goto L_0x01a9
            L_0x0240:
                U0.r0<java.lang.Boolean> r0 = r1.f118123l
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r23)
                Yw.d.l(r0, r2)
            L_0x0249:
                U0.r0<java.lang.Boolean> r0 = r1.f118122k
                r2 = r23
                Yw.d.n(r0, r2)
            L_0x0250:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0253:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Yw.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final Activity g(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C17542s.i(baseContext, "getBaseContext(...)");
        return g(baseContext);
    }

    public static final v<A1<Boolean>, C17631a<C16807N>> h(C4889m mVar, int i10) {
        mVar.W(1255793778);
        if (C4895p.J()) {
            C4895p.S(1255793778, i10, -1, "com.ingka.ikea.permissions.location.rememberPromptUserToEnableLocation (PromptUserToEnableLocationComposable.kt:46)");
        }
        Activity g10 = g((Context) mVar.Q(AndroidCompositionLocals_androidKt.g()));
        Object[] objArr = new Object[0];
        mVar.W(1253646249);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new a();
            mVar.u(D10);
        }
        mVar.P();
        C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, mVar, 3072, 6);
        mVar.W(1253647827);
        Object D11 = mVar.D();
        if (D11 == aVar.a()) {
            D11 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.u(D11);
        }
        C4899r0 r0Var2 = (C4899r0) D11;
        mVar.P();
        C5407e eVar = new C5407e();
        mVar.W(1253653798);
        boolean V10 = mVar.V(r0Var);
        Object D12 = mVar.D();
        if (V10 || D12 == aVar.a()) {
            D12 = new b(r0Var);
            mVar.u(D12);
        }
        mVar.P();
        C5286i a10 = C5280c.a(eVar, (C17642l) D12, mVar, 0);
        Boolean valueOf = Boolean.valueOf(m(r0Var2));
        mVar.W(1253658804);
        boolean F10 = mVar.F(g10) | mVar.V(r0Var) | mVar.F(a10);
        Object D13 = mVar.D();
        if (F10 || D13 == aVar.a()) {
            a aVar2 = new a(g10, a10, r0Var2, r0Var, (C17164e<? super a>) null);
            mVar.u(aVar2);
            D13 = aVar2;
        }
        mVar.P();
        P.g(valueOf, (p) D13, mVar, 0);
        mVar.W(1253699892);
        Object D14 = mVar.D();
        if (D14 == aVar.a()) {
            D14 = new c(r0Var2);
            mVar.u(D14);
        }
        mVar.P();
        v<A1<Boolean>, C17631a<C16807N>> a11 = C16796C.a(p1.q(k(r0Var), mVar, 0), (C17631a) D14);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a11;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 i() {
        return u1.e((Object) null, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C4899r0 r0Var) {
        n(r0Var, true);
        return C16807N.f139792a;
    }

    private static final Boolean k(C4899r0<Boolean> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void l(C4899r0<Boolean> r0Var, Boolean bool) {
        r0Var.setValue(bool);
    }

    /* access modifiers changed from: private */
    public static final boolean m(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void n(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C4899r0 r0Var, C5312a aVar) {
        C17542s.j(aVar, "result");
        l(r0Var, Boolean.valueOf(aVar.b() == -1));
        return C16807N.f139792a;
    }
}
