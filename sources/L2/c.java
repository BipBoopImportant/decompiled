package L2;

import H2.i;
import I2.C4600b0;
import I2.C4603d;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class c {

    class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9060a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, b bVar) {
            super(inputConnection, z10);
            this.f9060a = bVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f9060a.a(d.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i10, Bundle bundle);
    }

    private static b b(View view) {
        i.g(view);
        return new b(view);
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        H2.c.d(inputConnection, "inputConnection must be non-null");
        H2.c.d(editorInfo, "editorInfo must be non-null");
        H2.c.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean e(View view, d dVar, int i10, Bundle bundle) {
        if ((i10 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return C4600b0.e0(view, new C4603d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }
}
