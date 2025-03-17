package com.google.firebase.crashlytics.ndk;

import Qb.C9251i;
import Tb.F;
import Tb.G;
import Wb.g;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.ndk.f;
import com.optimizely.ab.config.audience.match.MatchRegistry;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import t5.C8815j;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f68233d = Charset.forName(Constants.ENCODING);

    /* renamed from: a  reason: collision with root package name */
    private final Context f68234a;

    /* renamed from: b  reason: collision with root package name */
    private final e f68235b;

    /* renamed from: c  reason: collision with root package name */
    private final g f68236c;

    a(Context context, e eVar, g gVar) {
        this.f68234a = context;
        this.f68235b = eVar;
        this.f68236c = gVar;
    }

    private static F.a a(ApplicationExitInfo applicationExitInfo) {
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(i(applicationExitInfo)).a();
    }

    public static String b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private F.a c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f(str);
        }
        return null;
    }

    private f.c e(String str, File file) {
        return new f.c(h(file, ".dmp"), c(str));
    }

    private F.a f(String str) {
        List a10 = ((ActivityManager) this.f68234a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
        File q10 = this.f68236c.q(str, "start-time");
        return g(q10 == null ? System.currentTimeMillis() : q10.lastModified(), a10);
    }

    private F.a g(long j10, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ApplicationExitInfo a10 : list) {
            ApplicationExitInfo a11 = C8815j.a(a10);
            if (a11.getReason() == 5 && a11.getTimestamp() >= j10) {
                arrayList.add(a11);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a(C8815j.a(arrayList.get(0)));
    }

    private static File h(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static String i(ApplicationExitInfo applicationExitInfo) {
        try {
            return b(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            Nb.g.f().k("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void o(g gVar, String str, String str2, String str3) {
        q(new File(gVar.k(str), str3), str2);
    }

    private static void q(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f68233d));
            try {
                bufferedWriter2.write(str);
                C9251i.f(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                C9251i.f(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C9251i.f(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
            C9251i.f(bufferedWriter, "Failed to close " + file);
        } catch (Throwable th3) {
            th = th3;
            C9251i.f(bufferedWriter, "Failed to close " + file);
            throw th;
        }
    }

    private static String r(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            String encodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return encodeToString;
            throw th;
            throw th;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public f d(String str) {
        File k10 = this.f68236c.k(str);
        File file = new File(k10, "pending");
        Nb.g f10 = Nb.g.f();
        f10.i("Minidump directory: " + file.getAbsolutePath());
        File h10 = h(file, ".dmp");
        Nb.g f11 = Nb.g.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        sb2.append((h10 == null || !h10.exists()) ? "does not exist" : MatchRegistry.EXISTS);
        f11.i(sb2.toString());
        f.b bVar = new f.b();
        if (k10 != null && k10.exists() && file.exists()) {
            bVar.l(e(str, file)).k(h(k10, ".device_info")).n(new File(k10, "session.json")).h(new File(k10, "app.json")).j(new File(k10, "device.json")).m(new File(k10, "os.json"));
        }
        return bVar.i();
    }

    public boolean j(String str) {
        f.c cVar = d(str).f68247a;
        return cVar != null && cVar.a();
    }

    public boolean k(String str, String str2, long j10, G g10) {
        File k10 = this.f68236c.k(str);
        if (k10 == null) {
            return false;
        }
        try {
            if (!this.f68235b.a(k10.getCanonicalPath(), this.f68234a.getAssets())) {
                return false;
            }
            l(str, str2, j10);
            m(str, g10.a());
            p(str, g10.d());
            n(str, g10.c());
            return true;
        } catch (IOException e10) {
            Nb.g.f().e("Error initializing Crashlytics NDK", e10);
            return false;
        }
    }

    public void l(String str, String str2, long j10) {
        o(this.f68236c, str, h.b(str, str2, j10), "session.json");
    }

    public void m(String str, G.a aVar) {
        o(this.f68236c, str, h.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), "app.json");
    }

    public void n(String str, G.b bVar) {
        o(this.f68236c, str, h.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), "device.json");
    }

    public void p(String str, G.c cVar) {
        o(this.f68236c, str, h.e(cVar.d(), cVar.c(), cVar.b()), "os.json");
    }
}
