package com.contentsquare.android.sdk;

import D8.c;
import TJ.C16505B;
import XH.C16807N;
import a9.B0;
import a9.C6801c3;
import a9.C6822f0;
import a9.C6839h1;
import a9.C6892n6;
import a9.C6908p6;
import a9.C6912q2;
import a9.C6966x1;
import a9.D4;
import a9.G4;
import a9.K2;
import a9.Q3;
import a9.W3;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C7134k0;
import com.contentsquare.android.sdk.C7158w0;
import com.contentsquare.android.sdk.E;
import com.contentsquare.android.sdk.K0;
import dI.C17164e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;

/* renamed from: com.contentsquare.android.sdk.b0  reason: case insensitive filesystem */
public final class C7116b0 extends C7140n0<C7158w0.b> {

    /* renamed from: e  reason: collision with root package name */
    public final E f47300e;

    /* renamed from: f  reason: collision with root package name */
    public final C6822f0 f47301f;

    /* renamed from: g  reason: collision with root package name */
    public final Q3 f47302g;

    /* renamed from: h  reason: collision with root package name */
    public final C6839h1 f47303h;

    /* renamed from: i  reason: collision with root package name */
    public final C6892n6 f47304i;

    /* renamed from: j  reason: collision with root package name */
    public final G4 f47305j;

    /* renamed from: k  reason: collision with root package name */
    public final C6966x1<B0> f47306k;

    /* renamed from: l  reason: collision with root package name */
    public final c f47307l = new c("VerticalComposeScrollRecorder");

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeScrollRecorder", f = "VerticalComposeScrollRecorder.kt", l = {64}, m = "runRecorder")
    /* renamed from: com.contentsquare.android.sdk.b0$a */
    public static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public C7116b0 f47308c;

        /* renamed from: d  reason: collision with root package name */
        public C7158w0.b f47309d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f47310e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47311f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C7116b0 f47312g;

        /* renamed from: h  reason: collision with root package name */
        public int f47313h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C7116b0 b0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f47312g = b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47311f = obj;
            this.f47313h |= Integer.MIN_VALUE;
            return this.f47312g.f((C7158w0.b) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7116b0(C16505B b10, E e10, C6822f0 f0Var, Q3 q32, C7132j0 j0Var, C6908p6 p6Var, C6892n6 n6Var, G4 g42, C6801c3 c3Var) {
        super(b10, p6Var);
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(e10, "externalViewsProcessor");
        C17542s.j(f0Var, "treeTraverser");
        C17542s.j(q32, "viewBitmapProviderFactory");
        C17542s.j(j0Var, "callback");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(n6Var, "composeJsonViewProcessor");
        C17542s.j(g42, "screenWiseGraphHelper");
        C17542s.j(c3Var, "screenAppendStrategy");
        this.f47300e = e10;
        this.f47301f = f0Var;
        this.f47302g = q32;
        this.f47303h = j0Var;
        this.f47304i = n6Var;
        this.f47305j = g42;
        this.f47306k = c3Var;
    }

    public static C7153u k(ArrayList arrayList, C7158w0.b bVar) {
        C17542s.j(arrayList, "androidComposeViewJsonList");
        C17542s.j(bVar, "context");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<C7153u> list = ((C7153u) it.next()).f47641c;
            C7153u uVar = list != null ? list.get(0) : null;
            if (uVar != null) {
                arrayList2.add(uVar);
            }
        }
        return l(arrayList2, bVar.f47684c.f());
    }

