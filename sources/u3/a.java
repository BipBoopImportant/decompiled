package u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jb.g;
import nb.C10076f;
import q3.z;
import t3.B;
import t3.C5950a;
import t3.N;

public final class a implements z.b {
    public static final Parcelable.Creator<a> CREATOR = new C0470a();

    /* renamed from: a  reason: collision with root package name */
    public final String f30062a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f30063b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30064c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30065d;

    /* renamed from: u3.a$a  reason: collision with other inner class name */
    class C0470a implements Parcelable.Creator<a> {
        C0470a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0470a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0470a aVar) {
        this(parcel);
    }

    private static String b(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        g.f(',').b(sb2, list);
        return sb2.toString();
    }

    private static void c(String str, byte[] bArr, int i10) {
        byte b10;
        str.hashCode();
        boolean z10 = false;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c10 = 1;
                    break;
                }
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c10 = 2;
                    break;
                }
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                C5950a.a(z10);
                return;
            case 1:
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                C5950a.a(z10);
                return;
            case 2:
            case 3:
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                C5950a.a(z10);
                return;
            case 4:
                if (i10 == 0) {
                    z10 = true;
                }
                C5950a.a(z10);
                return;
            default:
                return;
        }
    }

    public List<Integer> a() {
        C5950a.h(this.f30062a.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
        byte b10 = this.f30063b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f30063b[i10 + 2]));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30062a.equals(aVar.f30062a) && Arrays.equals(this.f30063b, aVar.f30063b) && this.f30064c == aVar.f30064c && this.f30065d == aVar.f30065d;
    }

    public int hashCode() {
        return ((((((527 + this.f30062a.hashCode()) * 31) + Arrays.hashCode(this.f30063b)) * 31) + this.f30064c) * 31) + this.f30065d;
    }

    public String toString() {
        String str;
        int i10 = this.f30065d;
        if (i10 != 0) {
            if (i10 == 1) {
                str = N.H(this.f30063b);
            } else if (i10 == 23) {
                str = String.valueOf(Float.intBitsToFloat(C10076f.f(this.f30063b)));
            } else if (i10 == 67) {
                str = String.valueOf(C10076f.f(this.f30063b));
            } else if (i10 == 75) {
                str = String.valueOf(Byte.toUnsignedInt(this.f30063b[0]));
            } else if (i10 == 78) {
                str = String.valueOf(new B(this.f30063b).O());
            }
            return "mdta: key=" + this.f30062a + ", value=" + str;
        } else if (this.f30062a.equals("editable.tracks.map")) {
            str = b(a());
            return "mdta: key=" + this.f30062a + ", value=" + str;
        }
        str = N.m1(this.f30063b);
        return "mdta: key=" + this.f30062a + ", value=" + str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30062a);
        parcel.writeByteArray(this.f30063b);
        parcel.writeInt(this.f30064c);
        parcel.writeInt(this.f30065d);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        c(str, bArr, i11);
        this.f30062a = str;
        this.f30063b = bArr;
        this.f30064c = i10;
        this.f30065d = i11;
    }

    private a(Parcel parcel) {
        String str = (String) N.i(parcel.readString());
        this.f30062a = str;
        byte[] bArr = (byte[]) N.i(parcel.createByteArray());
        this.f30063b = bArr;
        this.f30064c = parcel.readInt();
        int readInt = parcel.readInt();
        this.f30065d = readInt;
        c(str, bArr, readInt);
    }
}
