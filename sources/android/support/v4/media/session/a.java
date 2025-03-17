package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    public static abstract class C0222a extends Binder implements a {
        public C0222a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            boolean z10 = false;
            switch (i10) {
                case 1:
                    w(parcel.readString(), (Bundle) b.b(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    G0();
                    break;
                case 3:
                    D3((PlaybackStateCompat) b.b(parcel, PlaybackStateCompat.CREATOR));
                    break;
                case 4:
                    H0((MediaMetadataCompat) b.b(parcel, MediaMetadataCompat.CREATOR));
                    break;
                case 5:
                    X(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                case 6:
                    H2((CharSequence) b.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                case 7:
                    X1((Bundle) b.b(parcel, Bundle.CREATOR));
                    break;
                case 8:
                    C1((ParcelableVolumeInfo) b.b(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                case 9:
                    u(parcel.readInt());
                    break;
                case 10:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    F2(z10);
                    break;
                case 11:
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    s2(z10);
                    break;
                case 12:
                    X0(parcel.readInt());
                    break;
                case 13:
                    V();
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            return true;
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void C1(ParcelableVolumeInfo parcelableVolumeInfo);

    void D3(PlaybackStateCompat playbackStateCompat);

    void F2(boolean z10);

    void G0();

    void H0(MediaMetadataCompat mediaMetadataCompat);

    void H2(CharSequence charSequence);

    void V();

    void X(List<MediaSessionCompat.QueueItem> list);

    void X0(int i10);

    void X1(Bundle bundle);

    void s2(boolean z10);

    void u(int i10);

    void w(String str, Bundle bundle);
}
