package androidx.appcompat.app;

import I2.C4600b0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import i.C5421a;
import i.C5426f;
import i.C5430j;
import java.lang.ref.WeakReference;

class AlertController {

    /* renamed from: A  reason: collision with root package name */
    NestedScrollView f15333A;

    /* renamed from: B  reason: collision with root package name */
    private int f15334B = 0;

    /* renamed from: C  reason: collision with root package name */
    private Drawable f15335C;

    /* renamed from: D  reason: collision with root package name */
    private ImageView f15336D;

    /* renamed from: E  reason: collision with root package name */
    private TextView f15337E;

    /* renamed from: F  reason: collision with root package name */
    private TextView f15338F;

    /* renamed from: G  reason: collision with root package name */
    private View f15339G;

    /* renamed from: H  reason: collision with root package name */
    ListAdapter f15340H;

    /* renamed from: I  reason: collision with root package name */
    int f15341I = -1;

    /* renamed from: J  reason: collision with root package name */
    private int f15342J;

    /* renamed from: K  reason: collision with root package name */
    private int f15343K;

    /* renamed from: L  reason: collision with root package name */
    int f15344L;

    /* renamed from: M  reason: collision with root package name */
    int f15345M;

    /* renamed from: N  reason: collision with root package name */
    int f15346N;

    /* renamed from: O  reason: collision with root package name */
    int f15347O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f15348P;

    /* renamed from: Q  reason: collision with root package name */
    private int f15349Q = 0;

    /* renamed from: R  reason: collision with root package name */
    Handler f15350R;

    /* renamed from: S  reason: collision with root package name */
    private final View.OnClickListener f15351S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f15352a;

    /* renamed from: b  reason: collision with root package name */
    final p f15353b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f15354c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15355d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f15356e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f15357f;

    /* renamed from: g  reason: collision with root package name */
    ListView f15358g;

    /* renamed from: h  reason: collision with root package name */
    private View f15359h;

    /* renamed from: i  reason: collision with root package name */
    private int f15360i;

    /* renamed from: j  reason: collision with root package name */
    private int f15361j;

    /* renamed from: k  reason: collision with root package name */
    private int f15362k;

    /* renamed from: l  reason: collision with root package name */
    private int f15363l;

    /* renamed from: m  reason: collision with root package name */
    private int f15364m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15365n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f15366o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f15367p;

    /* renamed from: q  reason: collision with root package name */
    Message f15368q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f15369r;

    /* renamed from: s  reason: collision with root package name */
    Button f15370s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f15371t;

    /* renamed from: u  reason: collision with root package name */
    Message f15372u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f15373v;

    /* renamed from: w  reason: collision with root package name */
    Button f15374w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f15375x;

