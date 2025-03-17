package com.oppwa.mobile.connect.checkout.dialog;

import android.text.Editable;
import com.oppwa.mobile.connect.utils.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.l  reason: case insensitive filesystem */
class C14084l extends C14096p {

    /* renamed from: d  reason: collision with root package name */
    private String f121269d;

    C14084l() {
    }

    private void c(Editable editable) {
        for (int i10 = 0; i10 < editable.length(); i10++) {
            if (editable.charAt(i10) == '.') {
                this.f121281a = true;
                editable.replace(i10, i10 + 1, "");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: protected */
    public Editable b(Editable editable) {
        c(editable);
        int i10 = 0;
        while (i10 < editable.length()) {
            int i11 = i10 + 1;
            char charAt = i11 < 10 ? "##.##.####".charAt(i11) : '#';
            if (!(charAt == '#' || charAt == editable.charAt(i10))) {
                this.f121281a = true;
                editable.insert(i11, String.valueOf(charAt));
                i10 = i11;
            }
            i10++;
        }
        this.f121269d = editable.toString();
        return editable;
    }

    public Date a() {
        String str = this.f121269d;
        if (str != null) {
            return a(str);
        }
        return null;
    }

    private Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.US);
        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            Logger.error((Throwable) e10);
            return null;
        }
    }
}
