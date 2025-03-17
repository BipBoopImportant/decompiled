package a9;

import E8.c;
import G8.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.google.protobuf.C9575h;
import d9.C7767m;
import d9.I;
import d9.Y;
import d9.b0;
import d9.i0;
import d9.j0;
import java.io.File;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

public final class G0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42008a;

    /* renamed from: b  reason: collision with root package name */
    public final D8.c f42009b;

    /* renamed from: c  reason: collision with root package name */
    public C9036b f42010c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f42011d;

    /* renamed from: e  reason: collision with root package name */
    public int f42012e;

    /* renamed from: f  reason: collision with root package name */
    public final File f42013f;

    public G0(Context context, c cVar) {
        D8.c cVar2 = new D8.c("SessionReplayTreeLogger");
        C17542s.j(context, "context");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(cVar2, "logger");
        this.f42008a = cVar;
        this.f42009b = cVar2;
        this.f42013f = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "frames");
    }

    public static Y a(C9036b bVar) {
        i0.a aVar = i0.f50795b;
        Y.a r10 = Y.r();
        C17542s.i(r10, "newBuilder()");
        i0 a10 = aVar.a(r10);
        a10.f(bVar.r());
        C17542s.j(bVar, "viewLight");
        j0.a aVar2 = j0.f50799b;
        b0.a t10 = b0.t();
        C17542s.i(t10, "newBuilder()");
        j0 a11 = aVar2.a(t10);
        a11.j(bVar.p());
        a11.k(bVar.q());
        a11.i(bVar.w());
        a11.g(bVar.l());
        String u10 = bVar.u();
        if (u10 == null) {
            a11.c(g.o(bVar.g()));
        } else {
            byte[] k10 = bVar.k();
            if (k10 != null) {
                C9575h m10 = C9575h.m(k10);
                C17542s.i(m10, "copyFrom(encodeBitmap)");
                a11.d(m10);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (u10 == null) {
            u10 = "null";
        }
        sb2.append(u10);
        if (bVar.C()) {
            sb2.append("-masked");
        }
        if (bVar.B()) {
            sb2.append("-forced");
        }
        if (bVar.x()) {
            sb2.append("-animating");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        a11.e(sb3);
        a11.b(bVar.t());
        a11.h(bVar.E());
        a11.f(bVar.A());
        a10.g(a11.a());
        Y.b b10 = Y.b.b(bVar.F() ? 3 : 2);
        C17542s.i(b10, "forNumber(viewFormat)");
        a10.d(b10);
        if (!(bVar.i() == null && bVar.m() == null)) {
            C7767m.a aVar3 = C7767m.f50807b;
            I.a k11 = I.k();
            C17542s.i(k11, "newBuilder()");
            C7767m a12 = aVar3.a(k11);
            String i10 = bVar.i();
            String str = "";
            if (i10 == null) {
                i10 = str;
            }
            a12.b(i10);
            String m11 = bVar.m();
            if (m11 != null) {
                str = m11;
            }
            a12.c(str);
            a10.e(a12.a());
        }
        for (C9036b a13 : bVar.h()) {
            a10.b(a10.c(), a(a13));
        }
        return a10.a();
    }
}
