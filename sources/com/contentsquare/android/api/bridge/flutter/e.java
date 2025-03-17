package com.contentsquare.android.api.bridge.flutter;

import D8.c;
import Q8.a;
import a9.H1;
import a9.V;
import b9.h;
import b9.j;
import com.contentsquare.android.sdk.C7131j;
import com.google.protobuf.B;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lcom/contentsquare/android/api/bridge/flutter/e;", "", "Lcom/contentsquare/android/api/bridge/flutter/d;", "crashBuilder", "<init>", "(Lcom/contentsquare/android/api/bridge/flutter/d;)V", "Lb9/h;", "crash", "", "timestamp", "LXH/N;", "c", "(Lb9/h;J)V", "", "data", "Lb9/j;", "a", "([B)Lb9/j;", "", "reports", "b", "(Ljava/util/List;)V", "Lcom/contentsquare/android/api/bridge/flutter/d;", "LQ8/a;", "LQ8/a;", "getCrashUtils", "()LQ8/a;", "setCrashUtils", "(LQ8/a;)V", "crashUtils", "LD8/c;", "LD8/c;", "logger", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final d f46686a;

    /* renamed from: b  reason: collision with root package name */
    private a f46687b = a.f39639a;

    /* renamed from: c  reason: collision with root package name */
    private final c f46688c = new c("FlutterCrashProcessor");

    public e(d dVar) {
        C17542s.j(dVar, "crashBuilder");
        this.f46686a = dVar;
    }

    private final j a(byte[] bArr) {
        try {
            return j.j(bArr);
        } catch (B e10) {
            H1.a(this.f46688c, "Failed to build crash report", e10);
            return null;
        }
    }

    private final void c(h hVar, long j10) {
        C7131j jVar = C7131j.f47442k;
        if (jVar != null) {
            long o10 = hVar.o();
            long p10 = hVar.p();
            String o11 = hVar.n().o();
            C17542s.i(o11, "crash.context.errorSource");
            V v10 = new V(j10, o10, p10, o11);
            C17542s.j(v10, "event");
            jVar.f47456j.addCrashAndSaveToDisk(v10);
        }
        this.f46687b.e(hVar);
    }

    public final void b(List<byte[]> list) {
        C17542s.j(list, "reports");
        for (byte[] a10 : list) {
            j a11 = a(a10);
            if (a11 != null) {
                c(this.f46686a.a(a11), a11.i());
            }
        }
    }
}
