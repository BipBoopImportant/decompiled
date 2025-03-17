package jp;

import XH.C16807N;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/widget/EditText;", "Lkotlin/Function1;", "", "LXH/N;", "block", "Landroid/text/TextWatcher;", "a", "(Landroid/widget/EditText;LnI/l;)Landroid/text/TextWatcher;", "view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jp.c  reason: case insensitive filesystem */
public final class C11441c {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"jp/c$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jp.c$a */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f98632a;

        a(C17642l<? super String, C16807N> lVar) {
            this.f98632a = lVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String str;
            C17642l<String, C16807N> lVar = this.f98632a;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            lVar.invoke(str);
        }
    }

    public static final TextWatcher a(EditText editText, C17642l<? super String, C16807N> lVar) {
        C17542s.j(editText, "<this>");
        C17542s.j(lVar, "block");
        a aVar = new a(lVar);
        editText.addTextChangedListener(aVar);
        return aVar;
    }
}
