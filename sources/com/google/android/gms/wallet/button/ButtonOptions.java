package com.google.android.gms.wallet.button;

import K9.C6619q;
import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class ButtonOptions extends L9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    int f50618a;

    /* renamed from: b  reason: collision with root package name */
    int f50619b;

    /* renamed from: c  reason: collision with root package name */
    int f50620c;

    /* renamed from: d  reason: collision with root package name */
    String f50621d;

    /* renamed from: e  reason: collision with root package name */
    boolean f50622e = false;

    public final class a {
        /* synthetic */ a(Ca.a aVar) {
        }

        public ButtonOptions a() {
            return ButtonOptions.this;
        }

        public a b(String str) {
            ButtonOptions.this.f50621d = str;
            return this;
        }

        public a c(int i10) {
            ButtonOptions.this.f50619b = i10;
            return this;
        }

        public a d(int i10) {
            ButtonOptions.this.f50618a = i10;
            return this;
        }

        public a e(int i10) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f50620c = i10;
            buttonOptions.f50622e = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    public static a U() {
        return new a((Ca.a) null);
    }

    public int B() {
        return this.f50619b;
    }

    public int F() {
        return this.f50618a;
    }

    public int J() {
        return this.f50620c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            return C6619q.b(Integer.valueOf(this.f50618a), Integer.valueOf(buttonOptions.f50618a)) && C6619q.b(Integer.valueOf(this.f50619b), Integer.valueOf(buttonOptions.f50619b)) && C6619q.b(Integer.valueOf(this.f50620c), Integer.valueOf(buttonOptions.f50620c)) && C6619q.b(this.f50621d, buttonOptions.f50621d);
        }
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f50618a));
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, F());
        c.n(parcel, 2, B());
        c.n(parcel, 3, J());
        c.u(parcel, 4, x(), false);
        c.b(parcel, a10);
    }

    public String x() {
        return this.f50621d;
    }

    ButtonOptions(int i10, int i11, int i12, String str) {
        this.f50618a = ((Integer) C6620s.l(Integer.valueOf(i10))).intValue();
        this.f50619b = ((Integer) C6620s.l(Integer.valueOf(i11))).intValue();
        this.f50620c = ((Integer) C6620s.l(Integer.valueOf(i12))).intValue();
        this.f50621d = (String) C6620s.l(str);
    }
}
