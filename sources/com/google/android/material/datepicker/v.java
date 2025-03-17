package com.google.android.material.datepicker;

import Ea.C9068b;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9076j;
import H2.d;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.h;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class v implements i<Long> {
    public static final Parcelable.Creator<v> CREATOR = new b();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f66659a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Long f66660b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDateFormat f66661c;

    class a extends f {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ t f66662i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ TextInputLayout f66663j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, a aVar, t tVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f66662i = tVar;
            this.f66663j = textInputLayout2;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            CharSequence unused = v.this.f66659a = this.f66663j.getError();
            this.f66662i.a();
        }

        /* access modifiers changed from: package-private */
        public void g(Long l10) {
            if (l10 == null) {
                v.this.d();
            } else {
                v.this.n3(l10.longValue());
            }
            CharSequence unused = v.this.f66659a = null;
            this.f66662i.b(v.this.W2());
        }
    }

    class b implements Parcelable.Creator<v> {
        b() {
        }

        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            v vVar = new v();
            Long unused = vVar.f66660b = (Long) parcel.readValue(Long.class.getClassLoader());
            return vVar;
        }

        /* renamed from: b */
        public v[] newArray(int i10) {
            return new v[i10];
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        this.f66660b = null;
    }

    public int F0() {
        return C9076j.f59577t;
    }

    public String F1(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f66660b;
        if (l10 == null) {
            return resources.getString(C9076j.f59578u);
        }
        return resources.getString(C9076j.f59576s, new Object[]{j.k(l10.longValue())});
    }

    public boolean J2() {
        return this.f66660b != null;
    }

    public Collection<d<Long, Long>> L1() {
        return new ArrayList();
    }

    public String P0(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f66660b;
        return resources.getString(C9076j.f59574q, new Object[]{l10 == null ? resources.getString(C9076j.f59575r) : j.k(l10.longValue())});
    }

    public Collection<Long> Q2() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f66660b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    public int T0(Context context) {
        return Ra.b.d(context, C9068b.f59298D, MaterialDatePicker.class.getCanonicalName());
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Long W2() {
        return this.f66660b;
    }

    /* renamed from: f */
    public void N1(Long l10) {
        this.f66660b = l10 == null ? null : Long.valueOf(y.a(l10.longValue()));
    }

    public void n3(long j10) {
        this.f66660b = Long.valueOf(j10);
    }

    public View t2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, t<Long> tVar) {
        boolean z10 = false;
        View inflate = layoutInflater.inflate(C9074h.f59516E, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C9072f.f59467J);
        EditText editText = textInputLayout.getEditText();
        if (h.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f66661c;
        if (simpleDateFormat != null) {
            z10 = true;
        }
        if (!z10) {
            simpleDateFormat = y.f();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        String pattern = z10 ? simpleDateFormat2.toPattern() : y.g(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f66660b;
        if (l10 != null) {
            editText.setText(simpleDateFormat2.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, aVar, tVar, textInputLayout));
        i.r2(editText);
        return inflate;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f66660b);
    }
}
