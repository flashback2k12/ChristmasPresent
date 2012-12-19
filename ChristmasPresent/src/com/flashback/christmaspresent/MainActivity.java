package com.flashback.christmaspresent;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

/*
 * Variablen definieren
 */
	boolean mainisopen = true;
	boolean checkBisopen = true; 
	boolean checkB2isopen = true;

/*
 * @see android.app.Activity#onCreate(android.os.Bundle)
 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	
	}

/*
 * oeffnen der checkbox_acticity_first
 */
	public void FirstActivity (View view) {
		setContentView(R.layout.activity_checkbox); 
		mainisopen = false;
		checkBisopen = false; 
	}
	
	
/*
 * oeffnen der first_coupon_activity 
 */
	public void FirstCoupon (View view) {
		setContentView(R.layout.activity_first_coupon);
		mainisopen = false;
	}
/*
 * anzeigen des gutschein_first	
 */
	public void BtnFirstCoupon (View view ) {

		EditText Gutschein1 = (EditText)findViewById(R.id.etGutschein1);
		Gutschein1.setText("Ein Gutschein f�r einen Kinobesuch deiner Wahl!"); 
		mainisopen = false;
		checkBisopen = false; 
	}
/*
 * oeffnen der secound_coupon_activity
 */
	public void SecoundCoupon (View View) {
		setContentView(R.layout.activity_secound_coupon);
		mainisopen = false;
		checkBisopen = false; 
	}
/*
* anzeigen des gutschein_secound	
*/
		public void BtnSecoundCoupon (View view ) {

			EditText Gutschein2 = (EditText)findViewById(R.id.etGutschein2);
			Gutschein2.setText("Ein Gutschein zum Essen gehen deiner Wahl!"); 
			mainisopen = false;
			checkBisopen = false; 
		}
		
