package rE;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import rE.C15001f;

/* renamed from: rE.c  reason: case insensitive filesystem */
public final class C14998c extends C14997b {
    public static final Parcelable.Creator<C14998c> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public String f130654d;

    /* renamed from: e  reason: collision with root package name */
    public String f130655e;

    /* renamed from: f  reason: collision with root package name */
    public int f130656f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f130657g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f130658h = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f130659i;

    /* renamed from: j  reason: collision with root package name */
    public String f130660j;

    /* renamed from: k  reason: collision with root package name */
    public Map<C15001f.b, String> f130661k = null;

    /* renamed from: l  reason: collision with root package name */
    public Map<C15001f.b, String> f130662l = null;

    /* renamed from: m  reason: collision with root package name */
    public Map<C15001f.b, String> f130663m = null;

    /* renamed from: n  reason: collision with root package name */
    public Map<C15001f.b, Integer> f130664n = null;

    /* renamed from: o  reason: collision with root package name */
    public Map<C15001f.b, int[]> f130665o = null;

    /* renamed from: rE.c$a */
    public static class a implements Parcelable.Creator<C14998c> {
        public Object createFromParcel(Parcel parcel) {
            return new C14998c(parcel);
        }

        public Object[] newArray(int i10) {
            return new C14998c[i10];
        }
    }

