package com.google.gson.internal.sql;

import Tc.a;
import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b  reason: collision with root package name */
    static final v f69174b = new v() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f69175a;

    /* renamed from: a */
    public Time read(a aVar) {
        Time time;
        if (aVar.F() == b.NULL) {
            aVar.x();
            return null;
        }
        String C12 = aVar.C1();
        synchronized (this) {
            TimeZone timeZone = this.f69175a.getTimeZone();
            try {
                time = new Time(this.f69175a.parse(C12).getTime());
                this.f69175a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new p("Failed parsing '" + C12 + "' as SQL Time; at path " + aVar.q(), e10);
            } catch (Throwable th2) {
                this.f69175a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    /* renamed from: b */
    public void write(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.v();
            return;
        }
        synchronized (this) {
            format = this.f69175a.format(time);
        }
        cVar.l0(format);
    }

    private SqlTimeTypeAdapter() {
        this.f69175a = new SimpleDateFormat("hh:mm:ss a");
    }
}
