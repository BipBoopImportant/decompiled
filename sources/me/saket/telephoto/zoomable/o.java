package me.saket.telephoto.zoomable;

import IJ.C15906b;
import TJ.C16532g;
import U0.C4889m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;
import nK.C17673d;
import nK.C17679j;
import o1.C5673m;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\b\t\n\u000bJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lme/saket/telephoto/zoomable/o;", "", "LTJ/g;", "Lo1/m;", "canvasSize", "Lme/saket/telephoto/zoomable/o$d;", "a", "(LTJ/g;LU0/m;I)Lme/saket/telephoto/zoomable/o$d;", "b", "c", "d", "e", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144767a = a.f144768a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme/saket/telephoto/zoomable/o$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144768a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0001\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lme/saket/telephoto/zoomable/o$b;", "", "Lme/saket/telephoto/zoomable/o$c;", "Lme/saket/telephoto/zoomable/o$e;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    @C17604b
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0001\u0003\u0001\u0004\u0018\u00010\u0002¨\u0006\u0015"}, d2 = {"Lme/saket/telephoto/zoomable/o$c;", "Lme/saket/telephoto/zoomable/o$b;", "Lt1/c;", "painter", "b", "(Lt1/c;)Lt1/c;", "", "e", "(Lt1/c;)Ljava/lang/String;", "", "d", "(Lt1/c;)I", "", "other", "", "c", "(Lt1/c;Ljava/lang/Object;)Z", "a", "Lt1/c;", "getPainter", "()Lt1/c;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final C5942c f144769a;

        private /* synthetic */ c(C5942c cVar) {
            this.f144769a = cVar;
        }

        public static final /* synthetic */ c a(C5942c cVar) {
            return new c(cVar);
        }

        public static C5942c b(C5942c cVar) {
            return cVar;
        }

        public static boolean c(C5942c cVar, Object obj) {
            return (obj instanceof c) && C17542s.e(cVar, ((c) obj).f());
        }

        public static int d(C5942c cVar) {
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public static String e(C5942c cVar) {
            return "PainterDelegate(painter=" + cVar + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f144769a, obj);
        }

        public final /* synthetic */ C5942c f() {
            return this.f144769a;
        }

        public int hashCode() {
            return d(this.f144769a);
        }

        public String toString() {
            return e(this.f144769a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lme/saket/telephoto/zoomable/o$d;", "", "Lme/saket/telephoto/zoomable/o$b;", "delegate", "LIJ/b;", "crossfadeDuration", "Lt1/c;", "placeholder", "<init>", "(Lme/saket/telephoto/zoomable/o$b;JLt1/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lme/saket/telephoto/zoomable/o$b;", "b", "()Lme/saket/telephoto/zoomable/o$b;", "J", "()J", "c", "Lt1/c;", "()Lt1/c;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final b f144770a;

        /* renamed from: b  reason: collision with root package name */
        private final long f144771b;

        /* renamed from: c  reason: collision with root package name */
        private final C5942c f144772c;

        public /* synthetic */ d(b bVar, long j10, C5942c cVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, j10, cVar);
        }

        public final long a() {
            return this.f144771b;
        }

        public final b b() {
            return this.f144770a;
        }

        public final C5942c c() {
            return this.f144772c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f144770a, dVar.f144770a) && C15906b.F(this.f144771b, dVar.f144771b) && C17542s.e(this.f144772c, dVar.f144772c);
        }

        public int hashCode() {
            b bVar = this.f144770a;
            int i10 = 0;
            int hashCode = (((bVar == null ? 0 : bVar.hashCode()) * 31) + C15906b.T(this.f144771b)) * 31;
            C5942c cVar = this.f144772c;
            if (cVar != null) {
                i10 = cVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            b bVar = this.f144770a;
            String d02 = C15906b.d0(this.f144771b);
            C5942c cVar = this.f144772c;
            return "ResolveResult(delegate=" + bVar + ", crossfadeDuration=" + d02 + ", placeholder=" + cVar + ")";
        }

        private d(b bVar, long j10, C5942c cVar) {
            this.f144770a = bVar;
            this.f144771b = j10;
            this.f144772c = cVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(b bVar, long j10, C5942c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? C15906b.f135496b.c() : j10, (i10 & 4) != 0 ? null : cVar, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lme/saket/telephoto/zoomable/o$e;", "Lme/saket/telephoto/zoomable/o$b;", "LnK/j;", "source", "LnK/d;", "imageOptions", "<init>", "(LnK/j;LnK/d;)V", "a", "LnK/j;", "b", "()LnK/j;", "LnK/d;", "()LnK/d;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final C17679j f144773a;

        /* renamed from: b  reason: collision with root package name */
        private final C17673d f144774b;

        public e(C17679j jVar, C17673d dVar) {
            C17542s.j(jVar, "source");
            C17542s.j(dVar, "imageOptions");
            this.f144773a = jVar;
            this.f144774b = dVar;
        }

        public final C17673d a() {
            return this.f144774b;
        }

        public final C17679j b() {
            return this.f144773a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f144773a, eVar.f144773a) && C17542s.e(this.f144774b, eVar.f144774b);
        }

        public int hashCode() {
            return (this.f144773a.hashCode() * 31) + this.f144774b.hashCode();
        }

        public String toString() {
            C17679j jVar = this.f144773a;
            C17673d dVar = this.f144774b;
            return "SubSamplingDelegate(source=" + jVar + ", imageOptions=" + dVar + ")";
        }
    }

    d a(C16532g<C5673m> gVar, C4889m mVar, int i10);
}
