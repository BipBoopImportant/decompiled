package Yh;

import HJ.C15854t;
import Oo.b;
import XH.C16807N;
import YH.C16877v;
import Zh.a;
import android.content.Context;
import com.ingka.ikea.core.model.product.CareInstruction;
import com.ingka.ikea.core.model.product.CustomerCare;
import com.ingka.ikea.core.model.product.CustomerEnvironment;
import com.ingka.ikea.core.model.product.CustomerMaterial;
import com.ingka.ikea.core.model.product.MaterialInformation;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0010\u001a\u00020\b*\u0004\u0018\u00010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\r*\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LYh/e;", "LYh/m;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "product", "Landroid/content/Context;", "context", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Landroid/content/Context;)V", "LXH/N;", "D", "()V", "B", "z", "", "Lkotlin/Function1;", "block", "E", "(Ljava/lang/String;LnI/l;)V", "additionalString", "C", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "k", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "l", "Landroid/content/Context;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends m {

    /* renamed from: k  reason: collision with root package name */
    private final ProductLarge f65003k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f65004l;

    public e(ProductLarge productLarge, Context context) {
        C17542s.j(productLarge, "product");
        C17542s.j(context, "context");
        this.f65003k = productLarge;
        this.f65004l = context;
        D();
        B();
        z();
    }

    /* access modifiers changed from: private */
    public static final C16807N A(List list, e eVar, String str) {
        C17542s.j(str, "it");
        list.add(new a(eVar.C(str, ":"), f.TEXT, eVar.v(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
        return C16807N.f139792a;
    }

    private final void B() {
        List<CustomerEnvironment> f10;
        MoreInfo m10 = this.f65003k.m();
        if (m10 != null && (f10 = m10.f()) != null) {
            ArrayList arrayList = new ArrayList();
            for (CustomerEnvironment customerEnvironment : f10) {
                int size = customerEnvironment.b().size() - 1;
                int i10 = 0;
                for (Object next : customerEnvironment.b()) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C16877v.x();
                    }
                    arrayList.add(new a((String) next, f.TEXT, i10 != size ? u() : 0, (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                    i10 = i11;
                }
            }
            if (!arrayList.isEmpty()) {
                if (!t().isEmpty()) {
                    t().add(a.f65265h.a());
                }
                List<a> t10 = t();
                String string = this.f65004l.getString(b.f84320A2);
                C17542s.i(string, "getString(...)");
                t10.add(new a(string, f.TITLE, u(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                t().addAll(arrayList);
            }
        }
    }

    private final String C(String str, String str2) {
        if (C15854t.G(str, str2, false, 2, (Object) null)) {
            return str;
        }
        return str + str2;
    }

    private final void D() {
        List<CustomerMaterial> g10;
        MoreInfo m10 = this.f65003k.m();
        if (m10 != null && (g10 = m10.g()) != null) {
            ArrayList arrayList = new ArrayList();
            int size = g10.size() - 1;
            int i10 = 0;
            for (Object next : g10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                CustomerMaterial customerMaterial = (CustomerMaterial) next;
                String c10 = customerMaterial.c();
                if (!(c10 == null || c10.length() == 0)) {
                    a aVar = r8;
                    a aVar2 = new a(c10, f.TITLE, v(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null);
                    arrayList.add(aVar);
                }
                List<MaterialInformation> b10 = customerMaterial.b();
                int size2 = b10.size() - 1;
                int i12 = 0;
                for (Object next2 : b10) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    MaterialInformation materialInformation = (MaterialInformation) next2;
                    String b11 = materialInformation.b();
                    if (b11 != null && b11.length() > 0) {
                        arrayList.add(new a(C(b11, ":"), f.TEXT, 0, (String) null, (String) null, (C17631a) null, 60, (DefaultConstructorMarker) null));
                    }
                    arrayList.add(new a(materialInformation.a(), f.SUB_TEXT, (i10 == size && i12 == size2) ? 0 : u(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                    i12 = i13;
                }
                i10 = i11;
            }
            if (!arrayList.isEmpty()) {
                List<a> t10 = t();
                String string = this.f65004l.getString(b.f84362E4);
                C17542s.i(string, "getString(...)");
                t10.add(new a(string, f.TITLE, u(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                t().addAll(arrayList);
            }
        }
    }

    private final void E(String str, C17642l<? super String, C16807N> lVar) {
        if (str != null && str.length() > 0) {
            lVar.invoke(str);
        }
    }

    private final void z() {
        List<CustomerCare> e10;
        MoreInfo m10 = this.f65003k.m();
        if (m10 != null && (e10 = m10.e()) != null) {
            ArrayList arrayList = new ArrayList();
            for (CustomerCare customerCare : e10) {
                E(customerCare.c(), new d(arrayList, this));
                for (CareInstruction a10 : customerCare.b()) {
                    arrayList.add(new a(a10.a(), f.TEXT, v(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                }
            }
            if (!arrayList.isEmpty()) {
                if (!t().isEmpty()) {
                    t().add(a.f65265h.a());
                }
                List<a> t10 = t();
                String string = this.f65004l.getString(b.f84558Y0);
                C17542s.i(string, "getString(...)");
                t10.add(new a(string, f.TITLE, u(), (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
                t().addAll(arrayList);
            }
        }
    }
}
