package com.google.android.gms.internal.vision;

import K9.C6620s;
import T9.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.ByteBuffer;
import za.a;

public final class p2 extends M2<P1> {

    /* renamed from: i  reason: collision with root package name */
    private final C7525p1 f49367i;

    public p2(Context context, C7525p1 p1Var) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f49367i = p1Var;
        e();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(DynamiteModule dynamiteModule, Context context) {
        I2 i22;
        IBinder d10 = dynamiteModule.d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (d10 == null) {
            i22 = null;
        } else {
            IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            i22 = queryLocalInterface instanceof I2 ? (I2) queryLocalInterface : new K2(d10);
        }
        if (i22 == null) {
            return null;
        }
        return i22.x(d.L3(context), (C7525p1) C6620s.l(this.f49367i));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (c()) {
            ((P1) C6620s.l((P1) e())).zza();
        }
    }

    public final a[] f(Bitmap bitmap, L2 l22) {
        if (!c()) {
            return new a[0];
        }
        try {
            return ((P1) C6620s.l((P1) e())).P1(d.L3(bitmap), l22);
        } catch (RemoteException e10) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new a[0];
        }
    }

    public final a[] g(ByteBuffer byteBuffer, L2 l22) {
        if (!c()) {
            return new a[0];
        }
        try {
            return ((P1) C6620s.l((P1) e())).V1(d.L3(byteBuffer), l22);
        } catch (RemoteException e10) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new a[0];
        }
    }
}
