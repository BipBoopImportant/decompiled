package org.maplibre.android.maps.renderer.egl;

import android.opengl.GLSurfaceView;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.maplibre.android.log.Logger;
import zL.C18771a;

public class a implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a  reason: collision with root package name */
    private boolean f145986a;

    /* renamed from: org.maplibre.android.maps.renderer.egl.a$a  reason: collision with other inner class name */
    class C4252a implements Comparable<C4252a> {

        /* renamed from: a  reason: collision with root package name */
        private final b f145987a;

        /* renamed from: b  reason: collision with root package name */
        private final c f145988b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final boolean f145989c;

        /* renamed from: d  reason: collision with root package name */
        private final int f145990d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final EGLConfig f145991e;

        public C4252a(b bVar, c cVar, boolean z10, int i10, EGLConfig eGLConfig) {
            this.f145987a = bVar;
            this.f145988b = cVar;
            this.f145989c = z10;
            this.f145990d = i10;
            this.f145991e = eGLConfig;
        }

        /* renamed from: j */
        public int compareTo(C4252a aVar) {
            int a10 = org.maplibre.android.utils.c.a(this.f145987a.value, aVar.f145987a.value);
            if (a10 != 0) {
                return a10;
            }
            int a11 = org.maplibre.android.utils.c.a(this.f145988b.value, aVar.f145988b.value);
            if (a11 != 0) {
                return a11;
            }
            int b10 = org.maplibre.android.utils.c.b(this.f145989c, aVar.f145989c);
            if (b10 != 0) {
                return b10;
            }
            int a12 = org.maplibre.android.utils.c.a(this.f145990d, aVar.f145990d);
            if (a12 != 0) {
                return a12;
            }
            return 0;
        }
    }

    enum b {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);
        
        int value;

        private b(int i10) {
            this.value = i10;
        }
    }

    enum c {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);
        
        int value;

        private c(int i10) {
            this.value = i10;
        }
    }

    public a() {
        this(false);
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int i10;
        int i11;
        a aVar = this;
        EGL10 egl102 = egl10;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        ArrayList arrayList = new ArrayList();
        int length = eGLConfigArr2.length;
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            EGLConfig eGLConfig = eGLConfigArr2[i13];
            if (eGLConfig == null) {
                i11 = length;
                i10 = i13;
            } else {
                int i14 = i12 + 1;
                int b10 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12327);
                int b11 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12320);
                int b12 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12324);
                int b13 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12323);
                int b14 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12322);
                int b15 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12321);
                aVar.b(egl102, eGLDisplay2, eGLConfig, 12350);
                int b16 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12325);
                int b17 = aVar.b(egl102, eGLDisplay2, eGLConfig, 12326);
                i11 = length;
                i10 = i13;
                if (((b16 == 24 || b16 == 16) & (b17 == 8) & (aVar.b(egl102, eGLDisplay2, eGLConfig, 12338) == 0)) && (aVar.b(egl102, eGLDisplay2, eGLConfig, 12337) == 0)) {
                    b bVar = (b11 == 16 && b12 == 5 && b13 == 6 && b14 == 5 && b15 == 0) ? b.Format16Bit : (b11 == 32 && b12 == 8 && b13 == 8 && b14 == 8 && b15 == 0) ? b.Format32BitNoAlpha : (b11 == 32 && b12 == 8 && b13 == 8 && b14 == 8 && b15 == 8) ? b.Format32BitAlpha : (b11 == 24 && b12 == 8 && b13 == 8 && b14 == 8 && b15 == 0) ? b.Format24Bit : b.Unknown;
                    c cVar = (b16 == 16 && b17 == 8) ? c.Format16Depth8Stencil : c.Format24Depth8Stencil;
                    boolean z10 = b10 != 12344;
                    if (bVar != b.Unknown) {
                        arrayList.add(new C4252a(bVar, cVar, z10, i14, eGLConfig));
                    }
                }
                i12 = i14;
            }
            i13 = i10 + 1;
            aVar = this;
            egl102 = egl10;
            eGLConfigArr2 = eGLConfigArr;
            length = i11;
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 0) {
            Logger.e("Mbgl-EGLConfigChooser", "No matching configurations after filtering");
            return null;
        }
        C4252a aVar2 = (C4252a) arrayList.get(0);
        if (aVar2.f145989c) {
            Logger.w("Mbgl-EGLConfigChooser", "Chosen config has a caveat.");
        }
        return aVar2.f145991e;
    }

    private int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr = new int[1];
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(C18771a.f152883a, "eglGetConfigAttrib(%d) returned error %d", new Object[]{Integer.valueOf(i10), Integer.valueOf(egl10.eglGetError())}));
        }
        return iArr[0];
    }

    private int[] c() {
        int i10 = 0;
        boolean z10 = f() || g();
        Logger.i("Mbgl-EGLConfigChooser", String.format("In emulator: %s", new Object[]{Boolean.valueOf(z10)}));
        if (this.f145986a) {
            i10 = 8;
        }
        return new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, i10, 12325, 16, 12326, 8, z10 ? 12344 : 12351, 12430, 12352, 64, 12344};
    }

    private int[] d(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, (EGLConfig[]) null, 0, iArr2)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(C18771a.f152883a, "eglChooseConfig(NULL) returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())}));
        }
        return iArr2;
    }

    private EGLConfig[] e(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        int i10 = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i10];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i10, iArr2)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(C18771a.f152883a, "eglChooseConfig() returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())}));
        }
        return eGLConfigArr;
    }

    private boolean f() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            return str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT) || System.getProperty("ro.kernel.qemu") != null;
        }
    }

    private boolean g() {
        return Build.MANUFACTURER.contains("Genymotion");
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] c10 = c();
        int[] d10 = d(egl10, eGLDisplay, c10);
        if (d10[0] < 1) {
            Logger.e("Mbgl-EGLConfigChooser", "eglChooseConfig() returned no configs.");
        }
        EGLConfig a10 = a(egl10, eGLDisplay, e(egl10, eGLDisplay, c10, d10));
        if (a10 == null) {
            Logger.e("Mbgl-EGLConfigChooser", "No config chosen");
        }
        return a10;
    }

    public a(boolean z10) {
        this.f145986a = z10;
    }
}
