package com.auth0.android.request.internal;

import XH.v;
import YH.X;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.C8743b;
import w7.C8929b;
import w7.C8930c;
import w7.C8931d;
import w7.C8932e;
import w7.f;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001 B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJM\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ]\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%¨\u0006'"}, d2 = {"Lcom/auth0/android/request/internal/j;", "Ls7/b;", "U", "", "Lw7/e;", "client", "Lw7/b;", "errorAdapter", "<init>", "(Lw7/e;Lw7/b;)V", "T", "Lw7/c;", "method", "", "url", "Lw7/d;", "resultAdapter", "Lw7/f;", "f", "(Lw7/c;Ljava/lang/String;Lw7/d;Lw7/b;)Lw7/f;", "d", "(Ljava/lang/String;Lw7/d;)Lw7/f;", "Ljava/lang/Void;", "c", "(Ljava/lang/String;)Lw7/f;", "b", "clientInfo", "LXH/N;", "e", "(Ljava/lang/String;)V", "Lcom/auth0/android/request/internal/k;", "threadSwitcher", "a", "(Lw7/c;Ljava/lang/String;Lw7/e;Lw7/d;Lw7/b;Lcom/auth0/android/request/internal/k;)Lw7/f;", "Lw7/e;", "Lw7/b;", "", "Ljava/util/Map;", "baseHeaders", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<U extends C8743b> {

    /* renamed from: d  reason: collision with root package name */
    private static final a f46458d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8932e f46459a;

    /* renamed from: b  reason: collision with root package name */
    private final C8929b<U> f46460b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f46461c = X.p(new v("Accept-Language", f46458d.a()));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/auth0/android/request/internal/j$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "defaultLocale", "ACCEPT_LANGUAGE_HEADER", "Ljava/lang/String;", "AUTH0_CLIENT_INFO_HEADER", "DEFAULT_LOCALE_IF_MISSING", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            String locale = Locale.getDefault().toString();
            C17542s.i(locale, "getDefault().toString()");
            return locale.length() > 0 ? locale : "en_US";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/auth0/android/request/internal/j$b", "Lw7/d;", "Ljava/lang/Void;", "Ljava/io/Reader;", "reader", "b", "(Ljava/io/Reader;)Ljava/lang/Void;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C8931d<Void> {
        b() {
        }

        /* renamed from: b */
        public Void a(Reader reader) {
            C17542s.j(reader, "reader");
            return null;
        }
    }

    public j(C8932e eVar, C8929b<U> bVar) {
        C17542s.j(eVar, "client");
        C17542s.j(bVar, "errorAdapter");
        this.f46459a = eVar;
        this.f46460b = bVar;
    }

    private final <T> f<T, U> f(C8930c cVar, String str, C8931d<T> dVar, C8929b<U> bVar) {
        f<T, U> a10 = a(cVar, str, this.f46459a, dVar, bVar, e.f46448c.a());
        Map<String, String> map = this.f46461c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(a10.c((String) next.getKey(), (String) next.getValue()));
        }
        return a10;
    }

    public final <T> f<T, U> a(C8930c cVar, String str, C8932e eVar, C8931d<T> dVar, C8929b<U> bVar, k kVar) {
        C17542s.j(cVar, "method");
        C17542s.j(str, "url");
        C17542s.j(eVar, "client");
        C17542s.j(dVar, "resultAdapter");
        C17542s.j(bVar, "errorAdapter");
        C17542s.j(kVar, "threadSwitcher");
        return new d(cVar, str, eVar, dVar, bVar, kVar);
    }

    public final <T> f<T, U> b(String str, C8931d<T> dVar) {
        C17542s.j(str, "url");
        C17542s.j(dVar, "resultAdapter");
        return f(C8930c.b.f57339a, str, dVar, this.f46460b);
    }

    public final f<Void, U> c(String str) {
        C17542s.j(str, "url");
        return d(str, new b());
    }

    public final <T> f<T, U> d(String str, C8931d<T> dVar) {
        C17542s.j(str, "url");
        C17542s.j(dVar, "resultAdapter");
        return f(C8930c.d.f57341a, str, dVar, this.f46460b);
    }

    public final void e(String str) {
        C17542s.j(str, "clientInfo");
        this.f46461c.put("Auth0-Client", str);
    }
}
