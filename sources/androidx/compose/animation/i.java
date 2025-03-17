package androidx.compose.animation;

import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C5505A;
import l0.g;
import l0.m;
import l0.t;
import l0.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/i;", "", "<init>", "()V", "enter", "c", "(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ll0/A;", "b", "()Ll0/A;", "data", "a", "Landroidx/compose/animation/j;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17449a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final i f17450b = new j(new C5505A((m) null, (w) null, (g) null, (t) null, false, (Map) null, 63, (DefaultConstructorMarker) null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/i$a;", "", "<init>", "()V", "Landroidx/compose/animation/i;", "None", "Landroidx/compose/animation/i;", "a", "()Landroidx/compose/animation/i;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f17450b;
        }

        private a() {
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C5505A b();

    public final i c(i iVar) {
        m c10 = iVar.b().c();
        if (c10 == null) {
            c10 = b().c();
        }
        m mVar = c10;
        w f10 = iVar.b().f();
        if (f10 == null) {
            f10 = b().f();
        }
        w wVar = f10;
        g a10 = iVar.b().a();
        if (a10 == null) {
            a10 = b().a();
        }
        g gVar = a10;
        t e10 = iVar.b().e();
        if (e10 == null) {
            e10 = b().e();
        }
        return new j(new C5505A(mVar, wVar, gVar, e10, false, X.s(b().b(), iVar.b().b()), 16, (DefaultConstructorMarker) null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && C17542s.e(((i) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (C17542s.e(this, f17450b)) {
            return "EnterTransition.None";
        }
        C5505A b10 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        m c10 = b10.c();
        String str = null;
        sb2.append(c10 != null ? c10.toString() : null);
        sb2.append(",\nSlide - ");
        w f10 = b10.f();
        sb2.append(f10 != null ? f10.toString() : null);
        sb2.append(",\nShrink - ");
        g a10 = b10.a();
        sb2.append(a10 != null ? a10.toString() : null);
        sb2.append(",\nScale - ");
        t e10 = b10.e();
        if (e10 != null) {
            str = e10.toString();
        }
        sb2.append(str);
        return sb2.toString();
    }

    private i() {
    }
}
