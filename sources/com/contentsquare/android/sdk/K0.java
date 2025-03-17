package com.contentsquare.android.sdk;

import D8.c;
import G8.g;
import GJ.C15765h;
import GJ.C15768k;
import I2.C4610g0;
import XH.v;
import YH.C16877v;
import a9.C6783a1;
import a9.C6826f4;
import a9.C6866k4;
import a9.C6874l4;
import a9.C6936t3;
import a9.C6937t4;
import a9.W1;
import a9.W3;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.contentsquare.android.sdk.a1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class K0 {

    /* renamed from: a  reason: collision with root package name */
    public final W1 f47025a;

    /* renamed from: b  reason: collision with root package name */
    public final C6783a1 f47026b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f47027c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f47028d;

    /* renamed from: e  reason: collision with root package name */
    public final c f47029e = new c("ViewBitmapProviderPixelCopy");

    public static class a implements W3 {

        /* renamed from: d  reason: collision with root package name */
        public static final Bitmap f47030d;

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f47031a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47032b;

        /* renamed from: c  reason: collision with root package name */
        public final a1 f47033c = new a1();

        static {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            C17542s.i(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
            f47030d = createBitmap;
        }

        public a(Bitmap bitmap, boolean z10) {
            C17542s.j(bitmap, "bitmap");
            this.f47031a = bitmap;
            this.f47032b = z10;
        }

        public final Bitmap a(View view) {
            C17542s.j(view, "root");
            return this.f47031a;
        }

        public final String b(View view) {
            C17542s.j(view, "view");
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            return d(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        }

        public final String c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "root");
            Bitmap bitmap = this.f47031a;
            C17542s.j(bitmap, "bitmap");
            if (bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
                return "";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C17542s.i(byteArray, "stream.toByteArray()");
            C17542s.j(byteArray, "imageByteArray");
            String encodeToString = Base64.encodeToString(byteArray, 2);
            C17542s.i(encodeToString, "encodeToString(imageByteArray, Base64.NO_WRAP)");
            return encodeToString;
        }

        public String d(int i10, int i11, int i12, int i13) {
            Bitmap bitmap;
            int i14 = i10;
            int i15 = i11;
            int i16 = i12;
            int i17 = i13;
            a1 a1Var = this.f47033c;
            int width = this.f47031a.getWidth();
            int height = this.f47031a.getHeight();
            a1Var.getClass();
            boolean z10 = i14 + i16 > 0 && i15 + i17 > 0 && i14 < width && i15 < height;
            this.f47033c.getClass();
            if (i16 <= 0 || i17 <= 0 || !z10) {
                Bitmap bitmap2 = f47030d;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C17542s.i(byteArray, "getByteArrayOutputStream…ULT_BITMAP).toByteArray()");
                return C6936t3.a(byteArray);
            }
            a1.a a10 = this.f47033c.a(i10, i11, i12, i13, 0, 0, this.f47031a.getWidth(), this.f47031a.getHeight());
            C17542s.i(a10, "rectangleMaths\n         ….height\n                )");
            if (a10.f47285b == 0.0f) {
                bitmap = Bitmap.createBitmap(this.f47031a, i14, i15, i16, i17);
                C17542s.i(bitmap, "{\n                Bitmap…th, height)\n            }");
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                C17542s.i(createBitmap, "createBitmap(\n          …GB_8888\n                )");
                Bitmap bitmap3 = this.f47031a;
                Rect rect = a10.f47284a;
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap3, rect.left, rect.top, rect.width(), a10.f47284a.height());
                C17542s.i(createBitmap2, "createBitmap(\n          …t()\n                    )");
                a1 a1Var2 = this.f47033c;
                Rect rect2 = a10.f47284a;
                int i18 = rect2.left;
                int i19 = rect2.top;
                Point point = a1Var2.f47283b;
                point.x = i18 - i14;
                point.y = i19 - i15;
                C17542s.i(point, "rectangleMaths.offset(cl…sXOnScreen, posYOnScreen)");
                new Canvas(createBitmap).drawBitmap(createBitmap2, (float) point.x, (float) point.y, (Paint) null);
                bitmap = createBitmap;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            C17542s.i(byteArray2, "stream.toByteArray()");
            return C6936t3.a(byteArray2);
        }

        public final boolean a() {
            return this.f47032b;
        }
    }

    public K0(W1 w12, C6783a1 a1Var) {
        C17542s.j(w12, "pixelCopyInstantiable");
        C17542s.j(a1Var, "liveActivityProvider");
        this.f47025a = w12;
        this.f47026b = a1Var;
    }

    public static final void d(K0 k02, Bitmap bitmap, v vVar, C6937t4 t4Var, int i10) {
        C15765h<View> b10;
        C15765h<R> S10;
        C15765h<R> p10;
        C17542s.j(k02, "this$0");
        C17542s.j(bitmap, "$currentBitmap");
        C17542s.j(vVar, "$windowAndRoot");
        C17542s.j(t4Var, "$viewBitmapProviderListener");
        if (i10 == 0) {
            k02.f47027c.add(new v(bitmap, new int[2]));
            View decorView = ((Window) vVar.c()).getDecorView();
            C17542s.i(decorView, "window.decorView");
            List<R> list = null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (!(viewGroup == null || (b10 = C4610g0.b(viewGroup)) == null || (S10 = C15768k.S(b10, C6826f4.f42562c)) == null || (p10 = C15768k.p(S10)) == null)) {
                list = C15768k.a0(p10);
            }
            if (list == null) {
                list = C16877v.n();
            }
            if (list.isEmpty()) {
                f(k02.f47027c, t4Var);
                return;
            }
            try {
                for (R c10 : list) {
                    k02.c(t4Var, c10);
                }
            } catch (IllegalArgumentException e10) {
                k02.f47029e.i(e10, "Capture surface failed: not attached yet.");
                t4Var.b("Capture surface failed: not attached yet.");
            }
        } else {
            k02.getClass();
            t4Var.b("Capture window failed: ".concat(i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Error Unknown" : "Error destination invalid" : "Error source invalid" : "Error source no data" : "Error timeout"));
        }
    }

    public static final void e(K0 k02, SurfaceView surfaceView, Bitmap bitmap, C6937t4 t4Var, int i10) {
        C17542s.j(k02, "this$0");
        C17542s.j(surfaceView, "$surfaceView");
        C17542s.j(bitmap, "$currentBitmap");
        C17542s.j(t4Var, "$viewBitmapProviderListener");
        if (i10 == 0) {
            k02.f47029e.f("Successful captured SurfaceView: " + surfaceView);
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            k02.f47027c.add(new v(bitmap, iArr));
        } else {
            k02.f47029e.l("Child SurfaceView capture failed: ".concat(i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Error Unknown" : "Error destination invalid" : "Error source invalid" : "Error source no data" : "Error timeout"));
            k02.f47028d--;
        }
        if (k02.f47027c.size() == k02.f47028d) {
            f(k02.f47027c, t4Var);
        }
    }

    public static void f(ArrayList arrayList, C6937t4 t4Var) {
        Bitmap bitmap = (Bitmap) ((v) arrayList.get(0)).c();
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            g.c(bitmap, (Bitmap) ((v) arrayList.get(i10)).c(), (float) ((int[]) ((v) arrayList.get(i10)).d())[0], (float) ((int[]) ((v) arrayList.get(i10)).d())[1]);
        }
        t4Var.a(new a(bitmap, true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.Window} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            dI.k r0 = new dI.k
            dI.e r1 = eI.C17187b.c(r7)
            r0.<init>(r1)
            a9.t4 r1 = new a9.t4
            r1.<init>(r0)
            java.lang.String r2 = "viewBitmapProviderListener"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            a9.a1 r2 = r6.f47026b
            java.lang.ref.WeakReference<android.app.Activity> r2 = r2.f42433a
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            r3 = 0
            if (r2 == 0) goto L_0x0025
            android.view.Window r2 = r2.getWindow()
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            if (r2 == 0) goto L_0x0032
            XH.v r4 = new XH.v
            android.view.View r5 = r2.getDecorView()
            r4.<init>(r2, r5)
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x003c
            java.lang.Object r2 = r4.c()
            r3 = r2
            android.view.Window r3 = (android.view.Window) r3
        L_0x003c:
            if (r3 == 0) goto L_0x004d
            java.lang.Object r2 = r4.d()
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Pair<android.view.Window, android.view.View>"
            kotlin.jvm.internal.C17542s.h(r4, r2)
            r6.b(r1, r4)
            goto L_0x0052
        L_0x004d:
            java.lang.String r2 = "window or decorView is null"
            r1.b(r2)
        L_0x0052:
            java.lang.Object r0 = r0.a()
            java.lang.Object r1 = eI.C17187b.f()
            if (r0 != r1) goto L_0x005f
            kotlin.coroutines.jvm.internal.h.c(r7)
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.K0.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void b(C6937t4 t4Var, v vVar) {
        Bitmap createBitmap = Bitmap.createBitmap(((View) vVar.d()).getWidth(), ((View) vVar.d()).getHeight(), Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        this.f47028d++;
        W1 w12 = this.f47025a;
        C6866k4 k4Var = new C6866k4(this, createBitmap, vVar, t4Var);
        Handler handler = ((View) vVar.d()).getHandler();
        w12.getClass();
        W1.b((Window) vVar.c(), createBitmap, k4Var, handler);
    }

    public final void c(C6937t4 t4Var, SurfaceView surfaceView) {
        this.f47029e.f("Start capturing SurfaceView: " + surfaceView);
        Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        this.f47028d++;
        W1 w12 = this.f47025a;
        C6874l4 l4Var = new C6874l4(this, surfaceView, createBitmap, t4Var);
        Handler handler = surfaceView.getHandler();
        w12.getClass();
        W1.a(surfaceView, createBitmap, l4Var, handler);
    }
}
