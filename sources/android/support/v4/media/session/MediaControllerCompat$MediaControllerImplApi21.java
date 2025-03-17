package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f15208a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f15209b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f15210c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f15211d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f15212a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f15212a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f15208a) {
                    mediaControllerCompat$MediaControllerImplApi21.f15211d.b(b.a.I3(h.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f15211d.c(W4.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        public void C1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        public void G0() {
            throw new AssertionError();
        }

        public void H0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        public void H2(CharSequence charSequence) {
            throw new AssertionError();
        }

        public void X(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        public void X1(Bundle bundle) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f15211d.a() != null) {
            for (c next : this.f15209b) {
                a aVar = new a(next);
                this.f15210c.put(next, aVar);
                next.f15245b = aVar;
                try {
                    this.f15211d.a().I1(aVar);
                    next.i(13, (Object) null, (Bundle) null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f15209b.clear();
        }
    }
}
