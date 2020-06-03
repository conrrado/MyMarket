package com.ccamacho.mymarket.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ccamacho.mymarket.R;
import com.ccamacho.mymarket.model.Shopping;

import java.util.List;

public class ShoppingListAdapter extends RecyclerView.Adapter<ShoppingListAdapter.ShoppingViewHolder> {

    private List<Shopping> shoppingList;

    public ShoppingListAdapter(List<Shopping> shoppingList) {
        this.shoppingList = shoppingList;
    }

    @NonNull
    @Override
    public ShoppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_list_item, parent, false);
        return new ShoppingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingViewHolder holder, int position) {
        holder.bind(shoppingList.get(position));
    }

    @Override
    public int getItemCount() {
        return shoppingList.size();
    }

    static class ShoppingViewHolder extends RecyclerView.ViewHolder {

        TextView textViewMarketName;
        TextView textViewValue;
        TextView textViewDate;

        public ShoppingViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewMarketName = itemView.findViewById(R.id.textView_market_name);
            textViewValue = itemView.findViewById(R.id.textView_value);
            textViewDate = itemView.findViewById(R.id.textView_date);
        }

        void bind(Shopping shopping) {
            textViewMarketName.setText(shopping.getMarketName());
            textViewValue.setText(shopping.getTotalValue());
            textViewDate.setText(shopping.getPurchaseDate());
        }
    }
}
