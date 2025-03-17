package fl;

import HJ.C15854t;
import Ma.C9140b;
import Oo.b;
import XH.C16807N;
import al.C11067a;
import al.C11068b;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.room.x;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/content/Context;", "context", "", "previousValue", "maxPickerValue", "minPickerValue", "Lkotlin/Function1;", "LXH/N;", "selectedValue", "Landroidx/appcompat/app/c;", "c", "(Landroid/content/Context;IIILnI/l;)Landroidx/appcompat/app/c;", "uicomponents_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final androidx.appcompat.app.c c(Context context, int i10, int i11, int i12, C17642l<? super Integer, C16807N> lVar) {
        C17542s.j(context, "context");
        C17542s.j(lVar, "selectedValue");
        View inflate = View.inflate(context, C11068b.f90325m, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) inflate.findViewById(C11067a.f90296j);
        numberPicker.setMaxValue(i11);
        numberPicker.setMinValue(i12);
        numberPicker.setValue(i10);
        numberPicker.setWrapSelectorWheel(false);
        C9140b bVar = new C9140b(context);
        bVar.J(b.f84596b7);
        bVar.setView(inflate);
        bVar.setPositiveButton(b.f84616d5, new C11271a(numberPicker, i10, bVar, lVar));
        bVar.setNegativeButton(b.f84518U0, new C11272b());
        androidx.appcompat.app.c create = bVar.create();
        C17542s.i(create, "create(...)");
        create.setCancelable(true);
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public static /* synthetic */ androidx.appcompat.app.c d(Context context, int i10, int i11, int i12, C17642l lVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = x.MAX_BIND_PARAMETER_CNT;
        }
        if ((i13 & 8) != 0) {
            i12 = 1;
        }
        return c(context, i10, i11, i12, lVar);
    }

    /* access modifiers changed from: private */
    public static final void e(NumberPicker numberPicker, int i10, C9140b bVar, C17642l lVar, DialogInterface dialogInterface, int i11) {
        boolean z10;
        int value = numberPicker.getValue();
        char c10 = '$';
        if (value != i10) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("New value: " + value, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
                eVar = eVar;
            }
            lVar.invoke(Integer.valueOf(value));
            return;
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        Iterator it = d.f102012a.a().iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str5 = null;
        String str6 = null;
        for (C11819b bVar3 : arrayList2) {
            if (str5 == null) {
                String a11 = C11818a.a("Same value selected. No callback", (Throwable) null);
                if (a11 != null) {
                    str5 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str6 == null) {
                String name2 = bVar.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            String str7 = str6;
            bVar3.a(eVar2, str7, z10, (Throwable) null, str5);
            str6 = str7;
            z10 = z10;
            c10 = '$';
        }
    }

    /* access modifiers changed from: private */
    public static final void f(DialogInterface dialogInterface, int i10) {
    }
}
