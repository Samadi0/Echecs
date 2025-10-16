package Jeu;
import java.awt.*;      //Pour les panels=composantes de la fenetre
import javax.swing.*;   //Pour la frame=fenetre

public class Main extends JFrame{

	public Main() {  //constructeur
		//setSize(600,600);      //définir la taille de la fenêtre
		setExtendedState(JFrame.MAXIMIZED_BOTH);  //Mettre en plein écran
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); //récuppérer la valeur de la taille de l'écran
		//this.setLocation(d.width/2-this.getWidth()/2,d.height/2-this.getHeight()/2);  //Plaçer la fenêtre au centre de l'écran
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.setPreferredSize(new Dimension(100,100));
		JButton bouton = new JButton("cliquer"); //créer un bouton
		JButton bouton2 = new JButton("ne cliquez pas");
		bouton.setBounds(d.width/2-50,d.height/2-25,100,50); //(position du pt en haut à gauche, position du point en haut à gauche, largeur, hauteur)
		panel1.add(bouton,BorderLayout.CENTER); // ajouter le bouton à la fenetre
		panel1.add(bouton2,BorderLayout.NORTH);
		this.add(panel1);
		this.pack();     // Calcule les tailles selon PreferredSize
		setVisible(true);
	}
	public static void main(String[] args) {
		Main m = new Main();

	}

}
