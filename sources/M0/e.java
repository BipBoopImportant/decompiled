package M0;

import androidx.compose.ui.d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17540p;
import nI.C17642l;
import nI.p;
import z1.C6272b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aU\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "LM0/g;", "state", "", "enabled", "b", "(Landroidx/compose/ui/d;LM0/g;Z)Landroidx/compose/ui/d;", "Lkotlin/Function1;", "", "onPull", "Lkotlin/Function2;", "LdI/e;", "", "onRelease", "c", "(Landroidx/compose/ui/d;LnI/l;LnI/p;Z)Landroidx/compose/ui/d;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<Float, Float> {
        a(Object obj) {
            super(1, obj, g.class, "onPull", "onPull$material_release(F)F", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((Number) obj).floatValue());
        }

        public final Float t(float f10) {
            return Float.valueOf(((g) this.receiver).q(f10));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends C17525a implements p<Float, C17164e<? super Float>, Object> {
        b(Object obj) {
            super(2, obj, g.class, "onRelease", "onRelease$material_release(F)F", 4);
        }

        public final Object a(float f10, C17164e<? super Float> eVar) {
            return kotlin.coroutines.jvm.internal.b.d(((g) this.f144363a).r(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), (C17164e) obj2);
        }
    }

    public static final d b(d dVar, g gVar, boolean z10) {
        return c(dVar, new a(gVar), new b(gVar), z10);
    }

    public static final d c(d dVar, C17642l<? super Float, Float> lVar, p<? super Float, ? super C17164e<? super Float>, ? extends Object> pVar, boolean z10) {
        return androidx.compose.ui.input.nestedscroll.a.b(dVar, new f(lVar, pVar, z10), (C6272b) null, 2, (Object) null);
    }

    public static /* synthetic */ d d(d dVar, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(dVar, gVar, z10);
    }
}
