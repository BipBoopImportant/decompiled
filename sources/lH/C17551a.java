package lH;

import androidx.lifecycle.f0;
import iH.C17356c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l3.a;
import l3.d;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"VMF", "Ll3/a;", "Lkotlin/Function1;", "Landroidx/lifecycle/f0;", "callback", "b", "(Ll3/a;LnI/l;)Ll3/a;", "Ll3/d;", "a", "(Ll3/d;LnI/l;)Ll3/a;", "java_dagger_hilt_android_lifecycle-hilt_view_model_extensions_internal_kt"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* renamed from: lH.a  reason: case insensitive filesystem */
public final class C17551a {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"VMF", "", "kotlin.jvm.PlatformType", "factory", "Landroidx/lifecycle/f0;", "a", "(Ljava/lang/Object;)Landroidx/lifecycle/f0;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: lH.a$a  reason: collision with other inner class name */
    static final class C3524a extends C17544u implements C17642l<Object, f0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<VMF, f0> f144403c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3524a(C17642l<? super VMF, ? extends f0> lVar) {
            super(1);
            this.f144403c = lVar;
        }

        /* renamed from: a */
        public final f0 invoke(Object obj) {
            return this.f144403c.invoke(obj);
        }
    }

    public static final <VMF> a a(d dVar, C17642l<? super VMF, ? extends f0> lVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(lVar, "callback");
        a.b<C17642l<Object, f0>> bVar = C17356c.f143487e;
        C17542s.i(bVar, "CREATION_CALLBACK_KEY");
        dVar.c(bVar, new C3524a(lVar));
        return dVar;
    }

    public static final <VMF> a b(a aVar, C17642l<? super VMF, ? extends f0> lVar) {
        C17542s.j(aVar, "<this>");
        C17542s.j(lVar, "callback");
        return a(new d(aVar), lVar);
    }
}
