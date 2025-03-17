package v0;

import E1.C4488v;
import E1.T;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lv0/b;", "LE1/T;", "<init>", "()V", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LE1/v;", "coordinates", "u", "(LE1/v;)V", "", "d", "Z", "wasPositioned", "LdI/e;", "e", "LdI/e;", "continuation", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.b  reason: case insensitive filesystem */
public final class C6136b implements T {

    /* renamed from: d  reason: collision with root package name */
    private boolean f30849d;

    /* renamed from: e  reason: collision with root package name */
    private C17164e<? super C16807N> f30850e;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {35}, m = "waitForFirstLayout")
    /* renamed from: v0.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f30851c;

        /* renamed from: d  reason: collision with root package name */
        Object f30852d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f30853e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6136b f30854f;

        /* renamed from: g  reason: collision with root package name */
        int f30855g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6136b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f30854f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f30853e = obj;
            this.f30855g |= Integer.MIN_VALUE;
            return this.f30854f.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v0.C6136b.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            v0.b$a r0 = (v0.C6136b.a) r0
            int r1 = r0.f30855g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f30855g = r1
            goto L_0x0018
        L_0x0013:
            v0.b$a r0 = new v0.b$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f30853e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f30855g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f30852d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r0 = r0.f30851c
            v0.b r0 = (v0.C6136b) r0
            XH.y.b(r5)
            goto L_0x0064
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            XH.y.b(r5)
            boolean r5 = r4.f30849d
            if (r5 != 0) goto L_0x0071
            dI.e<? super XH.N> r5 = r4.f30850e
            r0.f30851c = r4
            r0.f30852d = r5
            r0.f30855g = r3
            dI.k r2 = new dI.k
            dI.e r3 = eI.C17187b.c(r0)
            r2.<init>(r3)
            r4.f30850e = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0060
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0060:
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r1 = r5
        L_0x0064:
            if (r1 == 0) goto L_0x0071
            XH.x$a r5 = XH.x.f139812b
            XH.N r5 = XH.C16807N.f139792a
            java.lang.Object r5 = XH.x.b(r5)
            r1.resumeWith(r5)
        L_0x0071:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C6136b.a(dI.e):java.lang.Object");
    }

    public void u(C4488v vVar) {
        if (!this.f30849d) {
            this.f30849d = true;
            C17164e<? super C16807N> eVar = this.f30850e;
            if (eVar != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(C16807N.f139792a));
            }
            this.f30850e = null;
        }
    }
}
