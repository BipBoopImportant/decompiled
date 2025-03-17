package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import j0.C5445a;
import java.lang.reflect.Method;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f44883d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f44884e;

    /* renamed from: f  reason: collision with root package name */
    private final int f44885f;

    /* renamed from: g  reason: collision with root package name */
    private final int f44886g;

    /* renamed from: h  reason: collision with root package name */
    private final String f44887h;

    /* renamed from: i  reason: collision with root package name */
    private int f44888i;

    /* renamed from: j  reason: collision with root package name */
    private int f44889j;

    /* renamed from: k  reason: collision with root package name */
    private int f44890k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5445a(), new C5445a(), new C5445a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f44884e.writeInt(bArr.length);
            this.f44884e.writeByteArray(bArr);
            return;
        }
        this.f44884e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f44884e, 0);
    }

    public void E(int i10) {
        this.f44884e.writeInt(i10);
    }

    public void G(Parcelable parcelable) {
        this.f44884e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f44884e.writeString(str);
    }

    public void a() {
        int i10 = this.f44888i;
        if (i10 >= 0) {
            int i11 = this.f44883d.get(i10);
            int dataPosition = this.f44884e.dataPosition();
            this.f44884e.setDataPosition(i11);
            this.f44884e.writeInt(dataPosition - i11);
            this.f44884e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f44884e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f44889j;
        if (i10 == this.f44885f) {
            i10 = this.f44886g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f44887h + "  ", this.f44880a, this.f44881b, this.f44882c);
    }

    public boolean g() {
        return this.f44884e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f44884e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f44884e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f44884e);
    }

    public boolean m(int i10) {
        while (this.f44889j < this.f44886g) {
            int i11 = this.f44890k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f44884e.setDataPosition(this.f44889j);
            int readInt = this.f44884e.readInt();
            this.f44890k = this.f44884e.readInt();
            this.f44889j += readInt;
        }
        return this.f44890k == i10;
    }

    public int o() {
        return this.f44884e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f44884e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f44884e.readString();
    }

    public void w(int i10) {
        a();
        this.f44888i = i10;
        this.f44883d.put(i10, this.f44884e.dataPosition());
        E(0);
        E(i10);
    }

    public void y(boolean z10) {
        this.f44884e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, C5445a<String, Method> aVar, C5445a<String, Method> aVar2, C5445a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f44883d = new SparseIntArray();
        this.f44888i = -1;
        this.f44890k = -1;
        this.f44884e = parcel;
        this.f44885f = i10;
        this.f44886g = i11;
        this.f44889j = i10;
        this.f44887h = str;
    }
}
