package r8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C8560a;
import m8.C8561b;
import m8.C8563d;
import z8.C9036b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr8/a;", "", "Lm8/a;", "composeTreeWalker", "<init>", "(Lm8/a;)V", "Lm8/d;", "root", "Lz8/b;", "androidViewLight", "", "isSnapshotFromSrEnabled", "LXH/N;", "a", "(Lm8/d;Lz8/b;Z)V", "Lm8/a;", "compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: r8.a  reason: case insensitive filesystem */
public final class C8709a {

    /* renamed from: a  reason: collision with root package name */
    private final C8560a f55777a;

    /* renamed from: r8.a$a  reason: collision with other inner class name */
    public static final class C0904a implements C8561b<C9036b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C9036b f55778a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f55779b;

        public C0904a(C9036b bVar, boolean z10) {
            this.f55778a = bVar;
            this.f55779b = z10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0067, code lost:
            r9 = r8.C8710b.b((r9 = r2.n()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(java.lang.Object r8, m8.C8563d r9, o1.C5669i r10, java.lang.String r11, int r12, float r13) {
            /*
                r7 = this;
                z8.b r8 = (z8.C9036b) r8
                java.lang.String r0 = "node"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r0 = "bounds"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                java.lang.String r0 = "nodeName"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                if (r8 != 0) goto L_0x0015
                z8.b r8 = r7.f55778a
            L_0x0015:
                z8.b$a r0 = z8.C9036b.f58523D
                z8.b r1 = r0.c()
                boolean r0 = r7.f55779b
                long r2 = r8.r()
                r1.Y(r2)
                java.util.List r2 = r8.h()
                int r2 = r2.size()
                r1.W(r2)
                java.util.List r2 = r8.h()
                r2.add(r1)
                if (r0 == 0) goto L_0x0057
                r1.L(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r11 = ":eq("
                r0.append(r11)
                r0.append(r12)
                r11 = 41
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                r1.V(r11)
            L_0x0057:
                L1.p r2 = r9.c()
                E1.z r3 = r9.b()
                if (r2 == 0) goto L_0x0073
                L1.l r9 = r2.n()
                if (r9 == 0) goto L_0x0073
                java.lang.Boolean r9 = r8.C8710b.g(r9)
                if (r9 == 0) goto L_0x0073
                boolean r8 = r9.booleanValue()
            L_0x0071:
                r6 = r8
                goto L_0x0078
            L_0x0073:
                boolean r8 = r8.C()
                goto L_0x0071
            L_0x0078:
                r4 = r10
                r5 = r13
                z8.b r8 = r8.C8710b.c(r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r8.C8709a.C0904a.a(java.lang.Object, m8.d, o1.i, java.lang.String, int, float):java.lang.Object");
        }
    }

    public C8709a(C8560a aVar) {
        C17542s.j(aVar, "composeTreeWalker");
        this.f55777a = aVar;
    }

    public final void a(C8563d dVar, C9036b bVar, boolean z10) {
        C17542s.j(dVar, "root");
        C17542s.j(bVar, "androidViewLight");
        C8560a.h(this.f55777a, dVar, false, new C0904a(bVar, z10), 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8709a(C8560a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C8560a() : aVar);
    }
}
