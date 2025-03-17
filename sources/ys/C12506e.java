package ys;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ys.C12504c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0011\u0007\u000b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000f\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lys/e;", "", "<init>", "()V", "Lys/f;", "a", "Lys/f;", "c", "()Lys/f;", "userMessage", "Lys/a;", "b", "()Lys/a;", "navigateTo", "Lys/c;", "()Lys/c;", "manualRefresh", "d", "Lys/e$a;", "Lys/e$b;", "Lys/e$c;", "Lys/e$d;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ys.e  reason: case insensitive filesystem */
public abstract class C12506e {

    /* renamed from: a  reason: collision with root package name */
    private final C12507f f107241a;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b&\u0010)¨\u0006*"}, d2 = {"Lys/e$a;", "Lys/e;", "Lys/a;", "navigateTo", "Lys/f;", "userMessage", "Lys/c$b;", "manualRefresh", "LKJ/c;", "Lys/d;", "notifications", "", "isLoading", "showEnableNotificationMessage", "<init>", "(Lys/a;Lys/f;Lys/c$b;LKJ/c;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lys/a;", "()Lys/a;", "c", "Lys/f;", "()Lys/f;", "d", "Lys/c$b;", "()Lys/c$b;", "e", "LKJ/c;", "()LKJ/c;", "f", "Z", "g", "()Z", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.e$a */
    public static final class a extends C12506e {

        /* renamed from: b  reason: collision with root package name */
        private final C12502a f107242b;

        /* renamed from: c  reason: collision with root package name */
        private final C12507f f107243c;

        /* renamed from: d  reason: collision with root package name */
        private final C12504c.b f107244d;

        /* renamed from: e  reason: collision with root package name */
        private final C15987c<C12505d> f107245e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f107246f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f107247g;

        public a() {
            this((C12502a) null, (C12507f) null, (C12504c.b) null, (C15987c) null, false, false, 63, (DefaultConstructorMarker) null);
        }

        public C12502a b() {
            return this.f107242b;
        }

        public C12507f c() {
            return this.f107243c;
        }

        /* renamed from: d */
        public C12504c.b a() {
            return this.f107244d;
        }

        public final C15987c<C12505d> e() {
            return this.f107245e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f107242b, aVar.f107242b) && C17542s.e(this.f107243c, aVar.f107243c) && C17542s.e(this.f107244d, aVar.f107244d) && C17542s.e(this.f107245e, aVar.f107245e) && this.f107246f == aVar.f107246f && this.f107247g == aVar.f107247g;
        }

        public final boolean f() {
            return this.f107247g;
        }

        public final boolean g() {
            return this.f107246f;
        }

        public int hashCode() {
            C12502a aVar = this.f107242b;
            int i10 = 0;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            C12507f fVar = this.f107243c;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            return ((((((((hashCode + i10) * 31) + this.f107244d.hashCode()) * 31) + this.f107245e.hashCode()) * 31) + Boolean.hashCode(this.f107246f)) * 31) + Boolean.hashCode(this.f107247g);
        }

        public String toString() {
            C12502a aVar = this.f107242b;
            C12507f fVar = this.f107243c;
            C12504c.b bVar = this.f107244d;
            C15987c<C12505d> cVar = this.f107245e;
            boolean z10 = this.f107246f;
            boolean z11 = this.f107247g;
            return "Content(navigateTo=" + aVar + ", userMessage=" + fVar + ", manualRefresh=" + bVar + ", notifications=" + cVar + ", isLoading=" + z10 + ", showEnableNotificationMessage=" + z11 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(ys.C12502a r5, ys.C12507f r6, ys.C12504c.b r7, KJ.C15987c r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = r6
            L_0x000e:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0014
                ys.c$c r7 = ys.C12504c.C2554c.f107229a
            L_0x0014:
                r1 = r7
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001d
                KJ.f r8 = KJ.C15985a.a()
            L_0x001d:
                r2 = r8
                r5 = r11 & 16
                r6 = 0
                if (r5 == 0) goto L_0x0025
                r3 = r6
                goto L_0x0026
            L_0x0025:
                r3 = r9
            L_0x0026:
                r5 = r11 & 32
                if (r5 == 0) goto L_0x002c
                r11 = r6
                goto L_0x002d
            L_0x002c:
                r11 = r10
            L_0x002d:
                r5 = r4
                r6 = r12
                r7 = r0
                r8 = r1
                r9 = r2
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ys.C12506e.a.<init>(ys.a, ys.f, ys.c$b, KJ.c, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C12502a aVar, C12507f fVar, C12504c.b bVar, C15987c<C12505d> cVar, boolean z10, boolean z11) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "manualRefresh");
            C17542s.j(cVar, "notifications");
            this.f107242b = aVar;
            this.f107243c = fVar;
            this.f107244d = bVar;
            this.f107245e = cVar;
            this.f107246f = z10;
            this.f107247g = z11;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lys/e$b;", "Lys/e;", "Lys/a;", "navigateTo", "Lys/f;", "userMessage", "", "showEnableNotificationMessage", "<init>", "(Lys/a;Lys/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lys/a;", "()Lys/a;", "c", "Lys/f;", "()Lys/f;", "d", "Z", "e", "()Z", "Lys/c$b;", "Lys/c$b;", "()Lys/c$b;", "manualRefresh", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.e$b */
    public static final class b extends C12506e {

        /* renamed from: b  reason: collision with root package name */
        private final C12502a f107248b;

        /* renamed from: c  reason: collision with root package name */
        private final C12507f f107249c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f107250d;

        /* renamed from: e  reason: collision with root package name */
        private final C12504c.b f107251e;

        public b() {
            this((C12502a) null, (C12507f) null, false, 7, (DefaultConstructorMarker) null);
        }

        public C12502a b() {
            return this.f107248b;
        }

        public C12507f c() {
            return this.f107249c;
        }

        /* renamed from: d */
        public C12504c.b a() {
            return this.f107251e;
        }

        public final boolean e() {
            return this.f107250d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f107248b, bVar.f107248b) && C17542s.e(this.f107249c, bVar.f107249c) && this.f107250d == bVar.f107250d;
        }

        public int hashCode() {
            C12502a aVar = this.f107248b;
            int i10 = 0;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            C12507f fVar = this.f107249c;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            return ((hashCode + i10) * 31) + Boolean.hashCode(this.f107250d);
        }

        public String toString() {
            C12502a aVar = this.f107248b;
            C12507f fVar = this.f107249c;
            boolean z10 = this.f107250d;
            return "Empty(navigateTo=" + aVar + ", userMessage=" + fVar + ", showEnableNotificationMessage=" + z10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C12502a aVar, C12507f fVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : fVar, (i10 & 4) != 0 ? false : z10);
        }

        public b(C12502a aVar, C12507f fVar, boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f107248b = aVar;
            this.f107249c = fVar;
            this.f107250d = z10;
            this.f107251e = C12504c.C2554c.f107229a;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lys/e$c;", "Lys/e;", "Lys/a;", "navigateTo", "<init>", "(Lys/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lys/a;", "()Lys/a;", "Lys/f;", "c", "Lys/f;", "()Lys/f;", "userMessage", "Lys/c$b;", "d", "Lys/c$b;", "()Lys/c$b;", "manualRefresh", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.e$c */
    public static final class c extends C12506e {

        /* renamed from: b  reason: collision with root package name */
        private final C12502a f107252b;

        /* renamed from: c  reason: collision with root package name */
        private final C12507f f107253c;

        /* renamed from: d  reason: collision with root package name */
        private final C12504c.b f107254d;

        public c() {
            this((C12502a) null, 1, (DefaultConstructorMarker) null);
        }

        public C12502a b() {
            return this.f107252b;
        }

        public C12507f c() {
            return this.f107253c;
        }

        /* renamed from: d */
        public C12504c.b a() {
            return this.f107254d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f107252b, ((c) obj).f107252b);
        }

        public int hashCode() {
            C12502a aVar = this.f107252b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C12502a aVar = this.f107252b;
            return "Error(navigateTo=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C12502a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar);
        }

        public c(C12502a aVar) {
            super((DefaultConstructorMarker) null);
            this.f107252b = aVar;
            this.f107254d = C12504c.C2554c.f107229a;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lys/e$d;", "Lys/e;", "Lys/a;", "navigateTo", "Lys/f;", "userMessage", "<init>", "(Lys/a;Lys/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lys/a;", "()Lys/a;", "c", "Lys/f;", "()Lys/f;", "Lys/c$a;", "d", "Lys/c$a;", "()Lys/c$a;", "manualRefresh", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.e$d */
    public static final class d extends C12506e {

        /* renamed from: b  reason: collision with root package name */
        private final C12502a f107255b;

        /* renamed from: c  reason: collision with root package name */
        private final C12507f f107256c;

        /* renamed from: d  reason: collision with root package name */
        private final C12504c.a f107257d;

        public d() {
            this((C12502a) null, (C12507f) null, 3, (DefaultConstructorMarker) null);
        }

        public C12502a b() {
            return this.f107255b;
        }

        public C12507f c() {
            return this.f107256c;
        }

        /* renamed from: d */
        public C12504c.a a() {
            return this.f107257d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f107255b, dVar.f107255b) && C17542s.e(this.f107256c, dVar.f107256c);
        }

        public int hashCode() {
            C12502a aVar = this.f107255b;
            int i10 = 0;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            C12507f fVar = this.f107256c;
            if (fVar != null) {
                i10 = fVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            C12502a aVar = this.f107255b;
            C12507f fVar = this.f107256c;
            return "Loading(navigateTo=" + aVar + ", userMessage=" + fVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(C12502a aVar, C12507f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : fVar);
        }

        public d(C12502a aVar, C12507f fVar) {
            super((DefaultConstructorMarker) null);
            this.f107255b = aVar;
            this.f107256c = fVar;
            this.f107257d = C12504c.a.f107228a;
        }
    }

    public /* synthetic */ C12506e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C12504c a();

    public abstract C12502a b();

    public C12507f c() {
        return this.f107241a;
    }

    private C12506e() {
    }
}
