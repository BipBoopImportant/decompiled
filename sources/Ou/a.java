package Ou;

import Dw.e;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Pu.b;
import Pu.g;
import XH.C16796C;
import XH.v;
import XH.x;
import XH.y;
import com.ingka.ikea.core.model.product.ProductItem;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LOu/a;", "", "<init>", "()V", "LPu/b$a$b;", "state", "Lkp/d;", "currencyConfig", "LPu/g;", "a", "(LPu/b$a$b;Lkp/d;)LPu/g;", "instorepurchasestatus-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ou.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1724a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85391a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Dw.c[] r0 = Dw.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Dw.c r1 = Dw.c.PREPARING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Dw.c r1 = Dw.c.READY_FOR_PICKUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f85391a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ou.a.C1724a.<clinit>():void");
        }
    }

    public final g a(b.a.C1746b bVar, C11522d dVar) {
        Object obj;
        C13023e eVar;
        g.c.b bVar2;
        C11522d dVar2 = dVar;
        C17542s.j(bVar, "state");
        C17542s.j(dVar2, "currencyConfig");
        if (bVar.e() == null) {
            return new g.b(bVar.c());
        }
        int i10 = C1724a.f85391a[bVar.e().b().ordinal()];
        v a10 = i10 != 1 ? i10 != 2 ? C16796C.a(null, null) : C16796C.a(Integer.valueOf(Oo.b.f84545W7), Boolean.TRUE) : C16796C.a(Integer.valueOf(Oo.b.f84535V7), Boolean.FALSE);
        try {
            x.a aVar = x.f139812b;
            e.a a11 = bVar.e().a();
            if (a11 != null) {
                eVar = C13026h.c(a11.b() + " - " + a11.a());
            } else {
                eVar = null;
            }
            if (eVar != null) {
                Integer num = (Integer) a10.c();
                Boolean bool = (Boolean) a10.d();
                String c10 = bVar.c();
                if (num != null) {
                    bVar2 = new g.c.b(C13026h.a(num.intValue()), bool != null ? bool.booleanValue() : false);
                } else {
                    bVar2 = null;
                }
                String d10 = bVar.d();
                if (d10 != null) {
                    g.c.a aVar2 = new g.c.a(eVar);
                    Double d11 = bVar.e().d();
                    c a12 = d11 != null ? C14957b.a(d11.doubleValue(), dVar2) : null;
                    if (a12 != null) {
                        double d12 = 0.0d;
                        for (ProductItem productItem : bVar.e().c()) {
                            ProductItem.Price.PriceTag d13 = productItem.e().g().d();
                            d12 += d13 != null ? d13.c() : productItem.e().g().e().c();
                        }
                        obj = x.b(new g.c(c10, bVar2, d10, aVar2, (g.c.d) null, new g.c.C1750c(C14957b.a(d12, dVar2), a12, dVar2), 16, (DefaultConstructorMarker) null));
                        Throwable e10 = x.e(obj);
                        if (e10 == null) {
                            return (g.c) obj;
                        }
                        qv.e eVar2 = qv.e.ERROR;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : d.f102012a.a()) {
                            if (((C11819b) next).b(eVar2, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar3 : arrayList) {
                            if (str == null) {
                                String a13 = C11818a.a((String) null, e10);
                                if (a13 == null) {
                                    break;
                                }
                                str = C11820c.a(a13);
                            }
                            String str3 = str;
                            if (str2 == null) {
                                String name = a.class.getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str4 = str2;
                            bVar3.a(eVar2, str4, false, e10, str3);
                            str = str3;
                            str2 = str4;
                        }
                        return new g.a(bVar.c());
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            x.a aVar3 = x.f139812b;
            obj = x.b(y.a(th2));
        }
    }
}
