package nJ;

import DI.a0;
import DI.h0;
import LI.C16015b;
import YH.g0;
import cJ.C17069f;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: nJ.k  reason: case insensitive filesystem */
public interface C17656k extends C17659n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144861a = a.f144862a;

    /* renamed from: nJ.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144862a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C17642l<C17069f, Boolean> f144863b = C17655j.f144860a;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean a(C17069f fVar) {
            C17542s.j(fVar, "it");
            return true;
        }

        public final C17642l<C17069f, Boolean> c() {
            return f144863b;
        }
    }

    /* renamed from: nJ.k$b */
    public static final class b extends C17657l {

        /* renamed from: b  reason: collision with root package name */
        public static final b f144864b = new b();

        private b() {
        }

        public Set<C17069f> a() {
            return g0.d();
        }

        public Set<C17069f> c() {
            return g0.d();
        }

        public Set<C17069f> f() {
            return g0.d();
        }
    }

    Set<C17069f> a();

    Collection<? extends a0> b(C17069f fVar, C16015b bVar);

    Set<C17069f> c();

    Collection<? extends h0> d(C17069f fVar, C16015b bVar);

    Set<C17069f> f();
}
