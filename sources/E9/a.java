package E9;

import K9.C6620s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.clearcut.C7169b;
import com.google.android.gms.internal.clearcut.X0;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.n2;
import com.google.android.gms.internal.clearcut.q2;
import com.google.android.gms.internal.clearcut.w2;
import com.google.android.gms.internal.clearcut.y2;
import java.util.ArrayList;
import java.util.TimeZone;

public final class a {

    /* renamed from: n  reason: collision with root package name */
    private static final a.g<q2> f35255n;

    /* renamed from: o  reason: collision with root package name */
    private static final a.C0821a<q2, a.d.c> f35256o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f35257p;

    /* renamed from: q  reason: collision with root package name */
    private static final ta.a[] f35258q = new ta.a[0];

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f35259r = new String[0];

    /* renamed from: s  reason: collision with root package name */
    private static final byte[][] f35260s = new byte[0][];
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f35261a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f35262b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f35263c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f35264d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f35265e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f35266f;

    /* renamed from: g  reason: collision with root package name */
    private String f35267g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final boolean f35268h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public d2 f35269i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final c f35270j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e f35271k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public d f35272l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final b f35273m;

    /* renamed from: E9.a$a  reason: collision with other inner class name */
    public class C0565a {

        /* renamed from: a  reason: collision with root package name */
        private int f35274a;

        /* renamed from: b  reason: collision with root package name */
        private String f35275b;

        /* renamed from: c  reason: collision with root package name */
        private String f35276c;

        /* renamed from: d  reason: collision with root package name */
        private String f35277d;

        /* renamed from: e  reason: collision with root package name */
        private d2 f35278e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<Integer> f35279f;

        /* renamed from: g  reason: collision with root package name */
        private ArrayList<String> f35280g;

        /* renamed from: h  reason: collision with root package name */
        private ArrayList<Integer> f35281h;

        /* renamed from: i  reason: collision with root package name */
        private ArrayList<ta.a> f35282i;

        /* renamed from: j  reason: collision with root package name */
        private ArrayList<byte[]> f35283j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f35284k;

        /* renamed from: l  reason: collision with root package name */
        private final n2 f35285l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f35286m;

        private C0565a(a aVar, byte[] bArr) {
            this(bArr, (c) null);
        }

        public void a() {
            if (!this.f35286m) {
                this.f35286m = true;
                f fVar = new f(new y2(a.this.f35262b, a.this.f35263c, this.f35274a, this.f35275b, this.f35276c, this.f35277d, a.this.f35268h, this.f35278e), this.f35285l, (c) null, (c) null, a.d((ArrayList<Integer>) null), (String[]) null, a.d((ArrayList<Integer>) null), (byte[][]) null, (ta.a[]) null, this.f35284k);
                if (a.this.f35273m.a(fVar)) {
                    a.this.f35270j.a(fVar);
                } else {
                    j.b(Status.f47983f, (g) null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }

        public C0565a b(int i10) {
            this.f35285l.f48443g = i10;
            return this;
        }

        private C0565a(byte[] bArr, c cVar) {
            this.f35274a = a.this.f35265e;
            this.f35275b = a.this.f35264d;
            this.f35276c = a.this.f35266f;
            this.f35277d = null;
            this.f35278e = a.this.f35269i;
            this.f35279f = null;
            this.f35280g = null;
            this.f35281h = null;
            this.f35282i = null;
            this.f35283j = null;
            this.f35284k = true;
            n2 n2Var = new n2();
            this.f35285l = n2Var;
            this.f35286m = false;
            this.f35276c = a.this.f35266f;
            this.f35277d = null;
            n2Var.f48438A = C7169b.a(a.this.f35261a);
            n2Var.f48439c = a.this.f35271k.a();
            n2Var.f48440d = a.this.f35271k.c();
            d unused = a.this.f35272l;
            n2Var.f48455s = (long) (TimeZone.getDefault().getOffset(n2Var.f48439c) / 1000);
            if (bArr != null) {
                n2Var.f48450n = bArr;
            }
        }

        /* synthetic */ C0565a(a aVar, byte[] bArr, b bVar) {
            this(aVar, bArr);
        }
    }

    public interface b {
        boolean a(f fVar);
    }

    public interface c {
    }

    public static class d {
    }

    static {
        a.g<q2> gVar = new a.g<>();
        f35255n = gVar;
        b bVar = new b();
        f35256o = bVar;
        f35257p = new com.google.android.gms.common.api.a<>("ClearcutLogger.API", bVar, gVar);
    }

    @VisibleForTesting
    private a(Context context, int i10, String str, String str2, String str3, boolean z10, c cVar, e eVar, d dVar, b bVar) {
        this.f35265e = -1;
        d2 d2Var = d2.DEFAULT;
        this.f35269i = d2Var;
        this.f35261a = context;
        this.f35262b = context.getPackageName();
        this.f35263c = c(context);
        this.f35265e = -1;
        this.f35264d = str;
        this.f35266f = str2;
        this.f35267g = null;
        this.f35268h = z10;
        this.f35270j = cVar;
        this.f35271k = eVar;
        this.f35272l = new d();
        this.f35269i = d2Var;
        this.f35273m = bVar;
        if (z10) {
            C6620s.b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    private static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            iArr[i11] = num.intValue();
            i11++;
        }
        return iArr;
    }

    public final C0565a a(byte[] bArr) {
        return new C0565a(this, bArr, (b) null);
    }

    public a(Context context, String str, String str2) {
        this(context, -1, str, str2, (String) null, false, X0.D(context), h.d(), (d) null, new w2(context));
    }
}
