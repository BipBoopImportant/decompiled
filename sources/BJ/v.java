package BJ;

import AI.C15429j;
import BJ.C15471f;
import DI.C15579z;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import uJ.C18096U;
import uJ.C18113f0;

public abstract class v implements C15471f {

    /* renamed from: a  reason: collision with root package name */
    private final String f133402a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C15429j, C18096U> f133403b;

    /* renamed from: c  reason: collision with root package name */
    private final String f133404c;

    public static final class a extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final a f133405d = new a();

        private a() {
            super("Boolean", u.f133401a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final C18096U c(C15429j jVar) {
            C17542s.j(jVar, "<this>");
            C18113f0 o10 = jVar.o();
            C17542s.i(o10, "getBooleanType(...)");
            return o10;
        }
    }

    public static final class b extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final b f133406d = new b();

        private b() {
            super("Int", w.f133408a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final C18096U c(C15429j jVar) {
            C17542s.j(jVar, "<this>");
            C18113f0 E10 = jVar.E();
            C17542s.i(E10, "getIntType(...)");
            return E10;
        }
    }

    public static final class c extends v {

        /* renamed from: d  reason: collision with root package name */
        public static final c f133407d = new c();

        private c() {
            super("Unit", x.f133409a, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final C18096U c(C15429j jVar) {
            C17542s.j(jVar, "<this>");
            C18113f0 a02 = jVar.a0();
            C17542s.i(a02, "getUnitType(...)");
            return a02;
        }
    }

    public /* synthetic */ v(String str, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    public boolean a(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        return C17542s.e(zVar.getReturnType(), this.f133403b.invoke(C17506e.m(zVar)));
    }

    public String b(C15579z zVar) {
        return C15471f.a.a(this, zVar);
    }

    public String getDescription() {
        return this.f133404c;
    }

    private v(String str, C17642l<? super C15429j, ? extends C18096U> lVar) {
        this.f133402a = str;
        this.f133403b = lVar;
        this.f133404c = "must return " + str;
    }
}
