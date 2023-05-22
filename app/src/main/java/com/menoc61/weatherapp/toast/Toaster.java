package com.menoc61.weatherapp.toast;

import android.content.Context;

import com.menoc61.roastedtoast.Toasty;
import com.menoc61.weatherapp.R;

public class Toaster {
    public static void successToast(Context context, String msg) {
        Toasty.custom(
                context,
                msg,
                R.drawable.ic_baseline_check_24,
                "#454B54",
                14,
                "#EEEEEE");
    }

    public static void errorToast(Context context, String msg) {
        Toasty.custom(
                context,
                msg,
                R.drawable.ic_baseline_error_outline_24,
                "#454B54",
                14,
                "#EEEEEE");
    }
}
