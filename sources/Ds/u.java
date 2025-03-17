package Ds;

import Ds.t;
import Ps.d;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import XH.C16807N;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import xs.C12340a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u00014B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001a\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"LDs/u;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LQs/b;", "getNotificationMessageUseCase", "Lxs/a;", "notificationDetailsMapper", "LLx/b;", "pushNotificationAnalytics", "<init>", "(Landroidx/lifecycle/U;LQs/b;Lxs/a;LLx/b;)V", "LPs/d;", "inboxNotification", "LDs/u$b;", "F", "(LPs/d;LdI/e;)Ljava/lang/Object;", "", "destinationUri", "LXH/N;", "G", "(Ljava/lang/String;)V", "LDs/t;", "event", "H", "(LDs/t;)V", "m", "LQs/b;", "n", "Lxs/a;", "o", "LLx/b;", "p", "Ljava/lang/String;", "argId", "q", "argFeature", "LPs/b;", "r", "LPs/b;", "inboxId", "LTJ/B;", "s", "LTJ/B;", "_uiState", "LTJ/P;", "t", "LTJ/P;", "()LTJ/P;", "uiState", "u", "LPs/d;", "b", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Qs.b f80276m;

    /* renamed from: n  reason: collision with root package name */
    private final C12340a f80277n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Lx.b f80278o;

    /* renamed from: p  reason: collision with root package name */
    private final String f80279p;

    /* renamed from: q  reason: collision with root package name */
    private final String f80280q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Ps.b f80281r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<b> f80282s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<b> f80283t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public d f80284u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.viewmodel.NotificationDetailsViewModel$1", f = "NotificationDetailsViewModel.kt", l = {47, 51, 54}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80285c;

        /* renamed from: d  reason: collision with root package name */
        Object f80286d;

        /* renamed from: e  reason: collision with root package name */
        Object f80287e;

        /* renamed from: f  reason: collision with root package name */
        int f80288f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u f80289g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f80289g = uVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f80289g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f80288f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x003a
                if (r1 == r4) goto L_0x0032
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r0 = r8.f80286d
                TJ.B r0 = (TJ.C16505B) r0
                java.lang.Object r1 = r8.f80285c
                Ps.d r1 = (Ps.d) r1
                XH.y.b(r9)
                goto L_0x009c
            L_0x001e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0026:
                java.lang.Object r1 = r8.f80286d
                TJ.B r1 = (TJ.C16505B) r1
                java.lang.Object r3 = r8.f80285c
                Ps.d r3 = (Ps.d) r3
                XH.y.b(r9)
                goto L_0x008a
            L_0x0032:
                java.lang.Object r1 = r8.f80285c
                Ds.u r1 = (Ds.u) r1
                XH.y.b(r9)
                goto L_0x0054
            L_0x003a:
                XH.y.b(r9)
                Ds.u r1 = r8.f80289g
                Qs.b r9 = r1.f80276m
                Ds.u r5 = r8.f80289g
                Ps.b r5 = r5.f80281r
                r8.f80285c = r1
                r8.f80288f = r4
                java.lang.Object r9 = r9.a(r5, r8)
                if (r9 != r0) goto L_0x0054
                return r0
            L_0x0054:
                r4 = r9
                Ps.d r4 = (Ps.d) r4
                r1.f80284u = r4
                Ds.u r1 = r8.f80289g
                TJ.B r1 = r1.f80282s
                Ds.u r4 = r8.f80289g
                Ps.d r4 = r4.f80284u
                if (r4 != 0) goto L_0x006b
                Ds.u$b$a r9 = Ds.u.b.a.f80290a
                goto L_0x009f
            L_0x006b:
                Ds.u r5 = r8.f80289g
                Lx.b r5 = r5.f80278o
                Lx.c$d r6 = new Lx.c$d
                java.util.Map r7 = r4.c()
                r6.<init>(r7)
                r8.f80285c = r4
                r8.f80286d = r1
                r8.f80287e = r9
                r8.f80288f = r3
                java.lang.Object r9 = r5.a(r6, r8)
                if (r9 != r0) goto L_0x0089
                return r0
            L_0x0089:
                r3 = r4
            L_0x008a:
                Ds.u r4 = r8.f80289g
                r8.f80285c = r3
                r8.f80286d = r1
                r8.f80287e = r9
                r8.f80288f = r2
                java.lang.Object r9 = r4.F(r3, r8)
                if (r9 != r0) goto L_0x009b
                return r0
            L_0x009b:
                r0 = r1
            L_0x009c:
                Ds.u$b r9 = (Ds.u.b) r9
                r1 = r0
            L_0x009f:
                r1.setValue(r9)
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Ds.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LDs/u$b;", "", "<init>", "()V", "a", "b", "c", "LDs/u$b$a;", "LDs/u$b$b;", "LDs/u$b$c;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDs/u$b$a;", "LDs/u$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f80290a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1719075623;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDs/u$b$b;", "LDs/u$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ds.u$b$b  reason: collision with other inner class name */
        public static final class C1515b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1515b f80291a = new C1515b();

            private C1515b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1515b);
            }

            public int hashCode() {
                return -948593715;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJX\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u000f¨\u0006!"}, d2 = {"LDs/u$b$c;", "LDs/u$b;", "", "image", "imageAltText", "bodyText", "ctaText", "ctaUrl", "header", "destinationUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LDs/u$b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "i", "c", "d", "e", "f", "g", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f80292a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80293b;

            /* renamed from: c  reason: collision with root package name */
            private final String f80294c;

            /* renamed from: d  reason: collision with root package name */
            private final String f80295d;

            /* renamed from: e  reason: collision with root package name */
            private final String f80296e;

            /* renamed from: f  reason: collision with root package name */
            private final String f80297f;

            /* renamed from: g  reason: collision with root package name */
            private final String f80298g;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? null : str7);
            }

            public static /* synthetic */ c b(c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cVar.f80292a;
                }
                if ((i10 & 2) != 0) {
                    str2 = cVar.f80293b;
                }
                String str8 = str2;
                if ((i10 & 4) != 0) {
                    str3 = cVar.f80294c;
                }
                String str9 = str3;
                if ((i10 & 8) != 0) {
                    str4 = cVar.f80295d;
                }
                String str10 = str4;
                if ((i10 & 16) != 0) {
                    str5 = cVar.f80296e;
                }
                String str11 = str5;
                if ((i10 & 32) != 0) {
                    str6 = cVar.f80297f;
                }
                String str12 = str6;
                if ((i10 & 64) != 0) {
                    str7 = cVar.f80298g;
                }
                return cVar.a(str, str8, str9, str10, str11, str12, str7);
            }

            public final c a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                C17542s.j(str, "image");
                C17542s.j(str2, "imageAltText");
                C17542s.j(str3, "bodyText");
                C17542s.j(str4, "ctaText");
                C17542s.j(str5, "ctaUrl");
                C17542s.j(str6, "header");
                return new c(str, str2, str3, str4, str5, str6, str7);
            }

            public final String c() {
                return this.f80294c;
            }

            public final String d() {
                return this.f80295d;
            }

            public final String e() {
                return this.f80296e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f80292a, cVar.f80292a) && C17542s.e(this.f80293b, cVar.f80293b) && C17542s.e(this.f80294c, cVar.f80294c) && C17542s.e(this.f80295d, cVar.f80295d) && C17542s.e(this.f80296e, cVar.f80296e) && C17542s.e(this.f80297f, cVar.f80297f) && C17542s.e(this.f80298g, cVar.f80298g);
            }

            public final String f() {
                return this.f80298g;
            }

            public final String g() {
                return this.f80297f;
            }

            public final String h() {
                return this.f80292a;
            }

            public int hashCode() {
                int hashCode = ((((((((((this.f80292a.hashCode() * 31) + this.f80293b.hashCode()) * 31) + this.f80294c.hashCode()) * 31) + this.f80295d.hashCode()) * 31) + this.f80296e.hashCode()) * 31) + this.f80297f.hashCode()) * 31;
                String str = this.f80298g;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String i() {
                return this.f80293b;
            }

            public String toString() {
                String str = this.f80292a;
                String str2 = this.f80293b;
                String str3 = this.f80294c;
                String str4 = this.f80295d;
                String str5 = this.f80296e;
                String str6 = this.f80297f;
                String str7 = this.f80298g;
                return "NotificationDetails(image=" + str + ", imageAltText=" + str2 + ", bodyText=" + str3 + ", ctaText=" + str4 + ", ctaUrl=" + str5 + ", header=" + str6 + ", destinationUri=" + str7 + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "image");
                C17542s.j(str2, "imageAltText");
                C17542s.j(str3, "bodyText");
                C17542s.j(str4, "ctaText");
                C17542s.j(str5, "ctaUrl");
                C17542s.j(str6, "header");
                this.f80292a = str;
                this.f80293b = str2;
                this.f80294c = str3;
                this.f80295d = str4;
                this.f80296e = str5;
                this.f80297f = str6;
                this.f80298g = str7;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.viewmodel.NotificationDetailsViewModel$navigateTo$1", f = "NotificationDetailsViewModel.kt", l = {90}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80299c;

        /* renamed from: d  reason: collision with root package name */
        Object f80300d;

        /* renamed from: e  reason: collision with root package name */
        Object f80301e;

        /* renamed from: f  reason: collision with root package name */
        int f80302f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f80303g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ u f80304h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f80305i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(u uVar, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f80304h = uVar;
            this.f80305i = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f80304h, this.f80305i, eVar);
            cVar.f80303g = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r13.f80302f
                r2 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r0 = r13.f80301e
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r0 = r13.f80300d
                java.util.Map r0 = (java.util.Map) r0
                java.lang.Object r0 = r13.f80299c
                Ds.u$b r0 = (Ds.u.b) r0
                java.lang.Object r1 = r13.f80303g
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r14)
                goto L_0x008f
            L_0x0020:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0028:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f80303g
                QJ.Q r14 = (QJ.Q) r14
                Ds.u r1 = r13.f80304h
                TJ.B r1 = r1.f80282s
                java.lang.Object r1 = r1.getValue()
                Ds.u$b r1 = (Ds.u.b) r1
                Ds.u$b$a r3 = Ds.u.b.a.f80290a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
                r4 = 0
                if (r3 != 0) goto L_0x00d9
                Ds.u$b$b r3 = Ds.u.b.C1515b.f80291a
                boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
                if (r3 == 0) goto L_0x004e
                goto L_0x00d9
            L_0x004e:
                boolean r3 = r1 instanceof Ds.u.b.c
                if (r3 == 0) goto L_0x00d3
                Ds.u r3 = r13.f80304h
                Ps.d r3 = r3.f80284u
                if (r3 == 0) goto L_0x005e
                java.util.Map r4 = r3.c()
            L_0x005e:
                java.lang.String r3 = r13.f80305i
                if (r3 == 0) goto L_0x0090
                boolean r5 = HJ.C15854t.v0(r3)
                if (r5 == 0) goto L_0x0069
                goto L_0x0090
            L_0x0069:
                if (r4 == 0) goto L_0x0090
                boolean r5 = r4.isEmpty()
                r5 = r5 ^ r2
                if (r5 != r2) goto L_0x0090
                Ds.u r5 = r13.f80304h
                Lx.b r5 = r5.f80278o
                Lx.c$b r6 = new Lx.c$b
                r6.<init>(r4)
                r13.f80303g = r14
                r13.f80299c = r1
                r13.f80300d = r4
                r13.f80301e = r3
                r13.f80302f = r2
                java.lang.Object r14 = r5.a(r6, r13)
                if (r14 != r0) goto L_0x008e
                return r0
            L_0x008e:
                r0 = r1
            L_0x008f:
                r1 = r0
            L_0x0090:
                java.lang.String r14 = r13.f80305i
                if (r14 == 0) goto L_0x00b6
                boolean r14 = HJ.C15854t.v0(r14)
                if (r14 != r2) goto L_0x00b6
                Ds.u r14 = r13.f80304h
                TJ.B r14 = r14.f80282s
                r2 = r1
                Ds.u$b$c r2 = (Ds.u.b.c) r2
                r10 = 63
                r11 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                Ds.u$b$c r0 = Ds.u.b.c.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.setValue(r0)
                goto L_0x01a2
            L_0x00b6:
                Ds.u r14 = r13.f80304h
                TJ.B r14 = r14.f80282s
                r2 = r1
                Ds.u$b$c r2 = (Ds.u.b.c) r2
                java.lang.String r9 = r13.f80305i
                r10 = 63
                r11 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                Ds.u$b$c r0 = Ds.u.b.c.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.setValue(r0)
                goto L_0x01a2
            L_0x00d3:
                XH.t r14 = new XH.t
                r14.<init>()
                throw r14
            L_0x00d9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r3 = r13.f80305i
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Invalid ui state: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = " when navigating to "
                r5.append(r1)
                r5.append(r3)
                java.lang.String r1 = r5.toString()
                r0.<init>(r1)
                qv.e r1 = qv.e.ERROR
                qv.d r3 = qv.d.f102012a
                java.util.List r3 = r3.a()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x010c:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x0124
                java.lang.Object r6 = r3.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                r8 = 0
                boolean r7 = r7.b(r1, r8)
                if (r7 == 0) goto L_0x010c
                r5.add(r6)
                goto L_0x010c
            L_0x0124:
                java.util.Iterator r3 = r5.iterator()
                r5 = r4
                r6 = r5
            L_0x012a:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x01a2
                java.lang.Object r7 = r3.next()
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x0144
                java.lang.String r5 = qv.C11818a.a(r4, r0)
                if (r5 != 0) goto L_0x0140
                goto L_0x01a2
            L_0x0140:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x0144:
                r11 = r5
                if (r6 != 0) goto L_0x0195
                java.lang.Class r5 = r14.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r4, r8, r4)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r4, r8, r4)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x0166
                goto L_0x016c
            L_0x0166:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x016c:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r2)
                if (r6 == 0) goto L_0x017f
                java.lang.String r6 = "m"
                goto L_0x0181
            L_0x017f:
                java.lang.String r6 = "b"
            L_0x0181:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x0195:
                r12 = r6
                r8 = 0
                r5 = r7
                r6 = r1
                r7 = r12
                r9 = r0
                r10 = r11
                r5.a(r6, r7, r8, r9, r10)
                r5 = r11
                r6 = r12
                goto L_0x012a
            L_0x01a2:
                XH.N r14 = XH.C16807N.f139792a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: Ds.u.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public u(U u10, Qs.b bVar, C12340a aVar, Lx.b bVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "getNotificationMessageUseCase");
        C17542s.j(aVar, "notificationDetailsMapper");
        C17542s.j(bVar2, "pushNotificationAnalytics");
        this.f80276m = bVar;
        this.f80277n = aVar;
        this.f80278o = bVar2;
        Object f10 = u10.f("id_key");
        if (f10 != null) {
            String str = (String) f10;
            this.f80279p = str;
            Object f11 = u10.f("feature_key");
            if (f11 != null) {
                String str2 = (String) f11;
                this.f80280q = str2;
                this.f80281r = new Ps.b(str, str2);
                C16505B<b> a10 = C16521S.a(b.C1515b.f80291a);
                this.f80282s = a10;
                this.f80283t = a10;
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final Object F(d dVar, C17164e<? super b> eVar) {
        return this.f80277n.a(dVar.c(), eVar);
    }

    private final void G(String str) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, str, (C17164e<? super c>) null), 3, (Object) null);
    }

    public final void H(t tVar) {
        C17542s.j(tVar, "event");
        if (tVar instanceof t.a) {
            G(((t.a) tVar).a());
        } else if (C17542s.e(tVar, t.b.f80275a)) {
            G((String) null);
        } else {
            throw new XH.t();
        }
    }

    public final C16519P<b> m() {
        return this.f80283t;
    }
}
