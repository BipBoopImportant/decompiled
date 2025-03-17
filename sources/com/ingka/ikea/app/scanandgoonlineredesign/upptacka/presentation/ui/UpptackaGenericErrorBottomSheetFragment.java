package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui;

import HJ.C15854t;
import QJ.Q;
import Sj.C10919f;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import uI.C18064m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u001a\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "", "R", "LXo/a;", "M0", "()I", "icon", "S", "N0", "title", "T", "K0", "description", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "U", "L0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "errorType", "X", "b", "Result", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpptackaGenericErrorBottomSheetFragment extends BottomSheetComposeDialogFragment {

    /* renamed from: X  reason: collision with root package name */
    public static final b f92285X = new b((DefaultConstructorMarker) null);

    /* renamed from: Y  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f92286Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final int f92287Z = Xo.a.f89218b;

    /* renamed from: R  reason: collision with root package name */
    private final Xo.a f92288R = new Xo.a("UpptackaGenericErrorBottomSheetFragment.Args.Icon");

    /* renamed from: S  reason: collision with root package name */
    private final Xo.a f92289S = new Xo.a("UpptackaGenericErrorBottomSheetFragment.Args.Title");

    /* renamed from: T  reason: collision with root package name */
    private final Xo.a f92290T = new Xo.a("UpptackaGenericErrorBottomSheetFragment.Args.Description");

    /* renamed from: U  reason: collision with root package name */
    private final Xo.a f92291U = new Xo.a("UpptackaGenericErrorBottomSheetFragment.Args.ErrorType");

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result;", "Landroid/os/Parcelable;", "Companion", "a", "b", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result extends Parcelable {
        public static final String BUNDLE_KEY = "UpptackaGenericErrorBottomSheetFragment.Bundle.Key";
        public static final a Companion = a.f92292a;
        public static final String REQUEST_KEY = "UpptackaGenericErrorBottomSheetFragment.Request.Key";

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result$a;", "", "<init>", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f92292a = new a();

            private a() {
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result;", "Landroid/os/Parcelable;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "errorType", "<init>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "getErrorType", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Result, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: b  reason: collision with root package name */
            public static final int f92293b = 8;

            /* renamed from: a  reason: collision with root package name */
            private final UiError.Type f92294a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    C17542s.j(parcel, "parcel");
                    return new b(UiError.Type.valueOf(parcel.readString()));
                }

                /* renamed from: b */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b(UiError.Type type) {
                C17542s.j(type, "errorType");
                this.f92294a = type;
            }

            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f92294a == ((b) obj).f92294a;
            }

            public int hashCode() {
                return this.f92294a.hashCode();
            }

            public String toString() {
                UiError.Type type = this.f92294a;
                return "OnDismiss(errorType=" + type + ")";
            }

            public final void writeToParcel(Parcel parcel, int i10) {
                C17542s.j(parcel, "dest");
                parcel.writeString(this.f92294a.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment$BottomSheetContent$2$1", f = "UpptackaGenericErrorBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92295c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UpptackaGenericErrorBottomSheetFragment f92296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UpptackaGenericErrorBottomSheetFragment upptackaGenericErrorBottomSheetFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f92296d = upptackaGenericErrorBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f92296d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92295c == 0) {
                y.b(obj);
                this.f92296d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$b;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "icon", "title", "description", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", "errorType", "LXH/N;", "d", "(Landroidx/fragment/app/FragmentManager;IIILcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaGenericErrorBottomSheetFragment$Result;", "onResult", "b", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;LnI/l;)V", "", "TAG", "Ljava/lang/String;", "ARGS_ICON", "ARGS_TITLE", "ARGS_DESCRIPTION", "ARGS_ERROR_TYPE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void c(C17642l lVar, String str, Bundle bundle) {
            C17542s.j(str, "<unused var>");
            C17542s.j(bundle, "bundle");
            Result result = (Result) bundle.getParcelable(Result.BUNDLE_KEY);
            if (result != null) {
                lVar.invoke(result);
                return;
            }
            b bVar = UpptackaGenericErrorBottomSheetFragment.f92285X;
            IllegalStateException illegalStateException = new IllegalStateException("Callback was not provided in result");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar2 : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar2.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
        }

        public final void b(FragmentManager fragmentManager, C5221y yVar, C17642l<? super Result, C16807N> lVar) {
            C17542s.j(fragmentManager, "fragmentManager");
            C17542s.j(yVar, "lifecycleOwner");
            C17542s.j(lVar, "onResult");
            fragmentManager.R1(Result.REQUEST_KEY, yVar, new C10919f(lVar));
        }

        public final void d(FragmentManager fragmentManager, int i10, int i11, int i12, UiError.Type type) {
            C17542s.j(fragmentManager, "fragmentManager");
            C17542s.j(type, "errorType");
            UpptackaGenericErrorBottomSheetFragment upptackaGenericErrorBottomSheetFragment = new UpptackaGenericErrorBottomSheetFragment();
            upptackaGenericErrorBottomSheetFragment.setArguments(D2.d.b(C16796C.a("UpptackaGenericErrorBottomSheetFragment.Args.Icon", Integer.valueOf(i10)), C16796C.a("UpptackaGenericErrorBottomSheetFragment.Args.Title", Integer.valueOf(i11)), C16796C.a("UpptackaGenericErrorBottomSheetFragment.Args.Description", Integer.valueOf(i12)), C16796C.a("UpptackaGenericErrorBottomSheetFragment.Args.ErrorType", type)));
            upptackaGenericErrorBottomSheetFragment.show(fragmentManager, "UpptackaGenericErrorBottomSheetFragment.TAG");
        }

        private b() {
        }
    }

    static {
        Class<UpptackaGenericErrorBottomSheetFragment> cls = UpptackaGenericErrorBottomSheetFragment.class;
        f92286Y = new C18064m[]{P.h(new G(cls, "icon", "getIcon()I", 0)), P.h(new G(cls, "title", "getTitle()I", 0)), P.h(new G(cls, "description", "getDescription()I", 0)), P.h(new G(cls, "errorType", "getErrorType()Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError$Type;", 0))};
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(UpptackaGenericErrorBottomSheetFragment upptackaGenericErrorBottomSheetFragment) {
        upptackaGenericErrorBottomSheetFragment.w0();
        return C16807N.f139792a;
    }

    private final int K0() {
        return ((Number) this.f92290T.a(this, f92286Y[2])).intValue();
    }

    private final UiError.Type L0() {
        return (UiError.Type) this.f92291U.a(this, f92286Y[3]);
    }

    private final int M0() {
        return ((Number) this.f92288R.a(this, f92286Y[0])).intValue();
    }

    private final int N0() {
        return ((Number) this.f92289S.a(this, f92286Y[1])).intValue();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return new BottomSheetComposeDialogFragment.a(Result.REQUEST_KEY, D2.d.b(C16796C.a(Result.BUNDLE_KEY, new Result.b(L0()))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r12, int r13) {
        /*
            r11 = this;
            r0 = -1007922288(0xffffffffc3ec5390, float:-472.65283)
            r12.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment.BottomSheetContent (UpptackaGenericErrorBottomSheetFragment.kt:31)"
            U0.C4895p.S(r0, r13, r1, r2)
        L_0x0012:
            int r3 = r11.M0()
            int r4 = r11.N0()
            int r5 = r11.K0()
            r0 = -1729022298(0xffffffff98f136a6, float:-6.235222E-24)
            r12.W(r0)
            r0 = r13 & 14
            r1 = 6
            r0 = r0 ^ r1
            r2 = 0
            r9 = 1
            r10 = 4
            if (r0 <= r10) goto L_0x0033
            boolean r6 = r12.F(r11)
            if (r6 != 0) goto L_0x0037
        L_0x0033:
            r6 = r13 & 6
            if (r6 != r10) goto L_0x0039
        L_0x0037:
            r6 = r9
            goto L_0x003a
        L_0x0039:
            r6 = r2
        L_0x003a:
            java.lang.Object r7 = r12.D()
            if (r6 != 0) goto L_0x0048
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0050
        L_0x0048:
            Sj.e r7 = new Sj.e
            r7.<init>(r11)
            r12.u(r7)
        L_0x0050:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r12.P()
            r8 = 0
            r7 = r12
            Sj.C10922i.c(r3, r4, r5, r6, r7, r8)
            XH.N r3 = XH.C16807N.f139792a
            r4 = -1729019331(0xffffffff98f1423d, float:-6.2363923E-24)
            r12.W(r4)
            if (r0 <= r10) goto L_0x006b
            boolean r0 = r12.F(r11)
            if (r0 != 0) goto L_0x006e
        L_0x006b:
            r13 = r13 & r1
            if (r13 != r10) goto L_0x006f
        L_0x006e:
            r2 = r9
        L_0x006f:
            java.lang.Object r13 = r12.D()
            if (r2 != 0) goto L_0x007d
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r13 != r0) goto L_0x0086
        L_0x007d:
            com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment$a r13 = new com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment$a
            r0 = 0
            r13.<init>(r11, r0)
            r12.u(r13)
        L_0x0086:
            nI.p r13 = (nI.p) r13
            r12.P()
            U0.P.g(r3, r13, r12, r1)
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x0097
            U0.C4895p.R()
        L_0x0097:
            r12.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment.u0(U0.m, int):void");
    }
}
