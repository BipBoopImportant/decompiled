package com.contentsquare.android.sdk;

import D8.c;
import TJ.C16505B;
import XH.C16807N;
import YH.C16877v;
import a9.C6822f0;
import a9.C6839h1;
import a9.C6886n0;
import a9.C6892n6;
import a9.C6897o3;
import a9.C6905p3;
import a9.C6908p6;
import a9.C6912q2;
import a9.C6984z3;
import a9.D4;
import a9.K2;
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
import kotlin.jvm.internal.C17544u;
import l8.C8537a;
import nI.p;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.o0  reason: case insensitive filesystem */
public final class C7143o0 extends C7140n0<C7158w0.d> {

    /* renamed from: e  reason: collision with root package name */
    public final E f47559e;

    /* renamed from: f  reason: collision with root package name */
    public final C6822f0 f47560f;

    /* renamed from: g  reason: collision with root package name */
    public final Q3 f47561g;

    /* renamed from: h  reason: collision with root package name */
    public final C6839h1 f47562h;

    /* renamed from: i  reason: collision with root package name */
    public final p<View, W3, C6984z3> f47563i;

    /* renamed from: j  reason: collision with root package name */
    public final C6905p3 f47564j;

    /* renamed from: k  reason: collision with root package name */
    public final C6897o3 f47565k;

    /* renamed from: l  reason: collision with root package name */
    public final c f47566l = new c("VerticalRecyclerViewScreenRecorder");

    /* renamed from: m  reason: collision with root package name */
    public C6912q2 f47567m;

    /* renamed from: n  reason: collision with root package name */
    public C7153u f47568n;

