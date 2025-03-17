package rE;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import nts.C3727;
import tE.C15072a;

/* renamed from: rE.f  reason: case insensitive filesystem */
public final class C15001f implements Parcelable {
    public static final Parcelable.Creator<C15001f> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public Map<a, C14996a> f130672a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Class<? extends C14997b>, C14997b> f130673b;

    /* renamed from: c  reason: collision with root package name */
    public String f130674c;

    /* renamed from: d  reason: collision with root package name */
    public int f130675d;

    /* renamed from: rE.f$a */
    public enum a {
        SUBMIT,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        ADDITIONAL,
        OOB_OPEN_APP
    }

    /* renamed from: rE.f$b */
    public enum b {
        INFO_HEADER,
        INFO_TEXT,
        INFO_LABEL,
        WHITELIST,
        DEVICE_BINDING,
        WHY_INFO,
        WHY_INFO_TEXT,
        EXPANDABLE_INFO,
        EXPANDABLE_INFO_TEXT,
        SELECTION_LIST,
        DATA_ENTRY_LABEL,
        DATA_ENTRY_LABEL_2
    }

    /* renamed from: rE.f$c */
    public static class c implements Parcelable.Creator<C15001f> {
        public Object createFromParcel(Parcel parcel) {
            return new C15001f(parcel);
        }

        public Object[] newArray(int i10) {
            return new C15001f[i10];
        }
    }

    public C15001f() {
        this.f130672a = new HashMap();
        this.f130673b = new HashMap();
        this.f130674c = null;
        this.f130675d = 0;
    }

    public String a() {
        return this.f130674c;
    }

    public C14996a b(a aVar) {
        j(C3727.m1052("\u000b\u001d\u001f\u001e\u0002\u0002;\u0017\u0011\u0005MWTV_]M}DCG]X]MW]ADDAMMKEk^YQKJO[AWKRRBRLAp\\HrKLHRWRBXRNKK=+)(44\r!'3>rinn;vvb7vp2}e}b!", 68, 10, 17), aVar);
        C14996a aVar2 = this.f130672a.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        C14996a aVar3 = new C14996a();
        this.f130672a.put(aVar, aVar3);
        return aVar3;
    }

    public int c() {
        return this.f130675d;
    }

    public C14998c d() {
        Class<C14998c> cls = C14998c.class;
        C14998c cVar = (C14998c) this.f130673b.get(cls);
        if (cVar != null) {
            return cVar;
        }
        C14998c cVar2 = new C14998c();
        this.f130673b.put(cls, cVar2);
        return cVar2;
    }

    public int describeContents() {
        return 0;
    }

    public C14999d e() {
        Class<C14999d> cls = C14999d.class;
        C14999d dVar = (C14999d) this.f130673b.get(cls);
        if (dVar != null) {
            return dVar;
        }
        C14999d dVar2 = new C14999d();
        this.f130673b.put(cls, dVar2);
        return dVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15001f.class != obj.getClass()) {
            return false;
        }
        C15001f fVar = (C15001f) obj;
        if (this.f130675d != fVar.f130675d || !this.f130672a.equals(fVar.f130672a) || !this.f130673b.equals(fVar.f130673b)) {
            return false;
        }
        String str = this.f130674c;
        String str2 = fVar.f130674c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public C14999d f() {
        Class<C14999d> cls = C14999d.class;
        C14999d dVar = (C14999d) this.f130673b.get(cls);
        if (dVar != null) {
            return dVar;
        }
        C14999d dVar2 = new C14999d();
        this.f130673b.put(cls, dVar2);
        return dVar2;
    }

    public C15000e g() {
        Class<C15000e> cls = C15000e.class;
        C15000e eVar = (C15000e) this.f130673b.get(cls);
        if (eVar != null) {
            return eVar;
        }
        C15000e eVar2 = new C15000e();
        this.f130673b.put(cls, eVar2);
        return eVar2;
    }

    public void h(C14996a aVar, a aVar2) {
        j(C3727.m1052("\u000b\u001d\u001f\u001e\u0002\u0002;\u0017\u0011\u0005MWTV_]M}DCG]X]MW]ADDAMMKEk^YQKJO[AWKRRBRLAp\\HrKLHRWRBXRNKK=+)(44\r!'3>rinn;vvb7vp2}e}b!", 0, 10, 99), aVar2);
        this.f130672a.put(aVar2, aVar);
    }

    public int hashCode() {
        int hashCode = ((this.f130672a.hashCode() * 31) + this.f130673b.hashCode()) * 31;
        String str = this.f130674c;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f130675d;
    }

    public void i(C15000e eVar) {
        j(C3727.m1052("\u000b\u001d\u001f\u001e\u0002\u0002;\u0017\u0011\u0005MWTV_]M}DCG]X]MW]ADDAMMKEk^YQKJO[AWKRRBRLAp\\HrKLHRWRBXRNKK=+)(44\r!'3>rinn;vvb7vp2}e}b!", 10, 20, 39), eVar);
        this.f130673b.put(C15000e.class, eVar);
    }

    public final void j(String str, Object obj) {
        if (obj == null) {
            throw new C15072a(str + C3727.m1052("\u000b\u001d\u001f\u001e\u0002\u0002;\u0017\u0011\u0005MWTV_]M}DCG]X]MW]ADDAMMKEk^YQKJO[AWKRRBRLAp\\HrKLHRWRBXRNKK=+)(44\r!'3>rinn;vvb7vp2}e}b!", 78, 18, 66), (Throwable) null);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f130672a.size());
        for (Map.Entry next : this.f130672a.entrySet()) {
            parcel.writeInt(next.getKey() == null ? -1 : ((a) next.getKey()).ordinal());
            parcel.writeParcelable((Parcelable) next.getValue(), i10);
        }
        parcel.writeInt(this.f130673b.size());
        for (Map.Entry next2 : this.f130673b.entrySet()) {
            parcel.writeSerializable((Serializable) next2.getKey());
            parcel.writeParcelable((Parcelable) next2.getValue(), i10);
        }
        parcel.writeString(this.f130674c);
        parcel.writeInt(this.f130675d);
    }

    public C15001f(Parcel parcel) {
        Object obj;
        this.f130672a = new HashMap();
        this.f130673b = new HashMap();
        this.f130674c = null;
        this.f130675d = 0;
        int readInt = parcel.readInt();
        this.f130672a = new HashMap(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            int readInt2 = parcel.readInt();
            if (readInt2 == -1) {
                obj = null;
            } else {
                obj = a.values()[readInt2];
            }
            this.f130672a.put(obj, (C14996a) parcel.readParcelable(C14996a.class.getClassLoader()));
        }
        int readInt3 = parcel.readInt();
        this.f130673b = new HashMap(readInt3);
        for (int i11 = 0; i11 < readInt3; i11++) {
            this.f130673b.put((Class) parcel.readSerializable(), (C14997b) parcel.readParcelable(C14997b.class.getClassLoader()));
        }
        this.f130674c = parcel.readString();
        this.f130675d = parcel.readInt();
    }
}
