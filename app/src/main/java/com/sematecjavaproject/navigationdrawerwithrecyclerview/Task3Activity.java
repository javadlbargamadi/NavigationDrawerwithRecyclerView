package com.sematecjavaproject.navigationdrawerwithrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task3Activity extends AppCompatActivity {

    private Button btn_UserData;
    TextView varTextView_SuccessMessage_UserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        final TextView varTextView_SuccessMessage_UserData = findViewById(R.id.txtSuccessMessage_UserData);

        varTextView_SuccessMessage_UserData.setText("");

        Button var_btnNext_UserData = (Button) findViewById(R.id.btnNext_UserData);

        final EditText varEditText_edtFirstName_UserData = (EditText) findViewById(R.id.edtFirstName_UserData);
        final EditText varEditText_edtSurName_UserData = (EditText) findViewById(R.id.edtSurName_UserData);
        final EditText varEditText_edtAge_UserData = (EditText) findViewById(R.id.edtAge_UserData);
        final EditText varEditText_edtPhoneNumber_UserData = (EditText) findViewById(R.id.edtPhoneNumber_UserData);
        final EditText varEditText_edtAddress_UserData = (EditText) findViewById(R.id.edtAddress_UserData);

        var_btnNext_UserData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String varString_FirstName_UserData = varEditText_edtFirstName_UserData.getText().toString();
                String varString_SurName_UserData = varEditText_edtSurName_UserData.getText().toString();
                String varString_Age_UserData= varEditText_edtAge_UserData.getText().toString();
                String varString_PhoneNumber_UserData= varEditText_edtPhoneNumber_UserData.getText().toString();
                String varString_Address_UserData = varEditText_edtAddress_UserData.getText().toString();

                Intent intent = new Intent(Task3Activity.this, UserProfile.class);
                intent.putExtra("firstName",varString_FirstName_UserData);
                intent.putExtra("surName",varString_SurName_UserData);
                intent.putExtra("age",varString_Age_UserData);
                intent.putExtra("phoneNumber",varString_PhoneNumber_UserData);
                intent.putExtra("address",varString_Address_UserData);

                startActivityForResult(intent, 1010);

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1010)
            if (resultCode == Activity.RESULT_OK){

                String successMessage = data.getStringExtra("Your data save SUCCESSFULLY!");
                varTextView_SuccessMessage_UserData.setText(successMessage);

            }
    }
}