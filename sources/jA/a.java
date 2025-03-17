package ja;

import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f54098a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54099b;

    protected a(IBinder iBinder, String str) {
        this.f54098a = iBinder;
        this.f54099b = str;
    }

    public IBinder asBinder() {
        return this.f54098a;
    }
}
