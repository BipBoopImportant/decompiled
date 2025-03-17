package com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16533h;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import XH.y;
import a9.C6783a1;
import a9.C6982z1;
import a9.D3;
import a9.K1;
import a9.L4;
import a9.X6;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import b8.l;
import b8.m;
import b8.n;
import b8.o;
import com.contentsquare.android.sdk.C7114a0;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7145p0;
import com.contentsquare.android.sdk.C7156v0;
import com.contentsquare.android.sdk.I;
import com.contentsquare.android.sdk.M;
import com.contentsquare.android.sdk.c1;
import com.contentsquare.android.sdk.k1;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import f8.C7863b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tI.C17978n;
import u8.C8886a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C16519P<C7134k0> f46621a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f46622b;

    /* renamed from: c  reason: collision with root package name */
    public final WindowManager f46623c;

    /* renamed from: d  reason: collision with root package name */
    public final C6783a1 f46624d;

    /* renamed from: e  reason: collision with root package name */
    public View f46625e;

    /* renamed from: f  reason: collision with root package name */
    public WindowManager.LayoutParams f46626f;

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f46627g;

    /* renamed from: h  reason: collision with root package name */
    public I f46628h;

    /* renamed from: i  reason: collision with root package name */
    public C7114a0 f46629i;

    /* renamed from: j  reason: collision with root package name */
    public int f46630j;

    /* renamed from: k  reason: collision with root package name */
    public int f46631k;

    /* renamed from: l  reason: collision with root package name */
    public C0812a f46632l;

    /* renamed from: m  reason: collision with root package name */
    public F0 f46633m;

    /* renamed from: com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a$a  reason: collision with other inner class name */
    public interface C0812a {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final d f46634a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f46635b;

        public b(a aVar, d dVar) {
            C17542s.j(dVar, "fabTouchedListener");
            this.f46635b = aVar;
            this.f46634a = dVar;
        }

        public final void onClick(View view) {
            C0812a aVar;
            C17542s.j(view, "view");
            if (this.f46634a.f46642e && (aVar = this.f46635b.f46632l) != null) {
                aVar.c();
            }
        }
    }

    public final class c implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final d f46636a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f46637b;

        public c(a aVar, d dVar) {
            C17542s.j(dVar, "fabTouchedListener");
            this.f46637b = aVar;
            this.f46636a = dVar;
        }

        public final boolean onLongClick(View view) {
            C0812a aVar;
            C17542s.j(view, "view");
            if (!this.f46636a.f46642e || (aVar = this.f46637b.f46632l) == null) {
                return true;
            }
            aVar.b();
            return true;
        }
    }

    public final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public int f46638a;

        /* renamed from: b  reason: collision with root package name */
        public int f46639b;

        /* renamed from: c  reason: collision with root package name */
        public float f46640c;

        /* renamed from: d  reason: collision with root package name */
        public float f46641d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f46642e = true;

        public d() {
        }

        public static final void b(WindowManager.LayoutParams layoutParams, a aVar, View view, ValueAnimator valueAnimator) {
            C17542s.j(layoutParams, "$fabParams");
            C17542s.j(aVar, "this$0");
            C17542s.j(view, "$fabLayout");
            C17542s.j(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.x = (int) ((Float) animatedValue).floatValue();
            aVar.f46623c.updateViewLayout(view, layoutParams);
        }

        public final void a(View view, WindowManager.LayoutParams layoutParams, int i10) {
            a.this.getClass();
            C17542s.j(view, "view");
            int width = view.getWidth();
            int i11 = i10 - width;
            if ((width / 2) + layoutParams.x < i10 / 2) {
                i11 = 0;
            }
            ValueAnimator valueAnimator = a.this.f46627g;
            if (valueAnimator == null) {
                C17542s.z("fabAnimator");
                valueAnimator = null;
            }
            a aVar = a.this;
            valueAnimator.setFloatValues(new float[]{(float) layoutParams.x, (float) i11});
            valueAnimator.addUpdateListener(new C7863b(layoutParams, aVar, view));
            valueAnimator.start();
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C17542s.j(view, "view");
            C17542s.j(motionEvent, "event");
            int action = motionEvent.getAction();
            boolean z10 = true;
            WindowManager.LayoutParams layoutParams = null;
            if (action == 0) {
                this.f46642e = true;
                WindowManager.LayoutParams layoutParams2 = a.this.f46626f;
                if (layoutParams2 == null) {
                    C17542s.z("fabParams");
                } else {
                    layoutParams = layoutParams2;
                }
                this.f46638a = layoutParams.x;
                this.f46639b = layoutParams.y;
                this.f46640c = motionEvent.getRawX();
                this.f46641d = motionEvent.getRawY();
            } else if (action == 1) {
                View a10 = a.this.a();
                WindowManager.LayoutParams layoutParams3 = a.this.f46626f;
                if (layoutParams3 == null) {
                    C17542s.z("fabParams");
                } else {
                    layoutParams = layoutParams3;
                }
                a(a10, layoutParams, a.this.f46631k);
            } else if (action == 2) {
                int e10 = C17978n.e(this.f46638a - ((int) (motionEvent.getRawX() - this.f46640c)), 0);
                a aVar = a.this;
                int i10 = aVar.f46631k;
                View a11 = aVar.a();
                C17542s.j(a11, "view");
                int i11 = C17978n.i(i10 - a11.getWidth(), e10);
                int i12 = a.this.f46630j / 2;
                v vVar = new v(Integer.valueOf(i11), Integer.valueOf(C17978n.i(i12, C17978n.e(this.f46639b + ((int) (motionEvent.getRawY() - this.f46641d)), -i12))));
                WindowManager.LayoutParams layoutParams4 = a.this.f46626f;
                if (layoutParams4 == null) {
                    C17542s.z("fabParams");
                    layoutParams4 = null;
                }
                layoutParams4.x = ((Number) vVar.c()).intValue();
                WindowManager.LayoutParams layoutParams5 = a.this.f46626f;
                if (layoutParams5 == null) {
                    C17542s.z("fabParams");
                    layoutParams5 = null;
                }
                layoutParams5.y = ((Number) vVar.d()).intValue();
                a aVar2 = a.this;
                WindowManager windowManager = aVar2.f46623c;
                View a12 = aVar2.a();
                WindowManager.LayoutParams layoutParams6 = a.this.f46626f;
                if (layoutParams6 == null) {
                    C17542s.z("fabParams");
                } else {
                    layoutParams = layoutParams6;
                }
                windowManager.updateViewLayout(a12, layoutParams);
                if (this.f46642e) {
                    float abs = Math.abs(this.f46640c - motionEvent.getRawX());
                    float abs2 = Math.abs(this.f46641d - motionEvent.getRawY());
                    if (abs >= 70.0f || abs2 >= 70.0f) {
                        z10 = false;
                    }
                    this.f46642e = z10;
                }
            }
            return false;
        }
    }

    public final class e implements C16533h<C7134k0> {
        public e() {
        }

        public final Object emit(Object obj, C17164e eVar) {
            a aVar;
            int i10;
            I i11;
            C17642l<? super D3, C16807N> lVar;
            k1.b bVar;
            C7134k0 k0Var = (C7134k0) obj;
            C7134k0 value = a.this.f46621a.getValue();
            if (!(value instanceof C7134k0.c)) {
                if (value instanceof C7134k0.a) {
                    I i12 = a.this.f46628h;
                    if (i12 != null) {
                        C7134k0.a aVar2 = (C7134k0.a) value;
                        C17542s.j(aVar2, "failureState");
                        C17642l<? super D3, C16807N> lVar2 = i12.f47002d;
                        if (lVar2 != null) {
                            C7134k0.b bVar2 = aVar2.f47468a;
                            lVar2.invoke(new D3(new k1.a(bVar2 instanceof C7134k0.b.d ? o.f45614u : bVar2 instanceof C7134k0.b.c ? o.f45613t : bVar2 instanceof C7134k0.b.C0819b ? o.f45612s : o.f45611r), new k1.a(o.f45603j), new C7156v0.b(l.f45527a), (L4) null, new L4(o.f45610q, new M(i12)), 8));
                        }
                    }
                } else {
                    boolean z10 = true;
                    if (value instanceof C7134k0.h) {
                        I i13 = a.this.f46628h;
                        if (i13 != null) {
                            C7134k0.h hVar = (C7134k0.h) value;
                            C17542s.j(hVar, "successState");
                            Activity activity = i13.f46999a.f42433a.get();
                            if (activity != null) {
                                String string = activity.getString(o.f45609p, new Object[]{hVar.f47483a});
                                C17542s.i(string, "context.getString(R.stri… successState.screenName)");
                                SpannableString spannableString = new SpannableString(string);
                                spannableString.setSpan(new StyleSpan(1), string.length() - hVar.f47483a.length(), string.length(), 33);
                                bVar = new k1.b(spannableString);
                            } else {
                                bVar = null;
                            }
                            k1.b bVar3 = bVar;
                            C17642l<? super D3, C16807N> lVar3 = i13.f47002d;
                            if (lVar3 != null) {
                                lVar3.invoke(new D3(new k1.a(o.f45617x), bVar3, new C7156v0.b(l.f45528b), (L4) null, (L4) null, 24));
                            }
                            c1 c1Var = i13.f47001c;
                            if (c1Var != null) {
                                c1Var.b();
                            }
                        }
                    } else if (value instanceof C7134k0.g) {
                        I i14 = a.this.f46628h;
                        if (!(i14 == null || (lVar = i14.f47002d) == null)) {
                            lVar.invoke(new D3(new k1.a(o.f45619z), new k1.a(o.f45618y), C7156v0.a.f47659a, (L4) null, (L4) null, 24));
                        }
                    } else if (value instanceof C7134k0.d) {
                        a aVar3 = a.this;
                        C0812a aVar4 = aVar3.f46632l;
                        if (!(aVar4 == null || (i11 = aVar3.f46628h) == null)) {
                            b bVar4 = new b(aVar4);
                            c cVar = new c(aVar4);
                            C17542s.j(bVar4, "onResume");
                            C17542s.j(cVar, "onCancel");
                            C17642l<? super D3, C16807N> lVar4 = i11.f47002d;
                            if (lVar4 != null) {
                                lVar4.invoke(new D3(new k1.a(o.f45604k), new k1.a(o.f45603j), (C7156v0) null, new L4(o.f45605l, new C6982z1(i11, cVar)), new L4(o.f45602i, new K1(bVar4)), 4));
                            }
                            C16807N n10 = C16807N.f139792a;
                        }
                    } else {
                        if (value instanceof C7134k0.e) {
                            aVar = a.this;
                            i10 = ((C7134k0.e) value).f47480c;
                        } else if (value instanceof C7134k0.f) {
                            aVar = a.this;
                            i10 = 100;
                            z10 = false;
                        }
                        aVar.c(i10, z10);
                    }
                }
            }
            return C16807N.f139792a;
        }
    }

    public static final class f extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f46645c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(a aVar) {
            super(0);
            this.f46645c = aVar;
        }

        public final Object invoke() {
            View a10 = this.f46645c.a();
            if (a10 != null) {
                a10.setVisibility(0);
            }
            return C16807N.f139792a;
        }
    }

    public static final class g extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f46646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(0);
            this.f46646c = aVar;
        }

        public final Object invoke() {
            View a10 = this.f46646c.a();
            if (a10 != null) {
                a10.setVisibility(0);
            }
            return C16807N.f139792a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayLayoutManager$initViews$4", f = "OverlayLayoutManager.kt", l = {200}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public int f46647c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f46648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f46648d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f46648d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new h(this.f46648d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f46647c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f46648d;
                C16519P<C7134k0> p10 = aVar.f46621a;
                e eVar = new e();
                this.f46647c = 1;
                if (p10.collect(eVar, this) == f10) {
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

    public static final class i extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f46649c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(a aVar) {
            super(0);
            this.f46649c = aVar;
        }

        public final Object invoke() {
            C0812a aVar = this.f46649c.f46632l;
            if (aVar != null) {
                aVar.a();
            }
            return C16807N.f139792a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayLayoutManager", f = "OverlayLayoutManager.kt", l = {219}, m = "showSnapshotDialog")
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        public a f46650c;

        /* renamed from: d  reason: collision with root package name */
        public C7145p0 f46651d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f46652e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f46653f;

        /* renamed from: g  reason: collision with root package name */
        public int f46654g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(a aVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f46653f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f46652e = obj;
            this.f46654g |= Integer.MIN_VALUE;
            return this.f46653f.b((C7145p0) null, this);
        }
    }

    public a(C16505B b10, Context context, WindowManager windowManager, C6783a1 a1Var) {
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(context, "context");
        C17542s.j(windowManager, "windowManager");
        C17542s.j(a1Var, "liveActivityProvider");
        this.f46621a = b10;
        this.f46622b = context;
        this.f46623c = windowManager;
        this.f46624d = a1Var;
    }

    public final View a() {
        View view = this.f46625e;
        if (view != null) {
            return view;
        }
        C17542s.z("fabLayout");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.contentsquare.android.sdk.C7145p0 r11, dI.C17164e<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a.j
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a$j r0 = (com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a.j) r0
            int r1 = r0.f46654g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f46654g = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a$j r0 = new com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a$j
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f46652e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f46654g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            com.contentsquare.android.sdk.p0 r11 = r0.f46651d
            com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a r0 = r0.f46650c
            XH.y.b(r12)
            goto L_0x008d
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            XH.y.b(r12)
            android.view.View r12 = r10.a()
            if (r12 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            r2 = 8
            r12.setVisibility(r2)
        L_0x0045:
            boolean r12 = r11 instanceof com.contentsquare.android.sdk.r1.b
            if (r12 != 0) goto L_0x004d
            boolean r12 = r11 instanceof com.contentsquare.android.sdk.p1.a
            if (r12 == 0) goto L_0x007b
        L_0x004d:
            com.contentsquare.android.sdk.a0 r12 = r10.f46629i
            if (r12 == 0) goto L_0x007b
            E8.c r12 = r12.f47278b
            E8.b r2 = E8.b.LONG_SNAPSHOT_EXPLANATION_SHOWN
            boolean r12 = r12.b(r2, r3)
            r12 = r12 ^ r4
            if (r12 != r4) goto L_0x007b
            com.contentsquare.android.sdk.a0 r11 = r10.f46629i
            if (r11 == 0) goto L_0x0094
            E8.c r12 = r11.f47278b
            r12.h(r2, r4)
            QJ.P0 r12 = QJ.C16311i0.c()
            QJ.Q r4 = QJ.S.a(r12)
            a9.o2 r7 = new a9.o2
            r12 = 0
            r7.<init>(r11, r12)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            QJ.F0 unused = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
            goto L_0x0094
        L_0x007b:
            com.contentsquare.android.sdk.I r12 = r10.f46628h
            if (r12 == 0) goto L_0x008c
            r0.f46650c = r10
            r0.f46651d = r11
            r0.f46654g = r4
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r0 = r10
        L_0x008d:
            boolean r11 = r11 instanceof com.contentsquare.android.sdk.C7145p0.a
            r11 = r11 ^ r4
            r0.c(r3, r11)
            r3 = r4
        L_0x0094:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a.b(com.contentsquare.android.sdk.p0, dI.e):java.lang.Object");
    }

    public final void c(int i10, boolean z10) {
        I i11 = this.f46628h;
        if (i11 != null) {
            L4 l42 = null;
            i iVar = z10 ? new i(this) : null;
            C17642l<? super D3, C16807N> lVar = i11.f47002d;
            if (lVar != null) {
                k1.a aVar = new k1.a(o.f45615v);
                k1.a aVar2 = new k1.a(o.f45616w);
                C7156v0.c cVar = new C7156v0.c(i10);
                if (iVar != null) {
                    l42 = new L4(o.f45610q, iVar);
                }
                lVar.invoke(new D3(aVar, aVar2, cVar, l42, (L4) null, 16));
            }
        }
    }

    @SuppressLint({"InflateParams"})
    public final void d() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimator.setDuration(250);
        this.f46627g = valueAnimator;
        LayoutInflater from = LayoutInflater.from(this.f46622b);
        C17542s.i(from, "layoutInflater");
        View inflate = from.inflate(n.f45587f, (ViewGroup) null, false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 262184, -3);
        layoutParams.windowAnimations = 16973827;
        layoutParams.gravity = 8388629;
        this.f46626f = layoutParams;
        this.f46623c.addView(inflate, layoutParams);
        d dVar = new d();
        View findViewById = inflate.findViewById(m.f45558c);
        ImageView imageView = (ImageView) findViewById;
        imageView.setOnTouchListener(dVar);
        imageView.setOnClickListener(new b(this, dVar));
        imageView.setOnLongClickListener(new c(this, dVar));
        C17542s.i(findViewById, "floatingButtonLayout.fin…uchedListener))\n        }");
        C17542s.i(inflate, "floatingButtonLayout");
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new X6(this));
        C17542s.j(inflate, "<set-?>");
        this.f46625e = inflate;
        this.f46629i = new C7114a0(this.f46624d, C8886a.f56874d.b(this.f46622b).f(), new f(this));
        this.f46628h = new I(this.f46624d, new g(this));
        this.f46633m = C16314k.d(S.a(C16311i0.c()), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }
}
