package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f20947a = (IconCompat) aVar.v(remoteActionCompat.f20947a, 1);
        remoteActionCompat.f20948b = aVar.l(remoteActionCompat.f20948b, 2);
        remoteActionCompat.f20949c = aVar.l(remoteActionCompat.f20949c, 3);
        remoteActionCompat.f20950d = (PendingIntent) aVar.r(remoteActionCompat.f20950d, 4);
        remoteActionCompat.f20951e = aVar.h(remoteActionCompat.f20951e, 5);
        remoteActionCompat.f20952f = aVar.h(remoteActionCompat.f20952f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f20947a, 1);
        aVar.D(remoteActionCompat.f20948b, 2);
        aVar.D(remoteActionCompat.f20949c, 3);
        aVar.H(remoteActionCompat.f20950d, 4);
        aVar.z(remoteActionCompat.f20951e, 5);
        aVar.z(remoteActionCompat.f20952f, 6);
    }
}