    public C14998c() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14998c.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14998c cVar = (C14998c) obj;
        if (this.f130656f != cVar.f130656f || this.f130657g != cVar.f130657g || this.f130658h != cVar.f130658h) {
            return false;
        }
        String str = this.f130654d;
        if (str == null ? cVar.f130654d != null : !str.equals(cVar.f130654d)) {
            return false;
        }
        String str2 = this.f130655e;
        if (str2 == null ? cVar.f130655e != null : !str2.equals(cVar.f130655e)) {
            return false;
        }
        String str3 = this.f130659i;
        if (str3 == null ? cVar.f130659i != null : !str3.equals(cVar.f130659i)) {
            return false;
        }
        String str4 = this.f130660j;
        if (str4 == null ? cVar.f130660j != null : !str4.equals(cVar.f130660j)) {
            return false;
        }
        Map<C15001f.b, String> map = this.f130661k;
        if (map == null ? cVar.f130661k != null : !map.equals(cVar.f130661k)) {
            return false;
        }
        Map<C15001f.b, String> map2 = this.f130662l;
        if (map2 == null ? cVar.f130662l != null : !map2.equals(cVar.f130662l)) {
            return false;
        }
        Map<C15001f.b, String> map3 = this.f130663m;
        if (map3 == null ? cVar.f130663m != null : !map3.equals(cVar.f130663m)) {
            return false;
        }
        Map<C15001f.b, Integer> map4 = this.f130664n;
        if (map4 == null ? cVar.f130664n != null : !map4.equals(cVar.f130664n)) {
            return false;
        }
        Map<C15001f.b, int[]> map5 = this.f130665o;
        Map<C15001f.b, int[]> map6 = cVar.f130665o;
        return map5 != null ? map5.equals(map6) : map6 == null;
    }

    public String g(C15001f.b bVar) {
        Map<C15001f.b, String> map = this.f130661k;
        if (map == null) {
            return null;
        }
        return map.get(bVar);
    }

    public int h() {
        return this.f130657g;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f130654d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f130655e;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f130656f) * 31) + this.f130657g) * 31) + this.f130658h) * 31;
        String str3 = this.f130659i;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f130660j;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<C15001f.b, String> map = this.f130661k;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        Map<C15001f.b, String> map2 = this.f130662l;
        int hashCode7 = (hashCode6 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<C15001f.b, String> map3 = this.f130663m;
        int hashCode8 = (hashCode7 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<C15001f.b, Integer> map4 = this.f130664n;
        int hashCode9 = (hashCode8 + (map4 != null ? map4.hashCode() : 0)) * 31;
        Map<C15001f.b, int[]> map5 = this.f130665o;
        if (map5 != null) {
            i10 = map5.hashCode();
        }
        return hashCode9 + i10;
    }

    public String i() {
        return this.f130654d;
    }

    public String j() {
        return this.f130655e;
    }

    public int k() {
        return this.f130656f;
    }

    public int[] l(C15001f.b bVar) {
        Map<C15001f.b, int[]> map = this.f130665o;
        if (map == null) {
            return null;
        }
        return map.get(bVar);
    }

    public String m(C15001f.b bVar) {
        Map<C15001f.b, String> map = this.f130662l;
        if (map == null) {
            return null;
        }
        return map.get(bVar);
    }

    public String n(C15001f.b bVar) {
        Map<C15001f.b, String> map = this.f130663m;
        if (map == null) {
            return null;
        }
        return map.get(bVar);
    }

    public Integer o(C15001f.b bVar) {
        Map<C15001f.b, Integer> map = this.f130664n;
        if (map == null) {
            return null;
        }
        return map.get(bVar);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f130654d);
        parcel.writeString(this.f130655e);
        parcel.writeInt(this.f130656f);
        parcel.writeInt(this.f130657g);
        parcel.writeInt(this.f130658h);
        parcel.writeString(this.f130659i);
        parcel.writeString(this.f130660j);
        Map<C15001f.b, String> map = this.f130661k;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map.size());
            for (Map.Entry next : this.f130661k.entrySet()) {
                parcel.writeInt(next.getKey() == null ? -1 : ((C15001f.b) next.getKey()).ordinal());
                parcel.writeString((String) next.getValue());
            }
        }
        Map<C15001f.b, String> map2 = this.f130662l;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map2.size());
            for (Map.Entry next2 : this.f130662l.entrySet()) {
                parcel.writeInt(next2.getKey() == null ? -1 : ((C15001f.b) next2.getKey()).ordinal());
                parcel.writeString((String) next2.getValue());
            }
        }
        Map<C15001f.b, String> map3 = this.f130663m;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map3.size());
            for (Map.Entry next3 : this.f130663m.entrySet()) {
                parcel.writeInt(next3.getKey() == null ? -1 : ((C15001f.b) next3.getKey()).ordinal());
                parcel.writeString((String) next3.getValue());
            }
        }
        Map<C15001f.b, Integer> map4 = this.f130664n;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map4.size());
            for (Map.Entry next4 : this.f130664n.entrySet()) {
                parcel.writeInt(next4.getKey() == null ? -1 : ((C15001f.b) next4.getKey()).ordinal());
                parcel.writeValue(next4.getValue());
            }
        }
        Map<C15001f.b, int[]> map5 = this.f130665o;
        if (map5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(map5.size());
        for (Map.Entry next5 : this.f130665o.entrySet()) {
            parcel.writeInt(next5.getKey() == null ? -1 : ((C15001f.b) next5.getKey()).ordinal());
            parcel.writeIntArray((int[]) next5.getValue());
        }
    }

    public C14998c(Parcel parcel) {
        super(parcel);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        this.f130654d = parcel.readString();
        this.f130655e = parcel.readString();
        this.f130656f = parcel.readInt();
        this.f130657g = parcel.readInt();
        this.f130658h = parcel.readInt();
        this.f130659i = parcel.readString();
        this.f130660j = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f130661k = new HashMap(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                if (readInt2 == -1) {
                    obj5 = null;
                } else {
                    obj5 = C15001f.b.values()[readInt2];
                }
                this.f130661k.put(obj5, parcel.readString());
            }
        } else {
            this.f130661k = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            this.f130662l = new HashMap(readInt3);
            for (int i11 = 0; i11 < readInt3; i11++) {
                int readInt4 = parcel.readInt();
                if (readInt4 == -1) {
                    obj4 = null;
                } else {
                    obj4 = C15001f.b.values()[readInt4];
                }
                this.f130662l.put(obj4, parcel.readString());
            }
        } else {
            this.f130662l = null;
        }
        int readInt5 = parcel.readInt();
        if (readInt5 > 0) {
            this.f130663m = new HashMap(readInt5);
            for (int i12 = 0; i12 < readInt5; i12++) {
                int readInt6 = parcel.readInt();
                if (readInt6 == -1) {
                    obj3 = null;
                } else {
                    obj3 = C15001f.b.values()[readInt6];
                }
                this.f130663m.put(obj3, parcel.readString());
            }
        } else {
            this.f130663m = null;
        }
        int readInt7 = parcel.readInt();
        if (readInt7 > 0) {
            this.f130664n = new HashMap(readInt7);
            for (int i13 = 0; i13 < readInt7; i13++) {
                int readInt8 = parcel.readInt();
                if (readInt8 == -1) {
                    obj2 = null;
                } else {
                    obj2 = C15001f.b.values()[readInt8];
                }
                this.f130664n.put(obj2, (Integer) parcel.readValue(Integer.class.getClassLoader()));
            }
        } else {
            this.f130664n = null;
        }
        int readInt9 = parcel.readInt();
        if (readInt9 > 0) {
            this.f130665o = new HashMap(readInt9);
            for (int i14 = 0; i14 < readInt9; i14++) {
                int readInt10 = parcel.readInt();
                if (readInt10 == -1) {
                    obj = null;
                } else {
                    obj = C15001f.b.values()[readInt10];
                }
                this.f130665o.put(obj, parcel.createIntArray());
            }
            return;
        }
        this.f130665o = null;
    }
}
