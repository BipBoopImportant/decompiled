package Le;

import HJ.C15854t;
import Le.b;
import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LLe/c;", "LLe/b;", "LLe/a;", "addressLookupRepository", "LLe/d;", "googleLookupRepository", "<init>", "(LLe/a;LLe/d;)V", "LLe/b$a;", "params", "", "componentValue", "LXH/N;", "c", "(LLe/b$a;Ljava/lang/String;)V", "searchString", "countryCode", "", "LJe/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "address", "lookupKey", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "b", "(LJe/b;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LLe/a;", "LLe/d;", "LLe/b$a;", "initializeParams", "", "d", "()Z", "isGooglePlaces", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f61621a;

    /* renamed from: b  reason: collision with root package name */
    private final d f61622b;

    /* renamed from: c  reason: collision with root package name */
    private b.a f61623c;

    public c(a aVar, d dVar) {
        C17542s.j(aVar, "addressLookupRepository");
        C17542s.j(dVar, "googleLookupRepository");
        this.f61621a = aVar;
        this.f61622b = dVar;
    }

    private final boolean d() {
        b.a aVar = this.f61623c;
        if (aVar == null) {
            C17542s.z("initializeParams");
            aVar = null;
        }
        return aVar.a();
    }

    public Object a(String str, String str2, C17164e<? super List<? extends Je.b>> eVar) {
        return d() ? this.f61622b.a(str, str2, eVar) : this.f61621a.a(str, eVar);
    }

    public Object b(Je.b bVar, String str, C17164e<? super PostalCodeAddress> eVar) {
        return d() ? this.f61622b.b(bVar, str, eVar) : this.f61621a.b(bVar);
    }

    public void c(b.a aVar, String str) {
        C17542s.j(aVar, "params");
        C17542s.j(str, "componentValue");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Initializing AddressLookupWrapper with params: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        this.f61623c = aVar;
        if (d()) {
            this.f61622b.c(str);
        }
    }
}
