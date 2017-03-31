/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *

 */


package com.example.android.designyourcar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = (1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view){
        String priceMessage = "That would be $" + (quantity * 24995) + " please!!\n" + "Thank you for your purchase!!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given when the user increments the quantity of the coffee.
     */

    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given when the user decrements the quantity of the coffee.
     */

    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given price of the coffee.
     */
    private void displayMessage(String message) {
        TextView pricevalueTextView = (TextView) findViewById(R.id.price_value_text_view);
        pricevalueTextView.setText(message);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int usr_number) {
        TextView quantityvalueTextView = (TextView) findViewById(R.id.quantity_value_text_view);
        quantityvalueTextView.setText("" + usr_number);
    }

    /**
     * This method displays the given price on the screen with a currency value depending on which country you live in.
     */

    private void displayPrice(int usr_number) {
        TextView pricevalueTextView = (TextView) findViewById(R.id.price_value_text_view);
        pricevalueTextView.setText(NumberFormat.getCurrencyInstance().format(usr_number));

    }
}
