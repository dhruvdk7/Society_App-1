package com.example.demo.society_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class profile extends AppCompatActivity {
    private EditText emailt , f_name , s_name , number,address ;
//    private FirebaseFirestore fstore;
//    private FirebaseAuth mAuth;
    private String userId;
    private Button confirm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        f_name = (EditText)findViewById(R.id.f_name);
        s_name = (EditText)findViewById(R.id.s_name);
        number = (EditText)findViewById(R.id.number);
        address = (EditText)findViewById(R.id.address);
        emailt = (EditText)findViewById(R.id.edit_text1);
        confirm = (Button)findViewById(R.id.confirm_button);
//        mAuth = FirebaseAuth.getInstance();
//        fstore = FirebaseFirestore.getInstance();
//        userId = mAuth.getCurrentUser().getUid();
//        DocumentReference documentReference = fstore.collection("users").document(userId);
//        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
//            @Override
//            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
//                f_name.setText(documentSnapshot.getString("f_name"));
//                s_name.setText(documentSnapshot.getString("s_name"));
//                number.setText(documentSnapshot.getString("number"));
//                address.setText(documentSnapshot.getString("address"));
//            }
//        });
    }
}
