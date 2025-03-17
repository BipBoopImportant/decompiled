package b7;

import android.content.Context;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.C8708j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0011"}, d2 = {"Lb7/a;", "Lb7/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lr7/j;", "a", "(LdI/e;)Ljava/lang/Object;", "value", "LXH/N;", "c", "(Lr7/j;LdI/e;)Ljava/lang/Object;", "", "Ljava/lang/String;", "cacheDirPath", "b", "certificatetransparency-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b7.a  reason: case insensitive filesystem */
public final class C7075a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0786a f45499b = new C0786a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C17052a f45500c = g.b(false, 1, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f45501a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb7/a$a;", "", "<init>", "()V", "", "LOG_LIST_FILE", "Ljava/lang/String;", "SIG_FILE", "LbK/a;", "mutex", "LbK/a;", "certificatetransparency-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b7.a$a  reason: collision with other inner class name */
    public static final class C0786a {
        public /* synthetic */ C0786a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0786a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.cache.AndroidDiskCache", f = "AndroidDiskCache.kt", l = {81}, m = "get")
    /* renamed from: b7.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f45502c;

        /* renamed from: d  reason: collision with root package name */
        Object f45503d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f45504e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7075a f45505f;

        /* renamed from: g  reason: collision with root package name */
        int f45506g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C7075a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f45505f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45504e = obj;
            this.f45506g |= Integer.MIN_VALUE;
            return this.f45505f.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.cache.AndroidDiskCache", f = "AndroidDiskCache.kt", l = {81}, m = "set")
    /* renamed from: b7.a$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f45507c;

        /* renamed from: d  reason: collision with root package name */
        Object f45508d;

        /* renamed from: e  reason: collision with root package name */
        Object f45509e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f45510f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7075a f45511g;

        /* renamed from: h  reason: collision with root package name */
        int f45512h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7075a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f45511g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45510f = obj;
            this.f45512h |= Integer.MIN_VALUE;
            return this.f45511g.b((C8708j) null, this);
        }
    }

    public C7075a(Context context) {
        C17542s.j(context, "context");
        this.f45501a = context.getCacheDir().getPath() + "/certificate-transparency-android";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super r7.C8708j> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b7.C7075a.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            b7.a$b r0 = (b7.C7075a.b) r0
            int r1 = r0.f45506g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f45506g = r1
            goto L_0x0018
        L_0x0013:
            b7.a$b r0 = new b7.a$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f45504e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f45506g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f45503d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f45502c
            b7.a r0 = (b7.C7075a) r0
            XH.y.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            XH.y.b(r6)
            bK.a r6 = f45500c
            r0.f45502c = r5
            r0.f45503d = r6
            r0.f45506g = r3
            java.lang.Object r0 = r6.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            java.lang.String r2 = r0.f45501a     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            java.lang.String r3 = "loglist.json"
            r6.<init>(r2, r3)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            java.lang.String r0 = r0.f45501a     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            java.lang.String r3 = "loglist.sig"
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            byte[] r6 = jI.C17423j.g(r6)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            byte[] r0 = jI.C17423j.g(r2)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            r7.j$b r2 = new r7.j$b     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            r2.<init>(r6, r0)     // Catch:{ IOException -> 0x0073, all -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r6 = move-exception
            r1.d(r4)
            throw r6
        L_0x0073:
            r2 = r4
        L_0x0074:
            r1.d(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C7075a.a(dI.e):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[SYNTHETIC, Splitter:B:19:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(r7.C8708j r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b7.C7075a.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            b7.a$c r0 = (b7.C7075a.c) r0
            int r1 = r0.f45512h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f45512h = r1
            goto L_0x0018
        L_0x0013:
            b7.a$c r0 = new b7.a$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f45510f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f45512h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f45509e
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r1 = r0.f45508d
            r7.j r1 = (r7.C8708j) r1
            java.lang.Object r0 = r0.f45507c
            b7.a r0 = (b7.C7075a) r0
            XH.y.b(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            XH.y.b(r7)
            bK.a r7 = f45500c
            r0.f45507c = r5
            r0.f45508d = r6
            r0.f45509e = r7
            r0.f45512h = r3
            java.lang.Object r0 = r7.e(r4, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            boolean r1 = r6 instanceof r7.C8708j.b     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x008b
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = r0.f45501a     // Catch:{ IOException -> 0x008b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x008b }
            r1.mkdirs()     // Catch:{ IOException -> 0x008b }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = r0.f45501a     // Catch:{ IOException -> 0x008b }
            java.lang.String r3 = "loglist.json"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x008b }
            r2 = r6
            r7.j$b r2 = (r7.C8708j.b) r2     // Catch:{ IOException -> 0x008b }
            byte[] r2 = r2.c()     // Catch:{ IOException -> 0x008b }
            jI.C17423j.j(r1, r2)     // Catch:{ IOException -> 0x008b }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.f45501a     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = "loglist.sig"
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x008b }
            r7.j$b r6 = (r7.C8708j.b) r6     // Catch:{ IOException -> 0x008b }
            byte[] r6 = r6.d()     // Catch:{ IOException -> 0x008b }
            jI.C17423j.j(r1, r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x008b
        L_0x0089:
            r6 = move-exception
            goto L_0x0093
        L_0x008b:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0089 }
            r7.d(r4)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0093:
            r7.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C7075a.b(r7.j, dI.e):java.lang.Object");
    }
}