    /* renamed from: com.contentsquare.android.sdk.o0$a */
    public static final class a extends C17544u implements p<View, C7153u, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f47569c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ C7143o0 f47570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, C7143o0 o0Var) {
            super(2);
            this.f47569c = view;
            this.f47570d = o0Var;
        }

        public final Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            C7153u uVar = (C7153u) obj2;
            C17542s.j(view, "view");
            C17542s.j(uVar, "jsonView");
            if (C17542s.e(view, this.f47569c)) {
                this.f47570d.f47568n = uVar;
            }
            return C16807N.f139792a;
        }
    }

    @f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalRecyclerViewScreenRecorder", f = "VerticalRecyclerViewScreenRecorder.kt", l = {73}, m = "runRecorder")
    /* renamed from: com.contentsquare.android.sdk.o0$b */
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public C7143o0 f47571c;

        /* renamed from: d  reason: collision with root package name */
        public C7158w0.d f47572d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f47573e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f47574f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ C7143o0 f47575g;

        /* renamed from: h  reason: collision with root package name */
        public int f47576h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C7143o0 o0Var, C17164e<? super b> eVar) {
            super(eVar);
            this.f47575g = o0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f47574f = obj;
            this.f47576h |= Integer.MIN_VALUE;
            return this.f47575g.f((C7158w0.d) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7143o0(C16505B b10, E e10, C6822f0 f0Var, Q3 q32, C7132j0 j0Var, C6908p6 p6Var, C6892n6 n6Var, C6905p3 p3Var, C6897o3 o3Var) {
        super(b10, p6Var);
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(e10, "externalViewsProcessor");
        C17542s.j(f0Var, "treeTraverser");
        C17542s.j(q32, "viewBitmapProviderFactory");
        C17542s.j(j0Var, "callback");
        C17542s.j(p6Var, "glassPane");
        C17542s.j(n6Var, "composeScreenGraphGenerator");
        C17542s.j(p3Var, "previewBitmapBuilder");
        C17542s.j(o3Var, "mergedScreenshotsBitmapBuilder");
        this.f47559e = e10;
        this.f47560f = f0Var;
        this.f47561g = q32;
        this.f47562h = j0Var;
        this.f47563i = n6Var;
        this.f47564j = p3Var;
        this.f47565k = o3Var;
    }

    public static ArrayList l(C7153u uVar) {
        List list;
        C17542s.j(uVar, "view");
        ArrayList arrayList = new ArrayList();
        arrayList.add(uVar);
        List<C7153u> list2 = uVar.f47641c;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C16877v.y(list2, 10));
            for (C7153u l10 : list2) {
                arrayList2.add(l(l10));
            }
            list = C16877v.A(arrayList2);
        } else {
            list = null;
        }
        if (list == null) {
            list = C16877v.n();
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public final c a() {
        return this.f47566l;
    }

    public final void c(C7158w0 w0Var) {
        C7158w0.d dVar = (C7158w0.d) w0Var;
        C17542s.j(dVar, "context");
        if (!C17542s.e(this.f47534c, dVar.f47686a)) {
            this.f47534c = null;
            this.f47535d = null;
            this.f47567m = null;
            this.f47568n = null;
            C6905p3 p3Var = this.f47564j;
            p3Var.f42794c = null;
            p3Var.f42795d = 0;
            p3Var.f42792a = 0;
            p3Var.f42793b = 0;
            C6897o3 o3Var = this.f47565k;
            o3Var.f42779a = null;
            o3Var.f42780b = 0;
            o3Var.f42781c = 0;
            o3Var.f42782d = 0;
            this.f47534c = dVar.f47686a;
        }
    }

    public final boolean g(C7158w0 w0Var) {
        C7158w0.d dVar = (C7158w0.d) w0Var;
        C17542s.j(dVar, "context");
        return dVar.f47690e.contains(0);
    }

    public final void j() {
        ViewGroup e10 = e();
        if (e10 != null) {
            C6905p3 p3Var = this.f47564j;
            int width = e10.getWidth();
            int height = e10.getHeight();
            p3Var.f42792a = width;
            p3Var.f42793b = height;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(com.contentsquare.android.sdk.C7158w0.d r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.contentsquare.android.sdk.C7143o0.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.contentsquare.android.sdk.o0$b r0 = (com.contentsquare.android.sdk.C7143o0.b) r0
            int r1 = r0.f47576h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f47576h = r1
            goto L_0x0018
        L_0x0013:
            com.contentsquare.android.sdk.o0$b r0 = new com.contentsquare.android.sdk.o0$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f47574f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f47576h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            android.view.ViewGroup r7 = r0.f47573e
            com.contentsquare.android.sdk.w0$d r1 = r0.f47572d
            com.contentsquare.android.sdk.o0 r0 = r0.f47571c
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
            a9.Q3 r2 = r6.f47561g
            com.contentsquare.android.sdk.K0 r4 = new com.contentsquare.android.sdk.K0
            a9.W1 r5 = new a9.W1
            r5.<init>()
            a9.a1 r2 = r2.f42228a
            r4.<init>(r5, r2)
            r0.f47571c = r6
            r0.f47572d = r7
            r0.f47573e = r8
            r0.f47576h = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7143o0.f(com.contentsquare.android.sdk.w0$d, dI.e):java.lang.Object");
    }

    public final void m(ViewGroup viewGroup, String str, C7158w0.d dVar, W3 w32) {
        Bitmap bitmap;
        String str2;
        String str3;
        String str4;
        List<C7153u> list;
        Integer num;
        int i10;
        C6912q2 q2Var;
        ViewGroup viewGroup2 = viewGroup;
        C7158w0.d dVar2 = dVar;
        W3 w33 = w32;
        C17542s.j(viewGroup2, "root");
        C17542s.j(dVar2, "context");
        C17542s.j(w33, "result");
        Bitmap a10 = w33.a(viewGroup2);
        if (dVar2.f47690e.contains(0)) {
            C6905p3 p3Var = this.f47564j;
            Rect rect = dVar2.f47689d;
            p3Var.getClass();
            C17542s.j(a10, "screenshot");
            C17542s.j(rect, "scrollContainerRect");
            p3Var.a(a10, new Rect(0, 0, a10.getWidth(), rect.top));
            C6897o3 o3Var = this.f47565k;
            Rect rect2 = dVar2.f47689d;
            o3Var.getClass();
            C17542s.j(a10, "screenshot");
            C17542s.j(rect2, "scrollContainerRect");
            Rect rect3 = new Rect(0, 0, a10.getWidth(), rect2.top);
            o3Var.b(a10, rect3);
            o3Var.f42780b = rect3.height() + o3Var.f42780b;
        }
        C6905p3 p3Var2 = this.f47564j;
        Rect rect4 = dVar2.f47694i;
        p3Var2.getClass();
        C17542s.j(a10, "screenshot");
        C17542s.j(rect4, "pageRect");
        p3Var2.a(a10, new Rect(0, rect4.top, a10.getWidth(), rect4.bottom));
        this.f47565k.c(a10, dVar2.f47694i);
        if (this.f47567m == null) {
            r1 r1Var = dVar2.f47693h;
            r1.b bVar = r1Var instanceof r1.b ? (r1.b) r1Var : null;
            if (bVar != null) {
                View view = bVar.f47611a;
                String h10 = h();
                C6822f0 f0Var = this.f47560f;
                C8537a[] aVarArr = ((D4) this.f47533b).f41962f;
                String str5 = h10;
                E e10 = this.f47559e;
                K2 k22 = new K2(viewGroup2, false);
                C8537a[] aVarArr2 = aVarArr;
                str2 = "scrollContainerRect";
                String str6 = str5;
                K2 k23 = k22;
                bitmap = a10;
                str4 = "<set-?>";
                p<View, W3, C6984z3> pVar = this.f47563i;
                str3 = "screenshot";
                C6912q2 a11 = f0Var.a(viewGroup, aVarArr2, e10, w32, k23, pVar, new a(view, this));
                a11.f42805a = str;
                C17542s.j(str6, str4);
                a11.f42806b = str6;
                this.f47567m = a11;
            } else {
                throw new IllegalStateException("context.config should be ScrollableSnapshotConfig.LongVertical!");
            }
        } else {
            str3 = "screenshot";
            bitmap = a10;
            str2 = "scrollContainerRect";
            str4 = "<set-?>";
        }
        C6897o3 o3Var2 = this.f47565k;
        o3Var2.getClass();
        Bitmap bitmap2 = o3Var2.f42779a;
        C17542s.g(bitmap2);
        R0 r02 = new R0(bitmap2, o3Var2.f42781c);
        List<View> list2 = dVar2.f47688c;
        C17542s.j(r02, "result");
        C17542s.j(list2, "itemViews");
        ArrayList arrayList = new ArrayList(C16877v.y(list2, 10));
        for (View view2 : list2) {
            if (view2 instanceof ViewGroup) {
                q2Var = this.f47560f.a((ViewGroup) view2, ((D4) this.f47533b).f41962f, this.f47559e, r02, new K2(view2, false), this.f47563i, C6886n0.f42722a);
            } else {
                C6822f0 f0Var2 = this.f47560f;
                C8537a[] aVarArr3 = ((D4) this.f47533b).f41962f;
                K2 k24 = new K2(view2, false);
                f0Var2.getClass();
                C17542s.j(view2, "view");
                C17542s.j(aVarArr3, "cVars");
                C17542s.j(r02, "viewBitmapProviderResult");
                C17542s.j(k24, "screenGraphParameters");
                C6912q2 q2Var2 = new C6912q2();
                List<C7153u> e11 = C16877v.e(C7159x.a(view2, r02, k24, f0Var2.f42547b.get()));
                C17542s.j(e11, str4);
                q2Var2.f42808d = e11;
                C17542s.j(aVarArr3, str4);
                q2Var2.f42807c = aVarArr3;
                q2Var = q2Var2;
            }
            arrayList.add(q2Var);
        }
        List<C6912q2> t12 = C16877v.t1(arrayList);
        C6912q2 q2Var3 = this.f47567m;
        if (q2Var3 == null || this.f47568n == null) {
            throw new IllegalStateException("Invalid item screen graph");
        }
        C17542s.g(q2Var3);
        C7153u uVar = this.f47568n;
        C17542s.g(uVar);
        int i11 = this.f47565k.f42782d;
        C17542s.j(dVar2, "context");
        C17542s.j(q2Var3, "current");
        C17542s.j(uVar, "recyclerView");
        C17542s.j(t12, "itemGraphs");
        if (dVar2.f47690e.contains(0)) {
            C17542s.j(uVar, "recyclerView");
            uVar.f47641c = C16877v.n();
        }
        C17542s.j(uVar, "recyclerView");
        C17542s.j(t12, "itemGraphs");
        List<C7153u> list3 = uVar.f47641c;
        if (list3 == null || (list = C16877v.w1(list3)) == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (C6912q2 q2Var4 : t12) {
            C16877v.E(arrayList2, q2Var4.f42808d);
        }
        C17542s.j(arrayList2, "items");
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C7153u uVar2 = (C7153u) it.next();
            JSONObject jSONObject = uVar2.f47644f;
            jSONObject.put("y", jSONObject.getInt("y") + i11);
            List<C7153u> list4 = uVar2.f47641c;
            if (list4 != null) {
                ArrayList arrayList3 = new ArrayList(C16877v.y(list4, 10));
                for (C7153u l10 : list4) {
                    arrayList3.add(l(l10));
                }
                List<C7153u> A10 = C16877v.A(arrayList3);
                if (A10 != null) {
                    for (C7153u uVar3 : A10) {
                        JSONObject jSONObject2 = uVar3.f47644f;
                        jSONObject2.put("y", jSONObject2.getInt("y") + i11);
                    }
                }
            }
        }
        list.addAll(arrayList2);
        uVar.f47641c = list;
        this.f47567m = q2Var3;
        Iterator<T> it2 = dVar2.f47687b.iterator();
        if (it2.hasNext()) {
            Integer valueOf = Integer.valueOf(((Rect) it2.next()).bottom);
            loop5:
            while (true) {
                num = valueOf;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop5;
                    }
                    valueOf = Integer.valueOf(((Rect) it2.next()).bottom);
                    if (num.compareTo(valueOf) < 0) {
                    }
                }
            }
        } else {
            num = null;
        }
        if (num != null) {
            this.f47565k.a(num.intValue());
        }
        if (dVar2.f47690e.contains(Integer.valueOf(dVar2.f47691f - 1))) {
            C6905p3 p3Var3 = this.f47564j;
            Rect rect5 = dVar2.f47689d;
            p3Var3.getClass();
            Bitmap bitmap3 = bitmap;
            C17542s.j(bitmap3, str3);
            C17542s.j(rect5, str2);
            p3Var3.a(bitmap3, new Rect(0, rect5.bottom, bitmap3.getWidth(), bitmap3.getHeight()));
            Bitmap bitmap4 = this.f47564j.f42794c;
            C6912q2 q2Var5 = this.f47567m;
            if (q2Var5 == null || bitmap4 == null) {
                throw new IllegalStateException("Invalid screen graph");
            }
            C17542s.g(q2Var5);
            C17542s.j(q2Var5, "screenGraph");
            C17542s.j(bitmap4, str3);
            String str7 = "";
            if (this.f47559e.d()) {
                K0.a aVar = new K0.a(bitmap4, false);
                E e12 = this.f47559e;
                C17542s.j(bitmap4, "bitmap");
                if (bitmap4.getHeight() > 0 && bitmap4.getWidth() > 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap4.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C17542s.i(byteArray, "stream.toByteArray()");
                    C17542s.j(byteArray, "imageByteArray");
                    String encodeToString = Base64.encodeToString(byteArray, 2);
                    C17542s.i(encodeToString, "encodeToString(imageByteArray, Base64.NO_WRAP)");
                    str7 = encodeToString;
                }
                e12.c(q2Var5, str7, aVar, this.f47562h, this.f47532a);
                i10 = 0;
            } else {
                this.f47532a.a(C7134k0.g.f47482a);
                C6839h1 h1Var = this.f47562h;
                C17542s.j(bitmap4, "bitmap");
                if (bitmap4.getHeight() > 0 && bitmap4.getWidth() > 0) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmap4.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    C17542s.i(byteArray2, "stream.toByteArray()");
                    C17542s.j(byteArray2, "imageByteArray");
                    str7 = Base64.encodeToString(byteArray2, 2);
                    C17542s.i(str7, "encodeToString(imageByteArray, Base64.NO_WRAP)");
                }
                i10 = 0;
                h1Var.a(q2Var5, str7, false);
            }
            this.f47534c = null;
            this.f47535d = null;
            this.f47567m = null;
            this.f47568n = null;
            C6905p3 p3Var4 = this.f47564j;
            p3Var4.f42794c = null;
            p3Var4.f42795d = i10;
            p3Var4.f42792a = i10;
            p3Var4.f42793b = i10;
            C6897o3 o3Var3 = this.f47565k;
            o3Var3.f42779a = null;
            o3Var3.f42780b = i10;
            o3Var3.f42781c = i10;
            o3Var3.f42782d = i10;
        }
    }
}
