package Jt;

import FB.C12860a;
import android.content.Context;
import dI.C17164e;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\f\tB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LJt/a;", "Low/h;", "LFB/a;", "localStoreSelectionRepository", "Landroid/content/Context;", "context", "<init>", "(LFB/a;Landroid/content/Context;)V", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LFB/a;", "b", "Landroid/content/Context;", "c", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final C1630a f82743c = new C1630a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f82744d = 8;

    /* renamed from: e  reason: collision with root package name */
    private static final String f82745e = "ikea://navigation/in-store/scanner/open";

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f82746a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f82747b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJt/a$a;", "", "<init>", "()V", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jt.a$a  reason: collision with other inner class name */
    public static final class C1630a {
        public /* synthetic */ C1630a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1630a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"LJt/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SCANNER", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        SCANNER("SCANNER");
        
        private final String value;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.shortcut.InstoreShortcuts", f = "InstoreShortcuts.kt", l = {35}, m = "setupDynamicShortcuts")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f82748c;

        /* renamed from: d  reason: collision with root package name */
        Object f82749d;

        /* renamed from: e  reason: collision with root package name */
        Object f82750e;

        /* renamed from: f  reason: collision with root package name */
        Object f82751f;

        /* renamed from: g  reason: collision with root package name */
        int f82752g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f82753h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f82754i;

        /* renamed from: j  reason: collision with root package name */
        int f82755j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f82754i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82753h = obj;
            this.f82755j |= Integer.MIN_VALUE;
            return this.f82754i.a(this);
        }
    }

    public a(C12860a aVar, Context context) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(context, "context");
        this.f82746a = aVar;
        this.f82747b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.C16807N> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Jt.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Jt.a$c r0 = (Jt.a.c) r0
            int r1 = r0.f82755j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82755j = r1
            goto L_0x0018
        L_0x0013:
            Jt.a$c r0 = new Jt.a$c
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f82753h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82755j
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r9 = r0.f82751f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f82750e
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.Object r2 = r0.f82749d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f82748c
            Jt.a r0 = (Jt.a) r0
            XH.y.b(r1)
            goto L_0x006f
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0041:
            XH.y.b(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = f82745e
            android.net.Uri r5 = android.net.Uri.parse(r3)
            java.lang.String r6 = "android.intent.action.VIEW"
            r1.<init>(r6, r5)
            FB.a r5 = r8.f82746a
            TJ.g r5 = r5.b()
            r0.f82748c = r8
            r0.f82749d = r9
            r0.f82750e = r1
            r0.f82751f = r3
            r9 = 0
            r0.f82752g = r9
            r0.f82755j = r4
            java.lang.Object r9 = TJ.C16534i.D(r5, r0)
            if (r9 != r2) goto L_0x006b
            return r2
        L_0x006b:
            r0 = r8
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x006f:
            EB.d r1 = (EB.C12832d) r1
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x007a
            goto L_0x00b4
        L_0x007a:
            v2.f$b r1 = new v2.f$b
            android.content.Context r2 = r0.f82747b
            Jt.a$b r3 = Jt.a.b.SCANNER
            java.lang.String r3 = r3.b()
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.f82747b
            int r3 = st.c.f102800q0
            java.lang.String r2 = r2.getString(r3)
            v2.f$b r1 = r1.e(r2)
            android.content.Context r2 = r0.f82747b
            int r3 = st.C11890a.f102692b
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.d(r2, r3)
            v2.f$b r1 = r1.b(r2)
            v2.f$b r9 = r1.c(r9)
            v2.f r9 = r9.a()
            java.lang.String r1 = "build(...)"
            kotlin.jvm.internal.C17542s.i(r9, r1)
            android.content.Context r0 = r0.f82747b
            v2.C6164i.f(r0, r9)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x00b4:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Jt.a.a(dI.e):java.lang.Object");
    }
}
