package Iz;

import A4.b;
import A4.c;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import com.adjust.sdk.Constants;
import com.ingka.coworker.discount.CoWorkerDiscountReadMoreDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.ScanAndGoCheckoutFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.ProductCollectedSuccessDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.EmailCollectionBottomSheetDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoOnboardingFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoScannerCouponFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.help.HelpDialogFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment.ProductDetailsFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.fragment.ProductDetailsSectionFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.ProductInfoPageFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductDialogFragment;
import com.ingka.ikea.scanandgo.deeplinkerrorscreens.DeeplinkWrongMarketFragment;
import com.ingka.ikea.scanandgo.deeplinkerrorscreens.DeeplinkWrongStoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a/\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\t\u001a\u0011\u0010\u000f\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\t\u001a\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\t\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\t\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\t\u001a\u0011\u0010\u0013\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\t\u001a\u0011\u0010\u0014\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a\u0011\u0010\u0015\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\t\u001a\u0011\u0010\u0016\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\t\u001a\u0011\u0010\u0017\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\t\u001a\u0011\u0010\u0018\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\t\u001a\u0011\u0010\u0019\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\t\u001a\u0011\u0010\u001a\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\t\u001a\u0011\u0010\u001b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lx4/y;", "", "isScannerMLKitEnabled", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "c0", "(Lx4/y;ZLnI/l;)V", "f0", "(Lx4/y;)V", "X", "q0", "(Lx4/y;Z)V", "o0", "Y", "b0", "S", "V", "p0", "h0", "I", "k0", "R", "t0", "w0", "C", "O", "L", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X {
    public static final void C(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), d0.f111049a.a(), P.b(CoWorkerDiscountReadMoreDialog.class));
        cVar.d(c0.f111023a.a());
        cVar.a("readMoreBadge", new S());
        cVar.a("readMoreTitle", new T());
        cVar.a("readMoreDescription", new U());
        cVar.a("readMoreImageUrl", new V());
        cVar.a("readMoreImageContentDescription", new W());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    public static final void I(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/product-collected-success?title={title}&qty={qty}", P.b(ProductCollectedSuccessDialog.class));
        cVar.a("title", new A());
        cVar.a("qty", new B());
        cVar.d("ikea://navigation/scanandgo/dialog/product-collected-success?title={title}&qty={qty}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57429d);
        return C16807N.f139792a;
    }

    public static final void L(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/wrongMarket?newStore={newStore}&newMarket={newMarket}", P.b(DeeplinkWrongMarketFragment.class));
        cVar.d("ikea://navigation/scanandgo/dialog/wrongMarket?newStore={newStore}&newMarket={newMarket}");
        cVar.a("newStore", new C13058y());
        cVar.a("newMarket", new C13059z());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void O(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/wrongStore?oldStore={oldStore}&newStore={newStore}", P.b(DeeplinkWrongStoreFragment.class));
        cVar.d("ikea://navigation/scanandgo/dialog/wrongStore?oldStore={oldStore}&newStore={newStore}");
        cVar.a("oldStore", new C13056w());
        cVar.a("newStore", new C13057x());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void R(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/scanningHelpDialog", P.b(HelpDialogFragment.class));
        cVar.d("ikea://navigation/scanandgo/dialog/scanningHelpDialog");
        yVar.k(cVar);
    }

    public static final void S(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/productInfoPage?rawValue={rawValue}&format={format}", P.b(ProductInfoPageFragment.class));
        cVar.d("ikea://navigation/scanandgo/productInfoPage?rawValue={rawValue}&format={format}");
        cVar.a("format", new L());
        cVar.a("rawValue", new M());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57429d);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void V(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/productInfoPage?barcode={barcode}", P.b(ProductInfoPageFragment.class));
        cVar.d("ikea://navigation/scanandgo/productInfoPage?barcode={barcode}");
        cVar.a("barcode", new C());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void X(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((b) yVar.l().d(b.class), "scanandgo/email", P.b(EmailCollectionBottomSheetDialog.class)));
    }

    public static final void Y(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/checkout?timeSlotId={timeSlotId}&earlyPayment={earlyPayment}&", P.b(ScanAndGoCheckoutFragment.class));
        cVar.d("ikea://navigation/scanandgo/checkout?timeSlotId={timeSlotId}&earlyPayment={earlyPayment}&");
        cVar.a("timeSlotId", new P());
        cVar.a("earlyPayment", new Q());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    public static final void b0(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((b) yVar.l().d(b.class), "scanandgo/checkout/confirmation", P.b(CheckoutConfirmationDialog.class)));
    }

    public static final void c0(y yVar, boolean z10, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), z10 ? "scanandgo/scanner/v2/product?entryPoint={entryPoint}&deeplink={deeplink}" : "scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}", "scanandgo");
        q0(yVar2, z10);
        o0(yVar2);
        X(yVar2);
        S(yVar2);
        V(yVar2);
        h0(yVar2);
        k0(yVar2);
        p0(yVar2);
        I(yVar2);
        R(yVar2);
        t0(yVar2);
        w0(yVar2);
        Y(yVar2);
        f0(yVar2);
        b0(yVar2);
        C(yVar2);
        O(yVar2);
        L(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static /* synthetic */ void d0(y yVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            new N
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v2 ? I:Iz.N) =  call: Iz.N.<init>():void type: CONSTRUCTOR in method: Iz.X.d0(x4.y, boolean, nI.l, int, java.lang.Object):void, dex: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0009
                Iz.N r2 = new Iz.N
                r2.<init>()
            L_0x0009:
                c0(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Iz.X.d0(x4.y, boolean, nI.l, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N e0(y yVar) {
            C17542s.j(yVar, "<this>");
            return C16807N.f139792a;
        }

        public static final void f0(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/onboarding?entryPoint={entryPoint}&", P.b(ScanAndGoOnboardingFragment.class));
            cVar.d("ikea://navigation/scanandgo/onboarding?entryPoint={entryPoint}&");
            cVar.a("entryPoint", new I());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N g0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        public static final void h0(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/product/details?productNo={productNo}&isCombination={isCombination}", P.b(ProductDetailsFragment.class));
            cVar.d("ikea://navigation/scanandgo/product/details?productNo={productNo}&isCombination={isCombination}");
            cVar.a("productNo", new G());
            cVar.a("isCombination", new H());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N i0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57439n);
            jVar.b(Boolean.FALSE);
            return C16807N.f139792a;
        }

        public static final void k0(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/product/details/section?productNo={productNo}&isCombination={isCombination}&sectionType={sectionType}", P.b(ProductDetailsSectionFragment.class));
            cVar.d("ikea://navigation/scanandgo/product/details/section?productNo={productNo}&isCombination={isCombination}&sectionType={sectionType}");
            cVar.a("productNo", new C13054u());
            cVar.a("isCombination", new F());
            cVar.a("sectionType", new O());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N l0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57439n);
            jVar.b(Boolean.FALSE);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        public static final void o0(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/scanner/v1/collect", P.b(CollectProductScannerFragment.class));
            cVar.d("ikea://navigation/scanandgo/scanner/v1/collect?barcode={barcode}");
            yVar.k(cVar);
        }

        public static final void p0(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "scanandgo/scanner/v1/coupon", P.b(ScanAndGoScannerCouponFragment.class));
            cVar.d("ikea://navigation/scanandgo/scanner/v1/coupon");
            yVar.k(cVar);
        }

        public static final void q0(y yVar, boolean z10) {
            C17542s.j(yVar, "<this>");
            Class cls = FragmentNavigator.class;
            if (z10) {
                androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(cls), "scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}", P.b(ProductScannerFragment.class));
                cVar.d("ikea://navigation/scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}");
                cVar.a(Constants.DEEPLINK, new J());
                yVar.k(cVar);
                return;
            }
            androidx.navigation.fragment.c cVar2 = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(cls), "scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}", P.b(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.class));
            cVar2.d("ikea://navigation/scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}");
            cVar2.a(Constants.DEEPLINK, new K());
            yVar.k(cVar2);
        }

        /* access modifiers changed from: private */
        public static final C16807N r0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N s0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        public static final void t0(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/unavailableChildItemsDialog?entryPoint={entryPoint}&barcode={barcode}", P.b(UnavailableChildItemsDialog.class));
            cVar.d("ikea://navigation/scanandgo/dialog/unavailableChildItemsDialog?entryPoint={entryPoint}&barcode={barcode}");
            cVar.a("entryPoint", new D());
            cVar.a("barcode", new E());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N u0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N v0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        public static final void w0(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((b) yVar.l().d(b.class), "scanandgo/dialog/upptackaImportDialog?listId={listId}", P.b(UpptackaImportProductDialogFragment.class));
            cVar.d("ikea://navigation/scanandgo/dialog/upptackaImportDialog?listId={listId}");
            cVar.a("listId", new C13055v());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N x0(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }
    }
