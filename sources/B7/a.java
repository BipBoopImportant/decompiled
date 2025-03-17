package B7;

import C7.e;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15787f;
import I7.h;
import Y7.c;
import Y7.k;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class a implements d<InputStream>, C15787f {

    /* renamed from: a  reason: collision with root package name */
    private final C15786e.a f33243a;

    /* renamed from: b  reason: collision with root package name */
    private final h f33244b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f33245c;

    /* renamed from: d  reason: collision with root package name */
    private C15777E f33246d;

    /* renamed from: e  reason: collision with root package name */
    private d.a<? super InputStream> f33247e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C15786e f33248f;

    public a(C15786e.a aVar, h hVar) {
        this.f33243a = aVar;
        this.f33244b = hVar;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        try {
            InputStream inputStream = this.f33245c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        C15777E e10 = this.f33246d;
        if (e10 != null) {
            e10.close();
        }
        this.f33247e = null;
    }

    public void c(C15786e eVar, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f33247e.c(iOException);
    }

    public void cancel() {
        C15786e eVar = this.f33248f;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public C7.a d() {
        return C7.a.REMOTE;
    }

    public void e(C15786e eVar, C15776D d10) {
        this.f33246d = d10.c();
        if (d10.e1()) {
            InputStream d11 = c.d(this.f33246d.c(), ((C15777E) k.d(this.f33246d)).g());
            this.f33245c = d11;
            this.f33247e.e(d11);
            return;
        }
        this.f33247e.c(new e(d10.s(), d10.g()));
    }

    public void f(g gVar, d.a<? super InputStream> aVar) {
        C15774B.a n10 = new C15774B.a().n(this.f33244b.h());
        for (Map.Entry next : this.f33244b.e().entrySet()) {
            n10.a((String) next.getKey(), (String) next.getValue());
        }
        C15774B b10 = n10.b();
        this.f33247e = aVar;
        this.f33248f = this.f33243a.b(b10);
        FirebasePerfOkHttpClient.enqueue(this.f33248f, this);
    }
}
