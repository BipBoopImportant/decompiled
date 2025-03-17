package com.ingka.ikea.app.productinformationpage.ui.sections;

import HJ.C15854t;
import Oo.b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import Xh.a;
import Xh.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C5221y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.core.model.product.Attachment;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import ip.C11410b;
import ip.j;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/sections/AssemblyAndDocumentsFragment;", "Lcom/ingka/ikea/app/productinformationpage/ui/sections/SectionBaseFragment;", "<init>", "()V", "", "url", "LXH/N;", "P0", "(Ljava/lang/String;)V", "", "H0", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LkK/c;", "Y", "LkK/c;", "Q0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "Lip/b;", "Z", "Lip/b;", "downloadItemActionLiveData", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "y0", "LXH/o;", "R0", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "safeArgs", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssemblyAndDocumentsFragment extends a {

    /* renamed from: Y  reason: collision with root package name */
    public C17514c f72115Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C11410b<String> f72116Z = new C11410b<>();

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f72117y0 = C16825p.b(new c(this));

    private final void P0(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private final ProductLarge R0() {
        return (ProductLarge) this.f72117y0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(RecyclerView recyclerView, AssemblyAndDocumentsFragment assemblyAndDocumentsFragment, Attachment attachment) {
        C17542s.j(attachment, "Properties");
        C17542s.g(recyclerView);
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Download pdfUrl: " + attachment.getUrl(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = recyclerView.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        assemblyAndDocumentsFragment.P0(attachment.getUrl());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(AssemblyAndDocumentsFragment assemblyAndDocumentsFragment, String str) {
        C17542s.j(str, "url");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Download pdfUrl: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = assemblyAndDocumentsFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        assemblyAndDocumentsFragment.P0(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final ProductLarge U0(AssemblyAndDocumentsFragment assemblyAndDocumentsFragment) {
        String string = assemblyAndDocumentsFragment.requireArguments().getString("productLarge");
        if (string == null) {
            return null;
        }
        C17514c Q02 = assemblyAndDocumentsFragment.Q0();
        Q02.a();
        return (ProductLarge) Q02.c(ProductLarge.Companion.serializer(), string);
    }

    /* access modifiers changed from: protected */
    public int H0() {
        return b.f84578a0;
    }

    public final C17514c Q0() {
        C17514c cVar = this.f72115Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        Yh.b bVar = null;
        if (context == null) {
            IllegalStateException illegalStateException = new IllegalStateException("No context available for fragment");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = AssemblyAndDocumentsFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            return;
        }
        RecyclerView recyclerView = G0().f63241d;
        ProductLarge R02 = R0();
        if (R02 != null) {
            bVar = new Yh.b(R02, context, new a(recyclerView, this));
        }
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        C11410b<String> bVar3 = this.f72116Z;
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(bVar3, viewLifecycleOwner, new Xh.b(this));
    }
}