    /* renamed from: y  reason: collision with root package name */
    Message f15376y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f15377z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f15378a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15379b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24158c2);
            this.f15379b = obtainStyledAttributes.getDimensionPixelOffset(C5430j.f24163d2, -1);
            this.f15378a = obtainStyledAttributes.getDimensionPixelOffset(C5430j.f24168e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f15378a, getPaddingRight(), z11 ? getPaddingBottom() : this.f15379b);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f15376y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f15366o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f15368q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f15370s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f15372u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f15374w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f15376y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f15350R
                r1 = 1
                androidx.appcompat.app.p r3 = r3.f15353b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: A  reason: collision with root package name */
        public int f15381A;

        /* renamed from: B  reason: collision with root package name */
        public int f15382B;

        /* renamed from: C  reason: collision with root package name */
        public int f15383C;

        /* renamed from: D  reason: collision with root package name */
        public int f15384D;

        /* renamed from: E  reason: collision with root package name */
        public boolean f15385E = false;

        /* renamed from: F  reason: collision with root package name */
        public boolean[] f15386F;

        /* renamed from: G  reason: collision with root package name */
        public boolean f15387G;

        /* renamed from: H  reason: collision with root package name */
        public boolean f15388H;

        /* renamed from: I  reason: collision with root package name */
        public int f15389I = -1;

        /* renamed from: J  reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f15390J;

        /* renamed from: K  reason: collision with root package name */
        public Cursor f15391K;

        /* renamed from: L  reason: collision with root package name */
        public String f15392L;

        /* renamed from: M  reason: collision with root package name */
        public String f15393M;

        /* renamed from: N  reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f15394N;

        /* renamed from: O  reason: collision with root package name */
        public boolean f15395O = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f15396a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f15397b;

        /* renamed from: c  reason: collision with root package name */
        public int f15398c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f15399d;

        /* renamed from: e  reason: collision with root package name */
        public int f15400e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f15401f;

        /* renamed from: g  reason: collision with root package name */
        public View f15402g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f15403h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f15404i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f15405j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f15406k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f15407l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f15408m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f15409n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f15410o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f15411p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f15412q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f15413r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f15414s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f15415t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f15416u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f15417v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f15418w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f15419x;

        /* renamed from: y  reason: collision with root package name */
        public int f15420y;

        /* renamed from: z  reason: collision with root package name */
        public View f15421z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f15422a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f15422a = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f15386F;
                if (zArr != null && zArr[i10]) {
                    this.f15422a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b  reason: collision with other inner class name */
        class C0225b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f15424a;

            /* renamed from: b  reason: collision with root package name */
            private final int f15425b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f15426c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f15427d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0225b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f15426c = recycleListView;
                this.f15427d = alertController;
                Cursor cursor2 = getCursor();
                this.f15424a = cursor2.getColumnIndexOrThrow(b.this.f15392L);
                this.f15425b = cursor2.getColumnIndexOrThrow(b.this.f15393M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f15424a));
                RecycleListView recycleListView = this.f15426c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f15425b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f15397b.inflate(this.f15427d.f15345M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f15429a;

            c(AlertController alertController) {
                this.f15429a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f15419x.onClick(this.f15429a.f15353b, i10);
                if (!b.this.f15388H) {
                    this.f15429a.f15353b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f15431a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f15432b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f15431a = recycleListView;
                this.f15432b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f15386F;
                if (zArr != null) {
                    zArr[i10] = this.f15431a.isItemChecked(i10);
                }
                b.this.f15390J.onClick(this.f15432b.f15353b, i10, this.f15431a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f15396a = context;
            this.f15413r = true;
            this.f15397b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f15397b
                int r1 = r10.f15344L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.f15387G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.f15391K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$b$a r8 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r9.f15396a
                int r4 = r10.f15345M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f15417v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$b$b r8 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r9.f15396a
                android.database.Cursor r4 = r9.f15391K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.f15388H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.f15346N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.f15347O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.f15391K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f15396a
                android.database.Cursor r5 = r9.f15391K
                java.lang.String r1 = r9.f15392L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f15418w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$d r8 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r9.f15396a
                java.lang.CharSequence[] r3 = r9.f15417v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                r10.f15340H = r8
                int r1 = r9.f15389I
                r10.f15341I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f15419x
                if (r1 == 0) goto L_0x007c
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r10)
                r0.setOnItemClickListener(r1)
                goto L_0x0088
            L_0x007c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.f15390J
                if (r1 == 0) goto L_0x0088
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r10)
                r0.setOnItemClickListener(r1)
            L_0x0088:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.f15394N
                if (r1 == 0) goto L_0x008f
                r0.setOnItemSelectedListener(r1)
            L_0x008f:
                boolean r1 = r9.f15388H
                if (r1 == 0) goto L_0x0098
                r1 = 1
                r0.setChoiceMode(r1)
                goto L_0x00a0
            L_0x0098:
                boolean r1 = r9.f15387G
                if (r1 == 0) goto L_0x00a0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a0:
                r10.f15358g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f15402g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f15401f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f15399d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f15398c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f15400e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f15403h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f15404i;
            if (!(charSequence3 == null && this.f15405j == null)) {
                alertController.k(-1, charSequence3, this.f15406k, (Message) null, this.f15405j);
            }
            CharSequence charSequence4 = this.f15407l;
            if (!(charSequence4 == null && this.f15408m == null)) {
                alertController.k(-2, charSequence4, this.f15409n, (Message) null, this.f15408m);
            }
            CharSequence charSequence5 = this.f15410o;
            if (!(charSequence5 == null && this.f15411p == null)) {
                alertController.k(-3, charSequence5, this.f15412q, (Message) null, this.f15411p);
            }
            if (!(this.f15417v == null && this.f15391K == null && this.f15418w == null)) {
                b(alertController);
            }
            View view2 = this.f15421z;
            if (view2 == null) {
                int i12 = this.f15420y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.f15385E) {
                alertController.t(view2, this.f15381A, this.f15382B, this.f15383C, this.f15384D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f15434a;

        public c(DialogInterface dialogInterface) {
            this.f15434a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f15434a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f15352a = context;
        this.f15353b = pVar;
        this.f15354c = window;
        this.f15350R = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C5430j.f24061F, C5421a.f23899n, 0);
        this.f15342J = obtainStyledAttributes.getResourceId(C5430j.f24065G, 0);
        this.f15343K = obtainStyledAttributes.getResourceId(C5430j.f24073I, 0);
        this.f15344L = obtainStyledAttributes.getResourceId(C5430j.f24081K, 0);
        this.f15345M = obtainStyledAttributes.getResourceId(C5430j.f24085L, 0);
        this.f15346N = obtainStyledAttributes.getResourceId(C5430j.f24093N, 0);
        this.f15347O = obtainStyledAttributes.getResourceId(C5430j.f24077J, 0);
        this.f15348P = obtainStyledAttributes.getBoolean(C5430j.f24089M, true);
        this.f15355d = obtainStyledAttributes.getDimensionPixelSize(C5430j.f24069H, 0);
        obtainStyledAttributes.recycle();
        pVar.i(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.f15343K;
        return i10 == 0 ? this.f15342J : this.f15349Q == 1 ? i10 : this.f15342J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f15354c.findViewById(C5426f.f24001u);
        View findViewById2 = this.f15354c.findViewById(C5426f.f24000t);
        C4600b0.I0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f15366o = button;
        button.setOnClickListener(this.f15351S);
        if (!TextUtils.isEmpty(this.f15367p) || this.f15369r != null) {
            this.f15366o.setText(this.f15367p);
            Drawable drawable = this.f15369r;
            if (drawable != null) {
                int i10 = this.f15355d;
                drawable.setBounds(0, 0, i10, i10);
                this.f15366o.setCompoundDrawables(this.f15369r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f15366o.setVisibility(0);
            z10 = true;
        } else {
            this.f15366o.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f15370s = button2;
        button2.setOnClickListener(this.f15351S);
        if (!TextUtils.isEmpty(this.f15371t) || this.f15373v != null) {
            this.f15370s.setText(this.f15371t);
            Drawable drawable2 = this.f15373v;
            if (drawable2 != null) {
                int i11 = this.f15355d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f15370s.setCompoundDrawables(this.f15373v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f15370s.setVisibility(0);
            z10 |= true;
        } else {
            this.f15370s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f15374w = button3;
        button3.setOnClickListener(this.f15351S);
        if (!TextUtils.isEmpty(this.f15375x) || this.f15377z != null) {
            this.f15374w.setText(this.f15375x);
            Drawable drawable3 = this.f15377z;
            if (drawable3 != null) {
                int i12 = this.f15355d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f15374w.setCompoundDrawables(this.f15377z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f15374w.setVisibility(0);
            z10 |= true;
        } else {
            this.f15374w.setVisibility(8);
        }
        if (z(this.f15352a)) {
            if (z10) {
                b(this.f15366o);
            } else if (z10) {
                b(this.f15370s);
            } else if (z10) {
                b(this.f15374w);
            }
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f15354c.findViewById(C5426f.f24002v);
        this.f15333A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f15333A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f15338F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f15357f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f15333A.removeView(this.f15338F);
            if (this.f15358g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f15333A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f15333A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f15358g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f15359h;
        boolean z10 = false;
        if (view == null) {
            view = this.f15360i != 0 ? LayoutInflater.from(this.f15352a).inflate(this.f15360i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f15354c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f15354c.findViewById(C5426f.f23994n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f15365n) {
                frameLayout.setPadding(this.f15361j, this.f15362k, this.f15363l, this.f15364m);
            }
            if (this.f15358g != null) {
                ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.f15339G != null) {
            viewGroup.addView(this.f15339G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f15354c.findViewById(C5426f.f23979E).setVisibility(8);
            return;
        }
        this.f15336D = (ImageView) this.f15354c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f15356e) || !this.f15348P) {
            this.f15354c.findViewById(C5426f.f23979E).setVisibility(8);
            this.f15336D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f15354c.findViewById(C5426f.f23990j);
        this.f15337E = textView;
        textView.setText(this.f15356e);
        int i10 = this.f15334B;
        if (i10 != 0) {
            this.f15336D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f15335C;
        if (drawable != null) {
            this.f15336D.setImageDrawable(drawable);
            return;
        }
        this.f15337E.setPadding(this.f15336D.getPaddingLeft(), this.f15336D.getPaddingTop(), this.f15336D.getPaddingRight(), this.f15336D.getPaddingBottom());
        this.f15336D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f15354c.findViewById(C5426f.f23999s);
        View findViewById4 = findViewById3.findViewById(C5426f.f23980F);
        View findViewById5 = findViewById3.findViewById(C5426f.f23993m);
        View findViewById6 = findViewById3.findViewById(C5426f.f23991k);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C5426f.f23995o);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(C5426f.f23980F);
        View findViewById8 = viewGroup.findViewById(C5426f.f23993m);
        View findViewById9 = viewGroup.findViewById(C5426f.f23991k);
        ViewGroup i10 = i(findViewById7, findViewById4);
        ViewGroup i11 = i(findViewById8, findViewById5);
        ViewGroup i12 = i(findViewById9, findViewById6);
        v(i11);
        u(i12);
        x(i10);
        char c10 = 0;
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i10 == null || i10.getVisibility() == 8) ? false : true;
        boolean z12 = (i12 == null || i12.getVisibility() == 8) ? false : true;
        if (!(z12 || i11 == null || (findViewById2 = i11.findViewById(C5426f.f23975A)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.f15333A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f15357f == null && this.f15358g == null) ? null : i10.findViewById(C5426f.f23978D);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (!(i11 == null || (findViewById = i11.findViewById(C5426f.f23976B)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f15358g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f15358g;
            if (view == null) {
                view = this.f15333A;
            }
            if (view != null) {
                if (z12) {
                    c10 = 2;
                }
                p(i11, view, z11 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f15358g;
        if (listView2 != null && (listAdapter = this.f15340H) != null) {
            listView2.setAdapter(listAdapter);
            int i13 = this.f15341I;
            if (i13 > -1) {
                listView2.setItemChecked(i13, true);
                listView2.setSelection(i13);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5421a.f23898m, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f15374w;
        }
        if (i10 == -2) {
            return this.f15370s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f15366o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f15352a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f15358g;
    }

    public void f() {
        this.f15353b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f15333A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f15333A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f15350R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f15375x = charSequence;
            this.f15376y = message;
            this.f15377z = drawable;
        } else if (i10 == -2) {
            this.f15371t = charSequence;
            this.f15372u = message;
            this.f15373v = drawable;
        } else if (i10 == -1) {
            this.f15367p = charSequence;
            this.f15368q = message;
            this.f15369r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.f15339G = view;
    }

    public void m(int i10) {
        this.f15335C = null;
        this.f15334B = i10;
        ImageView imageView = this.f15336D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.f15336D.setImageResource(this.f15334B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.f15335C = drawable;
        this.f15334B = 0;
        ImageView imageView = this.f15336D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f15336D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f15357f = charSequence;
        TextView textView = this.f15338F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f15356e = charSequence;
        TextView textView = this.f15337E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f15359h = null;
        this.f15360i = i10;
        this.f15365n = false;
    }

    public void s(View view) {
        this.f15359h = view;
        this.f15360i = 0;
        this.f15365n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f15359h = view;
        this.f15360i = 0;
        this.f15365n = true;
        this.f15361j = i10;
        this.f15362k = i11;
        this.f15363l = i12;
        this.f15364m = i13;
    }
}
