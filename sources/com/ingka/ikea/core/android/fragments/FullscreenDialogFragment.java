package com.ingka.ikea.core.android.fragments;

import D2.d;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Lcom/ingka/ikea/core/android/fragments/f;", "M", "LXH/o;", "y0", "()Lcom/ingka/ikea/core/android/fragments/f;", "fullScreenArguments", "N", "a", "b", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullscreenDialogFragment extends BaseDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    public static final a f94870N = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    public static final int f94871O = 8;

    /* renamed from: M  reason: collision with root package name */
    private final C16824o f94872M = C16825p.b(new g(this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$a;", "", "<init>", "()V", "", "title", "messageHeader", "message", "", "finishButtonStringRes", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;", "imageResource", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;)Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment;", "TAG", "Ljava/lang/String;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FullscreenDialogFragment b(a aVar, String str, String str2, String str3, int i10, b bVar, int i11, Object obj) {
            String str4 = (i11 & 1) != 0 ? null : str;
            String str5 = (i11 & 2) != 0 ? null : str2;
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                bVar = new b(0, (b.C2117b) null, 3, (DefaultConstructorMarker) null);
            }
            return aVar.a(str4, str5, str3, i12, bVar);
        }

        public final FullscreenDialogFragment a(String str, String str2, String str3, int i10, b bVar) {
            C17542s.j(str3, "message");
            C17542s.j(bVar, "imageResource");
            FullscreenDialogFragment fullscreenDialogFragment = new FullscreenDialogFragment();
            fullscreenDialogFragment.setArguments(d.b(C16796C.a("full_screen_arguments", new f(str, str2, str3, i10, bVar))));
            return fullscreenDialogFragment;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b;", "Landroid/os/Parcelable;", "", "imageResId", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b$b;", "placement", "<init>", "(ILcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b$b;)V", "Landroid/os/Parcel;", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b$b;", "()Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b$b;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f94873a;

        /* renamed from: b  reason: collision with root package name */
        private final C2117b f94874b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new b(parcel.readInt(), C2117b.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/FullscreenDialogFragment$b$b;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.core.android.fragments.FullscreenDialogFragment$b$b  reason: collision with other inner class name */
        public enum C2117b {
            TOP,
            CENTER;

            static {
                C2117b[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public b() {
            this(0, (C2117b) null, 3, (DefaultConstructorMarker) null);
        }

        public final int a() {
            return this.f94873a;
        }

        public final C2117b b() {
            return this.f94874b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f94873a == bVar.f94873a && this.f94874b == bVar.f94874b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f94873a) * 31) + this.f94874b.hashCode();
        }

        public String toString() {
            int i10 = this.f94873a;
            C2117b bVar = this.f94874b;
            return "ImageResource(imageResId=" + i10 + ", placement=" + bVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeInt(this.f94873a);
            parcel.writeString(this.f94874b.name());
        }

        public b(int i10, C2117b bVar) {
            C17542s.j(bVar, "placement");
            this.f94873a = i10;
            this.f94874b = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, C2117b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? C2117b.TOP : bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94875a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.ingka.ikea.core.android.fragments.FullscreenDialogFragment$b$b[] r0 = com.ingka.ikea.core.android.fragments.FullscreenDialogFragment.b.C2117b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.android.fragments.FullscreenDialogFragment$b$b r1 = com.ingka.ikea.core.android.fragments.FullscreenDialogFragment.b.C2117b.TOP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.android.fragments.FullscreenDialogFragment$b$b r1 = com.ingka.ikea.core.android.fragments.FullscreenDialogFragment.b.C2117b.CENTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f94875a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.android.fragments.FullscreenDialogFragment.c.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final void A0(FullscreenDialogFragment fullscreenDialogFragment, View view) {
        fullscreenDialogFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public static final f x0(FullscreenDialogFragment fullscreenDialogFragment) {
        Parcelable parcelable = fullscreenDialogFragment.requireArguments().getParcelable("full_screen_arguments");
        if (parcelable != null) {
            return (f) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final f y0() {
        return (f) this.f94872M.getValue();
    }

    /* access modifiers changed from: private */
    public static final void z0(FullscreenDialogFragment fullscreenDialogFragment, View view) {
        fullscreenDialogFragment.dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(Uo.b.f88329a, viewGroup, false);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i10;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(Uo.a.f88327h);
        toolbar.setNavigationOnClickListener(new h(this));
        toolbar.setTitle((CharSequence) y0().e());
        toolbar.setNavigationIcon(C6012a.e(view.getContext(), C18146a.f148097J2));
        toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
        b b10 = y0().b();
        if (b10.a() != -1) {
            int i11 = c.f94875a[b10.b().ordinal()];
            if (i11 == 1) {
                i10 = Uo.a.f88322c;
            } else if (i11 == 2) {
                i10 = Uo.a.f88325f;
            } else {
                throw new t();
            }
            ImageView imageView = (ImageView) view.findViewById(i10);
            imageView.setImageResource(b10.a());
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) view.findViewById(Uo.a.f88324e);
        String d10 = y0().d();
        if (d10 == null) {
            d10 = "";
        }
        textView.setText(d10);
        textView.setVisibility(0);
        ((TextView) view.findViewById(Uo.a.f88323d)).setText(y0().c());
        if (y0().a() != -1) {
            Button button = (Button) view.findViewById(Uo.a.f88321b);
            button.setText(y0().a());
            button.setOnClickListener(new i(this));
            button.setVisibility(0);
        }
    }
}
