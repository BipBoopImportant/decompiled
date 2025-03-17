package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q3.C5807s;
import q3.z;
import t3.N;

/* renamed from: Y3.a  reason: case insensitive filesystem */
public final class C6730a implements z.b {
    public static final Parcelable.Creator<C6730a> CREATOR = new C0681a();

    /* renamed from: g  reason: collision with root package name */
    private static final C5807s f40810g = new C5807s.b().s0("application/id3").M();

    /* renamed from: h  reason: collision with root package name */
    private static final C5807s f40811h = new C5807s.b().s0("application/x-scte35").M();

    /* renamed from: a  reason: collision with root package name */
    public final String f40812a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40813b;

    /* renamed from: c  reason: collision with root package name */
    public final long f40814c;

    /* renamed from: d  reason: collision with root package name */
    public final long f40815d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f40816e;

    /* renamed from: f  reason: collision with root package name */
    private int f40817f;

    /* renamed from: Y3.a$a  reason: collision with other inner class name */
    class C0681a implements Parcelable.Creator<C6730a> {
        C0681a() {
        }

        /* renamed from: a */
        public C6730a createFromParcel(Parcel parcel) {
            return new C6730a(parcel);
        }

        /* renamed from: b */
        public C6730a[] newArray(int i10) {
            return new C6730a[i10];
        }
    }

    public C6730a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f40812a = str;
        this.f40813b = str2;
        this.f40814c = j10;
        this.f40815d = j11;
        this.f40816e = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6730a.class != obj.getClass()) {
            return false;
        }
        C6730a aVar = (C6730a) obj;
        return this.f40814c == aVar.f40814c && this.f40815d == aVar.f40815d && N.d(this.f40812a, aVar.f40812a) && N.d(this.f40813b, aVar.f40813b) && Arrays.equals(this.f40816e, aVar.f40816e);
    }

    public int hashCode() {
        if (this.f40817f == 0) {
            String str = this.f40812a;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f40813b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f40814c;
            long j11 = this.f40815d;
            this.f40817f = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f40816e);
        }
        return this.f40817f;
    }

    public C5807s j0() {
        String str = this.f40812a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f40811h;
            case 1:
            case 2:
                return f40810g;
            default:
                return null;
        }
    }

    public byte[] m3() {
        if (j0() != null) {
            return this.f40816e;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f40812a + ", id=" + this.f40815d + ", durationMs=" + this.f40814c + ", value=" + this.f40813b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40812a);
        parcel.writeString(this.f40813b);
        parcel.writeLong(this.f40814c);
        parcel.writeLong(this.f40815d);
        parcel.writeByteArray(this.f40816e);
    }

    C6730a(Parcel parcel) {
        this.f40812a = (String) N.i(parcel.readString());
        this.f40813b = (String) N.i(parcel.readString());
        this.f40814c = parcel.readLong();
        this.f40815d = parcel.readLong();
        this.f40816e = (byte[]) N.i(parcel.createByteArray());
    }
}
