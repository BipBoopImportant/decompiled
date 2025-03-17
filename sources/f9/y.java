package F9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f35605a;

    /* renamed from: b  reason: collision with root package name */
    private final l f35606b;

    y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f35605a = new Messenger(iBinder);
            this.f35606b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f35606b = new l(iBinder);
            this.f35605a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f35605a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f35606b;
        if (lVar != null) {
            lVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
