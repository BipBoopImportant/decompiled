package Z3;

import android.os.Parcel;
import android.os.Parcelable;
import jb.C9892c;
import nb.C10076f;
import q3.y;
import q3.z;
import t3.N;

@Deprecated
/* renamed from: Z3.b  reason: case insensitive filesystem */
public class C6739b implements z.b {
    public static final Parcelable.Creator<C6739b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f41337a;

    /* renamed from: b  reason: collision with root package name */
    public final String f41338b;

    /* renamed from: Z3.b$a */
    class a implements Parcelable.Creator<C6739b> {
        a() {
        }

        /* renamed from: a */
        public C6739b createFromParcel(Parcel parcel) {
            return new C6739b(parcel);
        }

        /* renamed from: b */
        public C6739b[] newArray(int i10) {
            return new C6739b[i10];
        }
    }

    public C6739b(String str, String str2) {
        this.f41337a = C9892c.f(str);
        this.f41338b = str2;
    }

    public void c3(y.b bVar) {
        String str = this.f41337a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Integer m10 = C10076f.m(this.f41338b);
                if (m10 != null) {
                    bVar.r0(m10);
                    return;
                }
                return;
            case 1:
                Integer m11 = C10076f.m(this.f41338b);
                if (m11 != null) {
                    bVar.q0(m11);
                    return;
                }
                return;
            case 2:
                Integer m12 = C10076f.m(this.f41338b);
                if (m12 != null) {
                    bVar.s0(m12);
                    return;
                }
                return;
            case 3:
                bVar.P(this.f41338b);
                return;
            case 4:
                bVar.c0(this.f41338b);
                return;
            case 5:
                bVar.p0(this.f41338b);
                return;
            case 6:
                bVar.W(this.f41338b);
                return;
            case 7:
                Integer m13 = C10076f.m(this.f41338b);
                if (m13 != null) {
                    bVar.X(m13);
                    return;
                }
                return;
            case 8:
                bVar.O(this.f41338b);
                return;
            case 9:
                bVar.Q(this.f41338b);
                return;
            default:
                return;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6739b bVar = (C6739b) obj;
        return this.f41337a.equals(bVar.f41337a) && this.f41338b.equals(bVar.f41338b);
    }

    public int hashCode() {
        return ((527 + this.f41337a.hashCode()) * 31) + this.f41338b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f41337a + "=" + this.f41338b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41337a);
        parcel.writeString(this.f41338b);
    }

    protected C6739b(Parcel parcel) {
        this.f41337a = (String) N.i(parcel.readString());
        this.f41338b = (String) N.i(parcel.readString());
    }
}
