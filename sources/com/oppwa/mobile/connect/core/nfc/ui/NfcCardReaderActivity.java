package com.oppwa.mobile.connect.core.nfc.ui;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomsheet.a;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.core.nfc.EmvCardParser;
import com.oppwa.mobile.connect.core.nfc.NfcUtils;
import com.oppwa.mobile.connect.core.nfc.exception.EmvCardParserException;
import com.oppwa.mobile.connect.core.nfc.model.CardDetails;
import com.oppwa.mobile.connect.databinding.OppwaNfcBottomSheetDialogBinding;
import com.oppwa.mobile.connect.databinding.OppwaNfcCardReaderActivityBinding;
import com.oppwa.mobile.connect.utils.Logger;

public class NfcCardReaderActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    protected a f121589a;

    /* renamed from: b  reason: collision with root package name */
    private EmvCardParser f121590b;

    /* renamed from: c  reason: collision with root package name */
    private OppwaNfcBottomSheetDialogBinding f121591c;

    /* renamed from: d  reason: collision with root package name */
    private NfcAdapter f121592d;

    /* renamed from: e  reason: collision with root package name */
    private CardDetails f121593e;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        startActivity(NfcUtils.getNfcSettingsIntent());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f121593e != null) {
            Logger.info("NFCCardReader", "Card has been read.");
            setResult(-1, new Intent().putExtra("com.oppwa.mobile.connect.core.nfc.ui.EXTRA_CARD_DETAILS", this.f121593e));
            a(this.f121593e);
            return;
        }
        Logger.error("NFCCardReader", "Card details are not found.");
        a(R.string.oppwa_nfc_card_reader_error_generic);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(R.string.oppwa_nfc_card_reader_helper_description, R.color.oppwa_nfc_info_text_color, 0);
    }

    private void d() {
        OppwaNfcBottomSheetDialogBinding inflate = OppwaNfcBottomSheetDialogBinding.inflate(getLayoutInflater());
        this.f121591c = inflate;
        inflate.enableNfcButton.setOnClickListener(new d(this));
        a aVar = new a(this);
        this.f121589a = aVar;
        aVar.setContentView((View) this.f121591c.getRoot());
        this.f121589a.setOnDismissListener(new e(this));
        if (Build.VERSION.SDK_INT == 26) {
            this.f121591c.getRoot().getLayoutParams().height = getResources().getDisplayMetrics().heightPixels;
            this.f121591c.bottomSheetHandler.setVisibility(8);
            this.f121589a.o().X0(3);
            this.f121589a.o().K0(false);
        }
    }

    private void e() {
        this.f121591c.helperImage.setVisibility(4);
        this.f121591c.enableNfcButton.setVisibility(0);
        a(R.string.oppwa_nfc_card_reader_enable_nfc_description, R.color.oppwa_nfc_info_text_color, 0);
        a(this.f121591c.enableNfcButton.getBackground());
    }

    private void f() {
        this.f121591c.enableNfcButton.setVisibility(8);
        this.f121591c.helperImage.setVisibility(0);
        a(this.f121591c.helperImage.getDrawable());
        a(R.string.oppwa_nfc_card_reader_helper_description, R.color.oppwa_nfc_info_text_color, 3000);
    }

    private void g() {
        this.f121591c.helperImage.setVisibility(4);
        this.f121591c.progressImage.setVisibility(0);
        a(this.f121591c.progressImage.getDrawable());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1500);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(-1);
        this.f121591c.infoText.setText(R.string.oppwa_nfc_card_reader_progress_description);
        this.f121591c.infoText.startAnimation(alphaAnimation);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        this.f121592d = defaultAdapter;
        if (defaultAdapter == null) {
            Logger.error("NFCCardReader", "NFC adapter not available.");
            finish();
            return;
        }
        setContentView((View) OppwaNfcCardReaderActivityBinding.inflate(getLayoutInflater()).getRoot());
        d();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction())) {
            g();
            new Thread(new f(this, intent)).start();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f121592d.disableForegroundDispatch(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        a(this.f121592d);
        if (!NfcUtils.isNfcEnabled(this.f121592d)) {
            e();
        } else if (this.f121591c.progressImage.getVisibility() != 0) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f121589a.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f121589a.hide();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent) {
        a((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
    }

    private void a(Tag tag) {
        String str;
        try {
            this.f121593e = a().parse(tag);
            runOnUiThread(new b(this));
        } catch (EmvCardParserException e10) {
            if (e10.getMessage() != null) {
                str = e10.getMessage();
            } else {
                str = "Parsing error.";
            }
            Logger.error("NFCCardReader", str, e10);
            runOnUiThread(new c(this, e10));
        }
    }

    private void b(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).stop();
        }
    }

    private int b(String str) {
        if ("Tag was lost.".equals(str)) {
            return R.string.oppwa_nfc_card_reader_error_card_removed_too_fast;
        }
        return R.string.oppwa_nfc_card_reader_error_generic;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EmvCardParserException emvCardParserException) {
        a(b(emvCardParserException.getMessage()));
    }

    private EmvCardParser a() {
        if (this.f121590b == null) {
            this.f121590b = new EmvCardParser(getApplicationContext());
        }
        return this.f121590b;
    }

    private void a(int i10) {
        this.f121591c.progressImage.setVisibility(4);
        this.f121591c.helperImage.setVisibility(0);
        a(i10, R.color.oppwa_nfc_error_text_color, 0);
        new Handler().postDelayed(new g(this), 2000);
    }

    private void a(CardDetails cardDetails) {
        b(this.f121591c.progressImage.getDrawable());
        this.f121591c.helperImage.setVisibility(4);
        this.f121591c.progressImage.setVisibility(4);
        this.f121591c.resultLayout.setVisibility(0);
        this.f121591c.infoText.clearAnimation();
        this.f121591c.infoText.setVisibility(8);
        this.f121591c.cardNumber.setText(a(cardDetails.getPan()));
        if (!(cardDetails.getExpiryMonth() == null || cardDetails.getExpiryYear() == null)) {
            this.f121591c.cardExpiryDate.setText(a(cardDetails.getExpiryMonth(), cardDetails.getExpiryYear()));
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        this.f121591c.resultLayout.startAnimation(alphaAnimation);
        new Handler().postDelayed(new a(this), 2500);
    }

    private void a(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
    }

    private void a(NfcAdapter nfcAdapter) {
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(536870912), Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        try {
            new IntentFilter("android.nfc.action.NDEF_DISCOVERED").addDataType("*/*");
        } catch (IntentFilter.MalformedMimeTypeException e10) {
            Logger.error("NFCCardReader", "Failed to add data type into IntentFilter.", e10);
        }
        nfcAdapter.enableForegroundDispatch(this, activity, (IntentFilter[]) null, (String[][]) null);
    }

    private String a(String str) {
        return str.replaceAll(".{4}(?!$)", "$0   ");
    }

    private String a(String str, String str2) {
        return String.format(getString(R.string.oppwa_nfc_card_reader_expiry_date_template), new Object[]{str, str2});
    }

    private void a(int i10, int i11, long j10) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(j10);
        alphaAnimation.setDuration(500);
        this.f121591c.infoText.setTextColor(getResources().getColor(i11, getTheme()));
        this.f121591c.infoText.setText(i10);
        this.f121591c.infoText.startAnimation(alphaAnimation);
    }
}
