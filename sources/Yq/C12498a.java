package yq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import w5.g;
import y5.C8980c;
import y5.C8981d;
import y5.C8982e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyq/a;", "Lw5/g;", "Ly5/d;", "driver", "<init>", "(Ly5/d;)V", "", "T", "Lkotlin/Function2;", "", "", "mapper", "Lw5/c;", "g", "(LnI/p;)Lw5/c;", "Lyq/c;", "f", "()Lw5/c;", "e", "event", "LXH/N;", "h", "(Ljava/lang/String;)V", "d", "()V", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yq.a  reason: case insensitive filesystem */
public final class C12498a extends g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "emit", "a", "(LnI/l;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$a  reason: collision with other inner class name */
    static final class C2551a extends C17544u implements C17642l<C17642l<? super String, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final C2551a f107202c = new C2551a();

        C2551a() {
            super(1);
        }

        public final void a(C17642l<? super String, C16807N> lVar) {
            C17542s.j(lVar, "emit");
            lVar.invoke("events");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17642l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly5/c;", "cursor", "", "a", "(Ly5/c;)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$b */
    static final class b extends C17544u implements C17642l<C8980c, Long> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f107203c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Long invoke(C8980c cVar) {
            C17542s.j(cVar, "cursor");
            Long l10 = cVar.getLong(0);
            C17542s.g(l10);
            return l10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ly5/c;", "cursor", "a", "(Ly5/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$c */
    static final class c extends C17544u implements C17642l<C8980c, T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Long, String, T> f107204c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p<? super Long, ? super String, ? extends T> pVar) {
            super(1);
            this.f107204c = pVar;
        }

        /* renamed from: a */
        public final T invoke(C8980c cVar) {
            C17542s.j(cVar, "cursor");
            p<Long, String, T> pVar = this.f107204c;
            Long l10 = cVar.getLong(0);
            C17542s.g(l10);
            String string = cVar.getString(1);
            C17542s.g(string);
            return pVar.invoke(l10, string);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "", "event", "Lyq/c;", "a", "(JLjava/lang/String;)Lyq/c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$d */
    static final class d extends C17544u implements p<Long, String, C12500c> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f107205c = new d();

        d() {
            super(2);
        }

        public final C12500c a(long j10, String str) {
            C17542s.j(str, "event");
            return new C12500c(j10, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (String) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly5/e;", "LXH/N;", "a", "(Ly5/e;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$e */
    static final class e extends C17544u implements C17642l<C8982e, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f107206c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f107206c = str;
        }

        public final void a(C8982e eVar) {
            C17542s.j(eVar, "$this$execute");
            eVar.H(0, this.f107206c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8982e) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "emit", "a", "(LnI/l;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: yq.a$f */
    static final class f extends C17544u implements C17642l<C17642l<? super String, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f107207c = new f();

        f() {
            super(1);
        }

        public final void a(C17642l<? super String, C16807N> lVar) {
            C17542s.j(lVar, "emit");
            lVar.invoke("events");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17642l) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12498a(C8981d dVar) {
        super(dVar);
        C17542s.j(dVar, "driver");
    }

    public final void d() {
        C8981d.a.a(b(), -2030028178, "DELETE FROM events", 0, (C17642l) null, 8, (Object) null);
        c(-2030028178, C2551a.f107202c);
    }

    public final w5.c<Long> e() {
        return w5.d.a(-79074745, new String[]{"events"}, b(), "EpisodDatabase.sq", "getRowCount", "SELECT COUNT(*) FROM events", b.f107203c);
    }

    public final w5.c<C12500c> f() {
        return g(d.f107205c);
    }

    public final <T> w5.c<T> g(p<? super Long, ? super String, ? extends T> pVar) {
        C17542s.j(pVar, "mapper");
        return w5.d.a(865575679, new String[]{"events"}, b(), "EpisodDatabase.sq", "retrieveAllItems", "SELECT events.id, events.event FROM events", new c(pVar));
    }

    public final void h(String str) {
        C17542s.j(str, "event");
        b().V1(2012778036, "INSERT INTO events (event)\nVALUES (?)", 1, new e(str));
        c(2012778036, f.f107207c);
    }
}
