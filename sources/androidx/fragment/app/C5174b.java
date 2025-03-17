package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Q;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
final class C5174b implements Parcelable {
    public static final Parcelable.Creator<C5174b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f22023a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f22024b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f22025c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f22026d;

    /* renamed from: e  reason: collision with root package name */
    final int f22027e;

    /* renamed from: f  reason: collision with root package name */
    final String f22028f;

    /* renamed from: g  reason: collision with root package name */
    final int f22029g;

    /* renamed from: h  reason: collision with root package name */
    final int f22030h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f22031i;

    /* renamed from: j  reason: collision with root package name */
    final int f22032j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f22033k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f22034l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f22035m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f22036n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator<C5174b> {
        a() {
        }

        /* renamed from: a */
        public C5174b createFromParcel(Parcel parcel) {
            return new C5174b(parcel);
        }

        /* renamed from: b */
        public C5174b[] newArray(int i10) {
            return new C5174b[i10];
        }
    }

    C5174b(C5173a aVar) {
        int size = aVar.f21929c.size();
        this.f22023a = new int[(size * 6)];
        if (aVar.f21935i) {
            this.f22024b = new ArrayList<>(size);
            this.f22025c = new int[size];
            this.f22026d = new int[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Q.a aVar2 = aVar.f21929c.get(i11);
                int i12 = i10 + 1;
                this.f22023a[i10] = aVar2.f21946a;
                ArrayList<String> arrayList = this.f22024b;
                C5187o oVar = aVar2.f21947b;
                arrayList.add(oVar != null ? oVar.mWho : null);
                int[] iArr = this.f22023a;
                iArr[i12] = aVar2.f21948c;
                iArr[i10 + 2] = aVar2.f21949d;
                iArr[i10 + 3] = aVar2.f21950e;
                int i13 = i10 + 5;
                iArr[i10 + 4] = aVar2.f21951f;
                i10 += 6;
                iArr[i13] = aVar2.f21952g;
                this.f22025c[i11] = aVar2.f21953h.ordinal();
                this.f22026d[i11] = aVar2.f21954i.ordinal();
            }
            this.f22027e = aVar.f21934h;
            this.f22028f = aVar.f21937k;
            this.f22029g = aVar.f21996v;
            this.f22030h = aVar.f21938l;
            this.f22031i = aVar.f21939m;
            this.f22032j = aVar.f21940n;
            this.f22033k = aVar.f21941o;
            this.f22034l = aVar.f21942p;
            this.f22035m = aVar.f21943q;
            this.f22036n = aVar.f21944r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(C5173a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < this.f22023a.length) {
                Q.a aVar2 = new Q.a();
                int i12 = i10 + 1;
                aVar2.f21946a = this.f22023a[i10];
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f22023a[i12]);
                }
                aVar2.f21953h = r.b.values()[this.f22025c[i11]];
                aVar2.f21954i = r.b.values()[this.f22026d[i11]];
                int[] iArr = this.f22023a;
                int i13 = i10 + 2;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                aVar2.f21948c = z10;
                int i14 = iArr[i13];
                aVar2.f21949d = i14;
                int i15 = iArr[i10 + 3];
                aVar2.f21950e = i15;
                int i16 = i10 + 5;
                int i17 = iArr[i10 + 4];
                aVar2.f21951f = i17;
                i10 += 6;
                int i18 = iArr[i16];
                aVar2.f21952g = i18;
                aVar.f21930d = i14;
                aVar.f21931e = i15;
                aVar.f21932f = i17;
                aVar.f21933g = i18;
                aVar.g(aVar2);
                i11++;
            } else {
                aVar.f21934h = this.f22027e;
                aVar.f21937k = this.f22028f;
                aVar.f21935i = true;
                aVar.f21938l = this.f22030h;
                aVar.f21939m = this.f22031i;
                aVar.f21940n = this.f22032j;
                aVar.f21941o = this.f22033k;
                aVar.f21942p = this.f22034l;
                aVar.f21943q = this.f22035m;
                aVar.f21944r = this.f22036n;
                return;
            }
        }
    }

    public C5173a b(FragmentManager fragmentManager) {
        C5173a aVar = new C5173a(fragmentManager);
        a(aVar);
        aVar.f21996v = this.f22029g;
        for (int i10 = 0; i10 < this.f22024b.size(); i10++) {
            String str = this.f22024b.get(i10);
            if (str != null) {
                aVar.f21929c.get(i10).f21947b = fragmentManager.m0(str);
            }
        }
        aVar.C(1);
        return aVar;
    }

    public C5173a c(FragmentManager fragmentManager, Map<String, C5187o> map) {
        C5173a aVar = new C5173a(fragmentManager);
        a(aVar);
        for (int i10 = 0; i10 < this.f22024b.size(); i10++) {
            String str = this.f22024b.get(i10);
            if (str != null) {
                C5187o oVar = map.get(str);
                if (oVar != null) {
                    aVar.f21929c.get(i10).f21947b = oVar;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f22028f + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f22023a);
        parcel.writeStringList(this.f22024b);
        parcel.writeIntArray(this.f22025c);
        parcel.writeIntArray(this.f22026d);
        parcel.writeInt(this.f22027e);
        parcel.writeString(this.f22028f);
        parcel.writeInt(this.f22029g);
        parcel.writeInt(this.f22030h);
        TextUtils.writeToParcel(this.f22031i, parcel, 0);
        parcel.writeInt(this.f22032j);
        TextUtils.writeToParcel(this.f22033k, parcel, 0);
        parcel.writeStringList(this.f22034l);
        parcel.writeStringList(this.f22035m);
        parcel.writeInt(this.f22036n ? 1 : 0);
    }

    C5174b(Parcel parcel) {
        this.f22023a = parcel.createIntArray();
        this.f22024b = parcel.createStringArrayList();
        this.f22025c = parcel.createIntArray();
        this.f22026d = parcel.createIntArray();
        this.f22027e = parcel.readInt();
        this.f22028f = parcel.readString();
        this.f22029g = parcel.readInt();
        this.f22030h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f22031i = (CharSequence) creator.createFromParcel(parcel);
        this.f22032j = parcel.readInt();
        this.f22033k = (CharSequence) creator.createFromParcel(parcel);
        this.f22034l = parcel.createStringArrayList();
        this.f22035m = parcel.createStringArrayList();
        this.f22036n = parcel.readInt() != 0;
    }
}
