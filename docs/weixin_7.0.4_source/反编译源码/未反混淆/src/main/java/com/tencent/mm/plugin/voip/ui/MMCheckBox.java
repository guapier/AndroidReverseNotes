package com.tencent.mm.plugin.voip.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMCheckBox extends CheckBox {
    private Drawable sVQ;
    private int sVR;

    public MMCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MMCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setButtonDrawable(int i) {
        AppMethodBeat.i(4775);
        if (i == 0 || i != this.sVR) {
            this.sVR = i;
            Drawable drawable = null;
            if (this.sVR != 0) {
                drawable = getResources().getDrawable(this.sVR);
            }
            setButtonDrawable(drawable);
            AppMethodBeat.o(4775);
            return;
        }
        AppMethodBeat.o(4775);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.sVQ = drawable;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        AppMethodBeat.i(4776);
        super.drawableStateChanged();
        if (this.sVQ != null) {
            this.sVQ.setState(getDrawableState());
            invalidate();
        }
        AppMethodBeat.o(4776);
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        AppMethodBeat.i(4777);
        if (super.verifyDrawable(drawable) || drawable == this.sVQ) {
            AppMethodBeat.o(4777);
            return true;
        }
        AppMethodBeat.o(4777);
        return false;
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        AppMethodBeat.i(4778);
        super.jumpDrawablesToCurrentState();
        if (VERSION.SDK_INT >= 11 && this.sVQ != null) {
            this.sVQ.jumpToCurrentState();
        }
        AppMethodBeat.o(4778);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        int i = 0;
        AppMethodBeat.i(4779);
        super.onDraw(canvas);
        Drawable drawable = this.sVQ;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int gravity2 = getGravity() & 7;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            switch (gravity) {
                case 16:
                    gravity = (getHeight() - intrinsicHeight) / 2;
                    break;
                case 80:
                    gravity = getHeight() - intrinsicHeight;
                    break;
                default:
                    gravity = 0;
                    break;
            }
            switch (gravity2) {
                case 1:
                    i = (getWidth() - intrinsicWidth) / 2;
                    break;
                case 5:
                    i = getWidth() - intrinsicWidth;
                    break;
            }
            drawable.setBounds(i, gravity, i + intrinsicWidth, intrinsicHeight + gravity);
            drawable.draw(canvas);
        }
        AppMethodBeat.o(4779);
    }
}
