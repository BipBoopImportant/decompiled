package hc;

import fc.C9700a;
import fc.C9701b;
import fc.C9703d;
import fc.C9704e;
import fc.C9705f;
import fc.C9706g;
import gc.C9721a;
import gc.C9722b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: hc.d  reason: case insensitive filesystem */
public final class C9771d implements C9722b<C9771d> {

    /* renamed from: e  reason: collision with root package name */
    private static final C9703d<Object> f73557e = new C9768a();

    /* renamed from: f  reason: collision with root package name */
    private static final C9705f<String> f73558f = new C9769b();

    /* renamed from: g  reason: collision with root package name */
    private static final C9705f<Boolean> f73559g = new C9770c();

    /* renamed from: h  reason: collision with root package name */
    private static final b f73560h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, C9703d<?>> f73561a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, C9705f<?>> f73562b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C9703d<Object> f73563c = f73557e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f73564d = false;

    /* renamed from: hc.d$a */
    class a implements C9700a {
        a() {
        }

        public void a(Object obj, Writer writer) {
            C9772e eVar = new C9772e(writer, C9771d.this.f73561a, C9771d.this.f73562b, C9771d.this.f73563c, C9771d.this.f73564d);
            eVar.k(obj, false);
            eVar.u();
        }

        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: hc.d$b */
    private static final class b implements C9705f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f73566a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f73566a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* renamed from: b */
        public void a(Date date, C9706g gVar) {
            gVar.a(f73566a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C9771d() {
        p(String.class, f73558f);
        p(Boolean.class, f73559g);
        p(Date.class, f73560h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, C9704e eVar) {
        throw new C9701b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public C9700a i() {
        return new a();
    }

    public C9771d j(C9721a aVar) {
        aVar.a(this);
        return this;
    }

    public C9771d k(boolean z10) {
        this.f73564d = z10;
        return this;
    }

    /* renamed from: o */
    public <T> C9771d a(Class<T> cls, C9703d<? super T> dVar) {
        this.f73561a.put(cls, dVar);
        this.f73562b.remove(cls);
        return this;
    }

    public <T> C9771d p(Class<T> cls, C9705f<? super T> fVar) {
        this.f73562b.put(cls, fVar);
        this.f73561a.remove(cls);
        return this;
    }
}
