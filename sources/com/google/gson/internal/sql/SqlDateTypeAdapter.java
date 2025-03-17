package com.google.gson.internal.sql;

import Tc.a;
import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    static final v f69172b = new v() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f69173a;

    /* renamed from: a */
    public Date read(a aVar) {
        Date date;
        if (aVar.F() == b.NULL) {
            aVar.x();
            return null;
        }
        String C12 = aVar.C1();
        synchronized (this) {
            TimeZone timeZone = this.f69173a.getTimeZone();
            try {
                date = new Date(this.f69173a.parse(C12).getTime());
                this.f69173a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new p("Failed parsing '" + C12 + "' as SQL Date; at path " + aVar.q(), e10);
            } catch (Throwable th2) {
                this.f69173a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    /* renamed from: b */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.v();
            return;
        }
        synchronized (this) {
            format = this.f69173a.format(date);
        }
        cVar.l0(format);
    }

    private SqlDateTypeAdapter() {
        this.f69173a = new SimpleDateFormat("MMM d, yyyy");
    }
}
