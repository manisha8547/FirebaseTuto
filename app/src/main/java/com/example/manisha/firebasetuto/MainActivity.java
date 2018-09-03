
package com.example.manisha.firebasetuto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText question;
    EditText answer;
    Button submit;

    DatabaseReference databseQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       databseQuestions= FirebaseDatabase.getInstance().getReference("GDtopics");

        question=findViewById(R.id.question);
        answer=findViewById(R.id.answer);
        submit=findViewById(R.id.submitbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addQuestions();
            }
        });
    }

    public void addQuestions(){
        String nameque=question.getText().toString();
        String nameans=answer.getText().toString();

        if(!TextUtils.isEmpty(nameans)){
            String id =databseQuestions.push().getKey();

            Questions questions=new Questions(id,nameans,nameque);

            databseQuestions.child(id).setValue(questions);

            Toast.makeText(this,"Artist Added",Toast.LENGTH_SHORT).show();

        }
        else {

            Toast.makeText(this,"You should Enter a name",Toast.LENGTH_SHORT).show();
        }

    }
}
