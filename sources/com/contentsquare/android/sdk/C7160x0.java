package com.contentsquare.android.sdk;

import D8.c;
import G8.g;
import TJ.C16505B;
import XH.C16807N;
import YH.C16877v;
import a9.B0;
import a9.C6801c3;
import a9.C6822f0;
import a9.C6839h1;
import a9.C6892n6;
import a9.C6908p6;
import a9.C6912q2;
import a9.C6966x1;
import a9.C6984z3;
import a9.D4;
import a9.G4;
import a9.K2;
import a9.P2;
import a9.Q3;
import a9.W3;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7158w0;
import com.contentsquare.android.sdk.K0;
import com.contentsquare.android.sdk.r1;
import dI.C17164e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.x0  reason: case insensitive filesystem */
public final class C7160x0 extends C7140n0<C7158w0.e> {

    /* renamed from: e  reason: collision with root package name */
    public final P2 f47702e;

    /* renamed from: f  reason: collision with root package name */
    public final E f47703f;

    /* renamed from: g  reason: collision with root package name */
    public final C6822f0 f47704g;

    /* renamed from: h  reason: collision with root package name */
    public final Q3 f47705h;

    /* renamed from: i  reason: collision with root package name */
    public final C6839h1 f47706i;

    /* renamed from: j  reason: collision with root package name */
    public final G4 f47707j;

    /* renamed from: k  reason: collision with root package name */
    public final C6966x1<B0> f47708k;

    /* renamed from: l  reason: collision with root package name */
    public final p<View, W3, C6984z3> f47709l;

    /* renamed from: m  reason: collision with root package name */
    public final c f47710m = new c("VerticalScrollViewScreenRecorder");

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalScrollViewScreenRecorder", f = "VerticalScrollViewScreenRecorder.kt", l = {69}, m = "runRecorder")
    /* renamed from: com.contentsquare.android.sdk.x0$a */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public C7160x0 f47711c;

        /* renamed from: d  reason: collision with root package name */
        public C7158w0.e f47712d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f47713e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47714f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C7160x0 f47715g;

