package lJ;

import DI.C15557d;
import DI.C15558e;
import DI.h0;
import GI.C15717K;
import PI.C16201k;
import YH.C16877v;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;

/* renamed from: lJ.f  reason: case insensitive filesystem */
public interface C17559f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144409a = a.f144410a;

    /* renamed from: lJ.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f144410a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C17554a f144411b = new C17554a(C16877v.n());

        private a() {
        }

        public final C17554a a() {
            return f144411b;
        }
    }

    List<C17069f> a(C15558e eVar, C16201k kVar);

    void b(C15558e eVar, C17069f fVar, Collection<h0> collection, C16201k kVar);

    void c(C15558e eVar, C17069f fVar, Collection<h0> collection, C16201k kVar);

    List<C17069f> d(C15558e eVar, C16201k kVar);

    C15717K e(C15558e eVar, C15717K k10, C16201k kVar);

    void f(C15558e eVar, List<C15557d> list, C16201k kVar);

    List<C17069f> g(C15558e eVar, C16201k kVar);

    void h(C15558e eVar, C17069f fVar, List<C15558e> list, C16201k kVar);
}
