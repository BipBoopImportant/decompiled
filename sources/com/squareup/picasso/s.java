package com.squareup.picasso;

import GK.C15774B;
import GK.C15776D;
import GK.C15784c;
import GK.C15786e;
import GK.z;
import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;

public final class s implements j {

    /* renamed from: a  reason: collision with root package name */
    final C15786e.a f122592a;

    /* renamed from: b  reason: collision with root package name */
    private final C15784c f122593b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f122594c;

    public s(Context context) {
        this(F.e(context));
    }

    public C15776D a(C15774B b10) {
        return FirebasePerfOkHttpClient.execute(this.f122592a.b(b10));
    }

    public s(File file) {
        this(file, F.a(file));
    }

    public s(File file, long j10) {
        this(new z.a().d(new C15784c(file, j10)).c());
        this.f122594c = false;
    }

    public s(z zVar) {
        this.f122594c = true;
        this.f122592a = zVar;
        this.f122593b = zVar.j();
    }
}