        /* renamed from: h  reason: collision with root package name */
        public int f47716h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C7160x0 x0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f47715g = x0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47714f = obj;
            this.f47716h |= Integer.MIN_VALUE;
            return this.f47715g.f((C7158w0.e) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7160x0(C16505B b10, P2 p22, E e10, C6822f0 f0Var, Q3 q32, C7132j0 j0Var, C6908p6 p6Var, G4 g42, C6801c3 c3Var, C6892n6 n6Var) {
        super(b10, p6Var);
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(p22, "pauseStateGetter");
        C17542s.j(e10, "externalViewsProcessor");
        C17542s.j(f0Var, "treeTraverser");
        C17542s.j(q32, "viewBitmapProviderFactory");
        C17542s.j(j0Var, "callback");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(g42, "screenWiseGraphHelper");
        C17542s.j(c3Var, "screenAppendStrategy");
        C17542s.j(n6Var, "composeScreenGraphGenerator");
        this.f47702e = p22;
        this.f47703f = e10;
        this.f47704g = f0Var;
        this.f47705h = q32;
        this.f47706i = j0Var;
        this.f47707j = g42;
        this.f47708k = c3Var;
        this.f47709l = n6Var;
    }

    public final c a() {
        return this.f47710m;
    }

    public final void c(C7158w0 w0Var) {
        C7158w0.e eVar = (C7158w0.e) w0Var;
        C17542s.j(eVar, "context");
        if (!C17542s.e(this.f47534c, eVar.f47695a)) {
            this.f47535d = null;
            this.f47534c = eVar.f47695a;
        }
    }

    public final boolean g(C7158w0 w0Var) {
        C7158w0.e eVar = (C7158w0.e) w0Var;
        C17542s.j(eVar, "context");
        return eVar.f47698d == 0;
    }

    public final void j() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(com.contentsquare.android.sdk.C7158w0.e r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.contentsquare.android.sdk.C7160x0.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.contentsquare.android.sdk.x0$a r0 = (com.contentsquare.android.sdk.C7160x0.a) r0
            int r1 = r0.f47716h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47716h = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.x0$a r0 = new com.contentsquare.android.sdk.x0$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f47714f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47716h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            android.view.ViewGroup r7 = r0.f47713e
            com.contentsquare.android.sdk.w0$e r1 = r0.f47712d
            com.contentsquare.android.sdk.x0 r0 = r0.f47711c
            XH.y.b(r8)
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            XH.y.b(r8)
            android.view.ViewGroup r8 = r6.e()
            if (r8 == 0) goto L_0x007b
            a9.Q3 r2 = r6.f47705h
            com.contentsquare.android.sdk.K0 r4 = new com.contentsquare.android.sdk.K0
            a9.W1 r5 = new a9.W1
            r5.<init>()
            a9.a1 r2 = r2.f42228a
            r4.<init>(r5, r2)
            r0.f47711c = r6
            r0.f47712d = r7
            r0.f47713e = r8
            r0.f47716h = r3
            java.lang.Object r0 = r4.a(r0)
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r6
        L_0x0061:
            a9.W3 r8 = (a9.W3) r8
            java.lang.String r2 = r0.i()     // Catch:{ all -> 0x0072 }
            r0.m(r7, r2, r1, r8)     // Catch:{ all -> 0x0072 }
            android.graphics.Bitmap r7 = r8.a(r7)
            r7.recycle()
            goto L_0x007b
        L_0x0072:
            r0 = move-exception
            android.graphics.Bitmap r7 = r8.a(r7)
            r7.recycle()
            throw r0
        L_0x007b:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7160x0.f(com.contentsquare.android.sdk.w0$e, dI.e):java.lang.Object");
    }

    public final void l(C6912q2 q2Var, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        String str = "";
        if (this.f47703f.d()) {
            K0.a aVar = new K0.a(bitmap2, false);
            E e10 = this.f47703f;
            C17542s.j(bitmap2, "bitmap");
            if (bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C17542s.i(byteArray, "stream.toByteArray()");
                C17542s.j(byteArray, "imageByteArray");
                str = Base64.encodeToString(byteArray, 2);
                C17542s.i(str, "encodeToString(imageByteArray, Base64.NO_WRAP)");
            }
            e10.c(q2Var, str, aVar, this.f47706i, this.f47532a);
            return;
        }
        this.f47532a.a(C7134k0.g.f47482a);
        C6839h1 h1Var = this.f47706i;
        C17542s.j(bitmap2, "bitmap");
        if (bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            C17542s.i(byteArray2, "stream.toByteArray()");
            C17542s.j(byteArray2, "imageByteArray");
            str = Base64.encodeToString(byteArray2, 2);
            C17542s.i(str, "encodeToString(imageByteArray, Base64.NO_WRAP)");
        }
        h1Var.a(q2Var, str, false);
    }

    public final void m(ViewGroup viewGroup, String str, C7158w0.e eVar, W3 w32) {
        boolean z10;
        boolean z11;
        T t10;
        int childCount;
        JSONObject jSONObject;
        ArrayList arrayList;
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        C7158w0.e eVar2 = eVar;
        W3 w33 = w32;
        C17542s.j(viewGroup2, "root");
        C17542s.j(eVar2, "context");
        C17542s.j(w33, "result");
        Bitmap bitmap = this.f47535d;
        C17542s.j(viewGroup2, "root");
        C17542s.j(eVar2, "context");
        C17542s.j(w33, "result");
        Bitmap a10 = w33.a(viewGroup2);
        if (eVar2.f47700f instanceof r1.b) {
            int i10 = eVar2.f47699e;
            if (i10 != 1) {
                C6966x1<B0> x1Var = this.f47708k;
                Rect rect = eVar2.f47697c;
                int i11 = eVar2.f47696b.y;
                int i12 = eVar2.f47698d;
                a10 = x1Var.a(bitmap, a10, new B0(rect, i11, i10, i12 == 0, i10 == i12 + 1));
            }
            this.f47535d = a10;
            if (this.f47702e.f42201a.f42318a.get()) {
                this.f47532a.a(C7134k0.d.f47477a);
            } else {
                this.f47532a.a(new C7134k0.e(eVar2.f47698d, eVar2.f47699e));
            }
            if (eVar2.f47699e == eVar2.f47698d + 1) {
                O o10 = new O();
                C7147q0 q0Var = new C7147q0(eVar2, o10);
                String h10 = h();
                C6912q2 a11 = this.f47704g.a(viewGroup, ((D4) this.f47533b).f41962f, this.f47703f, w32, new K2(viewGroup2, false), this.f47709l, q0Var);
                a11.f42805a = str2;
                C17542s.j(h10, "<set-?>");
                a11.f42806b = h10;
                Bitmap bitmap2 = this.f47535d;
                if (bitmap2 != null) {
                    K0.a aVar = new K0.a(bitmap2, true);
                    O o11 = new O();
                    View a12 = eVar2.f47700f.a();
                    ViewGroup viewGroup3 = a12 instanceof ViewGroup ? (ViewGroup) a12 : null;
                    if (viewGroup3 == null) {
                        viewGroup3 = viewGroup;
                    }
                    C7152t0 t0Var = new C7152t0(eVar2, o11);
                    String h11 = h();
                    O o12 = o11;
                    C6912q2 a13 = this.f47704g.a(viewGroup3, ((D4) this.f47533b).f41962f, this.f47703f, aVar, new K2(viewGroup3, false), this.f47709l, t0Var);
                    a13.f42805a = str2;
                    C17542s.j(h11, "<set-?>");
                    a13.f42806b = h11;
                    if (o10.f144348a == null) {
                        View a14 = eVar2.f47700f.a();
                        ViewGroup viewGroup4 = a14 instanceof ViewGroup ? (ViewGroup) a14 : null;
                        if (!(viewGroup4 == null || (childCount = viewGroup4.getChildCount()) == 0)) {
                            if (childCount == 1) {
                                View childAt = viewGroup4.getChildAt(0);
                                C7153u uVar = a13.f42808d.size() == 1 ? a13.f42808d.get(0) : null;
                                if ((childAt instanceof ViewGroup) || uVar == null || (jSONObject = uVar.f47640b) == null || !jSONObject.has("fullpath")) {
                                    throw new IllegalStateException("Invalid single child snapshot");
                                }
                                this.f47707j.getClass();
                                C17542s.j(a11, "fullScreenGraph");
                                C17542s.j(uVar, "replacement");
                                String g10 = g.g(uVar.f47640b, "fullpath");
                                if (g10 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.addAll(a11.f42808d);
                                    boolean z12 = false;
                                    while (!arrayList2.isEmpty() && !z12) {
                                        C7153u uVar2 = (C7153u) arrayList2.remove(0);
                                        List<C7153u> list = uVar2.f47641c;
                                        if (list != null) {
                                            for (C7153u uVar3 : list) {
                                                if (C17542s.e(g10, g.g(uVar3.f47640b, "fullpath"))) {
                                                    List<C7153u> list2 = uVar2.f47641c;
                                                    if (list2 != null) {
                                                        arrayList = new ArrayList(C16877v.y(list2, 10));
                                                        for (C7153u uVar4 : list2) {
                                                            if (C17542s.e(uVar4, uVar3)) {
                                                                uVar4 = uVar;
                                                            }
                                                            arrayList.add(uVar4);
                                                        }
                                                    } else {
                                                        arrayList = null;
                                                    }
                                                    uVar2.f47641c = arrayList;
                                                    z12 = true;
                                                }
                                                arrayList2.add(uVar3);
                                            }
                                        }
                                    }
                                }
                                l(a11, bitmap2);
                                return;
                            }
                            throw new IllegalStateException("Invalid scroll container content");
                        }
                    } else {
                        if (this.f47535d != null) {
                            O o13 = o12;
                            if (o13.f144348a != null) {
                                G4 g42 = this.f47707j;
                                Rect rect2 = eVar2.f47697c;
                                int i13 = eVar2.f47696b.y;
                                int i14 = eVar2.f47699e;
                                int i15 = eVar2.f47698d;
                                if (i15 == 0) {
                                    z11 = true;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                    z11 = true;
                                }
                                B0 b02 = new B0(rect2, i13, i14, z10, i14 == i15 + (z11 ? 1 : 0) ? z11 : false);
                                Rect rect3 = new Rect();
                                viewGroup.getGlobalVisibleRect(rect3);
                                C16807N n10 = C16807N.f139792a;
                                Bitmap bitmap3 = this.f47535d;
                                C17542s.g(bitmap3);
                                T t11 = o13.f144348a;
                                C17542s.g(t11);
                                g42.b(b02, rect3, bitmap3, (C7153u) t11);
                                T t12 = o10.f144348a;
                                C17542s.g(t12);
                                T t13 = o13.f144348a;
                                C17542s.g(t13);
                                ((C7153u) t12).f47641c = ((C7153u) t13).f47641c;
                                G4 g43 = this.f47707j;
                                T t14 = o10.f144348a;
                                C17542s.g(t14);
                                C7153u uVar5 = (C7153u) t14;
                                g43.getClass();
                                C17542s.j(uVar5, "containerViewJson");
                                List<C7153u> list3 = uVar5.f47641c;
                                if (list3 != null) {
                                    Iterator<T> it = list3.iterator();
                                    if (!it.hasNext()) {
                                        t10 = null;
                                    } else {
                                        T next = it.next();
                                        if (!it.hasNext()) {
                                            t10 = next;
                                        } else {
                                            C7153u uVar6 = (C7153u) next;
                                            int i16 = uVar6.f47644f.getInt("height") + uVar6.f47644f.getInt("y");
                                            do {
                                                T next2 = it.next();
                                                C7153u uVar7 = (C7153u) next2;
                                                int i17 = uVar7.f47644f.getInt("height") + uVar7.f47644f.getInt("y");
                                                if (i16 < i17) {
                                                    next = next2;
                                                    i16 = i17;
                                                }
                                            } while (it.hasNext());
                                        }
                                        t10 = next;
                                    }
                                    C7153u uVar8 = (C7153u) t10;
                                    if (uVar8 != null) {
                                        uVar5.f47644f.put("height", (uVar8.f47644f.getInt("height") + uVar8.f47644f.getInt("y")) - uVar5.f47644f.getInt("y"));
                                    }
                                }
                            }
                        }
                        throw new IllegalStateException("Invalid snapshot");
                    }
                    l(a11, bitmap2);
                    return;
                }
                throw new IllegalStateException("Merged screenshot missing");
            }
            return;
        }
        throw new IllegalStateException(("SnapshotConfig not supported: " + eVar2.f47700f).toString());
    }
}