    public static C7153u l(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7153u uVar = (C7153u) it.next();
                if (!C17542s.e(uVar.f47639a, str)) {
                    uVar = l(uVar.f47641c, str);
                    continue;
                }
                if (uVar != null) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public final c a() {
        return this.f47307l;
    }

    public final void c(C7158w0 w0Var) {
        C7158w0.b bVar = (C7158w0.b) w0Var;
        C17542s.j(bVar, "context");
        if (!C17542s.e(this.f47534c, bVar.f47682a)) {
            this.f47535d = null;
            this.f47534c = bVar.f47682a;
        }
    }

    public final boolean g(C7158w0 w0Var) {
        C7158w0.b bVar = (C7158w0.b) w0Var;
        C17542s.j(bVar, "context");
        return bVar.f47683b == 0;
    }

    public final void j() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(com.contentsquare.android.sdk.C7158w0.b r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.contentsquare.android.sdk.C7116b0.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.contentsquare.android.sdk.b0$a r0 = (com.contentsquare.android.sdk.C7116b0.a) r0
            int r1 = r0.f47313h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47313h = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.b0$a r0 = new com.contentsquare.android.sdk.b0$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f47311f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47313h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            android.view.ViewGroup r7 = r0.f47310e
            com.contentsquare.android.sdk.w0$b r1 = r0.f47309d
            com.contentsquare.android.sdk.b0 r0 = r0.f47308c
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
            a9.Q3 r2 = r6.f47302g
            com.contentsquare.android.sdk.K0 r4 = new com.contentsquare.android.sdk.K0
            a9.W1 r5 = new a9.W1
            r5.<init>()
            a9.a1 r2 = r2.f42228a
            r4.<init>(r5, r2)
            r0.f47308c = r6
            r0.f47309d = r7
            r0.f47310e = r8
            r0.f47313h = r3
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
            r0.o(r7, r2, r1, r8)     // Catch:{ all -> 0x0072 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7116b0.f(com.contentsquare.android.sdk.w0$b, dI.e):java.lang.Object");
    }

    public final void n(C6912q2 q2Var, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        String str = "";
        if (this.f47300e.d()) {
            K0.a aVar = new K0.a(bitmap2, false);
            E e10 = this.f47300e;
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
            e10.c(q2Var, str, aVar, this.f47303h, this.f47532a);
            return;
        }
        this.f47532a.a(C7134k0.g.f47482a);
        C6839h1 h1Var = this.f47303h;
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

    public final void o(ViewGroup viewGroup, String str, C7158w0.b bVar, W3 w32) {
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        C7158w0.b bVar2 = bVar;
        W3 w33 = w32;
        C17542s.j(viewGroup2, "root");
        C17542s.j(bVar2, "context");
        C17542s.j(w33, "result");
        Bitmap bitmap = this.f47535d;
        C17542s.j(viewGroup2, "root");
        C17542s.j(bVar2, "context");
        C17542s.j(w33, "result");
        Bitmap a10 = w33.a(viewGroup2);
        if (bVar2.f47684c.g() != 1) {
            a10 = this.f47306k.a(bitmap, a10, new B0(bVar2.f47684c.d(), bVar2.f47684c.e(), bVar2.f47684c.g(), bVar2.f47683b == 0, bVar2.f47684c.g() == bVar2.f47683b + 1));
        }
        this.f47535d = a10;
        if (bVar2.f47684c.g() != bVar2.f47683b + 1) {
        } else if (str2 != null) {
            C17542s.j(viewGroup2, "root");
            C17542s.j(str2, "screenUrl");
            C17542s.j(w33, "result");
            C17542s.j(bVar2, "context");
            ArrayList arrayList = new ArrayList();
            X x10 = new X(arrayList);
            String str3 = "context";
            String h10 = h();
            String str4 = "screenUrl";
            C6912q2 a11 = this.f47301f.a(viewGroup, ((D4) this.f47533b).f41962f, this.f47300e, w32, new K2(viewGroup2, false), this.f47304i, x10);
            a11.f42805a = str2;
            C17542s.j(h10, "<set-?>");
            a11.f42806b = h10;
            C7153u k10 = k(arrayList, bVar2);
            E e10 = this.f47300e;
            e10.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(e10.f46949e);
            for (Map.Entry next : e10.f46950f.entrySet()) {
                Object key = next.getKey();
                C17542s.i(key, "entry.key");
                linkedHashMap.put(key, ((E.b) next.getValue()).f46956a);
            }
            C17542s.j(a11, "screenGraph");
            C17542s.j(linkedHashMap, "externalJsonViewsMap");
            Bitmap bitmap2 = this.f47535d;
            if (bitmap2 != null) {
                K0.a aVar = new K0.a(bitmap2, true);
                C17542s.j(viewGroup2, "root");
                C17542s.j(str2, str4);
                C17542s.j(aVar, "resultFullScreen");
                C17542s.j(bVar2, str3);
                ArrayList arrayList2 = new ArrayList();
                Y y10 = new Y(arrayList2);
                String h11 = h();
                C6822f0 f0Var = this.f47301f;
                C8537a[] aVarArr = ((D4) this.f47533b).f41962f;
                E e11 = this.f47300e;
                Bitmap bitmap3 = bitmap2;
                C7153u uVar = k10;
                K2 k22 = new K2(viewGroup2, false);
                String str5 = h11;
                Bitmap bitmap4 = bitmap3;
                C6912q2 q2Var = a11;
                C6912q2 a12 = f0Var.a(viewGroup, aVarArr, e11, aVar, k22, this.f47304i, y10);
                a12.f42805a = str2;
                C17542s.j(str5, "<set-?>");
                a12.f42806b = str5;
                C7153u k11 = k(arrayList2, bVar2);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    E e12 = this.f47300e;
                    View view = (View) entry.getKey();
                    C7153u uVar2 = (C7153u) entry.getValue();
                    e12.getClass();
                    C17542s.j(view, "view");
                    C17542s.j(uVar2, "jsonView");
                    if (view instanceof WebView) {
                        e12.f46949e.put(view, uVar2);
                    } else {
                        com.contentsquare.android.api.bridge.flutter.a aVar2 = E.f46944g.get(view);
                        if (aVar2 != null) {
                            e12.f46950f.put(view, new E.b(uVar2, aVar2));
                        }
                    }
                }
                if (uVar == null) {
                    n(q2Var, bitmap4);
                    return;
                }
                Bitmap bitmap5 = bitmap4;
                if (this.f47535d == null || k11 == null) {
                    throw new IllegalStateException("Invalid snapshot");
                }
                G4 g42 = this.f47305j;
                B0 b02 = new B0(bVar2.f47684c.d(), bVar2.f47684c.e(), bVar2.f47684c.g(), bVar2.f47683b == 0, bVar2.f47684c.g() == bVar2.f47683b + 1);
                Rect rect = new Rect();
                viewGroup.getGlobalVisibleRect(rect);
                C16807N n10 = C16807N.f139792a;
                g42.b(b02, rect, bitmap5, k11);
                uVar.f47641c = k11.f47641c;
                n(q2Var, bitmap5);
                return;
            }
            throw new IllegalStateException("Merged screenshot is null!");
        } else {
            throw new IllegalStateException("Screen url is null!");
        }
    }
}
