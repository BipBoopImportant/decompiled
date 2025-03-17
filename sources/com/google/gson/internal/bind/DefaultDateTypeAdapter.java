package com.google.gson.internal.bind;

import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f68960c = new v() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DefaultDateTypeAdapter(a.f68963b, 2, 2);
            }
            return null;
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final a<T> f68961a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f68962b;

    public static abstract class a<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final a<Date> f68963b = new C1185a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f68964a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a  reason: collision with other inner class name */
        class C1185a extends a<Date> {
            C1185a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            public Date d(Date date) {
                return date;
            }
        }

        protected a(Class<T> cls) {
            this.f68964a = cls;
        }

        private v c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f68964a, defaultDateTypeAdapter);
        }

        public final v a(int i10, int i11) {
            return c(new DefaultDateTypeAdapter(this, i10, i11));
        }

        public final v b(String str) {
            return c(new DefaultDateTypeAdapter(this, str));
        }

        /* access modifiers changed from: protected */
        public abstract T d(Date date);
    }

    private Date a(Tc.a aVar) {
        DateFormat next;
        TimeZone timeZone;
        String C12 = aVar.C1();
        synchronized (this.f68962b) {
            try {
                Iterator<DateFormat> it = this.f68962b.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    timeZone = next.getTimeZone();
                    Date parse = next.parse(C12);
                    next.setTimeZone(timeZone);
                    return parse;
                }
                try {
                    return Rc.a.c(C12, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new p("Failed parsing '" + C12 + "' as Date; at path " + aVar.q(), e10);
                }
            } catch (ParseException unused) {
                next.setTimeZone(timeZone);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: b */
    public T read(Tc.a aVar) {
        if (aVar.F() == b.NULL) {
            aVar.x();
            return null;
        }
        return this.f68961a.d(a(aVar));
    }

    /* renamed from: c */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.v();
            return;
        }
        DateFormat dateFormat = this.f68962b.get(0);
        synchronized (this.f68962b) {
            format = dateFormat.format(date);
        }
        cVar.l0(format);
    }

    public String toString() {
        DateFormat dateFormat = this.f68962b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(a<T> aVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f68962b = arrayList;
        Objects.requireNonNull(aVar);
        this.f68961a = aVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private DefaultDateTypeAdapter(a<T> aVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f68962b = arrayList;
        Objects.requireNonNull(aVar);
        this.f68961a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (d.c()) {
            arrayList.add(k.c(i10, i11));
        }
    }
}
