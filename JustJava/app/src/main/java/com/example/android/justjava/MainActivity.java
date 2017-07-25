package com.example.android.justjava;
import  android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.chckbox);
        boolean hasWhippedCream = checkBox.isChecked();
        int price = calculatePrice();
        displayMessage(createOrderSummary(price, hasWhippedCream));

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuanitity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
}

    public void increment(View view){
        quantity = quantity + 1;
        displayQuanitity(quantity);
    }

    public void decrement(View view){
        quantity = quantity - 1;
        displayQuanitity(quantity);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    /**
     * Calculates the price of the order.
     */
    private int calculatePrice() {

        return quantity * 5;
    }
    /*
     * Create Order summary
     */
    private String createOrderSummary(int priceOfOrder, boolean cream){
        String message ="Name:Ahmad Al-Qadmi";
        message += "\nAdd whipped cream? " + cream ;
        message += "\nQuantity:" + quantity;
        message += "\nTotal:" + priceOfOrder;
        message +=  "\nThank you!";
        return (message);
    }

    /*
     * box is checked
     */

    public void boxChecked(View v)
    {

    }
}