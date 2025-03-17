package androidx.media3.exoplayer;

import A3.C6298a;
import G3.C6479C;
import G3.C6497q;
import I3.C;
import I3.n;
import J3.C6571d;
import N3.C6674l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.C5229f;
import androidx.media3.exoplayer.image.ImageOutput;
import jb.f;
import jb.r;
import q3.C5792c;
import q3.E;
import t3.C5950a;
import t3.C5953d;
import t3.N;
import z3.C6281d;
import z3.G;
import z3.I;
import z3.J;
import z3.t;
import z3.u;
import z3.v;
import z3.w;
import z3.x;
import z3.y;
import z3.z;

public interface ExoPlayer extends E {

    public interface a {
        void B(boolean z10) {
        }

        void E(boolean z10) {
        }
    }

    public static final class b {

        /* renamed from: A  reason: collision with root package name */
        long f22384A;

        /* renamed from: B  reason: collision with root package name */
        long f22385B;

        /* renamed from: C  reason: collision with root package name */
        boolean f22386C;

        /* renamed from: D  reason: collision with root package name */
        boolean f22387D;

        /* renamed from: E  reason: collision with root package name */
        G f22388E;

        /* renamed from: F  reason: collision with root package name */
        boolean f22389F;

        /* renamed from: G  reason: collision with root package name */
        boolean f22390G;

        /* renamed from: H  reason: collision with root package name */
        String f22391H;

        /* renamed from: I  reason: collision with root package name */
        boolean f22392I;

        /* renamed from: J  reason: collision with root package name */
        y0 f22393J;

        /* renamed from: a  reason: collision with root package name */
        final Context f22394a;

        /* renamed from: b  reason: collision with root package name */
        C5953d f22395b;

        /* renamed from: c  reason: collision with root package name */
        long f22396c;

        /* renamed from: d  reason: collision with root package name */
        r<I> f22397d;

        /* renamed from: e  reason: collision with root package name */
        r<C6479C.a> f22398e;

        /* renamed from: f  reason: collision with root package name */
        r<C> f22399f;

        /* renamed from: g  reason: collision with root package name */
        r<X> f22400g;

        /* renamed from: h  reason: collision with root package name */
        r<C6571d> f22401h;

        /* renamed from: i  reason: collision with root package name */
        f<C5953d, C6298a> f22402i;

        /* renamed from: j  reason: collision with root package name */
        Looper f22403j;

        /* renamed from: k  reason: collision with root package name */
        int f22404k;

        /* renamed from: l  reason: collision with root package name */
        q3.G f22405l;

        /* renamed from: m  reason: collision with root package name */
        C5792c f22406m;

        /* renamed from: n  reason: collision with root package name */
        boolean f22407n;

        /* renamed from: o  reason: collision with root package name */
        int f22408o;

        /* renamed from: p  reason: collision with root package name */
        boolean f22409p;

        /* renamed from: q  reason: collision with root package name */
        boolean f22410q;

        /* renamed from: r  reason: collision with root package name */
        boolean f22411r;

        /* renamed from: s  reason: collision with root package name */
        int f22412s;

        /* renamed from: t  reason: collision with root package name */
        int f22413t;

        /* renamed from: u  reason: collision with root package name */
        boolean f22414u;

        /* renamed from: v  reason: collision with root package name */
        J f22415v;

        /* renamed from: w  reason: collision with root package name */
        long f22416w;

        /* renamed from: x  reason: collision with root package name */
        long f22417x;

        /* renamed from: y  reason: collision with root package name */
        long f22418y;

        /* renamed from: z  reason: collision with root package name */
        z3.E f22419z;

        public b(Context context) {
            this(context, new t(context), new u(context));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ I g(Context context) {
            return new C6281d(context);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C6479C.a h(Context context) {
            return new C6497q(context, (N3.u) new C6674l());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C i(Context context) {
            return new n(context);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ C6479C.a k(C6479C.a aVar) {
            return aVar;
        }

        public ExoPlayer f() {
            C5950a.g(!this.f22389F);
            this.f22389F = true;
            if (this.f22393J == null && N.f29462a >= 35 && this.f22390G) {
                this.f22393J = new C5232i(this.f22394a, new Handler(this.f22403j));
            }
            return new J(this, (E) null);
        }

        public b l(C6479C.a aVar) {
            C5950a.g(!this.f22389F);
            C5950a.e(aVar);
            this.f22398e = new z(aVar);
            return this;
        }

        private b(Context context, r<I> rVar, r<C6479C.a> rVar2) {
            this(context, rVar, rVar2, new v(context), new w(), new x(context), new y());
        }

        private b(Context context, r<I> rVar, r<C6479C.a> rVar2, r<C> rVar3, r<X> rVar4, r<C6571d> rVar5, f<C5953d, C6298a> fVar) {
            this.f22394a = (Context) C5950a.e(context);
            this.f22397d = rVar;
            this.f22398e = rVar2;
            this.f22399f = rVar3;
            this.f22400g = rVar4;
            this.f22401h = rVar5;
            this.f22402i = fVar;
            this.f22403j = N.U();
            this.f22406m = C5792c.f28108g;
            this.f22408o = 0;
            this.f22412s = 1;
            this.f22413t = 0;
            this.f22414u = true;
            this.f22415v = J.f32395g;
            this.f22416w = 5000;
            this.f22417x = 15000;
            this.f22418y = 3000;
            this.f22419z = new C5229f.b().a();
            this.f22395b = C5953d.f29483a;
            this.f22384A = 500;
            this.f22385B = 2000;
            this.f22387D = true;
            this.f22391H = "";
            this.f22404k = -1000;
        }
    }

    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f22420b = new c(-9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f22421a;

        public c(long j10) {
            this.f22421a = j10;
        }
    }

    void b(int i10);

    void release();

    void setImageOutput(ImageOutput imageOutput);
}
