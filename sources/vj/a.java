package Vj;

import HJ.C15850p;
import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\n\u000e\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\nB\u001b\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"LVj/a;", "", "", "barcodeFormat", "validLength", "<init>", "(II)V", "", "barcode", "", "c", "(Ljava/lang/String;)Z", "a", "I", "b", "()I", "f", "e", "d", "i", "h", "j", "g", "LVj/a$d;", "LVj/a$e;", "LVj/a$g;", "LVj/a$h;", "LVj/a$i;", "LVj/a$j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final c f88655c = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final a[] f88656d = {h.f88665e, b.f88660f, C1875a.f88659f, f.f88663f, e.f88662e, d.f88661e, i.f88666e};

    /* renamed from: a  reason: collision with root package name */
    private final int f88657a;

    /* renamed from: b  reason: collision with root package name */
    private final int f88658b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$a;", "LVj/a$g;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vj.a$a  reason: collision with other inner class name */
    public static final class C1875a extends g {

        /* renamed from: f  reason: collision with root package name */
        public static final C1875a f88659f = new C1875a();

        private C1875a() {
            super(1, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$b;", "LVj/a$g;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: f  reason: collision with root package name */
        public static final b f88660f = new b();

        private b() {
            super(2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LVj/a$c;", "", "<init>", "()V", "", "format", "LVj/a;", "a", "(I)LVj/a;", "b", "()I", "", "validFormats", "[LVj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10) {
            a aVar;
            a[] a10 = a.f88656d;
            int length = a10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = null;
                    break;
                }
                aVar = a10[i11];
                if (aVar.b() == i10) {
                    break;
                }
                i11++;
            }
            if (aVar != null) {
                return aVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Invalid format provided: format " + i10);
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                if (str2 == null) {
                    String name = c.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, illegalStateException, str);
            }
            return j.f88667e;
        }

        public final int b() {
            a[] a10 = a.f88656d;
            ArrayList arrayList = new ArrayList(a10.length);
            for (a b10 : a10) {
                arrayList.add(Integer.valueOf(b10.b()));
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
                }
                return ((Number) next).intValue();
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$d;", "LVj/a;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final d f88661e = new d();

        private d() {
            super(16, -1, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$e;", "LVj/a;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final e f88662e = new e();

        private e() {
            super(32, 13, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$f;", "LVj/a$g;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends g {

        /* renamed from: f  reason: collision with root package name */
        public static final f f88663f = new f();

        private f() {
            super(128, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LVj/a$g;", "LVj/a;", "", "format", "<init>", "(I)V", "", "barcode", "", "c", "(Ljava/lang/String;)Z", "LHJ/p;", "e", "LHJ/p;", "regex", "LVj/a$a;", "LVj/a$b;", "LVj/a$f;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g extends a {

        /* renamed from: e  reason: collision with root package name */
        private final C15850p f88664e;

        public /* synthetic */ g(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        public boolean c(String str) {
            C17542s.j(str, "barcode");
            return a.super.c(str) && this.f88664e.i(str);
        }

        private g(int i10) {
            super(i10, 14, (DefaultConstructorMarker) null);
            this.f88664e = new C15850p("^\\d*([0-357-9]\\z)(?!.*[0-357-9]\\z)$");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$h;", "LVj/a;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final h f88665e = new h();

        private h() {
            super(0, 8, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVj/a$i;", "LVj/a;", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final i f88666e = new i();

        private i() {
            super(256, -1, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVj/a$j;", "LVj/a;", "<init>", "()V", "", "barcode", "", "c", "(Ljava/lang/String;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final j f88667e = new j();

        private j() {
            super(-1, -1, (DefaultConstructorMarker) null);
        }

        public boolean c(String str) {
            C17542s.j(str, "barcode");
            return false;
        }
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int b() {
        return this.f88657a;
    }

    public boolean c(String str) {
        C17542s.j(str, "barcode");
        if (str.length() == 0) {
            return false;
        }
        return (this.f88658b == -1 && str.length() >= 9) || str.length() == this.f88658b;
    }

    private a(int i10, int i11) {
        this.f88657a = i10;
        this.f88658b = i11;
    }
}
