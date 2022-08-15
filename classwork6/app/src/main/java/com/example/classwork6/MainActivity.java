package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<Student> StudentArrayList = new ArrayList<>();
        int currentstudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView namee = findViewById(R.id.namee);
        TextView agee = findViewById(R.id.agee);
        TextView gradee = findViewById(R.id.gradee);
        Button ns = findViewById(R.id.ns);
        ImageView pink = findViewById(R.id.scrunkly);

        Student s1 = new Student("Ayah", 16, 11, R.drawable.ddg);
        Student s2 = new Student("Sara", 14, 9 , R.drawable.putple);
        Student s3 = new Student("Asmaa", 16 , 11 , R.drawable.blue);

        StudentArrayList.add(s1);
        StudentArrayList.add(s2);
        StudentArrayList.add(s3);

        pink.setImageResource(StudentArrayList.get(currentstudent).getStudentImg());
        namee.setText(StudentArrayList.get(currentstudent).getStudentName());
        agee.setText(String.valueOf(StudentArrayList.get(currentstudent).getStudentAge()));
        gradee.setText(String.valueOf(StudentArrayList.get(currentstudent).getStudentGrade()));

        ns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentstudent++;
                if (currentstudent == StudentArrayList.size() ){
                    currentstudent = 0;
                }



                pink.setImageResource(StudentArrayList.get(currentstudent).getStudentImg());
                namee.setText(StudentArrayList.get(currentstudent).getStudentName());
                agee.setText(String.valueOf(StudentArrayList.get(currentstudent).getStudentAge()));
                gradee.setText(String.valueOf(StudentArrayList.get(currentstudent).getStudentGrade()));

            }
        });
    }
}