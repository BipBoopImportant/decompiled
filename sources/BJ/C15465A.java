package BJ;

import BJ.C15471f;
import DI.C15579z;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: BJ.A  reason: case insensitive filesystem */
public abstract class C15465A implements C15471f {

    /* renamed from: a  reason: collision with root package name */
    private final String f133297a;

    /* renamed from: BJ.A$a */
    public static final class a extends C15465A {

        /* renamed from: b  reason: collision with root package name */
        private final int f133298b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f133298b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BJ.C15465A.a.<init>(int):void");
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return zVar.j().size() >= this.f133298b;
        }
    }

    /* renamed from: BJ.A$b */
    public static final class b extends C15465A {

        /* renamed from: b  reason: collision with root package name */
        private final int f133299b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", (DefaultConstructorMarker) null);
            this.f133299b = i10;
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return zVar.j().size() == this.f133299b;
        }
    }

    /* renamed from: BJ.A$c */
    public static final class c extends C15465A {

        /* renamed from: b  reason: collision with root package name */
        public static final c f133300b = new c();

        private c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return zVar.j().isEmpty();
        }
    }

    /* renamed from: BJ.A$d */
    public static final class d extends C15465A {

        /* renamed from: b  reason: collision with root package name */
        public static final d f133301b = new d();

        private d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return zVar.j().size() == 1;
        }
    }

    public /* synthetic */ C15465A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String b(C15579z zVar) {
        return C15471f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f133297a;
    }

    private C15465A(String str) {
        this.f133297a = str;
    }
}
