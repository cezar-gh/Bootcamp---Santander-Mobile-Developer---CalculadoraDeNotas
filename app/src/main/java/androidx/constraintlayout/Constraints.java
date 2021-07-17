package androidx.constraintlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class Constraints extends View {
    public Constraints(Context context) {
        this(context, null);
    }

    public Constraints(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
