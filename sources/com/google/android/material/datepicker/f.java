package com.google.android.material.datepicker;

import Ea.C9076j;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.r;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

abstract class f extends r {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f66617a;

    /* renamed from: b  reason: collision with root package name */
    private final String f66618b;

    /* renamed from: c  reason: collision with root package name */
    private final DateFormat f66619c;

    /* renamed from: d  reason: collision with root package name */
    private final a f66620d;

    /* renamed from: e  reason: collision with root package name */
    private final String f66621e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f66622f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f66623g;

    /* renamed from: h  reason: collision with root package name */
    private int f66624h = 0;

    f(String str, DateFormat dateFormat, TextInputLayout textInputLayout, a aVar) {
        this.f66618b = str;
        this.f66619c = dateFormat;
        this.f66617a = textInputLayout;
        this.f66620d = aVar;
        this.f66621e = textInputLayout.getContext().getString(C9076j.f59546C);
        this.f66622f = new d(this, str);
    }

    private Runnable c(long j10) {
        return new e(this, j10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(long j10) {
        this.f66617a.setError(String.format(this.f66621e, new Object[]{i(j.a(j10))}));
        f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        TextInputLayout textInputLayout = this.f66617a;
        DateFormat dateFormat = this.f66619c;
        Context context = textInputLayout.getContext();
        String string = context.getString(C9076j.f59581x);
        String format = String.format(context.getString(C9076j.f59583z), new Object[]{i(str)});
        String format2 = String.format(context.getString(C9076j.f59582y), new Object[]{i(dateFormat.format(new Date(y.k().getTimeInMillis())))});
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        f();
    }

    private String i(String str) {
        return str.replace(' ', 160);
    }

    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f66618b.length() && editable.length() >= this.f66624h) {
            char charAt = this.f66618b.charAt(editable.length());
            if (!Character.isLetterOrDigit(charAt)) {
                editable.append(charAt);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f66624h = charSequence.length();
    }

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: package-private */
    public abstract void g(Long l10);

    public void h(View view, Runnable runnable) {
        view.post(runnable);
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f66617a.removeCallbacks(this.f66622f);
        this.f66617a.removeCallbacks(this.f66623g);
        this.f66617a.setError((CharSequence) null);
        g((Long) null);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= this.f66618b.length()) {
            try {
                Date parse = this.f66619c.parse(charSequence.toString());
                this.f66617a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f66620d.g().W0(time) || !this.f66620d.n(time)) {
                    Runnable c10 = c(time);
                    this.f66623g = c10;
                    h(this.f66617a, c10);
                    return;
                }
                g(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                h(this.f66617a, this.f66622f);
            }
        }
    }
}
