package x2;

import E2.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.adjust.sdk.Constants;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import w2.C6211e;

class n {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, C6211e.c> f31860a = new ConcurrentHashMap<>();

    class a implements b<k.b> {
        a() {
        }

        /* renamed from: c */
        public int b(k.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean a(k.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        boolean a(T t10);

        int b(T t10);
    }

    n() {
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return f(tArr, (i10 & 1) == 0 ? Constants.MINIMAL_ERROR_STATUS_CODE : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.b(t11) - i10) * 2) + (bVar.a(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, C6211e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = o.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!o.b(d10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    /* access modifiers changed from: protected */
    public k.b g(k.b[] bVarArr, int i10) {
        return (k.b) e(bVarArr, i10, new a());
    }
}
