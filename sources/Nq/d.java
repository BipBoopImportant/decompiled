package Nq;

import HJ.C15854t;
import Oq.b;
import Oq.c;
import Qq.g;
import Qq.s;
import XH.t;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"LNq/d;", "LNq/c;", "<init>", "()V", "", "id", "title", "LOq/b;", "rewardStatus", "LOq/a;", "rewardCategory", "", "pointsNeeded", "LNq/a;", "content", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "remote", "LQq/g;", "e", "(Ljava/lang/String;Ljava/lang/String;LOq/b;LOq/a;ILNq/a;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;)LQq/g;", "description", "category", "Lcom/ingka/ikea/core/model/Image;", "image", "LQq/s;", "terms", "LQq/e;", "expiryDate", "LQq/g$b;", "f", "(LNq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;LQq/s;ILQq/e;)LQq/g$b;", "d", "(LNq/a;)LQq/s;", "c", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;)LQq/e;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;)LNq/a;", "a", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;)LQq/g;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f84251a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f84252b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                Oq.b[] r0 = Oq.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Oq.b r2 = Oq.b.ASSIGNED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Oq.b r3 = Oq.b.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Oq.b r4 = Oq.b.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                Oq.b r5 = Oq.b.CLAIMED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f84251a = r0
                Oq.c[] r0 = Oq.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Oq.c r5 = Oq.c.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                Oq.c r1 = Oq.c.ONLINE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                Oq.c r1 = Oq.c.IN_STORE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                Oq.c r1 = Oq.c.MULTI     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f84252b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Nq.d.a.<clinit>():void");
        }
    }

    private final a b(ContentRemote contentRemote) {
        String i10;
        String j10 = contentRemote.j();
        Image image = null;
        if (j10 == null || j10.length() == 0 || (i10 = contentRemote.i()) == null || i10.length() == 0) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, true)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Illegal Reward: " + contentRemote, (Throwable) null);
                    if (a10 == null) {
                        return null;
                    }
                    str = C11820c.a(a10);
                } else {
                    ContentRemote contentRemote2 = contentRemote;
                }
                if (str2 == null) {
                    String name = ContentRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, true, (Throwable) null, str);
            }
            return null;
        }
        c a11 = c.Companion.a(contentRemote.g());
        String f10 = contentRemote.f();
        String str3 = f10 == null ? "" : f10;
        String b10 = contentRemote.b();
        String str4 = b10 == null ? "" : b10;
        String d10 = contentRemote.d();
        String str5 = d10 == null ? "" : d10;
        String c10 = contentRemote.c();
        String str6 = c10 == null ? "" : c10;
        String e10 = contentRemote.e();
        String str7 = e10 == null ? "" : e10;
        String j11 = contentRemote.j();
        String i11 = contentRemote.i();
        String h10 = contentRemote.h();
        String str8 = h10 == null ? "" : h10;
        String a12 = contentRemote.a();
        if (a12 != null) {
            image = new Image(a12, "");
        }
        return new a(a11, str3, str4, str5, str6, str7, j11, i11, str8, image);
    }

    private final Qq.e c(RewardRemote rewardRemote) {
        String d10 = rewardRemote.d();
        String str = "";
        if (d10 == null) {
            d10 = str;
        }
        String a10 = rewardRemote.a();
        if (a10 != null) {
            str = a10;
        }
        return new Qq.e(d10, str);
    }

    private final s d(a aVar) {
        return new s(aVar.j(), aVar.i(), aVar.h());
    }

    private final g e(String str, String str2, b bVar, Oq.a aVar, int i10, a aVar2, RewardRemote rewardRemote) {
        String f10 = aVar2.f();
        s d10 = d(aVar2);
        String j10 = aVar.j();
        Image a10 = aVar2.a();
        if (a10 == null) {
            a10 = new Image("", "");
        }
        Image image = a10;
        int i11 = a.f84251a[bVar.ordinal()];
        if (i11 == 1) {
            IllegalStateException illegalStateException = new IllegalStateException("invalid status: '" + bVar + "'");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList) {
                if (str3 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name = d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar2.a(eVar, str4, false, illegalStateException, str3);
            }
            return null;
        } else if (i11 == 2) {
            RewardRemote rewardRemote2 = rewardRemote;
            Integer g10 = rewardRemote.g();
            int intValue = g10 != null ? g10.intValue() : 0;
            String e10 = rewardRemote.e();
            return new g.c(str, str2, f10, j10, image, i10, d10, intValue, e10 == null ? "" : e10);
        } else if (i11 == 3) {
            RewardRemote rewardRemote3 = rewardRemote;
            String f11 = rewardRemote.f();
            return new g.a(str, str2, f10, j10, image, i10, d10, f11 == null ? "" : f11);
        } else if (i11 == 4) {
            return f(aVar2, str, str2, f10, j10, image, d10, i10, c(rewardRemote));
        } else {
            throw new t();
        }
    }

    private final g.b f(a aVar, String str, String str2, String str3, String str4, Image image, s sVar, int i10, Qq.e eVar) {
        String e10 = aVar.e();
        String b10 = aVar.b();
        String d10 = aVar.d();
        String c10 = aVar.c();
        int i11 = a.f84252b[aVar.g().ordinal()];
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            return new g.b.c(str, str2, str3, str4, image, i10, sVar, eVar, e10);
        }
        if (i11 == 3) {
            return new g.b.a(str, str2, str3, str4, image, i10, sVar, eVar, b10, d10, c10);
        }
        if (i11 == 4) {
            return new g.b.C1770b(str, str2, str3, str4, image, i10, sVar, eVar, e10, b10, d10, c10);
        }
        throw new t();
    }

    public g a(RewardRemote rewardRemote) {
        String k10;
        b a10;
        Oq.a a11;
        Integer b10;
        a b11;
        C17542s.j(rewardRemote, "remote");
        String i10 = rewardRemote.i();
        if (!(i10 == null || (k10 = rewardRemote.k()) == null || (a10 = b.Companion.a(rewardRemote.j())) == null || (a11 = Oq.a.Companion.a(rewardRemote.c())) == null || (b10 = rewardRemote.b()) == null)) {
            int intValue = b10.intValue();
            ContentRemote h10 = rewardRemote.h();
            if (!(h10 == null || (b11 = b(h10)) == null)) {
                return e(i10, k10, a10, a11, intValue, b11, rewardRemote);
            }
        }
        return null;
    }
}
