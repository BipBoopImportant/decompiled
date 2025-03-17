package Lg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\"!\u0010\u0012\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "LLg/c;", "", "resId", "Landroid/graphics/drawable/Drawable;", "b", "(LLg/c;I)Landroid/graphics/drawable/Drawable;", "", "c", "(LLg/c;I)Ljava/lang/String;", "", "", "args", "d", "(LLg/c;I[Ljava/lang/Object;)Ljava/lang/String;", "Landroid/content/Context;", "a", "(LLg/c;)Landroid/content/Context;", "context", "listdelegate_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final <T> Context a(c<T> cVar) {
        C17542s.j(cVar, "<this>");
        Context context = cVar.itemView.getContext();
        C17542s.i(context, "getContext(...)");
        return context;
    }

    public static final <T> Drawable b(c<T> cVar, int i10) {
        C17542s.j(cVar, "<this>");
        if (i10 != 0) {
            return C6012a.e(cVar.itemView.getContext(), i10);
        }
        return null;
    }

    public static final <T> String c(c<T> cVar, int i10) {
        C17542s.j(cVar, "<this>");
        String string = i10 != 0 ? cVar.itemView.getResources().getString(i10) : "";
        C17542s.g(string);
        return string;
    }

    public static final <T> String d(c<T> cVar, int i10, Object... objArr) {
        C17542s.j(cVar, "<this>");
        C17542s.j(objArr, "args");
        String string = i10 != 0 ? cVar.itemView.getResources().getString(i10, Arrays.copyOf(objArr, objArr.length)) : "";
        C17542s.g(string);
        return string;
    }
}
