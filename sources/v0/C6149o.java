package v0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import v0.C6138d;
import v0.C6149o.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lv0/o;", "Lv0/o$a;", "Interval", "", "<init>", "()V", "", "index", "p", "(I)Ljava/lang/Object;", "m", "Lv0/d;", "n", "()Lv0/d;", "intervals", "o", "()I", "itemCount", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.o  reason: case insensitive filesystem */
public abstract class C6149o<Interval extends a> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lv0/o$a;", "", "Lkotlin/Function1;", "", "getKey", "()LnI/l;", "key", "getType", "type", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.o$a */
    public interface a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv0/o$a;", "Interval", "", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v0.o$a$a  reason: collision with other inner class name */
        static final class C0477a extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final C0477a f30914c = new C0477a();

            C0477a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        C17642l<Integer, Object> getKey() {
            return null;
        }

        C17642l<Integer, Object> getType() {
            return C0477a.f30914c;
        }
    }

    public final Object m(int i10) {
        C6138d.a aVar = n().get(i10);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract C6138d<Interval> n();

    public final int o() {
        return n().a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r0 = r0.invoke(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(int r3) {
        /*
            r2 = this;
            v0.d r0 = r2.n()
            v0.d$a r0 = r0.get(r3)
            int r1 = r0.b()
            int r1 = r3 - r1
            java.lang.Object r0 = r0.c()
            v0.o$a r0 = (v0.C6149o.a) r0
            nI.l r0 = r0.getKey()
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            if (r0 != 0) goto L_0x0028
        L_0x0024:
            java.lang.Object r0 = v0.C6134H.a(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C6149o.p(int):java.lang.Object");
    }
}
