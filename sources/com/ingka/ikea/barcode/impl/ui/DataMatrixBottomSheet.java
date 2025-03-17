package com.ingka.ikea.barcode.impl.ui;

import HJ.C15854t;
import I2.L;
import XH.C16824o;
import XH.C16825p;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import vm.C12190a;
import wm.C12282c;
import xm.C12319a;
import ym.g;
import zm.C12535a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/ingka/ikea/barcode/impl/ui/DataMatrixBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/widget/ImageView;", "view", "", "barcodeValue", "LXH/N;", "E0", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Lvm/a;", "O", "Lvm/a;", "A0", "()Lvm/a;", "setBarcode", "(Lvm/a;)V", "barcode", "Lxm/a;", "P", "Lxm/a;", "_binding", "Lym/g;", "Q", "LXH/o;", "C0", "()Lym/g;", "safeArgs", "B0", "()Lxm/a;", "binding", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataMatrixBottomSheet extends Hilt_DataMatrixBottomSheet {

    /* renamed from: O  reason: collision with root package name */
    public C12190a f93167O;

    /* renamed from: P  reason: collision with root package name */
    private C12319a f93168P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f93169Q = C16825p.b(new C12535a(this));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f93170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataMatrixBottomSheet f93171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f93172c;

        public a(View view, DataMatrixBottomSheet dataMatrixBottomSheet, String str) {
            this.f93170a = view;
            this.f93171b = dataMatrixBottomSheet;
            this.f93172c = str;
        }

        public final void run() {
            DataMatrixBottomSheet dataMatrixBottomSheet = this.f93171b;
            ImageView imageView = dataMatrixBottomSheet.B0().f106059b;
            C17542s.i(imageView, "barcodeImage");
            dataMatrixBottomSheet.E0(imageView, this.f93172c);
        }
    }

    /* access modifiers changed from: private */
    public final C12319a B0() {
        C12319a aVar = this.f93168P;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final g C0() {
        return (g) this.f93169Q.getValue();
    }

    /* access modifiers changed from: private */
    public static final g D0(DataMatrixBottomSheet dataMatrixBottomSheet) {
        g.a aVar = g.f106505e;
        Bundle requireArguments = dataMatrixBottomSheet.requireArguments();
        C17542s.i(requireArguments, "requireArguments(...)");
        return aVar.a(requireArguments);
    }

    /* access modifiers changed from: private */
    public final void E0(ImageView imageView, String str) {
        if (str != null) {
            Bitmap a10 = A0().a(str, C12190a.C2496a.ITF, (imageView.getWidth() - imageView.getPaddingStart()) - imageView.getPaddingEnd(), getResources().getDimensionPixelOffset(C12282c.f105870a) / 2, true, 0, false);
            if (a10 != null) {
                B0().f106059b.setImageBitmap(a10);
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to create barcode");
            e eVar = e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 != null) {
                        str2 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = DataMatrixBottomSheet.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
    }

    public final C12190a A0() {
        C12190a aVar = this.f93167O;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcode");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10;
        CharSequence charSequence;
        String str;
        char c10;
        String str2;
        CharSequence charSequence2;
        Iterator it;
        String str3;
        String str4;
        C17542s.j(layoutInflater, "inflater");
        this.f93168P = C12319a.c(layoutInflater);
        String a10 = C0().a();
        String d10 = C0().d();
        String b10 = C0().b();
        boolean c11 = C0().c();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C12282c.f105870a);
        int length = a10.length();
        String str5 = DslKt.INDICATOR_BACKGROUND;
        String str6 = DslKt.INDICATOR_MAIN;
        Class<DataMatrixBottomSheet> cls = DataMatrixBottomSheet.class;
        if (length == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to create data matrix, empty value");
            e eVar = e.ERROR;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            String str7 = null;
            String str8 = null;
            while (it2.hasNext()) {
                C11819b bVar = (C11819b) it2.next();
                if (str7 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    it = it2;
                    str3 = str5;
                    str4 = str6;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    it = it2;
                    str3 = str5;
                    str4 = str6;
                }
                bVar.a(eVar, str8, false, illegalArgumentException, str7);
                it2 = it;
                str6 = str4;
                str5 = str3;
            }
            z10 = true;
        } else {
            String str9 = str5;
            String str10 = str6;
            String str11 = null;
            CharSequence charSequence3 = "Kt";
            CharSequence charSequence4 = DslKt.MAIN_THREAD_NAME;
            Bitmap a12 = A0().a(a10, C12190a.C2496a.DATA_MATRIX, dimensionPixelOffset, dimensionPixelOffset, true, 0, false);
            if (a12 != null) {
                B0().f106064g.setImageBitmap(a12);
            } else {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unable to create data matrix");
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str12 = null;
                String str13 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str12 == null) {
                        String a13 = C11818a.a(str11, illegalArgumentException2);
                        if (a13 == null) {
                            break;
                        }
                        str12 = C11820c.a(a13);
                    }
                    String str14 = str12;
                    if (str13 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        c10 = '.';
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', str11, 2, str11), '.', str11, 2, str11);
                        if (o13.length() == 0) {
                            str2 = name2;
                            charSequence2 = charSequence3;
                        } else {
                            charSequence2 = charSequence3;
                            str2 = C15854t.P0(o13, charSequence2);
                        }
                        charSequence = charSequence2;
                        str = (C15854t.b0(Thread.currentThread().getName(), charSequence4, true) ? str10 : str9) + DslKt.INDICATOR_SEPARATOR + str2;
                    } else {
                        c10 = '.';
                        str = str13;
                        charSequence = charSequence3;
                    }
                    char c12 = c10;
                    bVar2.a(eVar2, str, false, illegalArgumentException2, str14);
                    str12 = str14;
                    str13 = str;
                    charSequence3 = charSequence;
                    str11 = null;
                }
            }
            z10 = true;
        }
        B0().f106062e.setText(a10);
        TextView textView = B0().f106063f;
        C17542s.g(textView);
        int i10 = 0;
        if (d10.length() <= 0) {
            z10 = false;
        }
        textView.setVisibility(z10 ? 0 : 8);
        textView.setText(d10);
        TextView textView2 = B0().f106061d;
        C17542s.g(textView2);
        textView2.setVisibility(!C15854t.v0(b10) ? 0 : 8);
        textView2.setText(b10);
        ImageView imageView = B0().f106059b;
        C17542s.g(imageView);
        if (!c11) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (c11) {
            L.a(imageView, new a(imageView, this, a10));
        }
        ScrollView b11 = B0().getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroyView() {
        this.f93168P = null;
        super.onDestroyView();
    }
}
