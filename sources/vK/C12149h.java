package vk;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.h  reason: case insensitive filesystem */
public final class C12149h {

    /* renamed from: a  reason: collision with root package name */
    public static final C12149h f104791a = new C12149h();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104792b = c.c(-2017519910, false, a.f104794a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104793c = c.c(-1227151981, false, b.f104795a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.h$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104794a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2017519910, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ComposableSingletons$DeleteListContentKt.lambda-1.<anonymous> (DeleteListContent.kt:30)");
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.h$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104795a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1227151981, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ComposableSingletons$DeleteListContentKt.lambda-2.<anonymous> (DeleteListContent.kt:44)");
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f104792b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f104793c;
    }
}
