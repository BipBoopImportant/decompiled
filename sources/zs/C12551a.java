package zs;

import Bs.m;
import Zl.a;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lzs/a;", "LZl/a;", "LBs/m;", "resolveNotificationContentUri", "<init>", "(LBs/m;)V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "LBs/m;", "Landroid/content/UriMatcher;", "c", "Landroid/content/UriMatcher;", "uriMatcher", "d", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zs.a  reason: case insensitive filesystem */
public final class C12551a implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2566a f107577d = new C2566a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f107578e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final m f107579b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f107580c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzs/a$a;", "", "<init>", "()V", "", "DEPRECATED_INBOX", "I", "NOTIFICATION", "INBOX", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zs.a$a  reason: collision with other inner class name */
    public static final class C2566a {
        public /* synthetic */ C2566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2566a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.navigation.InboxApplinkMapper", f = "InboxApplinkMapper.kt", l = {39}, m = "map")
    /* renamed from: zs.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f107581c;

        /* renamed from: d  reason: collision with root package name */
        Object f107582d;

        /* renamed from: e  reason: collision with root package name */
        Object f107583e;

        /* renamed from: f  reason: collision with root package name */
        int f107584f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f107585g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12551a f107586h;

        /* renamed from: i  reason: collision with root package name */
        int f107587i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12551a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f107586h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107585g = obj;
            this.f107587i |= Integer.MIN_VALUE;
            return this.f107586h.b((Uri) null, this);
        }
    }

    public C12551a(m mVar) {
        C17542s.j(mVar, "resolveNotificationContentUri");
        this.f107579b = mVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "ikeaapp/inbox_page", 1);
        uriMatcher.addURI("www.ikea.com", "ikeaapp/notification", 2);
        uriMatcher.addURI("inbox", "open", 3);
        this.f107580c = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return Zl.b.a(this.f107580c, uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(android.net.Uri r7, dI.C17164e<? super android.net.Uri> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zs.C12551a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            zs.a$b r0 = (zs.C12551a.b) r0
            int r1 = r0.f107587i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f107587i = r1
            goto L_0x0018
        L_0x0013:
            zs.a$b r0 = new zs.a$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f107585g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f107587i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r5) goto L_0x0036
            java.lang.Object r7 = r0.f107583e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f107582d
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r8 = r0.f107581c
            zs.a r8 = (zs.C12551a) r8
            XH.y.b(r1)
            goto L_0x0074
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            XH.y.b(r1)
            android.content.UriMatcher r1 = r6.f107580c
            int r1 = r1.match(r7)
            if (r1 == r5) goto L_0x0086
            r3 = 2
            if (r1 == r3) goto L_0x0061
            r8 = 3
            if (r1 == r8) goto L_0x005a
            Zl.a$a r8 = Zl.a.f89961a
            java.lang.String r7 = r7.toString()
            android.net.Uri r7 = Zl.a.C1929a.b(r8, r4, r7, r5, r4)
            goto L_0x009e
        L_0x005a:
            java.lang.String r7 = "ikea://navigation/inbox_page"
            android.net.Uri r7 = android.net.Uri.parse(r7)
            goto L_0x009e
        L_0x0061:
            Bs.m r3 = r6.f107579b
            r0.f107581c = r6
            r0.f107582d = r7
            r0.f107583e = r8
            r0.f107584f = r1
            r0.f107587i = r5
            java.lang.Object r1 = r3.a(r7, r0)
            if (r1 != r2) goto L_0x0074
            return r2
        L_0x0074:
            r8 = r1
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 != 0) goto L_0x0084
            Zl.a$a r8 = Zl.a.f89961a
            java.lang.String r7 = r7.toString()
            android.net.Uri r7 = Zl.a.C1929a.b(r8, r4, r7, r5, r4)
            goto L_0x009e
        L_0x0084:
            r7 = r8
            goto L_0x009e
        L_0x0086:
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r0, r7)
            r4 = 4
            r5 = 0
            java.lang.String r1 = "https://www.ikea.com/ikeaapp"
            java.lang.String r2 = "ikea://navigation"
            r3 = 0
            java.lang.String r7 = HJ.C15854t.Q(r0, r1, r2, r3, r4, r5)
            android.net.Uri r7 = android.net.Uri.parse(r7)
        L_0x009e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zs.C12551a.b(android.net.Uri, dI.e):java.lang.Object");
    }
}
