package android.support.v4.media.session;

import W4.b;
import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f15216a;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f15216a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f15216a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Object f15217a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f15218b;

        /* renamed from: c  reason: collision with root package name */
        private b f15219c;

        /* renamed from: d  reason: collision with root package name */
        private b f15220d;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (b) null);
        }

        public b a() {
            b bVar;
            synchronized (this.f15217a) {
                bVar = this.f15219c;
            }
            return bVar;
        }

        public void b(b bVar) {
            synchronized (this.f15217a) {
                this.f15219c = bVar;
            }
        }

        public void c(b bVar) {
            synchronized (this.f15217a) {
                this.f15220d = bVar;
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f15218b;
            if (obj2 == null) {
                return token.f15218b == null;
            }
            Object obj3 = token.f15218b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f15218b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f15218b, i10);
        }

        Token(Object obj, b bVar, b bVar2) {
            this.f15217a = new Object();
            this.f15218b = obj;
            this.f15219c = bVar;
            this.f15220d = bVar2;
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final MediaDescriptionCompat f15213a;

        /* renamed from: b  reason: collision with root package name */
        private final long f15214b;

        /* renamed from: c  reason: collision with root package name */
        private MediaSession.QueueItem f15215c;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j10 != -1) {
                this.f15213a = mediaDescriptionCompat;
                this.f15214b = j10;
                this.f15215c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f15213a + ", Id=" + this.f15214b + " }";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f15213a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f15214b);
        }

        QueueItem(Parcel parcel) {
            this.f15213a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f15214b = parcel.readLong();
        }
    }
}
