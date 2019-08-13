package com.sematecjavaproject.navigationdrawerwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    private TextView txt_UserProfile;
    private Button var_btnEdit_UserProfile;
    private Button var_btnConfirm_UserProfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        TextView varTextView_txtFirstName_UserProfile = (TextView) findViewById(R.id.txtFirstName_UserProfile);
        TextView varTextView_txtSurName_UserProfile = (TextView) findViewById(R.id.txtSurName_UserProfile);
        TextView varTextView_txtAge_UserProfile = (TextView) findViewById(R.id.txtAge_UserProfile);
        TextView varTextView_txtPhoneNumber_UserProfile = (TextView) findViewById(R.id.txtPhoneNumber_UserProfile);
        TextView varTextView_txtAddress_UserProfile = (TextView) findViewById(R.id.txtAddress_UserProfile);

        Intent intent = getIntent();

        String varString_FirstName_UserProfile  = intent.getStringExtra("firstName");
        String varString_SurName_UserProfile   = intent.getStringExtra("surName");
        String varString_Age_UserProfile = intent.getStringExtra("age");
        String varString_PhoneNumber_UserProfilene = intent.getStringExtra("phoneNumber");
        String varString_Address_UserProfile = intent.getStringExtra("address");


        varTextView_txtFirstName_UserProfile.setText(varString_FirstName_UserProfile);
        varTextView_txtSurName_UserProfile.setText(varString_SurName_UserProfile);
        varTextView_txtAge_UserProfile.setText(varString_Age_UserProfile);
        varTextView_txtPhoneNumber_UserProfile.setText(varString_PhoneNumber_UserProfilene);
        varTextView_txtAddress_UserProfile.setText(varString_Address_UserProfile);


        Button var_btnEdit_UserProfile = (Button) findViewById(R.id.btnEdit_UserProfile);
        var_btnEdit_UserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserProfile.this, Task3Activity.class);
                startActivity(i);
                finish();
            }
        });

        Button var_btnConfirm_UserProfile = (Button) findViewById(R.id.btnConfirm_UserProfile);
        var_btnConfirm_UserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String successMessage = "Your data save SUCCESSFULLY!";
                Intent confirm = new Intent();
                confirm.putExtra("Your data save SUCCESSFULLY!", successMessage);
                setResult(Activity.RESULT_OK, confirm);
                finish(); //BACK Button
            }

            // PreferenceManager.getDefaultSharedPreferences(this).edit()
            //   .putString("username", username).apply();

        });




    }
}
