package E2;

import C.F;
import H2.i;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class k {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f5994a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5995b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5996c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5997d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5998e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f5994a = (Uri) i.g(uri);
            this.f5995b = i10;
            this.f5996c = i11;
            this.f5997d = z10;
            this.f5998e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f5998e;
        }

        public int c() {
            return this.f5995b;
        }

        public Uri d() {
            return this.f5994a;
        }

        public int e() {
            return this.f5996c;
        }

        public boolean f() {
            return this.f5997d;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return x2.i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, F.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        a aVar = new a(cVar, l.b(handler));
        if (!z10) {
            return i.d(context, list, i10, (Executor) null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5992a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b[]> f5993b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f5992a = i10;
            this.f5993b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return this.f5993b.get(0);
        }

        public List<b[]> d() {
            return this.f5993b;
        }

        public int e() {
            return this.f5992a;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f5993b.size() > 1;
        }

        a(int i10, List<b[]> list) {
            this.f5992a = i10;
            this.f5993b = list;
        }
    }
}
