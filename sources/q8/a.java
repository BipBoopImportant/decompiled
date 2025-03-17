package Q8;

import D8.c;
import G8.h;
import G8.i;
import YH.C16870n;
import YH.C16877v;
import a9.H1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, d2 = {"LQ8/a;", "", "<init>", "()V", "Lb9/h;", "crashEvent", "", "a", "(Lb9/h;)[B", "", "", "b", "()Ljava/util/List;", "crashData", "LXH/N;", "d", "([B)V", "crash", "e", "(Lb9/h;)V", "LD8/c;", "LD8/c;", "logger", "LG8/h;", "c", "LG8/h;", "storageUtil", "()Ljava/lang/String;", "storagePath", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39639a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final c f39640b = new c("CrashEventWriterReader");

    /* renamed from: c  reason: collision with root package name */
    private static final h f39641c = new h();

    private a() {
    }

    private final byte[] a(b9.h hVar) {
        i iVar = i.f36274a;
        byte[] byteArray = hVar.toByteArray();
        C17542s.i(byteArray, "crashEvent.toByteArray()");
        return i.b(iVar, byteArray, (ByteArrayOutputStream) null, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = (r1 = (r1 = r1.b()).getApplicationContext()).getFilesDir();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String c() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            X8.b r1 = X8.b.i()
            if (r1 == 0) goto L_0x0022
            android.app.Application r1 = r1.b()
            if (r1 == 0) goto L_0x0022
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto L_0x0022
            java.io.File r1 = r1.getFilesDir()
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = r1.getAbsolutePath()
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "cs"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "crashes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q8.a.c():java.lang.String");
    }

    public final List<String> b() {
        ArrayList arrayList;
        List<String> f10;
        String[] n10 = f39641c.n(c());
        if (n10 == null || (f10 = C16870n.f(n10)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C16877v.y(f10, 10));
            for (String str : f10) {
                arrayList.add(f39639a.c() + File.separator + str);
            }
        }
        return arrayList == null ? C16877v.n() : arrayList;
    }

    public final void d(byte[] bArr) {
        C17542s.j(bArr, "crashData");
        try {
            b9.h s10 = b9.h.s(i.f36274a.c(bArr));
            String str = C17542s.e(s10.n().o(), "reactNative") ? "ReactNative " : "";
            c cVar = f39640b;
            cVar.j(str + "Crash event detected and sent for userID: \"" + s10.n().r() + "\" session: [" + s10.n().p() + "] on screen: [" + s10.n().s() + "] crashID: [" + s10.o() + ']');
        } catch (IOException e10) {
            H1.a(f39640b, "Failed to read crash file", e10);
        }
    }

    public final void e(b9.h hVar) {
        C17542s.j(hVar, "crash");
        try {
            byte[] a10 = a(hVar);
            String str = c() + File.separator + hVar.o();
            f39640b.f("Saving crash to event to file: " + str);
            h hVar2 = f39641c;
            hVar2.o(c());
            hVar2.s(str, a10, true);
        } catch (IOException e10) {
            H1.a(f39640b, "Failed to write crash event to file", e10);
        }
    }
}
