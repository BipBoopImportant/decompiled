package w6;

import B6.g;
import G6.w;
import H6.c;
import I6.d;
import I6.j;
import WK.C16772g;
import WK.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, p<C8927i>> f57280a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C> f57281b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f57282c = {80, 75, 3, 4};

    public static C8917A<C8927i> A(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return B(context, zipInputStream, str);
        } finally {
            if (z10) {
                j.c(zipInputStream);
            }
        }
    }

    private static C8917A<C8927i> B(Context context, ZipInputStream zipInputStream, String str) {
        C8927i iVar;
        FileOutputStream fileOutputStream;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            iVar = null;
        } else {
            try {
                iVar = g.b().a(str);
            } catch (IOException e10) {
                return new C8917A<>((Throwable) e10);
            }
        }
        if (iVar != null) {
            return new C8917A<>(iVar);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C8927i iVar2 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                iVar2 = s(c.h(y.d(y.l(zipInputStream))), (String) null, false).b();
            } else {
                if (!name.contains(".png")) {
                    if (!name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            if (!name.contains(".ttf")) {
                                if (!name.contains(".otf")) {
                                    zipInputStream.closeEntry();
                                }
                            }
                            String[] split = name.split("/");
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                byte[] bArr = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                d.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th2);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                d.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVar2 == null) {
            return new C8917A<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            v j10 = j(iVar2, (String) entry.getKey());
            if (j10 != null) {
                j10.f(j.l((Bitmap) entry.getValue(), j10.e(), j10.c()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (B6.c next : iVar2.g().values()) {
                if (next.a().equals(entry2.getKey())) {
                    next.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                d.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            for (Map.Entry<String, v> value : iVar2.j().entrySet()) {
                v vVar = (v) value.getValue();
                if (vVar == null) {
                    return null;
                }
                String b10 = vVar.b();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (b10.startsWith("data:") && b10.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(b10.substring(b10.indexOf(44) + 1), 0);
                        vVar.f(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                    } catch (IllegalArgumentException e11) {
                        d.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            g.b().c(str, iVar2);
        }
        return new C8917A<>(iVar2);
        throw th;
    }

    private static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean D(C16772g gVar) {
        try {
            C16772g O10 = gVar.O();
            for (byte b10 : f57282c) {
                if (O10.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            O10.close();
            return Boolean.TRUE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        } catch (Exception e10) {
            d.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8917A E(C8927i iVar) {
        return new C8917A(iVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void F(String str, AtomicBoolean atomicBoolean, C8927i iVar) {
        Map<String, p<C8927i>> map = f57280a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void G(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, p<C8927i>> map = f57280a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            M(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8917A K(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return w(context, i10, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8917A L(Context context, String str, String str2) {
        C8917A<C8927i> c10 = C8923e.i(context).c(context, str, str2);
        if (!(str2 == null || c10.b() == null)) {
            g.b().c(str2, c10.b());
        }
        return c10;
    }

    private static void M(boolean z10) {
        ArrayList arrayList = new ArrayList(f57281b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((C) arrayList.get(i10)).a(z10);
        }
    }

    private static String N(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(C(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    private static p<C8927i> i(String str, Callable<C8917A<C8927i>> callable, Runnable runnable) {
        p<C8927i> pVar = null;
        C8927i a10 = str == null ? null : g.b().a(str);
        if (a10 != null) {
            pVar = new p<>(new n(a10));
        }
        if (str != null) {
            Map<String, p<C8927i>> map = f57280a;
            if (map.containsKey(str)) {
                pVar = map.get(str);
            }
        }
        if (pVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return pVar;
        }
        p<C8927i> pVar2 = new p<>(callable);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            pVar2.d(new o(str, atomicBoolean));
            pVar2.c(new p(str, atomicBoolean));
            if (!atomicBoolean.get()) {
                Map<String, p<C8927i>> map2 = f57280a;
                map2.put(str, pVar2);
                if (map2.size() == 1) {
                    M(false);
                }
            }
        }
        return pVar2;
    }

    private static v j(C8927i iVar, String str) {
        for (v next : iVar.j().values()) {
            if (next.b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static p<C8927i> k(Context context, String str) {
        return l(context, str, "asset_" + str);
    }

    public static p<C8927i> l(Context context, String str, String str2) {
        return i(str2, new m(context.getApplicationContext(), str, str2), (Runnable) null);
    }

    public static C8917A<C8927i> m(Context context, String str) {
        return n(context, str, "asset_" + str);
    }

    public static C8917A<C8927i> n(Context context, String str, String str2) {
        C8927i a10 = str2 == null ? null : g.b().a(str2);
        if (a10 != null) {
            return new C8917A<>(a10);
        }
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return p(context.getAssets().open(str), str2);
                }
            }
            return z(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new C8917A<>((Throwable) e10);
        }
    }

    public static p<C8927i> o(InputStream inputStream, String str) {
        return i(str, new k(inputStream, str), new l(inputStream));
    }

    public static C8917A<C8927i> p(InputStream inputStream, String str) {
        return q(inputStream, str, true);
    }

    public static C8917A<C8927i> q(InputStream inputStream, String str, boolean z10) {
        return r(c.h(y.d(y.l(inputStream))), str, z10);
    }

    public static C8917A<C8927i> r(c cVar, String str, boolean z10) {
        return s(cVar, str, z10);
    }

    private static C8917A<C8927i> s(c cVar, String str, boolean z10) {
        C8927i iVar;
        if (str == null) {
            iVar = null;
        } else {
            try {
                iVar = g.b().a(str);
            } catch (Exception e10) {
                C8917A<C8927i> a10 = new C8917A<>((Throwable) e10);
                if (z10) {
                    j.c(cVar);
                }
                return a10;
            } catch (Throwable th2) {
                if (z10) {
                    j.c(cVar);
                }
                throw th2;
            }
        }
        if (iVar != null) {
            C8917A<C8927i> a11 = new C8917A<>(iVar);
            if (z10) {
                j.c(cVar);
            }
            return a11;
        }
        C8927i a12 = w.a(cVar);
        if (str != null) {
            g.b().c(str, a12);
        }
        C8917A<C8927i> a13 = new C8917A<>(a12);
        if (z10) {
            j.c(cVar);
        }
        return a13;
    }

    public static p<C8927i> t(Context context, int i10) {
        return u(context, i10, N(context, i10));
    }

    public static p<C8927i> u(Context context, int i10, String str) {
        return i(str, new q(new WeakReference(context), context.getApplicationContext(), i10, str), (Runnable) null);
    }

    public static C8917A<C8927i> v(Context context, int i10) {
        return w(context, i10, N(context, i10));
    }

    public static C8917A<C8927i> w(Context context, int i10, String str) {
        C8927i a10 = str == null ? null : g.b().a(str);
        if (a10 != null) {
            return new C8917A<>(a10);
        }
        try {
            C16772g d10 = y.d(y.l(context.getResources().openRawResource(i10)));
            return D(d10).booleanValue() ? z(context, new ZipInputStream(d10.q3()), str) : p(d10.q3(), str);
        } catch (Resources.NotFoundException e10) {
            return new C8917A<>((Throwable) e10);
        }
    }

    public static p<C8927i> x(Context context, String str) {
        return y(context, str, "url_" + str);
    }

    public static p<C8927i> y(Context context, String str, String str2) {
        return i(str2, new j(context, str, str2), (Runnable) null);
    }

    public static C8917A<C8927i> z(Context context, ZipInputStream zipInputStream, String str) {
        return A(context, zipInputStream, str, true);
    }
}
