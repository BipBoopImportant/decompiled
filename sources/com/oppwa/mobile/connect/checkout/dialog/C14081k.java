package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import java.util.Calendar;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.k  reason: case insensitive filesystem */
class C14081k extends C14096p {

    /* renamed from: d  reason: collision with root package name */
    private final String f121262d;

    /* renamed from: e  reason: collision with root package name */
    private String f121263e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f121264f = "";

    /* renamed from: g  reason: collision with root package name */
    private final int f121265g;

    C14081k(Character ch2, int i10) {
        this.f121262d = String.valueOf(ch2);
        this.f121265g = i10;
    }

    private void c(Editable editable) {
        int length = editable.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (editable.charAt(i10) == this.f121262d.charAt(0)) {
                this.f121281a = true;
                editable.replace(i10, i10 + 1, "");
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f121263e;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f121264f;
    }

    /* access modifiers changed from: protected */
    public void a(Editable editable) {
        b(editable.toString());
    }

    /* access modifiers changed from: protected */
    public Editable b(Editable editable) {
        c(editable);
        if (editable.length() < this.f121265g) {
            return editable;
        }
        int length = editable.length();
        int i10 = this.f121265g;
        if (length == i10) {
            this.f121281a = true;
            editable.append(this.f121262d);
        } else {
            this.f121281a = true;
            editable.insert(i10, this.f121262d);
        }
        b(editable.toString());
        return editable;
    }

    private String a(String str) {
        if (str.length() != 2) {
            return str;
        }
        return (Calendar.getInstance().get(1) / 100) + str;
    }

    private void b(String str) {
        if (str.contains(this.f121262d)) {
            String[] split = str.split(this.f121262d);
            if (split.length > 0) {
                this.f121263e = split[0];
            }
            if (split.length > 1) {
                this.f121264f = a(split[1]);
            }
        }
    }
}
