package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class S implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114434a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114435b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114436c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f114437d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f114438e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageButton f114439f;

    /* renamed from: g  reason: collision with root package name */
    public final PreviewView f114440g;

    private S(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, ImageView imageView, ProgressBar progressBar, ImageButton imageButton, PreviewView previewView) {
        this.f114434a = constraintLayout;
        this.f114435b = floatingActionButton;
        this.f114436c = textView;
        this.f114437d = imageView;
        this.f114438e = progressBar;
        this.f114439f = imageButton;
        this.f114440g = previewView;
    }

    public static S a(View view) {
        int i10 = C13317i.f113025i;
        FloatingActionButton floatingActionButton = (FloatingActionButton) b.a(view, i10);
        if (floatingActionButton != null) {
            i10 = C13317i.f113065q;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = C13317i.f112897E;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = C13317i.f112959T1;
                    ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                    if (progressBar != null) {
                        i10 = C13317i.f112989a3;
                        ImageButton imageButton = (ImageButton) b.a(view, i10);
                        if (imageButton != null) {
                            i10 = C13317i.f113059o3;
                            PreviewView previewView = (PreviewView) b.a(view, i10);
                            if (previewView != null) {
                                return new S((ConstraintLayout) view, floatingActionButton, textView, imageView, progressBar, imageButton, previewView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static S c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113120P, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114434a;
    }
}
