package com.example.marieanne.spot;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.marieanne.spot.Data.Event;
import com.example.marieanne.spot.Data.Profil;

import java.util.ArrayList;
import java.util.List;


public class Accueil0 extends Activity {


    public static List<Event> listBar = new ArrayList<>();
    public static List<Event> listMuseum = new ArrayList<>();
    public static List<Event> listBalade = new ArrayList<>();
    public static List<Event> listResto = new ArrayList<>();
    public static List<Event> listShopping = new ArrayList<>();
    public static List<Event> listConcert = new ArrayList<>();
    public static Profil profil = new Profil("Mayalen","metcheverry@telecom-paristech.fr","123456");
    Event cafeDeLaPresse = new Event("Cafe de la Presse", "bar", R.drawable.cafe, "Venez degustez un guakamole de haute volée!!", "#terasse");







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil0);

        profil.addEvent(new Event("Brasserie Lipp", "resto", R.drawable.brasserie, "Brasserie bien située", "#bière #brasserie"));
        profil.addEvent(new Event("Crêperie du Luxembourg", "resto", R.drawable.crepe, "Pas cher, vendeur sympa", "#crepe #luxembourg"));
        profil.addEvent(new Event("Courbette et Galibette","shopping",R.drawable.courbette,"Petite boutique qui vend plein de marques abordables. Vendeuses adorables et de bons conseils.","#abordable #petitBoutique"));
        profil.addEvent(new Event("Cafe de la presse","bar",R.drawable.cafedelapresse , "Ambiance très conviviale et très jeune. Tous les soirs il y a des DJ qui viennet, dès 21h.","#branché #jeune" ));

        listResto.add(new Event("Brasserie Lipp", "resto", R.drawable.brasserie, "Brasserie bien située", "#bière #brasserie"));
        listResto.add(new Event("Lutecia", "resto", R.drawable.lutetia, "Cadre luxieux. La nouriture est bonne", "#luxe #bon resto"));
        listResto.add(new Event("Crêperie du Luxembourg", "resto", R.drawable.crepe, "Pas cher, vendeur sympa", "#crepe #luxembourg"));
        listResto.add(new Event("KFC Place d'Italie", "resto", R.drawable.kfc, "KFC agréable. Service très rapide!", "#KFC #rapide"));

        listBalade.add(new Event("Ile de la Cite", "balade", R.drawable.cite, "Antique berceau de la ville de Paris, l’Ile de la Cité fut pendant de longs siècles le centre névralgique de la capitale, avant que celle-ci ne s’étende au-delà de la Seine et que de nouveaux quartiers à la mode éclosent (Le Marais, Saint-Germain-des-Près…).", "#historique #cathédrale #centre"));
        listBalade.add(new Event("Ile Saint Louis", "balade", R.drawable.saintlouis, "Plus bourgeoise et mois touristique que l’Île de la Cité, l’Île Saint-Louis reste l’une des plus agréables pour une flânerie dans la capitale. Restée quasiment identique depuis près de 4 siècles, son architecture et son atmosphère de village indépendant font de l’Île un lieu idéal pour une balade en toute saison.", "#historique #flanerie #centre"));
        listBalade.add(new Event("Quartier du Louvre", "balade", R.drawable.quailouvre, "La balade commence au niveau de la magnifique place de la Concorde, puis dans le jardin des Tuileries. Vos enfants pourront se dépenser à l’envi dans cet espace vert situé à l’emplacement d’un ancien Palais des rois de France. Outre les activités classiques proposées, vos enfants apprécieront de faire naviguer des petits bateaux sur les bassins du jardin (bateaux en location).", "#parc #enfant "));
        listBalade.add(new Event("Belleville et Menilmontant ", "balade", R.drawable.belleville, "Quartiers situés en dehors de Paris jusqu’à leur annexion en 1860, Belleville et Ménilmontant ont conservé à certains endroits leur atmosphère de village d’autrefois, constitué en bas de la butte d’un quartier grouillant avec cabarets et guinguettes, et en haut, d’un plateau champêtre avec ses vignerons et ses Parisiens en villégiature.", "#parc #vigne #nord "));

        listShopping.add(new Event("Rue de Rivoli","shopping",R.drawable.rivoli,"Longue de plusieurs kilomètres, la rue Rivoli à Paris est une zone incontournable pour faire du shopping à Paris. C’est sur cette rue qu’est localisée le Grand Magasin BHV (au niveau de la Place de l’Hôtel de Ville), vous y trouverez aussi bien des articles de mode (habits, parfums,…) que des produits dédiés à la maison et la décoration.","#dense #varié"));
        listShopping.add(new Event("Courbette et Galibette","shopping",R.drawable.courbette,"Petite boutique qui vend plein de marques abordables. Vendeuses adorables et de bons conseils.","#abordable #petitBoutique"));
        // profil.addEvent(cafeDeLaPresse); }
        listMuseum.add(new Event("James Bond","museum",R.drawable.james,"James Bond est à l'honneur à la Grande Halle de la Villette de Paris, du 16 avril au 4 septembre 2016. A l'occasion des 50 ans de l'espion le plus célèbre au monde, l'exposition dévoile 500 accessoires du 007, de ses costumes à son Aston Martin DB5, sans oublier les décors des différents films !","#007 #accessoire"));
        listMuseum.add(new Event("American Realities","museum",R.drawable.american,"La galerie Polka présente le travail du photographe danois Joakim Eskildsen du 20 avril au 21 mai 2016 : dans sa série \"American realities\", le photographe part à la rencontre de l'Amérique pauvre en parcourant les routes des cinq états les plus démunis : la Californie, la Louisiane, la Géorgie, le Dakota du Sud et New York.","#photographie #Amerique"));


        listConcert.add(new Event ("Beyonce","concert",R.drawable.beyonce,"Connu grâce au girl band Destiny's Child, la reine du r'n'b est devenue une icône de la pop-culture américaine des années 90's. Son dernier album I am ... Sasha Fierce est à découvrir en live.","#hip hop #Beyonce" ));
        listConcert.add(new Event ("Celine Dion","concert",R.drawable.celinedion,"La québecoise qui s'apprête à fêter bientôt sa millième représentation à Las Vegas, confirme deux concerts en France à l'été 2016","#variété #voix" ));
        listConcert.add(new Event ("le Zero Zero ","concert",R.drawable.zero,"La raison d’un tel succès ? Le son d’abord. Tous les jours, les platines posées ici sont maniées par des DJs pointus, souvent house, minimale et hip-hop/funk.","#house #minimal" ));

        listBar.add(new Event("Cafe de la presse","bar",R.drawable.cafedelapresse , "Ambiance très conviviale et très jeune. Tous les soirs il y a des DJ qui viennet, dès 21h.","#branché #jeune" ));
        listBar.add(new Event("La Taverne", "bar", R.drawable.lataverne, " Pas cher. On peut prendre son verre en plastique et se mettre dehors et partir avec. Très conviviale.","#pasCher #BonneEnfant"));

        Resources res = getResources();
        StateListDrawable button = new StateListDrawable();
       /* button.addState(new int[] {}, res.getDrawable(R.drawable.button_rouge));
        button.addState(new int[] {android.R.attr.state_pressed}, res.getDrawable(R.drawable.button_rouge));
        button.addState(new int[] {android.R.attr.state_focused}, res.getDrawable(R.drawable.button_rouge));
        
        ((Button)findViewById(R.id.connexion)).setBackgroundDrawable(button);
        ((Button)findViewById(R.id.inscription)).setBackgroundDrawable(button);*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_accueil0, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
 
      
    public void goToAccueil1(View view) {
       Intent intentSeCo = new Intent(Accueil0.this, Accueil1.class);
    }


    public void goToInscription(View view) {
        Intent intentSeCo = new Intent(Accueil0.this, CreerCompte.class);
        startActivity(intentSeCo);
    }
    
    public void goToEvent(View view) {
        Intent intentSeCo = new Intent(Accueil0.this, Accueil1.class);
        startActivity(intentSeCo);
    }
}
