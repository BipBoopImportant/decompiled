package qa;

import android.os.RemoteException;

public final class m extends RuntimeException {
    public m(RemoteException remoteException) {
        super(remoteException);
    }
}
