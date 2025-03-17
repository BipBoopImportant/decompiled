package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class x {

    /* renamed from: c  reason: collision with root package name */
    private static final x f66666c = new x((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f66667a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f66668b;

    private x(Long l10, TimeZone timeZone) {
        this.f66667a = l10;
        this.f66668b = timeZone;
    }

    static x c() {
        return f66666c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f66668b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f66667a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        return instance;
    }
}
