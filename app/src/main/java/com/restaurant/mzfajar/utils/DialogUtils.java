package com.restaurant.mzfajar.utils;

import android.app.ProgressDialog;

import com.restaurant.mzfajar.ChangePasswordActivity;
import com.restaurant.mzfajar.auth.LoginActivity;
import com.restaurant.mzfajar.auth.RegisterActivity;

public class DialogUtils {
    public static ProgressDialog progressDialog;
    public static void openDialog(LoginActivity context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading . . . ");
        progressDialog.show();
    }
    public static void closeDialog() {
        progressDialog.dismiss();
    }

    public static void openDialog(RegisterActivity registerActivity) {
    }

    public static void openDialog(ChangePasswordActivity changePasswordActivity) {
    }
}
