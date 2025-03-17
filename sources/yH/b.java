package Yh;

import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import android.content.Context;
import com.ingka.ikea.core.model.product.Attachment;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u0000  2\u00020\u0001:\u0002!\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"LYh/b;", "LYh/m;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "product", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/product/Attachment;", "LXH/N;", "onClick", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Landroid/content/Context;LnI/l;)V", "", "LYh/b$b;", "D", "()Ljava/util/List;", "sectionOfData", "z", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Ljava/util/List;)V", "", "string", "B", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "text", "C", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "k", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "l", "Landroid/content/Context;", "m", "LnI/l;", "n", "b", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends m {

    /* renamed from: n  reason: collision with root package name */
    public static final a f64993n = new a((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f64994o = 8;

    /* renamed from: k  reason: collision with root package name */
    private final ProductLarge f64995k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f64996l;

    /* renamed from: m  reason: collision with root package name */
    private final C17642l<Attachment, C16807N> f64997m;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"LYh/b$a;", "", "<init>", "()V", "", "WIDTH", "Ljava/lang/String;", "HEIGHT", "LENGTH", "WEIGHT", "WEIGHT_GROSS", "DIAMETER", "VOLUME", "ASSEMBLY_INSTRUCTION", "CUSTOMER_DISASSEMBLY_INSTRUCTIONS", "MANUAL", "FOOD_DECLARATION", "GUARANTEE", "SAFETY_DATA_SHEET", "SOFTWARE", "TECHNICAL_INFORMATION", "WOOD_DECLARATION", "OTHER_DOCUMENTS", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LYh/b$b;", "", "Lcom/ingka/ikea/core/model/product/Attachment;", "attachment", "", "LZh/a;", "models", "<init>", "(Lcom/ingka/ikea/core/model/product/Attachment;Ljava/util/List;)V", "other", "", "a", "(LYh/b$b;)I", "Lcom/ingka/ikea/core/model/product/Attachment;", "b", "Ljava/util/List;", "()Ljava/util/List;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yh.b$b  reason: collision with other inner class name */
    private static final class C1137b implements Comparable<C1137b> {

        /* renamed from: a  reason: collision with root package name */
        private final Attachment f64998a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Zh.a> f64999b;

        public C1137b(Attachment attachment, List<Zh.a> list) {
            C17542s.j(attachment, "attachment");
            C17542s.j(list, "models");
            this.f64998a = attachment;
            this.f64999b = list;
        }

        /* renamed from: a */
        public int compareTo(C1137b bVar) {
            C17542s.j(bVar, "other");
            return this.f64998a.compareTo(bVar.f64998a);
        }

        public final List<Zh.a> b() {
            return this.f64999b;
        }
    }

    public b(ProductLarge productLarge, Context context, C17642l<? super Attachment, C16807N> lVar) {
        C17542s.j(productLarge, "product");
        C17542s.j(context, "context");
        C17542s.j(lVar, "onClick");
        this.f64995k = productLarge;
        this.f64996l = context;
        this.f64997m = lVar;
        List<C1137b> D10 = D();
        C16877v.B(D10);
        for (C1137b bVar : D10) {
            if (!t().isEmpty()) {
                t().add(Zh.a.f65265h.a());
            }
            t().addAll(bVar.b());
        }
        String c10 = this.f64995k.m().c();
        if (c10 != null) {
            t().add(Zh.a.f65265h.a());
            t().add(new Zh.a(c10, f.DISCLAIMER, 0, (String) null, (String) null, (C17631a) null, 60, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(b bVar, Attachment attachment) {
        bVar.f64997m.invoke(attachment);
        return C16807N.f139792a;
    }

    private final String B(String str, String str2) {
        return (str2 == null || !C17542s.e(str, str2)) ? str : "";
    }

    private final String C(Context context, String str) {
        return (C15854t.H("WEIGHT", str, true) || C15854t.H("WEIGHT_GROSS", str, true)) ? context.getString(Oo.b.f84763q9) : C15854t.H("HEIGHT", str, true) ? context.getString(Oo.b.f84421K3) : C15854t.H("WIDTH", str, true) ? context.getString(Oo.b.f84796t9) : C15854t.H("LENGTH", str, true) ? context.getString(Oo.b.f84692k4) : C15854t.H("VOLUME", str, true) ? context.getString(Oo.b.f84730n9) : C15854t.H("DIAMETER", str, true) ? context.getString(Oo.b.f84657h2) : C15854t.H("FOOD_DECLARATION", str, true) ? context.getString(Oo.b.f84768r3) : C15854t.H("GUARANTEE", str, true) ? context.getString(Oo.b.f84411J3) : C15854t.H("SAFETY_DATA_SHEET", str, true) ? context.getString(Oo.b.f84375F7) : C15854t.H("SOFTWARE", str, true) ? context.getString(Oo.b.f84386G8) : C15854t.H("TECHNICAL_INFORMATION", str, true) ? context.getString(Oo.b.f84426K8) : C15854t.H("WOOD_DECLARATION", str, true) ? context.getString(Oo.b.f84818v9) : C15854t.H("ASSEMBLY_INSTRUCTION", str, true) ? context.getString(Oo.b.f84589b0) : C15854t.H("CUSTOMER_DISASSEMBLY_INSTRUCTIONS", str, true) ? context.getString(Oo.b.f84701l2) : C15854t.H("OTHER_DOCUMENTS", str, true) ? context.getString(Oo.b.f84770r5) : C15854t.H("MANUAL", str, true) ? context.getString(Oo.b.f84352D4) : str;
    }

    private final List<C1137b> D() {
        ArrayList arrayList = new ArrayList();
        z(this.f64995k, arrayList);
        return arrayList;
    }

    private final void z(ProductLarge productLarge, List<C1137b> list) {
        for (Attachment attachment : productLarge.m().b()) {
            ArrayList arrayList = new ArrayList();
            String name = attachment.n().name();
            String C10 = C(this.f64996l, name);
            if (C10 == null) {
                C10 = "";
            }
            String B10 = B(C10, name);
            arrayList.add(new Zh.a(B10, f.TITLE, u(), (String) null, this.f64996l.getString(Oo.b.f84327B, new Object[]{B10, attachment.m()}), (C17631a) null, 40, (DefaultConstructorMarker) null));
            arrayList.add(new Zh.a(attachment.m(), f.DOCUMENT, v(), (String) null, this.f64996l.getString(Oo.b.f84317A, new Object[]{attachment.m(), B10}), new a(this, attachment), 8, (DefaultConstructorMarker) null));
            arrayList.add(new Zh.a(attachment.j(), f.DISCLAIMER, 0, (String) null, this.f64996l.getString(Oo.b.f84327B, new Object[]{B10, attachment.j()}), (C17631a) null, 44, (DefaultConstructorMarker) null));
            list.add(new C1137b(attachment, arrayList));
        }
    }
}
