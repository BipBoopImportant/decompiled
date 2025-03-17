package da;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: da.a  reason: case insensitive filesystem */
public class C7780a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f50831a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50832b;

    protected C7780a(IBinder iBinder, String str) {
        this.f50831a = iBinder;
        this.f50832b = str;
    }

    public IBinder asBinder() {
        return this.f50831a;
    }
}
