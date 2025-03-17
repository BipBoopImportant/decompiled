package xo;

import HJ.C15850p;
import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import am.h;
import com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyRegex;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qg.C10192b;
import qg.C10193c;
import qg.C10195e;
import qg.i;
import qg.k;
import qg.l;
import qg.m;
import qg.o;
import qg.q;
import qg.t;
import qg.u;
import qg.v;
import qg.w;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tI.C17978n;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00062\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J]\u0010\u001f\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0016H\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006%"}, d2 = {"Lxo/e;", "", "<init>", "()V", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lqg/i;", "cachedField", "", "allowOverride", "", "", "attributesCache", "defaultCountryCode", "Lkotlin/Function1;", "LXH/N;", "onChanged", "c", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;Lqg/i;ZLjava/util/Map;Ljava/lang/String;LnI/l;)Lqg/i;", "b", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;Ljava/lang/String;LnI/l;)Lqg/i;", "model", "", "all", "a", "(Lqg/i;Ljava/util/List;)Z", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "Lxo/b;", "cache", "overrideCurrentValues", "onFieldsChanged", "d", "(Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;Lxo/b;Ljava/util/Map;ZLjava/lang/String;LnI/l;)Lxo/b;", "e", "(Ljava/util/List;)Z", "Lxo/b;", "EMPTY_FIELDS", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.e  reason: case insensitive filesystem */
public final class C12325e {

    /* renamed from: a  reason: collision with root package name */
    public static final C12325e f106111a = new C12325e();

    /* renamed from: b  reason: collision with root package name */
    private static final C12322b f106112b = new C12322b(C16877v.n(), C16877v.n(), C16877v.n(), C16877v.n());

