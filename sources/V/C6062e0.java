package v;

import I.a;
import android.hardware.camera2.TotalCaptureResult;
import java.util.List;
import ob.C10101e;
import v.C6050a0;

/* renamed from: v.e0  reason: case insensitive filesystem */
public final /* synthetic */ class C6062e0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6050a0.d f30538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f30539b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f30540c;

    public /* synthetic */ C6062e0(C6050a0.d dVar, List list, int i10) {
        this.f30538a = dVar;
        this.f30539b = list;
        this.f30540c = i10;
    }

    public final C10101e apply(Object obj) {
        return this.f30538a.l(this.f30539b, this.f30540c, (TotalCaptureResult) obj);
    }
}
