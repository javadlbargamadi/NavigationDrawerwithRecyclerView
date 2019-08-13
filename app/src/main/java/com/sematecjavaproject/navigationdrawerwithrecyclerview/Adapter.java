package com.sematecjavaproject.navigationdrawerwithrecyclerview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemHolder> {

    Context context;

    public Adapter(Context context, List<Model> models) {
        this.context = context;
    }
        @NonNull
        @Override
        public ItemHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){

            View view = LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false);
            return new ItemHolder(view);
        }

        @Override
        public void onBindViewHolder (@NonNull ItemHolder holder,int position){

            holder.btn_tsk11.setText("Go to Task 1 - Home");
            holder.btn_tsk21.setText("Go to Task 2 - Dialer");
            holder.btn_tsk22.setText("Go to Task 2 - Profile");

            holder.btn_tsk11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Task1Activity.class);
                    context.startActivity(intent);
                }
            });

            holder.btn_tsk21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent21 = new Intent(context, Task2Activity.class);
                    context.startActivity(intent21);
                }
            });

            holder.btn_tsk22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent22 = new Intent(context, Task3Activity.class);
                    context.startActivity(intent22);
                }
            });
        }

        @Override
        public int getItemCount () {
            return 3;
        }

        class ItemHolder extends RecyclerView.ViewHolder {

            TextView btn_tsk11, btn_tsk21, btn_tsk22;

            public ItemHolder(@NonNull View itemView) {
                super(itemView);

                btn_tsk11 = itemView.findViewById(R.id.btn_tsk11);
                btn_tsk21 = itemView.findViewById(R.id.btn_tsk21);
                btn_tsk22 = itemView.findViewById(R.id.btn_tsk22);
            }
        }
    }