    /* renamed from: c  reason: collision with root package name */
    public static final int f106113c = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xo.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106114a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.dynamicfields.datalayer.c[] r0 = com.ingka.ikea.dynamicfields.datalayer.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.PICKER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.DATE_PICKER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.STORE_PICKER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.ADDRESS_PICKER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.LABEL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TEXT_BOX     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.BODY_2     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.DISCLAIMER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f106114a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.C12325e.a.<clinit>():void");
        }
    }

    private C12325e() {
    }

    private final boolean a(i<?> iVar, List<? extends i<?>> list) {
        Object obj;
        String str;
        Iterator it = iVar.k().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            boolean z11 = true;
            for (KeyRegex keyRegex : ((Conditions) it.next()).b()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (C17542s.e(((i) obj).e(), keyRegex.a())) {
                        break;
                    }
                }
                i iVar2 = (i) obj;
                Object j10 = iVar2 != null ? iVar2.j() : null;
                boolean i10 = j10 != null ? new C15850p(keyRegex.b()).i(j10.toString()) : false;
                z11 = z11 && i10;
                e eVar = e.VERBOSE;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    Iterator it3 = it;
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                    it = it3;
                }
                Iterator it4 = it;
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a("Check condition. Field: " + iVar.e() + ", other value: " + j10 + ", ruleVisible: " + i10, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    } else {
                        str = str3;
                    }
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "calculateVisibility";
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    str3 = str;
                }
                it = it4;
            }
            Iterator it5 = it;
            z10 = z10 || z11;
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str4 == null) {
                    String a11 = C11818a.a("Check visibility. Field: " + iVar.e() + ", conditionFulfilled: " + z11, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "calculateVisibility";
                }
                bVar2.a(eVar2, str5, false, (Throwable) null, str4);
            }
            it = it5;
        }
        return z10;
    }

    private final i<? extends Object> b(FieldAttributes fieldAttributes, String str, C17642l<Object, C16807N> lVar) {
        switch (a.f106114a[fieldAttributes.m().ordinal()]) {
            case 1:
                return l.f76136r.a(fieldAttributes, lVar);
            case 2:
                return q.f76166s.a(fieldAttributes, lVar);
            case 3:
                return v.f76206v.a(fieldAttributes, lVar);
            case 4:
                return k.f76125s.a(fieldAttributes, lVar);
            case 5:
                return C10195e.a.b(C10195e.f76095u, fieldAttributes, (h) null, lVar, 2, (Object) null);
            case 6:
                return u.f76195s.a(fieldAttributes, lVar);
            case 7:
                return C10192b.f76065w.a(str, fieldAttributes, lVar);
            case 8:
                return m.f76146p.a(fieldAttributes);
            case 9:
                return t.f76183t.a(fieldAttributes);
            case 10:
                return w.f76220t.a(fieldAttributes, lVar);
            case 11:
                return C10193c.f76085r.a(fieldAttributes);
            case 12:
                return o.f76155s.a(fieldAttributes);
            case 13:
                return v.f76206v.a(fieldAttributes, lVar);
            default:
                throw new XH.t();
        }
    }

    private final i<?> c(FieldAttributes fieldAttributes, i<?> iVar, boolean z10, Map<String, FieldAttributes> map, String str, C17642l<Object, C16807N> lVar) {
        if (iVar != null && C17542s.e(map.get(iVar.e()), fieldAttributes)) {
            if (!z10) {
                return iVar;
            }
            FieldAttributes fieldAttributes2 = map.get(iVar.e());
            if (C17542s.e(fieldAttributes2 != null ? fieldAttributes2.g() : null, iVar.j())) {
                return iVar;
            }
        }
        return b(fieldAttributes, str, lVar);
    }

    public final C12322b d(ShippingBillingDynamicModel shippingBillingDynamicModel, C12322b bVar, Map<String, FieldAttributes> map, boolean z10, String str, C17642l<Object, C16807N> lVar) {
        boolean z11;
        List<i<?>> list;
        List<i<?>> list2;
        List<i<?>> list3;
        List<i<?>> n10;
        List<FieldAttributes> n11;
        List n12;
        char c10;
        char c11;
        Iterator it;
        Class<C12325e> cls;
        List<FieldAttributes> c12;
        ShippingBillingDynamicModel shippingBillingDynamicModel2 = shippingBillingDynamicModel;
        Map<String, FieldAttributes> map2 = map;
        boolean z12 = z10;
        C17542s.j(map2, "attributesCache");
        C17542s.j(str, "defaultCountryCode");
        boolean z13 = z12 && shippingBillingDynamicModel2 != null && shippingBillingDynamicModel.b();
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        Iterator it2 = d.f102012a.a().iterator();
        while (true) {
            z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar2 : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("prepareFields, overrideCurrentValues: " + z12, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "prepareFields";
            }
            String str5 = str3;
            bVar2.a(eVar, str5, z11, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
            eVar = eVar;
            z11 = z11;
        }
        String str6 = null;
        if (shippingBillingDynamicModel2 == null) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            for (C11819b bVar3 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("Fields are null or empty", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "prepareFields";
                }
                bVar3.a(eVar2, str7, false, (Throwable) null, str6);
            }
            return f106112b;
        }
        if (bVar == null || (list = bVar.d()) == null) {
            list = C16877v.n();
        }
        if (bVar == null || (list2 = bVar.e()) == null) {
            list2 = C16877v.n();
        }
        if (bVar == null || (list3 = bVar.c()) == null) {
            list3 = C16877v.n();
        }
        if (bVar == null || (n10 = bVar.f()) == null) {
            n10 = C16877v.n();
        }
        Iterable A10 = C16877v.A(C16877v.q(list, list2, list3, n10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(A10, 10)), 16));
        for (Object next3 : A10) {
            linkedHashMap.put(((i) next3).e(), next3);
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(shippingBillingDynamicModel.c().c());
        DynamicFields$Configuration d10 = shippingBillingDynamicModel.d();
        if (d10 == null || (n11 = d10.c()) == null) {
            n11 = C16877v.n();
        }
        arrayList3.addAll(n11);
        arrayList3.addAll(shippingBillingDynamicModel.a().c());
        arrayList3.addAll(shippingBillingDynamicModel.e().c());
        Iterable<FieldAttributes> c13 = shippingBillingDynamicModel.c().c();
        ArrayList arrayList4 = new ArrayList(C16877v.y(c13, 10));
        for (FieldAttributes fieldAttributes : c13) {
            ArrayList arrayList5 = arrayList4;
            arrayList5.add(f106111a.c(fieldAttributes, (i) linkedHashMap.get(fieldAttributes.h()), z13, map, str, lVar));
            linkedHashMap = linkedHashMap;
            arrayList4 = arrayList5;
            arrayList3 = arrayList3;
        }
        ArrayList arrayList6 = arrayList4;
        ArrayList arrayList7 = arrayList3;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        DynamicFields$Configuration d11 = shippingBillingDynamicModel.d();
        if (d11 == null || (c12 = d11.c()) == null) {
            n12 = C16877v.n();
        } else {
            Iterable<FieldAttributes> iterable = c12;
            n12 = new ArrayList(C16877v.y(iterable, 10));
            for (FieldAttributes fieldAttributes2 : iterable) {
                List list4 = n12;
                list4.add(f106111a.c(fieldAttributes2, (i) linkedHashMap2.get(fieldAttributes2.h()), z13, map, str, lVar));
                n12 = list4;
            }
        }
        List list5 = n12;
        Iterable<FieldAttributes> c14 = shippingBillingDynamicModel.a().c();
        ArrayList arrayList8 = new ArrayList(C16877v.y(c14, 10));
        for (FieldAttributes fieldAttributes3 : c14) {
            ArrayList arrayList9 = arrayList8;
            arrayList9.add(f106111a.c(fieldAttributes3, (i) linkedHashMap2.get(fieldAttributes3.h()), z13, map, str, lVar));
            arrayList8 = arrayList9;
            String str8 = str;
        }
        ArrayList arrayList10 = arrayList8;
        Iterable<FieldAttributes> c15 = shippingBillingDynamicModel.e().c();
        ArrayList arrayList11 = new ArrayList(C16877v.y(c15, 10));
        for (FieldAttributes fieldAttributes4 : c15) {
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            ArrayList arrayList12 = arrayList11;
            arrayList12.add(f106111a.c(fieldAttributes4, (i) linkedHashMap2.get(fieldAttributes4.h()), z13, map, str, lVar));
            arrayList11 = arrayList12;
            linkedHashMap2 = linkedHashMap3;
        }
        ArrayList arrayList13 = arrayList11;
        Class<C12325e> cls2 = C12325e.class;
        if (arrayList6.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("No shipping fields found, is this really a correct config?: " + shippingBillingDynamicModel2);
            e eVar3 = e.ERROR;
            ArrayList arrayList14 = new ArrayList();
            for (Object next4 : d.f102012a.a()) {
                if (((C11819b) next4).b(eVar3, false)) {
                    arrayList14.add(next4);
                }
            }
            Iterator it3 = arrayList14.iterator();
            String str9 = null;
            String str10 = null;
            while (it3.hasNext()) {
                C11819b bVar4 = (C11819b) it3.next();
                if (str9 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 == null) {
                        break;
                    }
                    str9 = C11820c.a(a12);
                }
                if (str10 == null) {
                    String name = cls2.getName();
                    C17542s.g(name);
                    it = it3;
                    cls = cls2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    it = it3;
                    cls = cls2;
                }
                bVar4.a(eVar3, str10, false, illegalStateException, str9);
                it3 = it;
                cls2 = cls;
            }
        }
        Class<C12325e> cls3 = cls2;
        map.clear();
        ArrayList arrayList15 = arrayList7;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList15, 10)), 16));
        for (Object next5 : arrayList15) {
            linkedHashMap4.put(((FieldAttributes) next5).h(), next5);
        }
        map2.putAll(linkedHashMap4);
        e(C16877v.A(C16877v.q(arrayList6, list5, arrayList10, arrayList13)));
        C12322b bVar5 = new C12322b(arrayList6, list5, arrayList10, arrayList13);
        e eVar4 = e.DEBUG;
        ArrayList<C11819b> arrayList16 = new ArrayList<>();
        for (Object next6 : d.f102012a.a()) {
            if (((C11819b) next6).b(eVar4, false)) {
                arrayList16.add(next6);
            }
        }
        String str11 = null;
        String str12 = null;
        for (C11819b bVar6 : arrayList16) {
            if (str12 == null) {
                String a13 = C11818a.a("prepareFields, return list: " + bVar5, (Throwable) null);
                if (a13 == null) {
                    break;
                }
                str12 = C11820c.a(a13);
            }
            String str13 = str12;
            if (str11 == null) {
                String name2 = cls3.getName();
                C17542s.g(name2);
                c11 = '$';
                c10 = '.';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = '.';
                c11 = '$';
            }
            String str14 = str11;
            char c16 = c10;
            char c17 = c11;
            bVar6.a(eVar4, str14, false, (Throwable) null, str13);
            str12 = str13;
            str11 = str14;
        }
        return bVar5;
    }

    public final boolean e(List<? extends i<?>> list) {
        C17542s.j(list, "all");
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                i iVar = (i) it.next();
                boolean p10 = iVar.p();
                if (iVar.k().isEmpty()) {
                    iVar.s(true);
                } else {
                    iVar.s(f106111a.a(iVar, list));
                }
                if (!z10) {
                    if (p10 != iVar.p()) {
                        z10 = true;
                    }
                }
            }
        }
    }
}
