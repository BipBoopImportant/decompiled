package ed;

import K9.C6620s;
import T9.b;
import T9.d;
import Vc.a;
import Zc.m;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import bd.C9428b;
import cd.C9452a;
import com.google.android.gms.dynamite.DynamiteModule;
import fd.C9707a;
import gd.C9724b;
import gd.C9726d;
import ha.C7995e6;
import ha.C8059l0;
import ha.C8136s8;
import ha.V8;
import ha.X8;
import ha.f9;
import ha.h9;
import ha.i9;
import ha.p9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ed.m  reason: case insensitive filesystem */
final class C9645m implements C9643k {

    /* renamed from: h  reason: collision with root package name */
    private static final C8059l0 f72616h = C8059l0.r("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a  reason: collision with root package name */
    private boolean f72617a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f72618b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f72619c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f72620d;

    /* renamed from: e  reason: collision with root package name */
    private final C9428b f72621e;

    /* renamed from: f  reason: collision with root package name */
    private final C8136s8 f72622f;

    /* renamed from: g  reason: collision with root package name */
    private f9 f72623g;

    C9645m(Context context, C9428b bVar, C8136s8 s8Var) {
        this.f72620d = context;
        this.f72621e = bVar;
        this.f72622f = s8Var;
    }

    static boolean b(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    public final List a(C9707a aVar) {
        if (this.f72623g == null) {
            zzc();
        }
        f9 f9Var = (f9) C6620s.l(this.f72623g);
        if (!this.f72617a) {
            try {
                f9Var.h();
                this.f72617a = true;
            } catch (RemoteException e10) {
                throw new a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int j10 = aVar.j();
        if (aVar.e() == 35) {
            j10 = ((Image.Plane[]) C6620s.l(aVar.h()))[0].getRowStride();
        }
        try {
            List<V8> L32 = f9Var.L3(C9726d.b().a(aVar), new p9(aVar.e(), j10, aVar.f(), C9724b.a(aVar.i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (V8 lVar : L32) {
                arrayList.add(new C9452a(new C9644l(lVar), aVar.d()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new a("Failed to run barcode scanner.", 13, e11);
        }
    }

    /* access modifiers changed from: package-private */
    public final f9 c(DynamiteModule.b bVar, String str, String str2) {
        boolean z10;
        i9 I32 = h9.I3(DynamiteModule.e(this.f72620d, bVar, str).d(str2));
        b L32 = d.L3(this.f72620d);
        int a10 = this.f72621e.a();
        if (!this.f72621e.d()) {
            this.f72621e.b();
            z10 = false;
        } else {
            z10 = true;
        }
        return I32.O1(L32, new X8(a10, z10));
    }

    public final void zzb() {
        f9 f9Var = this.f72623g;
        if (f9Var != null) {
            try {
                f9Var.i();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f72623g = null;
            this.f72617a = false;
        }
    }

    public final boolean zzc() {
        if (this.f72623g != null) {
            return this.f72618b;
        }
        if (b(this.f72620d)) {
            this.f72618b = true;
            try {
                this.f72623g = c(DynamiteModule.f48094c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (DynamiteModule.a e10) {
                throw new a("Failed to load the bundled barcode module.", 13, e10);
            } catch (RemoteException e11) {
                throw new a("Failed to create thick barcode scanner.", 13, e11);
            }
        } else {
            this.f72618b = false;
            if (!m.a(this.f72620d, f72616h)) {
                if (!this.f72619c) {
                    m.d(this.f72620d, C8059l0.r("barcode", "tflite_dynamite"));
                    this.f72619c = true;
                }
                C9635c.e(this.f72622f, C7995e6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f72623g = c(DynamiteModule.f48093b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                C9635c.e(this.f72622f, C7995e6.OPTIONAL_MODULE_INIT_ERROR);
                throw new a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        C9635c.e(this.f72622f, C7995e6.NO_ERROR);
        return this.f72618b;
    }
}
