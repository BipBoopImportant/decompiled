package BJ;

import BJ.C15471f;
import DI.C15579z;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: BJ.k  reason: case insensitive filesystem */
public abstract class C15476k implements C15471f {

    /* renamed from: a  reason: collision with root package name */
    private final String f133324a;

    /* renamed from: BJ.k$a */
    public static final class a extends C15476k {

        /* renamed from: b  reason: collision with root package name */
        public static final a f133325b = new a();

        private a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return zVar.L() != null;
        }
    }

    /* renamed from: BJ.k$b */
    public static final class b extends C15476k {

        /* renamed from: b  reason: collision with root package name */
        public static final b f133326b = new b();

        private b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        public boolean a(C15579z zVar) {
            C17542s.j(zVar, "functionDescriptor");
            return (zVar.L() == null && zVar.O() == null) ? false : true;
        }
    }

    public /* synthetic */ C15476k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String b(C15579z zVar) {
        return C15471f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f133324a;
    }

    private C15476k(String str) {
        this.f133324a = str;
    }
}
