package Mc;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"LMc/s;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f61821c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f61822a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61823b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"LMc/s$a;", "", "<init>", "()V", "Lnc/e;", "firebaseInstallations", "LMc/s;", "a", "(Lnc/e;LdI/e;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
        /* renamed from: Mc.s$a$a  reason: collision with other inner class name */
        static final class C1031a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f61824c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f61825d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f61826e;

            /* renamed from: f  reason: collision with root package name */
            int f61827f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1031a(a aVar, C17164e<? super C1031a> eVar) {
                super(eVar);
                this.f61826e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f61825d = obj;
                this.f61827f |= Integer.MIN_VALUE;
                return this.f61826e.a((e) null, this);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[Catch:{ Exception -> 0x0034 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(nc.e r9, dI.C17164e<? super Mc.s> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Mc.s.a.C1031a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                Mc.s$a$a r0 = (Mc.s.a.C1031a) r0
                int r1 = r0.f61827f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f61827f = r1
                goto L_0x0018
            L_0x0013:
                Mc.s$a$a r0 = new Mc.s$a$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f61825d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f61827f
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r6) goto L_0x003e
                if (r2 != r5) goto L_0x0036
                java.lang.Object r9 = r0.f61824c
                java.lang.String r9 = (java.lang.String) r9
                XH.y.b(r10)     // Catch:{ Exception -> 0x0034 }
                goto L_0x008a
            L_0x0034:
                r10 = move-exception
                goto L_0x0093
            L_0x0036:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x003e:
                java.lang.Object r9 = r0.f61824c
                nc.e r9 = (nc.e) r9
                XH.y.b(r10)     // Catch:{ Exception -> 0x0046 }
                goto L_0x0060
            L_0x0046:
                r10 = move-exception
                goto L_0x006f
            L_0x0048:
                XH.y.b(r10)
                r10 = 0
                xa.l r10 = r9.a(r10)     // Catch:{ Exception -> 0x0046 }
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.C17542s.i(r10, r2)     // Catch:{ Exception -> 0x0046 }
                r0.f61824c = r9     // Catch:{ Exception -> 0x0046 }
                r0.f61827f = r6     // Catch:{ Exception -> 0x0046 }
                java.lang.Object r10 = cK.C17078d.g(r10, r0)     // Catch:{ Exception -> 0x0046 }
                if (r10 != r1) goto L_0x0060
                return r1
            L_0x0060:
                com.google.firebase.installations.g r10 = (com.google.firebase.installations.g) r10     // Catch:{ Exception -> 0x0046 }
                java.lang.String r10 = r10.b()     // Catch:{ Exception -> 0x0046 }
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.C17542s.i(r10, r2)     // Catch:{ Exception -> 0x0046 }
                r7 = r10
                r10 = r9
                r9 = r7
                goto L_0x0076
            L_0x006f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L_0x0076:
                xa.l r10 = r10.getId()     // Catch:{ Exception -> 0x0034 }
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.C17542s.i(r10, r2)     // Catch:{ Exception -> 0x0034 }
                r0.f61824c = r9     // Catch:{ Exception -> 0x0034 }
                r0.f61827f = r5     // Catch:{ Exception -> 0x0034 }
                java.lang.Object r10 = cK.C17078d.g(r10, r0)     // Catch:{ Exception -> 0x0034 }
                if (r10 != r1) goto L_0x008a
                return r1
            L_0x008a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.C17542s.i(r10, r0)     // Catch:{ Exception -> 0x0034 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0034 }
                r3 = r10
                goto L_0x0098
            L_0x0093:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L_0x0098:
                Mc.s r10 = new Mc.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Mc.s.a.a(nc.e, dI.e):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ s(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f61823b;
    }

    public final String b() {
        return this.f61822a;
    }

    private s(String str, String str2) {
        this.f61822a = str;
        this.f61823b = str2;
    }
}
