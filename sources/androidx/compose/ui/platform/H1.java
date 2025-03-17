package androidx.compose.ui.platform;

import D2.i;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4879h0;
import U0.C4915z0;
import U0.O0;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "LU0/r;", "d", "(Landroid/view/View;)LU0/r;", "Landroid/content/Context;", "applicationContext", "LTJ/P;", "", "e", "(Landroid/content/Context;)LTJ/P;", "LdI/i;", "coroutineContext", "Landroidx/lifecycle/r;", "lifecycle", "LU0/O0;", "b", "(Landroid/view/View;LdI/i;Landroidx/lifecycle/r;)LU0/O0;", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "i", "(Landroid/view/View;LU0/r;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)LU0/O0;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Context, C16519P<Float>> f19216a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/H1$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f19217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O0 f19218b;

        a(View view, O0 o02) {
            this.f19217a = view;
            this.f19218b = o02;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f19217a.removeOnAttachStateChangeListener(this);
            this.f19218b.a0();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/H1$b", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f19219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4915z0 f19220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O0 f19221c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<A0> f19222d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f19223e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f19224a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f19224a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.H1.b.a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {396}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.H1$b$b  reason: collision with other inner class name */
        static final class C0295b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f19225c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f19226d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O<A0> f19227e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ O0 f19228f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C5221y f19229g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f19230h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ View f19231i;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.H1$b$b$a */
            static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f19232c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C16519P<Float> f19233d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ A0 f19234e;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "LXH/N;", "c", "(FLdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.ui.platform.H1$b$b$a$a  reason: collision with other inner class name */
                static final class C0296a<T> implements C16533h {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ A0 f19235a;

                    C0296a(A0 a02) {
                        this.f19235a = a02;
                    }

                    public final Object c(float f10, C17164e<? super C16807N> eVar) {
                        this.f19235a.a(f10);
                        return C16807N.f139792a;
                    }

                    public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                        return c(((Number) obj).floatValue(), eVar);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C16519P<Float> p10, A0 a02, C17164e<? super a> eVar) {
                    super(2, eVar);
                    this.f19233d = p10;
                    this.f19234e = a02;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new a(this.f19233d, this.f19234e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f19232c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16519P<Float> p10 = this.f19233d;
                        C0296a aVar = new C0296a(this.f19234e);
                        this.f19232c = 1;
                        if (p10.collect(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y.b(obj);
                    }
                    throw new C16820k();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0295b(O<A0> o10, O0 o02, C5221y yVar, b bVar, View view, C17164e<? super C0295b> eVar) {
                super(2, eVar);
                this.f19227e = o10;
                this.f19228f = o02;
                this.f19229g = yVar;
                this.f19230h = bVar;
                this.f19231i = view;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C0295b bVar = new C0295b(this.f19227e, this.f19228f, this.f19229g, this.f19230h, this.f19231i, eVar);
                bVar.f19226d = obj;
                return bVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0295b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r11.f19225c
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r0 = r11.f19226d
                    QJ.F0 r0 = (QJ.F0) r0
                    XH.y.b(r12)     // Catch:{ all -> 0x0014 }
                    goto L_0x006a
                L_0x0014:
                    r12 = move-exception
                    goto L_0x0081
                L_0x0017:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001f:
                    XH.y.b(r12)
                    java.lang.Object r12 = r11.f19226d
                    r4 = r12
                    QJ.Q r4 = (QJ.Q) r4
                    kotlin.jvm.internal.O<androidx.compose.ui.platform.A0> r12 = r11.f19227e     // Catch:{ all -> 0x0058 }
                    T r12 = r12.f144348a     // Catch:{ all -> 0x0058 }
                    androidx.compose.ui.platform.A0 r12 = (androidx.compose.ui.platform.A0) r12     // Catch:{ all -> 0x0058 }
                    if (r12 == 0) goto L_0x005b
                    android.view.View r1 = r11.f19231i     // Catch:{ all -> 0x0058 }
                    android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0058 }
                    android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0058 }
                    TJ.P r1 = androidx.compose.ui.platform.H1.e(r1)     // Catch:{ all -> 0x0058 }
                    java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0058 }
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0058 }
                    float r5 = r5.floatValue()     // Catch:{ all -> 0x0058 }
                    r12.a(r5)     // Catch:{ all -> 0x0058 }
                    androidx.compose.ui.platform.H1$b$b$a r7 = new androidx.compose.ui.platform.H1$b$b$a     // Catch:{ all -> 0x0058 }
                    r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0058 }
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    QJ.F0 r12 = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0058 }
                    goto L_0x005c
                L_0x0058:
                    r12 = move-exception
                    r0 = r3
                    goto L_0x0081
                L_0x005b:
                    r12 = r3
                L_0x005c:
                    U0.O0 r1 = r11.f19228f     // Catch:{ all -> 0x007d }
                    r11.f19226d = r12     // Catch:{ all -> 0x007d }
                    r11.f19225c = r2     // Catch:{ all -> 0x007d }
                    java.lang.Object r1 = r1.B0(r11)     // Catch:{ all -> 0x007d }
                    if (r1 != r0) goto L_0x0069
                    return r0
                L_0x0069:
                    r0 = r12
                L_0x006a:
                    if (r0 == 0) goto L_0x006f
                    QJ.F0.a.a(r0, r3, r2, r3)
                L_0x006f:
                    androidx.lifecycle.y r12 = r11.f19229g
                    androidx.lifecycle.r r12 = r12.getLifecycle()
                    androidx.compose.ui.platform.H1$b r0 = r11.f19230h
                    r12.g(r0)
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                L_0x007d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L_0x0081:
                    if (r0 == 0) goto L_0x0086
                    QJ.F0.a.a(r0, r3, r2, r3)
                L_0x0086:
                    androidx.lifecycle.y r0 = r11.f19229g
                    androidx.lifecycle.r r0 = r0.getLifecycle()
                    androidx.compose.ui.platform.H1$b r1 = r11.f19230h
                    r0.g(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.H1.b.C0295b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(Q q10, C4915z0 z0Var, O0 o02, O<A0> o10, View view) {
            this.f19219a = q10;
            this.f19220b = z0Var;
            this.f19221c = o02;
            this.f19222d = o10;
            this.f19223e = view;
        }

        public void e(C5221y yVar, r.a aVar) {
            int i10 = a.f19224a[aVar.ordinal()];
            if (i10 == 1) {
                F0 unused = C16314k.d(this.f19219a, (C17168i) null, T.UNDISPATCHED, new C0295b(this.f19222d, this.f19221c, yVar, this, this.f19223e, (C17164e<? super C0295b>) null), 1, (Object) null);
            } else if (i10 == 2) {
                C4915z0 z0Var = this.f19220b;
                if (z0Var != null) {
                    z0Var.b();
                }
                this.f19221c.A0();
            } else if (i10 == 3) {
                this.f19221c.n0();
            } else if (i10 == 4) {
                this.f19221c.a0();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {117, 123}, m = "invokeSuspend")
    static final class c extends l implements p<C16533h<? super Float>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f19236c;

        /* renamed from: d  reason: collision with root package name */
        int f19237d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f19238e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ContentResolver f19239f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Uri f19240g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f19241h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C16434j<C16807N> f19242i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Context f19243j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, C16434j<C16807N> jVar, Context context, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f19239f = contentResolver;
            this.f19240g = uri;
            this.f19241h = dVar;
            this.f19242i = jVar;
            this.f19243j = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f19239f, this.f19240g, this.f19241h, this.f19242i, this.f19243j, eVar);
            cVar.f19238e = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super Float> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ all -> 0x001b }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ all -> 0x001b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f19237d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r8.f19236c
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r4 = r8.f19238e
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r9)     // Catch:{ all -> 0x001b }
            L_0x0019:
                r9 = r4
                goto L_0x0048
            L_0x001b:
                r9 = move-exception
                goto L_0x008c
            L_0x001d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0025:
                java.lang.Object r1 = r8.f19236c
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r4 = r8.f19238e
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r9)     // Catch:{ all -> 0x001b }
                goto L_0x0058
            L_0x0031:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f19238e
                TJ.h r9 = (TJ.C16533h) r9
                android.content.ContentResolver r1 = r8.f19239f
                android.net.Uri r4 = r8.f19240g
                r5 = 0
                androidx.compose.ui.platform.H1$d r6 = r8.f19241h
                r1.registerContentObserver(r4, r5, r6)
                SJ.j<XH.N> r1 = r8.f19242i     // Catch:{ all -> 0x001b }
                SJ.l r1 = r1.iterator()     // Catch:{ all -> 0x001b }
            L_0x0048:
                r8.f19238e = r9     // Catch:{ all -> 0x001b }
                r8.f19236c = r1     // Catch:{ all -> 0x001b }
                r8.f19237d = r3     // Catch:{ all -> 0x001b }
                java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x001b }
                if (r4 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r7 = r4
                r4 = r9
                r9 = r7
            L_0x0058:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x001b }
                boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x001b }
                if (r9 == 0) goto L_0x0082
                r1.next()     // Catch:{ all -> 0x001b }
                android.content.Context r9 = r8.f19243j     // Catch:{ all -> 0x001b }
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ all -> 0x001b }
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch:{ all -> 0x001b }
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.d(r9)     // Catch:{ all -> 0x001b }
                r8.f19238e = r4     // Catch:{ all -> 0x001b }
                r8.f19236c = r1     // Catch:{ all -> 0x001b }
                r8.f19237d = r2     // Catch:{ all -> 0x001b }
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch:{ all -> 0x001b }
                if (r9 != r0) goto L_0x0019
                return r0
            L_0x0082:
                android.content.ContentResolver r9 = r8.f19239f
                androidx.compose.ui.platform.H1$d r0 = r8.f19241h
                r9.unregisterContentObserver(r0)
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x008c:
                android.content.ContentResolver r0 = r8.f19239f
                androidx.compose.ui.platform.H1$d r1 = r8.f19241h
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.H1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/H1$d", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "LXH/N;", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16434j<C16807N> f19244a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C16434j<C16807N> jVar, Handler handler) {
            super(handler);
            this.f19244a = jVar;
        }

        public void onChange(boolean z10, Uri uri) {
            this.f19244a.k(C16807N.f139792a);
        }
    }

    public static final O0 b(View view, C17168i iVar, r rVar) {
        C4915z0 z0Var;
        if (iVar.get(C17165f.f142966s0) == null || iVar.get(C4879h0.f13990g0) == null) {
            iVar = O.f19306l.a().plus(iVar);
        }
        C4879h0 h0Var = (C4879h0) iVar.get(C4879h0.f13990g0);
        if (h0Var != null) {
            C4915z0 z0Var2 = new C4915z0(h0Var);
            z0Var2.a();
            z0Var = z0Var2;
        } else {
            z0Var = null;
        }
        O o10 = new O();
        T t10 = (h) iVar.get(h.f24327t0);
        if (t10 == null) {
            t10 = new A0();
            o10.f144348a = t10;
        }
        C17168i plus = iVar.plus(z0Var != null ? z0Var : C17169j.f142968a).plus(t10);
        O0 o02 = new O0(plus);
        o02.n0();
        Q a10 = S.a(plus);
        if (rVar == null) {
            C5221y a11 = l0.a(view);
            rVar = a11 != null ? a11.getLifecycle() : null;
        }
        if (rVar != null) {
            view.addOnAttachStateChangeListener(new a(view, o02));
            rVar.c(new b(a10, z0Var, o02, o10, view));
            return o02;
        }
        D1.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new C16820k();
    }

    public static /* synthetic */ O0 c(View view, C17168i iVar, r rVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            rVar = null;
        }
        return b(view, iVar, rVar);
    }

    public static final U0.r d(View view) {
        U0.r f10 = f(view);
        if (f10 != null) {
            return f10;
        }
        ViewParent parent = view.getParent();
        while (f10 == null && (parent instanceof View)) {
            f10 = f((View) parent);
            parent = parent.getParent();
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final C16519P<Float> e(Context context) {
        C16519P<Float> p10;
        Map<Context, C16519P<Float>> map = f19216a;
        synchronized (map) {
            try {
                C16519P<Float> p11 = map.get(context);
                if (p11 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C16434j b10 = C16437m.b(-1, (C16428d) null, (C17642l) null, 6, (Object) null);
                    p11 = C16534i.c0(C16534i.H(new c(contentResolver, uriFor, new d(b10, i.a(Looper.getMainLooper())), b10, context, (C17164e<? super c>) null)), S.b(), C16515L.a.b(C16515L.f138570a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, p11);
                }
                p10 = p11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p10;
    }

    public static final U0.r f(View view) {
        Object tag = view.getTag(i1.i.f24335G);
        if (tag instanceof U0.r) {
            return (U0.r) tag;
        }
        return null;
    }

    private static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    public static final O0 h(View view) {
        if (!view.isAttachedToWindow()) {
            D1.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View g10 = g(view);
        U0.r f10 = f(g10);
        if (f10 == null) {
            return G1.f19208a.a(g10);
        }
        if (f10 instanceof O0) {
            return (O0) f10;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, U0.r rVar) {
        view.setTag(i1.i.f24335G, rVar);
    }
}
