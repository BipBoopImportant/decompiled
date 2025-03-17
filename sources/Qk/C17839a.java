package qK;

import B5.h;
import N5.h;
import O5.a;
import O5.c;
import O5.i;
import O5.j;
import TJ.C16532g;
import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import me.saket.telephoto.zoomable.o;
import o1.C5673m;
import pI.C17752b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LqK/a;", "Lme/saket/telephoto/zoomable/o;", "", "model", "LB5/h;", "imageLoader", "<init>", "(Ljava/lang/Object;LB5/h;)V", "Lo1/m;", "LO5/i;", "c", "(J)LO5/i;", "LTJ/g;", "canvasSize", "Lme/saket/telephoto/zoomable/o$d;", "a", "(LTJ/g;LU0/m;I)Lme/saket/telephoto/zoomable/o$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "LB5/h;", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK.a  reason: case insensitive filesystem */
public final class C17839a implements o {

    /* renamed from: b  reason: collision with root package name */
    private final Object f146619b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146620c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO5/i;", "b", "(LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qK.a$a  reason: collision with other inner class name */
    static final class C4263a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17839a f146621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16532g<C5673m> f146622b;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @f(c = "me.saket.telephoto.zoomable.coil.CoilImageSource$resolve$resolver$1$1", f = "CoilImageSource.kt", l = {67}, m = "size")
        /* renamed from: qK.a$a$a  reason: collision with other inner class name */
        static final class C4264a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f146623c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f146624d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C4263a f146625e;

            /* renamed from: f  reason: collision with root package name */
            int f146626f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4264a(C4263a aVar, C17164e<? super C4264a> eVar) {
                super(eVar);
                this.f146625e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f146624d = obj;
                this.f146626f |= Integer.MIN_VALUE;
                return this.f146625e.b(this);
            }
        }

        C4263a(C17839a aVar, C16532g<C5673m> gVar) {
            this.f146621a = aVar;
            this.f146622b = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(dI.C17164e<? super O5.i> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof qK.C17839a.C4263a.C4264a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                qK.a$a$a r0 = (qK.C17839a.C4263a.C4264a) r0
                int r1 = r0.f146626f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f146626f = r1
                goto L_0x0018
            L_0x0013:
                qK.a$a$a r0 = new qK.a$a$a
                r0.<init>(r5, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f146624d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f146626f
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r0 = r0.f146623c
                qK.a r0 = (qK.C17839a) r0
                XH.y.b(r6)
                goto L_0x004a
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0035:
                XH.y.b(r6)
                qK.a r6 = r5.f146621a
                TJ.g<o1.m> r2 = r5.f146622b
                r0.f146623c = r6
                r0.f146626f = r3
                java.lang.Object r0 = TJ.C16534i.B(r2, r0)
                if (r0 != r1) goto L_0x0047
                return r1
            L_0x0047:
                r4 = r0
                r0 = r6
                r6 = r4
            L_0x004a:
                o1.m r6 = (o1.C5673m) r6
                long r1 = r6.q()
                O5.i r6 = r0.c(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qK.C17839a.C4263a.b(dI.e):java.lang.Object");
        }
    }

    public C17839a(Object obj, h hVar) {
        C17542s.j(hVar, "imageLoader");
        this.f146619b = obj;
        this.f146620c = hVar;
    }

    /* access modifiers changed from: private */
    public final i c(long j10) {
        float l10 = C5673m.l(j10);
        c a10 = (Float.isInfinite(l10) || Float.isNaN(l10)) ? c.b.f39248a : a.a(C17752b.e(C5673m.l(j10)));
        float i10 = C5673m.i(j10);
        return new i(a10, (Float.isInfinite(i10) || Float.isNaN(i10)) ? c.b.f39248a : a.a(C17752b.e(C5673m.i(j10))));
    }

    public o.d a(C16532g<C5673m> gVar, C4889m mVar, int i10) {
        C17542s.j(gVar, "canvasSize");
        mVar.C(-1481980455);
        if (C4895p.J()) {
            C4895p.S(-1481980455, i10, -1, "me.saket.telephoto.zoomable.coil.CoilImageSource.resolve (CoilImageSource.kt:57)");
        }
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        mVar.C(1716981208);
        boolean z10 = (((i10 & 112) ^ 48) > 32 && mVar.V(this)) || (i10 & 48) == 32;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            Object obj = this.f146619b;
            N5.h hVar = obj instanceof N5.h ? (N5.h) obj : null;
            if (hVar == null) {
                hVar = new h.a(context).b(this.f146619b).a();
            }
            D10 = new C17841c(hVar, this.f146620c, new C4263a(this, gVar));
            mVar.u(D10);
        }
        mVar.U();
        o.d g10 = ((C17841c) D10).g();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return g10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17839a)) {
            return false;
        }
        C17839a aVar = (C17839a) obj;
        return C17542s.e(this.f146619b, aVar.f146619b) && C17542s.e(this.f146620c, aVar.f146620c);
    }

    public int hashCode() {
        Object obj = this.f146619b;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f146620c.hashCode();
    }

    public String toString() {
        Object obj = this.f146619b;
        B5.h hVar = this.f146620c;
        return "CoilImageSource(model=" + obj + ", imageLoader=" + hVar + ")";
    }
}
