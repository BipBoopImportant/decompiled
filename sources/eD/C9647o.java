package ed;

import K9.C6620s;
import T9.d;
import Vc.a;
import Zc.m;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import bd.C9428b;
import cd.C9452a;
import com.google.android.gms.dynamite.DynamiteModule;
import fd.C9707a;
import gd.C9724b;
import gd.C9725c;
import ha.C7995e6;
import ha.C8028i;
import ha.C8048k;
import ha.C8068m;
import ha.C8088o;
import ha.C8136s8;
import ha.C8166v8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ed.o  reason: case insensitive filesystem */
final class C9647o implements C9643k {

    /* renamed from: a  reason: collision with root package name */
    private boolean f72625a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f72626b;

    /* renamed from: c  reason: collision with root package name */
    private final C8028i f72627c;

    /* renamed from: d  reason: collision with root package name */
    private final C8136s8 f72628d;

    /* renamed from: e  reason: collision with root package name */
    private C8048k f72629e;

    C9647o(Context context, C9428b bVar, C8136s8 s8Var) {
        C8028i iVar = new C8028i();
        this.f72627c = iVar;
        this.f72626b = context;
        iVar.f52575a = bVar.a();
        this.f72628d = s8Var;
    }

    public final List a(C9707a aVar) {
        C8166v8[] v8VarArr;
        if (this.f72629e == null) {
            zzc();
        }
        C8048k kVar = this.f72629e;
        if (kVar != null) {
            C8048k kVar2 = (C8048k) C6620s.l(kVar);
            C8088o oVar = new C8088o(aVar.j(), aVar.f(), 0, 0, C9724b.a(aVar.i()));
            try {
                int e10 = aVar.e();
                if (e10 == -1) {
                    v8VarArr = kVar2.N3(d.L3(aVar.b()), oVar);
                } else if (e10 == 17) {
                    v8VarArr = kVar2.M3(d.L3(aVar.c()), oVar);
                } else if (e10 == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) C6620s.l(aVar.h());
                    oVar.f52679a = planeArr[0].getRowStride();
                    v8VarArr = kVar2.M3(d.L3(planeArr[0].getBuffer()), oVar);
                } else if (e10 == 842094169) {
                    v8VarArr = kVar2.M3(d.L3(C9725c.d().c(aVar, false)), oVar);
                } else {
                    throw new a("Unsupported image format: " + aVar.e(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (C8166v8 nVar : v8VarArr) {
                    arrayList.add(new C9452a(new C9646n(nVar), aVar.d()));
                }
                return arrayList;
            } catch (RemoteException e11) {
                throw new a("Failed to detect with legacy barcode detector", 13, e11);
            }
        } else {
            throw new a("Error initializing the legacy barcode scanner.", 14);
        }
    }

    public final void zzb() {
        C8048k kVar = this.f72629e;
        if (kVar != null) {
            try {
                kVar.L3();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f72629e = null;
        }
    }

    public final boolean zzc() {
        if (this.f72629e != null) {
            return false;
        }
        try {
            C8048k d02 = C8068m.I3(DynamiteModule.e(this.f72626b, DynamiteModule.f48093b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).d0(d.L3(this.f72626b), this.f72627c);
            this.f72629e = d02;
            if (d02 == null) {
                if (!this.f72625a) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    m.c(this.f72626b, "barcode");
                    this.f72625a = true;
                    C9635c.e(this.f72628d, C7995e6.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new a("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
            }
            C9635c.e(this.f72628d, C7995e6.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }
}
