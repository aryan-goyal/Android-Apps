package com.example.android.justjava;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.order;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    boolean whippedCream = false;
    boolean chocolate = false;
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the + is clicked.
     */
    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void decrement(View view) {
        if (quantity >= 1)
            quantity--;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkBox);
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkBox);
        EditText nameEditText = (EditText) findViewById(R.id.name_editText);

        if (whippedCreamCheckBox.isChecked() == true){
            whippedCream = true;
        }
        else{
            whippedCream = false;
        }

        if(chocolateCheckBox.isChecked() == true)
        {
            chocolate = true;
        }
        else {
            chocolate = false;
        }
        name = nameEditText.getText().toString();
        displayMessage(createOrderSummary(calculatePrice(), whippedCream, chocolate, name));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
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
        int price = quantity * 5;
        return price;
    }

    /**
     * Shows the order summary
     */
    private String createOrderSummary(int price, boolean addWhippedCream, boolean chocolate, String name) {
        String priceMessage = "Name: " + name +"\nAdd whipped cream to coffe? " + addWhippedCream + "\nAdd Chocolate? " + chocolate + "\nQuantity: " + quantity + "\nTotal: $" + price + "\nThank You!";
        return priceMessage;
    }
}