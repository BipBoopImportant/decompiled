package kc;

import Hc.i;
import Jb.a;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import android.content.Context;
import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import kc.j;
import mc.C10036b;
import org.json.JSONArray;
import org.json.JSONObject;
import xa.C8971l;
import xa.C8974o;

public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final C10036b<k> f75053a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f75054b;

    /* renamed from: c  reason: collision with root package name */
    private final C10036b<i> f75055c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f75056d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f75057e;

    private f(Context context, String str, Set<g> set, C10036b<i> bVar, Executor executor) {
        this((C10036b<k>) new e(context, str), set, executor, bVar, context);
    }

    public static C9128c<f> g() {
        E<Executor> a10 = E.a(a.class, Executor.class);
        return C9128c.f(f.class, i.class, j.class).b(q.l(Context.class)).b(q.l(Fb.f.class)).b(q.o(g.class)).b(q.n(i.class)).b(q.k(a10)).f(new d(a10)).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f h(E e10, C9129d dVar) {
        return new f((Context) dVar.a(Context.class), ((Fb.f) dVar.a(Fb.f.class)).o(), dVar.d(g.class), dVar.e(i.class), (Executor) dVar.b(e10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String i() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                k kVar = this.f75053a.get();
                List<l> c10 = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    l lVar = c10.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray(lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString(Constants.ENCODING);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
        throw th;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            this.f75053a.get().k(System.currentTimeMillis(), this.f75055c.get().a());
        }
        return null;
    }

    public C8971l<String> a() {
        return !D2.q.a(this.f75054b) ? C8974o.f("") : C8974o.c(this.f75057e, new c(this));
    }

    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f75053a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public C8971l<Void> l() {
        return this.f75056d.size() <= 0 ? C8974o.f(null) : !D2.q.a(this.f75054b) ? C8974o.f(null) : C8974o.c(this.f75057e, new b(this));
    }

    f(C10036b<k> bVar, Set<g> set, Executor executor, C10036b<i> bVar2, Context context) {
        this.f75053a = bVar;
        this.f75056d = set;
        this.f75057e = executor;
        this.f75055c = bVar2;
        this.f75054b = context;
    }
}
