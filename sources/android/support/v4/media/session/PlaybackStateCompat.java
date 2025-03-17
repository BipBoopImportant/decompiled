package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f15226a;

    /* renamed from: b  reason: collision with root package name */
    final long f15227b;

    /* renamed from: c  reason: collision with root package name */
    final long f15228c;

    /* renamed from: d  reason: collision with root package name */
    final float f15229d;

    /* renamed from: e  reason: collision with root package name */
    final long f15230e;

    /* renamed from: f  reason: collision with root package name */
    final int f15231f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f15232g;

    /* renamed from: h  reason: collision with root package name */
    final long f15233h;

    /* renamed from: i  reason: collision with root package name */
    List<CustomAction> f15234i;

    /* renamed from: j  reason: collision with root package name */
    final long f15235j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f15236k;

    /* renamed from: l  reason: collision with root package name */
    private PlaybackState f15237l;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f15226a = i10;
        this.f15227b = j10;
        this.f15228c = j11;
        this.f15229d = f10;
        this.f15230e = j12;
        this.f15231f = i11;
        this.f15232g = charSequence;
        this.f15233h = j13;
        this.f15234i = new ArrayList(list);
        this.f15235j = j14;
        this.f15236k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            arrayList = new ArrayList(j10.size());
            for (PlaybackState.CustomAction a10 : j10) {
                arrayList.add(CustomAction.a(a10));
            }
        }
        Bundle a11 = c.a(playbackState);
        MediaSessionCompat.a(a11);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), a11);
        playbackStateCompat.f15237l = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f15226a + ", position=" + this.f15227b + ", buffered position=" + this.f15228c + ", speed=" + this.f15229d + ", updated=" + this.f15233h + ", actions=" + this.f15230e + ", error code=" + this.f15231f + ", error message=" + this.f15232g + ", custom actions=" + this.f15234i + ", active item id=" + this.f15235j + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15226a);
        parcel.writeLong(this.f15227b);
        parcel.writeFloat(this.f15229d);
        parcel.writeLong(this.f15233h);
        parcel.writeLong(this.f15228c);
        parcel.writeLong(this.f15230e);
        TextUtils.writeToParcel(this.f15232g, parcel, i10);
        parcel.writeTypedList(this.f15234i);
        parcel.writeLong(this.f15235j);
        parcel.writeBundle(this.f15236k);
        parcel.writeInt(this.f15231f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f15238a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f15239b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15240c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f15241d;

        /* renamed from: e  reason: collision with root package name */
        private PlaybackState.CustomAction f15242e;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f15238a = str;
            this.f15239b = charSequence;
            this.f15240c = i10;
            this.f15241d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
            customAction2.f15242e = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f15239b + ", mIcon=" + this.f15240c + ", mExtras=" + this.f15241d;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f15238a);
            TextUtils.writeToParcel(this.f15239b, parcel, i10);
            parcel.writeInt(this.f15240c);
            parcel.writeBundle(this.f15241d);
        }

        CustomAction(Parcel parcel) {
            this.f15238a = parcel.readString();
            this.f15239b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15240c = parcel.readInt();
            this.f15241d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f15226a = parcel.readInt();
        this.f15227b = parcel.readLong();
        this.f15229d = parcel.readFloat();
        this.f15233h = parcel.readLong();
        this.f15228c = parcel.readLong();
        this.f15230e = parcel.readLong();
        this.f15232g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15234i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f15235j = parcel.readLong();
        this.f15236k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f15231f = parcel.readInt();
    }
}
