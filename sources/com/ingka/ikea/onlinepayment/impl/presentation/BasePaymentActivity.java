package com.ingka.ikea.onlinepayment.impl.presentation;

import HJ.C15854t;
import Lw.b;
import Mw.C13213c;
import Nn.B;
import Nn.D;
import Nn.H;
import Ow.C13323a;
import Tw.C13695h;
import Tw.C13711n;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import android.content.Intent;
import android.os.Bundle;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.sugarcube.core.logger.DslKt;
import ip.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0004¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010\u0003R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8 X \u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/ingka/ikea/onlinepayment/impl/presentation/BasePaymentActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "<init>", "()V", "Lcom/oppwa/mobile/connect/exception/PaymentError;", "error", "LXH/N;", "H0", "(Lcom/oppwa/mobile/connect/exception/PaymentError;)V", "Lcom/oppwa/mobile/connect/provider/Transaction;", "transaction", "", "resourcePath", "J0", "(Lcom/oppwa/mobile/connect/provider/Transaction;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "K0", "(Landroid/content/Intent;)Z", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;", "result", "I0", "(Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;)V", "checkoutId", "", "LNn/D;", "supportedPaymentOptions", "gatewayMerchantId", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "providerMode", "LOw/a$a$a;", "googlePayExpressSettings", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "E0", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;LOw/a$a$a;)Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "LMw/c;", "H", "LMw/c;", "F0", "()LMw/c;", "setPaymentDevAnalytics", "(LMw/c;)V", "paymentDevAnalytics", "LOw/a;", "I", "LOw/a;", "C0", "()LOw/a;", "setAciLauncher", "(LOw/a;)V", "aciLauncher", "LTw/h;", "G0", "()LTw/h;", "paymentViewModel", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "D0", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderNameValidation", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BasePaymentActivity extends i {

    /* renamed from: H  reason: collision with root package name */
    public C13213c f119301H;

    /* renamed from: I  reason: collision with root package name */
    public C13323a f119302I;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Nn.B[] r0 = Nn.B.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.B r1 = Nn.B.BINLIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nn.B r1 = Nn.B.REGEX     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.B r1 = Nn.B.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f119303a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.onlinepayment.impl.presentation.BasePaymentActivity.a.<clinit>():void");
        }
    }

    private final void H0(PaymentError paymentError) {
        G0().s0(paymentError);
    }

    private final void I0(CheckoutActivityResult checkoutActivityResult) {
        String f10;
        char c10;
        char c11;
        String f11;
        String str;
        String str2 = "";
        if (checkoutActivityResult.isCanceled()) {
            boolean q02 = G0().q0();
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Payment cancelled, isExpressGooglePay: " + q02, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                }
                String str5 = str4;
                bVar.a(eVar, str5, false, (Throwable) null, str3);
                str4 = str5;
                eVar = eVar;
                str2 = str;
            }
            String str6 = str2;
            C13213c F02 = F0();
            C13213c.C2746c cVar = C13213c.C2746c.CANCEL;
            H i02 = G0().i0();
            C13213c.a.a(F02, cVar, (i02 == null || (f11 = i02.f()) == null) ? str6 : f11, (C13213c.b) null, (String) null, 12, (Object) null);
            if (q02) {
                setResult(3336);
                finish();
                return;
            }
            return;
        }
        String str7 = str2;
        if (checkoutActivityResult.isErrored()) {
            H0(checkoutActivityResult.getPaymentError());
            return;
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str8 = null;
        String str9 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str8 == null) {
                String a11 = C11818a.a("Payment result, success", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str8 = C11820c.a(a11);
            }
            if (str9 == null) {
                String name2 = getClass().getName();
                C17542s.g(name2);
                c11 = 2;
                c10 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c11 = 2;
                c10 = '$';
            }
            char c12 = c11;
            char c13 = c10;
            bVar2.a(eVar2, str9, false, (Throwable) null, str8);
        }
        J0(checkoutActivityResult.getTransaction(), checkoutActivityResult.getResourcePath());
        C13213c F03 = F0();
        C13213c.C2746c cVar2 = C13213c.C2746c.SUCCESS;
        H i03 = G0().i0();
        C13213c.a.a(F03, cVar2, (i03 == null || (f10 = i03.f()) == null) ? str7 : f10, (C13213c.b) null, (String) null, 12, (Object) null);
    }

    private final void J0(Transaction transaction, String str) {
        String str2;
        Transaction transaction2 = transaction;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str2 = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("Successful payment, transaction: " + transaction2 + ", transaction type: " + (transaction2 != null ? transaction.getTransactionType() : null) + ", path: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            } else {
                String str5 = str;
            }
            String str6 = str3;
            if (str4 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str2 = DslKt.INDICATOR_MAIN;
                }
                str4 = str2 + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str7 = str4;
            bVar.a(eVar, str7, true, (Throwable) null, str6);
            str4 = str7;
            str3 = str6;
        }
        if ((transaction2 != null ? transaction.getTransactionType() : null) == TransactionType.SYNC) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a("Set TransactionState to Completed since it's SYNC", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str8 = C11820c.a(a11);
                }
                if (str9 == null) {
                    String name2 = getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str9, false, (Throwable) null, str8);
            }
            G0().F0(C13711n.COMPLETED);
        } else if (G0().l0() != C13711n.COMPLETED) {
            e eVar3 = e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str10 == null) {
                    String a12 = C11818a.a("Set TransactionState to Pending since it's ASYNC", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str10 = C11820c.a(a12);
                }
                if (str11 == null) {
                    String name3 = getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str11, false, (Throwable) null, str10);
            }
            G0().F0(C13711n.PENDING);
        } else {
            e eVar4 = e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str12 = null;
            String str13 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str12 == null) {
                    String a13 = C11818a.a("TransactionState is Completed. Wait for ASYNC response", (Throwable) null);
                    if (a13 != null) {
                        str12 = C11820c.a(a13);
                    } else {
                        return;
                    }
                }
                if (str13 == null) {
                    String name4 = getClass().getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str13, false, (Throwable) null, str12);
            }
        }
    }

    private final boolean K0(Intent intent) {
        return C17542s.e(getString(b.f111929a), intent.getScheme());
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(BasePaymentActivity basePaymentActivity, CheckoutActivityResult checkoutActivityResult) {
        C17542s.j(checkoutActivityResult, "it");
        basePaymentActivity.I0(checkoutActivityResult);
        return C16807N.f139792a;
    }

    public final C13323a C0() {
        C13323a aVar = this.f119302I;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("aciLauncher");
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract MComConfig.b D0();

    /* access modifiers changed from: protected */
    public final CheckoutSettings E0(String str, List<? extends D> list, String str2, Connect.ProviderMode providerMode, C13323a.C2787a.C2788a aVar) {
        B b10;
        CheckoutBrandDetectionType checkoutBrandDetectionType;
        CheckoutBrandDetectionType checkoutBrandDetectionType2;
        List<? extends D> list2 = list;
        Connect.ProviderMode providerMode2 = providerMode;
        C17542s.j(str, "checkoutId");
        C17542s.j(list2, "supportedPaymentOptions");
        C17542s.j(providerMode2, "providerMode");
        D d10 = (D) C16877v.w0(list);
        double c02 = G0().c0();
        String b11 = v0().s().b();
        boolean e10 = d10.e();
        Set<String> b02 = G0().b0(list2);
        String a02 = G0().a0(d10);
        if ((d10 instanceof D.b) || (d10 instanceof D.c) || (d10 instanceof D.d) || (d10 instanceof D.e)) {
            b10 = null;
        } else if (d10 instanceof D.h) {
            b10 = ((D.h) d10).i();
        } else if (d10 instanceof D.g) {
            b10 = ((D.g) d10).j();
        } else {
            throw new t();
        }
        C13323a C02 = C0();
        int i10 = b10 == null ? -1 : a.f119303a[b10.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                checkoutBrandDetectionType2 = CheckoutBrandDetectionType.BINLIST;
            } else if (i10 == 2) {
                checkoutBrandDetectionType2 = CheckoutBrandDetectionType.REGEX;
            } else if (i10 != 3) {
                throw new t();
            }
            checkoutBrandDetectionType = checkoutBrandDetectionType2;
            return C02.b(this, providerMode2, new C13323a.C2787a(v0().i(), str, str2, b11, c02, b02, d10, a02, checkoutBrandDetectionType, e10, D0(), aVar));
        }
        checkoutBrandDetectionType = null;
        return C02.b(this, providerMode2, new C13323a.C2787a(v0().i(), str, str2, b11, c02, b02, d10, a02, checkoutBrandDetectionType, e10, D0(), aVar));
    }

    public final C13213c F0() {
        C13213c cVar = this.f119301H;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("paymentDevAnalytics");
        return null;
    }

    public abstract C13695h G0();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(G0().j0(), this, new e(this));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        String str;
        char c10;
        char c11;
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '.';
            c11 = '$';
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("onNewIntent received", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str4 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str4 = str6;
            str3 = str5;
        }
        if (K0(intent)) {
            G0().B0(true);
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a("Set TransactionState to Completed", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name2 = getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), c10, (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                c10 = '.';
            }
            G0().F0(C13711n.COMPLETED);
        } else {
            String scheme = intent.getScheme();
            H i02 = G0().i0();
            IllegalStateException illegalStateException = new IllegalStateException("Unknown callback in onNewIntent. scheme: " + scheme + ", psp: " + (i02 != null ? i02.e() : null));
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str9 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 == null) {
                        break;
                    }
                    str9 = C11820c.a(a12);
                }
                if (str10 == null) {
                    String name3 = getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str10, false, illegalStateException, str9);
                c11 = '$';
            }
        }
        e eVar4 = e.DEBUG;
        ArrayList<C11819b> arrayList4 = new ArrayList<>();
        for (Object next4 : d.f102012a.a()) {
            if (((C11819b) next4).b(eVar4, true)) {
                arrayList4.add(next4);
            }
        }
        String str11 = null;
        String str12 = null;
        for (C11819b bVar4 : arrayList4) {
            if (str11 == null) {
                String a13 = C11818a.a("onNewIntent, intent scheme: " + intent.getScheme(), (Throwable) null);
                if (a13 == null) {
                    break;
                }
                str11 = C11820c.a(a13);
            }
            if (str12 == null) {
                String name4 = getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name4;
            }
            bVar4.a(eVar4, str12, true, (Throwable) null, str11);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String next5 : extras.keySet()) {
                e eVar5 = e.DEBUG;
                ArrayList arrayList5 = new ArrayList();
                for (Object next6 : d.f102012a.a()) {
                    if (((C11819b) next6).b(eVar5, true)) {
                        arrayList5.add(next6);
                    }
                }
                Iterator it2 = arrayList5.iterator();
                String str13 = str2;
                String str14 = str13;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C11819b bVar5 = (C11819b) it2.next();
                    if (str13 == null) {
                        String a14 = C11818a.a("key: " + next5 + ", value: " + extras.get(next5), (Throwable) null);
                        if (a14 == null) {
                            break;
                        }
                        str13 = C11820c.a(a14);
                    }
                    if (str14 == null) {
                        String name5 = getClass().getName();
                        C17542s.g(name5);
                        String o16 = C15854t.o1(C15854t.s1(name5, '$', str2, 2, str2), '.', str2, 2, str2);
                        if (o16.length() != 0) {
                            name5 = C15854t.P0(o16, "Kt");
                        }
                        str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name5;
                    }
                    bVar5.a(eVar5, str14, true, (Throwable) null, str13);
                    str2 = null;
                }
                str2 = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        boolean z10 = true;
        if (G0().l0() == C13711n.PENDING) {
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
                    String a10 = C11818a.a("TransactionState is Pending. Show payment options again", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
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
            G0().B0(false);
        } else if (G0().l0() == C13711n.COMPLETED) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str5 == null) {
                    String a11 = C11818a.a("TransactionState is Completed. Process payment", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str5 = C11820c.a(a11);
                }
                String str7 = str5;
                if (str6 == null) {
                    String name2 = getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, z10) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                String str8 = str6;
                bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                str6 = str8;
                str5 = str7;
                z10 = true;
            }
            G0().v0();
        }
    }
}
