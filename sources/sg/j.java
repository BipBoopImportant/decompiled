package sg;

import Ma.C9140b;
import XH.C16807N;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsg/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "values", "default", "Lkotlin/Function1;", "LXH/N;", "callback", "c", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;LnI/l;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f76552a = new j();

    private j() {
    }

    /* access modifiers changed from: private */
    public static final void d(C17642l lVar, List list, DialogInterface dialogInterface, int i10) {
        lVar.invoke(list.get(i10));
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e(C17642l lVar, DialogInterface dialogInterface) {
        lVar.invoke(null);
    }

    public final void c(Context context, List<String> list, String str, C17642l<? super String, C16807N> lVar) {
        C17542s.j(context, "context");
        C17542s.j(list, "values");
        C17542s.j(lVar, "callback");
        C9140b bVar = new C9140b(context);
        int i10 = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (str != null) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (C17542s.e(it.next(), str)) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        bVar.I((CharSequence[]) strArr, i10, new h(lVar, list));
        bVar.i(new i(lVar));
        bVar.p();
    }
}