/*
 * oeffnen der third_coupon_activity 
 */
		public void ThirdCoupon (View view) {
				setContentView(R.layout.activity_third_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_third	
 */
		public void BtnThirdCoupon (View view ) {

				EditText Gutschein3 = (EditText)findViewById(R.id.etGutschein3);
				Gutschein3.setText("Ein Gutschein f�r eine Massage deiner Wahl!"); 
				mainisopen = false;
				checkBisopen = false; 
			}		
/*
 * oeffnen der fourth_coupon_activity 
 */
			public void FourthCoupon (View view) {
					setContentView(R.layout.activity_fourth_coupon);
					mainisopen = false;
			}
/*
 * anzeigen des gutschein_fourth	
 */
			public void BtnFourthCoupon (View view ) {

					EditText Gutschein4 = (EditText)findViewById(R.id.etGutschein4);
					Gutschein4.setText("Ein Gutschein f�r ein Candlelight Dinner!"); 
					mainisopen = false;
					checkBisopen = false; 
			}			
/*
 * oeffnen der fifth_coupon_activity 
 */
			public void FifthCoupon (View view) {
					setContentView(R.layout.activity_fifth_coupon);
					mainisopen = false;
			}
/*
 * oeffnen der checkbox_acticity_secound	
 */
			public void BtnFifthCoupon (View view ) {
				setContentView(R.layout.activity_checkbox2);
				mainisopen = false;
			}			
/*
 * oeffnen der six_coupon_activity 
 */
			public void SixCoupon (View view) {
				setContentView(R.layout.activity_six_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_five	
 */
			public void BtnSixCoupon (View view ) {

				EditText Gutschein6 = (EditText)findViewById(R.id.etGutschein6);
				Gutschein6.setText("Ein Gutschein f�r 4 Knutsch-Fotos im Passbildautomat (Ecke L�ffelfamilie)!"); 
				mainisopen = false;
				checkBisopen = true; 
				checkB2isopen = false; 
			}			
/*
 * oeffnen der seven_coupon_activity 
 */
			public void SevenCoupon (View view) {
				setContentView(R.layout.activity_seven_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_six	
 */
			public void BtnSevenCoupon (View view ) {

				EditText Gutschein7 = (EditText)findViewById(R.id.etGutschein7);
				Gutschein7.setText("Ein Gutschein f�r einen DVD Marathon deiner Wahl mit Leckereien!"); 
				mainisopen = false;
				checkBisopen = true; 
				checkB2isopen = false; 
			}	
/*
 * oeffnen der eight_coupon_activity 
 */
			public void EightCoupon (View view) {
				setContentView(R.layout.activity_eight_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_seven	
 */
			public void BtnEightCoupon (View view ) {

				EditText Gutschein8 = (EditText)findViewById(R.id.etGutschein8);
				Gutschein8.setText("Ein Gutschein f�r die Erf�llung eines Wunsches von dir!"); 
				mainisopen = false;
				checkBisopen = true; 
				checkB2isopen = false; 
			}				
/*
 * oeffnen der nine_coupon_activity 
 */
			public void NineCoupon (View view) {
				setContentView(R.layout.activity_nine_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_eight	
 */
			public void BtnNineCoupon (View view ) {

				EditText Gutschein9 = (EditText)findViewById(R.id.etGutschein9);
				Gutschein9.setText("Ein Gutschein f�r ein Picknick!"); 
				mainisopen = false;
				checkBisopen = true; 
				checkB2isopen = false; 
			}
/*
 * oeffnen der ten_coupon_activity 
 */
			public void TenCoupon (View view) {
				setContentView(R.layout.activity_ten_coupon);
				mainisopen = false;
			}
/*
 * anzeigen des gutschein_nine	
 */
			public void BtnTenCoupon (View view ) {

				EditText Gutschein10 = (EditText)findViewById(R.id.etGutschein10);
				Gutschein10.setText("Ein Gutschein deiner Wahl wiederholen!"); 
				mainisopen = false;
				checkBisopen = true; 
				checkB2isopen = false; 
			}
/*
 * oeffnen der expanded_stuff_activity			
 */
			public void BtnZusatz (View view) {
				setContentView(R.layout.activity_expanded_stuff);
				mainisopen = false;
				checkBisopen = true;
				checkB2isopen = true; 
			}
/*
 * haben-dir-die-Gutscheine-gefallen Antwortabfrage
 */

			public void BtnAntwort (View view) {
							
				EditText FeldAntwortSchatz = (EditText)findViewById(R.id.etAntwortSchatz);
				EditText FeldAntwort = (EditText)findViewById(R.id.etAntwort); 
				
				String AntwortSchatz = FeldAntwortSchatz.getText().toString(); 
				
				if (AntwortSchatz.equals("ja"))
				{
					FeldAntwort.setText("Die Gutscheine kannst du jetzt zweimal benutzen! :-"); 
				}
				if (AntwortSchatz.equals("nein"))
				{
					FeldAntwort.setText("Schade :-((( N�chstes Jahr ist auch noch ein Jahr."); 
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Bitte ja oder nein eingeben mein Schatz!", Toast.LENGTH_LONG).show(); 
				}
			}
			
/*
 * @see android.app.Activity#onKeyDown(int, android.view.KeyEvent)
 * Funktionlitaet des zurueck-buttons
 */
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
		
		if (keyCode == KeyEvent.KEYCODE_BACK && checkBisopen == false) {
			checkBisopen = true;
			setContentView(R.layout.activity_checkbox); 
			return true;		
			}
		else if (keyCode == KeyEvent.KEYCODE_BACK && checkB2isopen == false) {
			checkB2isopen = true;
			setContentView(R.layout.activity_checkbox2); 
			return true;		
			}
		else if (keyCode == KeyEvent.KEYCODE_BACK && mainisopen == false) {
			mainisopen = true;
			setContentView(R.layout.activity_main); 
			return true;		
			}
		return super.onKeyDown(keyCode, event); 
	} 
	
	
}
