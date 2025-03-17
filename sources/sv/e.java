package Sv;

import Bv.m;
import IC.C13023e;
import KJ.C15987c;
import Op.d1;
import Rv.c;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LSv/e;", "LxB/a;", "c", "a", "g", "d", "e", "f", "b", "LSv/e$a;", "LSv/e$b;", "LSv/e$c;", "LSv/e$d;", "LSv/e$e;", "LSv/e$f;", "LSv/e$g;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e extends C15201a {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"LSv/e$a;", "LSv/e;", "<init>", "()V", "", "a", "J", "f", "()J", "stableId", "b", "LSv/e$a$a;", "LSv/e$a$b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final long f39956a;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LSv/e$a$a;", "LSv/e$a;", "LKJ/c;", "LSv/a;", "content", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LKJ/c;", "g", "()LKJ/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sv.e$a$a  reason: collision with other inner class name */
        public static final class C0653a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final C15987c<a> f39957b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0653a(C15987c<a> cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "content");
                this.f39957b = cVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0653a) && C17542s.e(this.f39957b, ((C0653a) obj).f39957b);
            }

            public final C15987c<a> g() {
                return this.f39957b;
            }

            public int hashCode() {
                return this.f39957b.hashCode();
            }

            public String toString() {
                C15987c<a> cVar = this.f39957b;
                return "Content(content=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSv/e$a$b;", "LSv/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f39958b = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -658128445;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public long f() {
            return this.f39956a;
        }

        private a() {
            this.f39956a = (long) Objects.hash(new Object[]{P.b(a.class)});
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LSv/e$b;", "LSv/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "b", "J", "f", "()J", "stableId", "LRv/c$a$g;", "c", "LRv/c$a$g;", "g", "()LRv/c$a$g;", "clickEvent", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39959a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final long f39960b = ((long) Objects.hash(new Object[]{P.b(b.class)}));

        /* renamed from: c  reason: collision with root package name */
        private static final c.a.g f39961c = c.a.g.DelightContent;

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public long f() {
            return f39960b;
        }

        public final c.a.g g() {
            return f39961c;
        }

        public int hashCode() {
            return 76540075;
        }

        public String toString() {
            return "DelightMessage";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LSv/e$c;", "LSv/e;", "LIC/e;", "text", "subtext", "LRv/c$a;", "clickEvent", "<init>", "(LIC/e;LIC/e;LRv/c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "i", "()LIC/e;", "b", "h", "c", "LRv/c$a;", "g", "()LRv/c$a;", "", "d", "J", "f", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f39962a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f39963b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a f39964c;

        /* renamed from: d  reason: collision with root package name */
        private final long f39965d;

        public c(C13023e eVar, C13023e eVar2, c.a aVar) {
            C17542s.j(eVar, "text");
            this.f39962a = eVar;
            this.f39963b = eVar2;
            this.f39964c = aVar;
            U u10 = new U(3);
            u10.a(P.b(c.class));
            u10.a(eVar);
            u10.b(new Object[0]);
            this.f39965d = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f39962a, cVar.f39962a) && C17542s.e(this.f39963b, cVar.f39963b) && C17542s.e(this.f39964c, cVar.f39964c);
        }

        public long f() {
            return this.f39965d;
        }

        public final c.a g() {
            return this.f39964c;
        }

        public final C13023e h() {
            return this.f39963b;
        }

        public int hashCode() {
            int hashCode = this.f39962a.hashCode() * 31;
            C13023e eVar = this.f39963b;
            int i10 = 0;
            int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            c.a aVar = this.f39964c;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public final C13023e i() {
            return this.f39962a;
        }

        public String toString() {
            C13023e eVar = this.f39962a;
            C13023e eVar2 = this.f39963b;
            c.a aVar = this.f39964c;
            return "Header(text=" + eVar + ", subtext=" + eVar2 + ", clickEvent=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LSv/e$d;", "LSv/e;", "LKJ/c;", "LSv/b;", "tiles", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "", "b", "J", "f", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<b> f39966a;

        /* renamed from: b  reason: collision with root package name */
        private final long f39967b = ((long) Objects.hash(new Object[]{P.b(d.class)}));

        public d(C15987c<? extends b> cVar) {
            C17542s.j(cVar, "tiles");
            this.f39966a = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f39966a, ((d) obj).f39966a);
        }

        public long f() {
            return this.f39967b;
        }

        public final C15987c<b> g() {
            return this.f39966a;
        }

        public int hashCode() {
            return this.f39966a.hashCode();
        }

        public String toString() {
            C15987c<b> cVar = this.f39966a;
            return "LatestActionTiles(tiles=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"LSv/e$e;", "LSv/e;", "LKJ/c;", "LOp/d1;", "content", "", "isLoading", "<init>", "(LKJ/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "g", "()LKJ/c;", "b", "Z", "i", "()Z", "", "c", "J", "f", "()J", "stableId", "", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "itemNos", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sv.e$e  reason: collision with other inner class name */
    public static final class C0654e implements e {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<d1> f39968a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f39969b;

        /* renamed from: c  reason: collision with root package name */
        private final long f39970c = ((long) Objects.hash(new Object[]{P.b(C0654e.class)}));

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f39971d;

        public C0654e(C15987c<d1> cVar, boolean z10) {
            C17542s.j(cVar, "content");
            this.f39968a = cVar;
            this.f39969b = z10;
            ArrayList arrayList = new ArrayList(C16877v.y(cVar, 10));
            for (d1 p10 : cVar) {
                arrayList.add(p10.p().f());
            }
            this.f39971d = arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0654e)) {
                return false;
            }
            C0654e eVar = (C0654e) obj;
            return C17542s.e(this.f39968a, eVar.f39968a) && this.f39969b == eVar.f39969b;
        }

        public long f() {
            return this.f39970c;
        }

        public final C15987c<d1> g() {
            return this.f39968a;
        }

        public final List<String> h() {
            return this.f39971d;
        }

        public int hashCode() {
            return (this.f39968a.hashCode() * 31) + Boolean.hashCode(this.f39969b);
        }

        public final boolean i() {
            return this.f39969b;
        }

        public String toString() {
            int size = this.f39968a.size();
            boolean z10 = this.f39969b;
            return "ProductCarousel(content=(size:" + size + "), isLoading=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"LSv/e$f;", "LSv/e;", "<init>", "()V", "", "a", "J", "f", "()J", "stableId", "b", "LSv/e$f$a;", "LSv/e$f$b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final long f39972a;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LSv/e$f$a;", "LSv/e$f;", "LBv/m;", "latestPurchase", "<init>", "(LBv/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LBv/m;", "g", "()LBv/m;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends f {

            /* renamed from: b  reason: collision with root package name */
            private final m f39973b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(m mVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(mVar, "latestPurchase");
                this.f39973b = mVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f39973b, ((a) obj).f39973b);
            }

            public final m g() {
                return this.f39973b;
            }

            public int hashCode() {
                return this.f39973b.hashCode();
            }

            public String toString() {
                m mVar = this.f39973b;
                return "Loaded(latestPurchase=" + mVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSv/e$f$b;", "LSv/e$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends f {

            /* renamed from: b  reason: collision with root package name */
            public static final b f39974b = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1102057224;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public long f() {
            return this.f39972a;
        }

        private f() {
            this.f39972a = (long) Objects.hash(new Object[]{P.b(f.class)});
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LSv/e$g;", "LSv/e;", "LIq/g;", "state", "<init>", "(LIq/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIq/g;", "g", "()LIq/g;", "", "b", "J", "f", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Iq.g f39975a;

        /* renamed from: b  reason: collision with root package name */
        private final long f39976b = ((long) Objects.hash(new Object[]{P.b(g.class)}));

        public g(Iq.g gVar) {
            C17542s.j(gVar, "state");
            this.f39975a = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f39975a, ((g) obj).f39975a);
        }

        public long f() {
            return this.f39976b;
        }

        public final Iq.g g() {
            return this.f39975a;
        }

        public int hashCode() {
            return this.f39975a.hashCode();
        }

        public String toString() {
            Iq.g gVar = this.f39975a;
            return "RewardsCarousel(state=" + gVar + ")";
        }
    }
}
