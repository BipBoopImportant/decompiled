package f1;

import HJ.C15835a;
import U0.C4910x;
import U0.I0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Lf1/h;", "a", "(Ljava/util/Map;LnI/l;)Lf1/h;", "", "c", "(Ljava/lang/CharSequence;)Z", "LU0/I0;", "LU0/I0;", "d", "()LU0/I0;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.j  reason: case insensitive filesystem */
public final class C5308j {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5306h> f23288a = C4910x.f(a.f23289c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf1/h;", "b", "()Lf1/h;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.j$a */
    static final class a extends C17544u implements C17631a<C5306h> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23289c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5306h invoke() {
            return null;
        }
    }

    public static final C5306h a(Map<String, ? extends List<? extends Object>> map, C17642l<Object, Boolean> lVar) {
        return new C5307i(map, lVar);
    }

    /* access modifiers changed from: private */
    public static final boolean c(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C15835a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final I0<C5306h> d() {
        return f23288a;
    }
}
