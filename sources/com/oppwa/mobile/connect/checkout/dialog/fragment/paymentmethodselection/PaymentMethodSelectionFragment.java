package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.dialog.Utils;
import com.oppwa.mobile.connect.checkout.dialog.fragment.CheckoutFragment;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponent;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction;
import com.oppwa.mobile.connect.databinding.OppwaPaymentMethodSelectionFragmentBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PaymentMethodSelectionFragment extends CheckoutFragment<OppwaPaymentMethodSelectionFragmentBinding> implements PaymentMethodSelectionUiComponent {

    /* renamed from: b  reason: collision with root package name */
    private final List<a<?>> f121231b = new ArrayList();

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction, String str) {
        a(paymentMethodSelectionUiComponentInteraction.getCheckoutInfo().getAmount(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction r7) {
        /*
            r6 = this;
            com.oppwa.mobile.connect.checkout.meta.PaymentMethod[] r0 = r7.getPaymentMethods()
            com.oppwa.mobile.connect.checkout.meta.PaymentMethod[] r1 = r6.b((com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]) r0)
            int r2 = r1.length
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0012
            r6.b(r1, r7)
            r1 = r3
            goto L_0x0013
        L_0x0012:
            r1 = r4
        L_0x0013:
            com.oppwa.mobile.connect.checkout.meta.CheckoutSettings r2 = r7.getCheckoutSettings()
            com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode r2 = r2.getCardBrandsDisplayMode()
            com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode r5 = com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode.GROUPED
            if (r2 != r5) goto L_0x002b
            com.oppwa.mobile.connect.checkout.meta.PaymentMethod[] r2 = r6.a((com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]) r0)
            int r5 = r2.length
            if (r5 <= 0) goto L_0x002b
            r6.a((com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]) r2, (com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction) r7)
            r2 = r3
            goto L_0x002c
        L_0x002b:
            r2 = r4
        L_0x002c:
            com.oppwa.mobile.connect.checkout.meta.PaymentMethod[] r0 = r6.a((com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]) r0, (boolean) r2)
            int r5 = r0.length
            if (r5 <= 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            r6.a(r0, r7, r3)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.PaymentMethodSelectionFragment.b(com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentMethod[] c(int i10) {
        return new PaymentMethod[i10];
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(PaymentMethod paymentMethod) {
        return true;
    }

    private void e() {
        for (a<?> removeListener : this.f121231b) {
            ImageLoader.getInstance(requireContext()).removeListener(removeListener);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T inflate = OppwaPaymentMethodSelectionFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121180a = inflate;
        return inflate.getRoot();
    }

    public void onStart() {
        super.onStart();
        c();
    }

    public void onStop() {
        super.onStop();
        e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PaymentMethod paymentMethod) {
        return !paymentMethod.isCard();
    }

    private int d() {
        return requireContext().getResources().getDisplayMetrics().widthPixels / ((int) requireContext().getResources().getDimension(R.dimen.oppwa_checkout_grouped_cards_grid_item_width));
    }

    public void onUiComponentCreated(PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
        a(paymentMethodSelectionUiComponentInteraction);
        if (paymentMethodSelectionUiComponentInteraction.getCheckoutSettings().isTotalAmountRequired()) {
            Optional.ofNullable(paymentMethodSelectionUiComponentInteraction.getCheckoutInfo().getCurrencyCode()).ifPresent(new i(this, paymentMethodSelectionUiComponentInteraction));
        }
        b(paymentMethodSelectionUiComponentInteraction);
    }

    private void a(PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
        ((OppwaPaymentMethodSelectionFragmentBinding) b()).header.title.setText(R.string.checkout_layout_text_select_payment_method);
        ((OppwaPaymentMethodSelectionFragmentBinding) b()).header.closeButton.setOnClickListener(new j(paymentMethodSelectionUiComponentInteraction));
    }

    private void c() {
        for (a<?> addListener : this.f121231b) {
            ImageLoader.getInstance(requireContext()).addListener(addListener);
        }
    }

    private void a(double d10, String str) {
        ((OppwaPaymentMethodSelectionFragmentBinding) b()).totalAmountView.setVisibility(0);
        ((OppwaPaymentMethodSelectionFragmentBinding) b()).totalAmountValue.setText(Utils.getFormattedAmount(d10, str));
    }

    private PaymentMethod[] a(PaymentMethod[] paymentMethodArr) {
        return (PaymentMethod[]) Stream.of(paymentMethodArr).filter(new e()).toArray(new g());
    }

    private PaymentMethod[] b(PaymentMethod[] paymentMethodArr) {
        return (PaymentMethod[]) Stream.of(paymentMethodArr).filter(new o()).toArray(new f());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PaymentMethod paymentMethod) {
        return !paymentMethod.isToken() && paymentMethod.isCard();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentMethod[] a(int i10) {
        return new PaymentMethod[i10];
    }

    private PaymentMethod[] a(PaymentMethod[] paymentMethodArr, boolean z10) {
        Predicate predicate;
        Stream filter = Stream.of(paymentMethodArr).filter(new k());
        if (z10) {
            new l
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r3v4 ? I:com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.l) =  call: com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.l.<init>():void type: CONSTRUCTOR in method: com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.PaymentMethodSelectionFragment.a(com.oppwa.mobile.connect.checkout.meta.PaymentMethod[], boolean):com.oppwa.mobile.connect.checkout.meta.PaymentMethod[], dex: classes5.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
                com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.k r0 = new com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.k
                r0.<init>()
                java.util.stream.Stream r2 = r2.filter(r0)
                if (r3 == 0) goto L_0x0015
                com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.l r3 = new com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.l
                r3.<init>()
                goto L_0x001a
            L_0x0015:
                com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.m r3 = new com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.m
                r3.<init>()
            L_0x001a:
                java.util.stream.Stream r2 = r2.filter(r3)
                com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.n r3 = new com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.n
                r3.<init>()
                java.lang.Object[] r2 = r2.toArray(r3)
                com.oppwa.mobile.connect.checkout.meta.PaymentMethod[] r2 = (com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection.PaymentMethodSelectionFragment.a(com.oppwa.mobile.connect.checkout.meta.PaymentMethod[], boolean):com.oppwa.mobile.connect.checkout.meta.PaymentMethod[]");
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean b(PaymentMethod paymentMethod) {
            return !paymentMethod.isToken();
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ PaymentMethod[] b(int i10) {
            return new PaymentMethod[i10];
        }

        private void b(PaymentMethod[] paymentMethodArr, PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentTokensSectionTitle.setVisibility(0);
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentTokensSectionTitle.setAllCaps(true);
            Objects.requireNonNull(paymentMethodSelectionUiComponentInteraction);
            d dVar = new d(paymentMethodArr, new h(paymentMethodSelectionUiComponentInteraction));
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentTokensRecyclerView.setAdapter(dVar);
            this.f121231b.add(dVar);
        }

        private void a(PaymentMethod[] paymentMethodArr, PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), d());
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentCardsBrandSectionTitle.setVisibility(0);
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentCardsBrandSectionTitle.setAllCaps(true);
            Objects.requireNonNull(paymentMethodSelectionUiComponentInteraction);
            b bVar = new b(paymentMethodArr, new h(paymentMethodSelectionUiComponentInteraction));
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentCardsBrandsRecyclerView.setLayoutManager(gridLayoutManager);
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentCardsBrandsRecyclerView.setAdapter(bVar);
            this.f121231b.add(bVar);
        }

        private void a(PaymentMethod[] paymentMethodArr, PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction, boolean z10) {
            if (z10) {
                ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentBrandSectionTitle.setVisibility(0);
                ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentBrandSectionTitle.setAllCaps(true);
            }
            Objects.requireNonNull(paymentMethodSelectionUiComponentInteraction);
            c cVar = new c(paymentMethodArr, new h(paymentMethodSelectionUiComponentInteraction));
            ((OppwaPaymentMethodSelectionFragmentBinding) b()).paymentBrandsRecyclerView.setAdapter(cVar);
            this.f121231b.add(cVar);
        }
    }
